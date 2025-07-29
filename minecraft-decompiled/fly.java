import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryUtil;

public abstract class fly {
   public static fly a(GLCapabilities $$0, Set<String> $$1) {
      if ($$0.GL_ARB_buffer_storage && fme.f) {
         $$1.add("GL_ARB_buffer_storage");
         return new fly.a();
      } else {
         return new fly.b();
      }
   }

   public abstract fma a(flz var1, @Nullable Supplier<String> var2, int var3, int var4);

   public abstract fma a(flz var1, @Nullable Supplier<String> var2, int var3, ByteBuffer var4);

   public abstract fma.a a(flz var1, fma var2, int var3, int var4, int var5);

   static class a extends fly {
      @Override
      public fma a(flz $$0, @Nullable Supplier<String> $$1, int $$2, int $$3) {
         int $$4 = $$0.a();
         $$0.b($$4, $$3, GlConst.bufferUsageToGlFlag($$2));
         ByteBuffer $$5 = this.a($$0, $$2, $$4, $$3);
         return new fma($$1, $$0, $$2, $$3, $$4, $$5);
      }

      @Override
      public fma a(flz $$0, @Nullable Supplier<String> $$1, int $$2, ByteBuffer $$3) {
         int $$4 = $$0.a();
         int $$5 = $$3.remaining();
         $$0.b($$4, $$3, GlConst.bufferUsageToGlFlag($$2));
         ByteBuffer $$6 = this.a($$0, $$2, $$4, $$5);
         return new fma($$1, $$0, $$2, $$5, $$4, $$6);
      }

      @Nullable
      private ByteBuffer a(flz $$0, int $$1, int $$2, int $$3) {
         int $$4 = 0;
         if (($$1 & 1) != 0) {
            $$4 |= 1;
         }

         if (($$1 & 2) != 0) {
            $$4 |= 18;
         }

         ByteBuffer $$5;
         if ($$4 != 0) {
            GlStateManager.clearGlErrors();
            $$5 = $$0.a($$2, 0, $$3, $$4 | 64);
            if ($$5 == null) {
               throw new IllegalStateException("Can't persistently map buffer, opengl error " + GlStateManager._getError());
            }
         } else {
            $$5 = null;
         }

         return $$5;
      }

      @Override
      public fma.a a(flz $$0, fma $$1, int $$2, int $$3, int $$4) {
         if ($$1.e == null) {
            throw new IllegalStateException("Somehow trying to map an unmappable buffer");
         } else {
            return new fma.a(() -> {
               if (($$4 & 2) != 0) {
                  $$0.a($$1.d, $$2, $$3);
               }
            }, $$1, MemoryUtil.memSlice($$1.e, $$2, $$3));
         }
      }
   }

   static class b extends fly {
      @Override
      public fma a(flz $$0, @Nullable Supplier<String> $$1, int $$2, int $$3) {
         int $$4 = $$0.a();
         $$0.a($$4, (long)$$3, GlConst.bufferUsageToGlEnum($$2));
         return new fma($$1, $$0, $$2, $$3, $$4, null);
      }

      @Override
      public fma a(flz $$0, @Nullable Supplier<String> $$1, int $$2, ByteBuffer $$3) {
         int $$4 = $$0.a();
         int $$5 = $$3.remaining();
         $$0.a($$4, $$3, GlConst.bufferUsageToGlEnum($$2));
         return new fma($$1, $$0, $$2, $$5, $$4, null);
      }

      @Override
      public fma.a a(flz $$0, fma $$1, int $$2, int $$3, int $$4) {
         GlStateManager.clearGlErrors();
         ByteBuffer $$5 = $$0.a($$1.d, $$2, $$3, $$4);
         if ($$5 == null) {
            throw new IllegalStateException("Can't map buffer, opengl error " + GlStateManager._getError());
         } else {
            return new fma.a(() -> $$0.a($$1.d), $$1, $$5);
         }
      }
   }
}
