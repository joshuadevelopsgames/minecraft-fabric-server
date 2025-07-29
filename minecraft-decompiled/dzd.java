import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dzd extends dpl {
   public static final MapCodec<dzd> a = b(dzd::new);
   public static final eez<edf> b = eer.bC;
   public static final ees c = eer.bF;

   @Override
   public MapCodec<dzd> a() {
      return a;
   }

   public dzd(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, edf.a).b(c, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0 instanceof aub $$3
         ? a($$2, ebb.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(eer.bF).orElse(false)))
         : a($$2, ebb.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(eer.bF).orElse(false)));
   }
}
