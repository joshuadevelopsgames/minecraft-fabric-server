import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;

public class gxc implements AutoCloseable {
   public static final int a = new Std140SizeCalculator().putVec2().putFloat().putFloat().putInt().get();
   private final GpuBuffer b = RenderSystem.getDevice().createBuffer(() -> "Global Settings UBO", 136, a);

   public void a(int $$0, int $$1, double $$2, long $$3, ftu $$4, int $$5) {
      MemoryStack $$6 = MemoryStack.stackPush();

      try {
         ByteBuffer $$7 = Std140Builder.onStack($$6, a)
            .putVec2($$0, $$1)
            .putFloat((float)$$2)
            .putFloat(((float)($$3 % 24000L) + $$4.a(false)) / 24000.0F)
            .putInt($$5)
            .get();
         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.b.slice(), $$7);
      } catch (Throwable var13) {
         if ($$6 != null) {
            try {
               $$6.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if ($$6 != null) {
         $$6.close();
      }

      RenderSystem.setGlobalSettingsUniform(this.b);
   }

   @Override
   public void close() {
      this.b.close();
   }
}
