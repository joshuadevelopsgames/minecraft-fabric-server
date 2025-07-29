import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.util.function.Function;
import java.util.function.Supplier;

public enum gau implements flp {
   a(() -> a(5, 8, ($$0, $$1) -> -1)),
   b(() -> {
      int $$0 = 5;
      int $$1 = 8;
      return a(5, 8, ($$0x, $$1x) -> {
         boolean $$2 = $$0x == 0 || $$0x + 1 == 5 || $$1x == 0 || $$1x + 1 == 8;
         return $$2 ? -1 : 0;
      });
   });

   final fnf c;

   private static fnf a(int $$0, int $$1, gau.a $$2) {
      fnf $$3 = new fnf(fnf.a.a, $$0, $$1, false);

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         for (int $$5 = 0; $$5 < $$0; $$5++) {
            $$3.b($$5, $$4, $$2.getColor($$5, $$4));
         }
      }

      $$3.g();
      return $$3;
   }

   private gau(final Supplier<fnf> $$0) {
      this.c = $$0.get();
   }

   @Override
   public float getAdvance() {
      return this.c.a() + 1;
   }

   @Override
   public gas bake(Function<flr, gas> $$0) {
      return $$0.apply(new flr() {
         @Override
         public int a() {
            return gau.this.c.a();
         }

         @Override
         public int b() {
            return gau.this.c.b();
         }

         @Override
         public float d() {
            return 1.0F;
         }

         @Override
         public void a(int $$0, int $$1, GpuTexture $$2) {
            RenderSystem.getDevice().createCommandEncoder().writeToTexture($$2, gau.this.c, 0, 0, $$0, $$1, gau.this.c.a(), gau.this.c.b(), 0, 0);
         }

         @Override
         public boolean c() {
            return true;
         }
      });
   }

   @FunctionalInterface
   interface a {
      int getColor(int var1, int var2);
   }
}
