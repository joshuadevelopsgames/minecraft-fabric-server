import javax.annotation.Nullable;

public class cmn extends cly {
   private static final alh<jl<cmo>> ck = all.a(cmn.class, alj.z);

   public cmn(bzv<? extends cmn> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, cxc.a(this.eb(), cmp.a));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      cxc.a($$0, this.n());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cxc.a($$0, mn.aQ).ifPresent(this::b);
   }

   @Nullable
   public cmn b(aub $$0, bzc $$1) {
      cmn $$2 = bzv.D.a($$0, bzu.e);
      if ($$2 != null && $$1 instanceof cmn $$3) {
         $$2.b(this.ar.h() ? this.n() : $$3.n());
      }

      return $$2;
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cxc.a(cwz.a($$0, this.dx()), mn.aQ).ifPresent(this::b);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void b(jl<cmo> $$0) {
      this.ay.a(ck, $$0);
   }

   public jl<cmo> n() {
      return this.ay.a(ck);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aI ? c((kp<T>)$$0, this.n()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aI) {
         this.b(c(kq.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
