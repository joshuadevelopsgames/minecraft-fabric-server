import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

public class gxr implements AutoCloseable {
   private final GpuBuffer a;
   private final GpuBufferSlice b;

   public gxr(String $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      this.a = $$1.createBuffer(() -> "Projection matrix UBO " + $$0, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
      this.b = this.a.slice(0, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
   }

   public GpuBufferSlice a(Matrix4f $$0) {
      MemoryStack $$1 = MemoryStack.stackPush();

      try {
         ByteBuffer $$2 = Std140Builder.onStack($$1, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f($$0).get();
         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.a.slice(), $$2);
      } catch (Throwable var6) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if ($$1 != null) {
         $$1.close();
      }

      return this.b;
   }

   @Override
   public void close() {
      this.a.close();
   }
}
