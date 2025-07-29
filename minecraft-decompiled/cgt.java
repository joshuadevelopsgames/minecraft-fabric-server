import java.util.EnumSet;

public class cgt extends chi {
   private final cau a;

   public cgt(cau $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cw() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean W_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<jb> $$0 = jb.b(
         bcb.a(this.a.dC() - 1.0), this.a.dD(), bcb.a(this.a.dI() - 1.0), bcb.a(this.a.dC() + 1.0), bcb.a(this.a.dE() + 8.0), bcb.a(this.a.dI() + 1.0)
      );
      jb $$1 = null;

      for (jb $$2 : $$0) {
         if (this.a(this.a.ai(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jb.a(this.a.dC(), this.a.dE() + 8.0, this.a.dI());
      }

      this.a.S().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new fis(this.a.bC, this.a.bD, this.a.bE));
      this.a.a(caq.a, this.a.dA());
   }

   private boolean a(dmx $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dqb.nK)) && $$2.a(fba.a);
   }
}
