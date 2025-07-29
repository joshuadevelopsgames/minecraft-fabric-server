import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dzk extends dpl {
   public static final MapCodec<dzk> a = b(dzk::new);
   public static final efe<edn> b = eer.bD;
   public static final eez<jh> c = dub.f;
   public static final ees d = eer.bF;

   @Override
   public MapCodec<dzk> a() {
      return a;
   }

   public dzk(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jh.c).b(b, edn.a).b(d, false));
   }

   @Override
   public bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if (!$$0.f() && $$1.c(b) == edn.b) {
         if ($$2 instanceof aub $$7) {
            if (!($$7.c_($$3) instanceof edi $$8)) {
               return bxj.f;
            }

            edi.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bxj.b;
      } else {
         return bxj.f;
      }
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new edi($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0 instanceof aub $$3
         ? a($$2, ebb.S, ($$1x, $$2x, $$3x, $$4) -> edi.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, ebb.S, ($$0x, $$1x, $$2x, $$3x) -> edi.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
