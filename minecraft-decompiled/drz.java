import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drz extends dpl {
   public static final MapCodec<drz> a = b(drz::new);
   public static final efb b = eer.aW;
   public static final ees c = eer.s;
   private static final fjm d = dpz.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0).b(c, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b);
   }

   private static void d(eeb $$0, dmu $$1, jb $$2) {
      int $$3 = $$1.a(dnd.a, $$2) - $$1.E_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round($$3 * bcb.b($$4));
      }

      $$3 = bcb.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, $$3), 3);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$3.gF()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            eeb $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(ejb.c, $$2, ejb.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bxj.a;
      }
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return !$$0.C && $$0.G_().g() ? a($$2, ebb.r, drz::a) : null;
   }

   private static void a(dmu $$0, jb $$1, eeb $$2, ebq $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }
}
