import java.util.Optional;

public class dcp extends dcr {
   public dcp(dcr.a $$0) {
      super($$0);
   }

   public static dcv a(dcr $$0, jl<dco> $$1) {
      dcv $$2 = new dcv($$0);
      $$2.b(kq.ab, new dfl($$1));
      return $$2;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      Optional<? extends jl<dco>> $$4 = this.a($$3, $$1.eb());
      if ($$4.isPresent()) {
         dco $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gP().a($$3, bcb.d($$5.b() * 20.0F));
         $$1.b(azj.c.b(this));
         return bxj.c;
      } else {
         return bxj.d;
      }
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      Optional<jl<dco>> $$2 = this.a($$0, $$1.eb());
      return $$2.<Integer>map($$0x -> bcb.d(((dco)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jl<dco>> a(dcv $$0, jn.a $$1) {
      dfl $$2 = $$0.a(kq.ab);
      return $$2 != null ? $$2.a($$1) : Optional.empty();
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.i;
   }

   private static void a(dmu $$0, cut $$1, dco $$2) {
      ayy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aza.c, $$4, 1.0F);
      $$0.a(ejb.B, $$1.dv(), ejb.a.a($$1));
   }
}
