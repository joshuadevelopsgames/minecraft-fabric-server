import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class esf extends esi {
   public static final MapCodec<esf> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(esf::new, $$0 -> $$0.b);
   private final float b;

   @Override
   protected esj<?> a() {
      return esj.b;
   }

   public esf(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(esi.a $$0) {
      bck $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            jb $$3 = $$2.h();
            if ($$0.a($$3)) {
               a($$3, dzm.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jb $$4 = $$2.i();
            if ($$0.a($$4)) {
               a($$4, dzm.f, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jb $$5 = $$2.f();
            if ($$0.a($$5)) {
               a($$5, dzm.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            jb $$6 = $$2.g();
            if ($$0.a($$6)) {
               a($$6, dzm.c, $$0);
            }
         }
      });
   }

   private static void a(jb $$0, ees $$1, esi.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for (jb var4 = $$0.e(); $$2.a(var4) && $$3 > 0; $$3--) {
         $$2.a(var4, $$1);
         var4 = var4.e();
      }
   }
}
