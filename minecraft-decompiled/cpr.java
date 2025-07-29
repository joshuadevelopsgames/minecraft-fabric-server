import java.util.Optional;
import javax.annotation.Nullable;

public class cpr extends bzm {
   private static final alh<Optional<jb>> b = all.a(cpr.class, alj.p);
   private static final alh<Boolean> c = all.a(cpr.class, alj.k);
   private static final boolean d = true;
   public int a;

   public cpr(bzv<? extends cpr> $$0, dmu $$1) {
      super($$0, $$1);
      this.V = true;
      this.a = this.ar.a(100000);
   }

   public cpr(dmu $$0, double $$1, double $$2, double $$3) {
      this(bzv.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void g() {
      this.a++;
      this.aL();
      this.bZ();
      if (this.ai() instanceof aub) {
         jb $$0 = this.dx();
         if (((aub)this.ai()).G() != null && this.ai().a_($$0).l()) {
            this.ai().c($$0, dpm.a(this.ai(), $$0));
         }
      }
   }

   @Override
   protected void a(fdc $$0) {
      $$0.b("beam_target", jb.a, this.e());
      $$0.a("ShowBottom", this.f());
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.<jb>a("beam_target", jb.a).orElse(null));
      this.a($$0.a("ShowBottom", true));
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public final boolean b(byb $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cps);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cps) {
         return false;
      } else {
         if (!this.dU()) {
            this.a(bzm.e.a);
            if (!$$1.a(azp.l)) {
               byb $$3 = $$1.d() != null ? this.ea().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dC(), this.dE(), this.dI(), 6.0F, false, dmu.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(aub $$0) {
      this.a($$0, this.ea().p());
      super.c($$0);
   }

   private void a(aub $$0, byb $$1) {
      eib $$2 = $$0.G();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable jb $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public jb e() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean f() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.e() != null;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.wI);
   }
}
