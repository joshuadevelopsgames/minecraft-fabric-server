import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dou extends dpl {
   public static final eez<jh> a = dub.f;
   public static final ees b = eer.u;

   protected dou(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jh.c).b(b, false));
   }

   @Override
   protected abstract MapCodec<? extends dou> a();

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bxj.a;
   }

   protected abstract void a(dmu var1, jb var2, cut var3);

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends eaz> eba<T> a(dmu $$0, ebb<T> $$1, ebb<? extends eam> $$2) {
      return $$0 instanceof aub $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> eam.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
