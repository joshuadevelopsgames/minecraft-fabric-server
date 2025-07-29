import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dov extends dpl {
   public static final ees a = eer.A;
   private final dxm.a b;

   public dov(dxm.a $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, false));
   }

   @Override
   protected abstract MapCodec<? extends dov> a();

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dqb.hp) || $$1.a(dqb.hq) || $$1.a(dqb.hr) || $$1.a(dqb.hs);
         if ($$3) {
            return a($$2, ebb.q, ecp::a);
         }
      }

      return null;
   }

   public dxm.a b() {
      return this.b;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(a, $$0.q().E($$0.a()));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.E($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, $$6), 2);
         }
      }
   }
}
