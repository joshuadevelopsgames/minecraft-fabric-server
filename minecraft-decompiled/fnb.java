import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;

public class fnb implements AutoCloseable {
   private static final Vector3f b = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f c = new Vector3f(-0.2F, 1.0F, 0.7F).normalize();
   private static final Vector3f d = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f e = new Vector3f(-0.2F, -1.0F, 0.7F).normalize();
   private static final Vector3f f = new Vector3f(0.2F, -1.0F, 1.0F).normalize();
   private static final Vector3f g = new Vector3f(-0.2F, -1.0F, 0.0F).normalize();
   public static final int a = new Std140SizeCalculator().putVec3().putVec3().get();
   private final GpuBuffer h;
   private final int i;

   public fnb() {
      GpuDevice $$0 = RenderSystem.getDevice();
      this.i = bcb.d(a, $$0.getUniformOffsetAlignment());
      this.h = $$0.createBuffer(() -> "Lighting UBO", 136, this.i * fnb.a.values().length);
      Matrix4f $$1 = new Matrix4f().rotationY((float) (-Math.PI / 8)).rotateX((float) (Math.PI * 3.0 / 4.0));
      this.a(fnb.a.b, $$1.transformDirection(b, new Vector3f()), $$1.transformDirection(c, new Vector3f()));
      Matrix4f $$2 = new Matrix4f()
         .scaling(1.0F, -1.0F, 1.0F)
         .rotateYXZ(1.0821041F, 3.2375858F, 0.0F)
         .rotateYXZ((float) (-Math.PI / 8), (float) (Math.PI * 3.0 / 4.0), 0.0F);
      this.a(fnb.a.c, $$2.transformDirection(b, new Vector3f()), $$2.transformDirection(c, new Vector3f()));
      this.a(fnb.a.d, f, g);
      Matrix4f $$3 = new Matrix4f();
      this.a(fnb.a.e, $$3.transformDirection(f, new Vector3f()), $$3.transformDirection(g, new Vector3f()));
   }

   public void a(boolean $$0) {
      if ($$0) {
         this.a(fnb.a.a, d, e);
      } else {
         this.a(fnb.a.a, b, c);
      }
   }

   private void a(fnb.a $$0, Vector3f $$1, Vector3f $$2) {
      MemoryStack $$3 = MemoryStack.stackPush();

      try {
         ByteBuffer $$4 = Std140Builder.onStack($$3, a).putVec3($$1).putVec3($$2).get();
         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.h.slice($$0.ordinal() * this.i, this.i), $$4);
      } catch (Throwable var8) {
         if ($$3 != null) {
            try {
               $$3.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$3 != null) {
         $$3.close();
      }
   }

   public void a(fnb.a $$0) {
      RenderSystem.setShaderLights(this.h.slice($$0.ordinal() * this.i, a));
   }

   @Override
   public void close() {
      this.h.close();
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
