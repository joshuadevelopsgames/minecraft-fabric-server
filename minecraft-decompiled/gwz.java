import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class gwz implements AutoCloseable {
   public static final int a = new Std140SizeCalculator().putMat4f().putVec4().putVec3().putMat4f().putFloat().get();
   private static final int b = 2;
   private final gwy<gwz.a> c = new gwy<>("Dynamic Transforms UBO", a, 2);

   public void a() {
      this.c.a();
   }

   @Override
   public void close() {
      this.c.close();
   }

   public GpuBufferSlice a(Matrix4fc $$0, Vector4fc $$1, Vector3fc $$2, Matrix4fc $$3, float $$4) {
      return this.c.a(new gwz.a(new Matrix4f($$0), new Vector4f($$1), new Vector3f($$2), new Matrix4f($$3), $$4));
   }

   public GpuBufferSlice[] a(gwz.a... $$0) {
      return this.c.a($$0);
   }

   public record a(Matrix4fc a, Vector4fc b, Vector3fc c, Matrix4fc d, float e) implements gwy.a {
      @Override
      public void a(ByteBuffer $$0) {
         Std140Builder.intoBuffer($$0).putMat4f(this.a).putVec4(this.b).putVec3(this.c).putMat4f(this.d).putFloat(this.e);
      }
   }
}
