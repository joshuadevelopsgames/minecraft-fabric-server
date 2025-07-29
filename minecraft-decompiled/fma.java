import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fma extends GpuBuffer {
   protected static final MemoryPool a = TracyClient.createMemoryPool("GPU Buffers");
   protected boolean b;
   @Nullable
   protected final Supplier<String> c;
   private final flz f;
   protected final int d;
   @Nullable
   protected ByteBuffer e;

   protected fma(@Nullable Supplier<String> $$0, flz $$1, int $$2, int $$3, int $$4, @Nullable ByteBuffer $$5) {
      super($$2, $$3);
      this.c = $$0;
      this.f = $$1;
      this.d = $$4;
      this.e = $$5;
      a.malloc($$4, $$3);
   }

   @Override
   public boolean isClosed() {
      return this.b;
   }

   @Override
   public void close() {
      if (!this.b) {
         this.b = true;
         if (this.e != null) {
            this.f.a(this.d);
            this.e = null;
         }

         GlStateManager._glDeleteBuffers(this.d);
         a.free(this.d);
      }
   }

   public static class a implements GpuBuffer.MappedView {
      private final Runnable a;
      private final fma b;
      private final ByteBuffer c;
      private boolean d;

      protected a(Runnable $$0, fma $$1, ByteBuffer $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public ByteBuffer data() {
         return this.c;
      }

      @Override
      public void close() {
         if (!this.d) {
            this.d = true;
            this.a.run();
         }
      }
   }
}
