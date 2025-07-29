public class cis extends chi {
   private final cau a;

   public cis(cau $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.aK() && !this.a.ai().b_(this.a.dx()).a(azu.a);
   }

   @Override
   public void d() {
      jb $$0 = null;

      for (jb $$2 : jb.b(
         bcb.a(this.a.dC() - 2.0), bcb.a(this.a.dE() - 2.0), bcb.a(this.a.dI() - 2.0), bcb.a(this.a.dC() + 2.0), this.a.dD(), bcb.a(this.a.dI() + 2.0)
      )) {
         if (this.a.ai().b_($$2).a(azu.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.Q().a($$0.u(), $$0.v(), $$0.w(), 1.0);
      }
   }
}
