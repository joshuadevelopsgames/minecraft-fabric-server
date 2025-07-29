public class hvf implements hva {
   private final gwi a;
   private boolean b;
   private boolean c = true;

   public hvf(gwi $$0) {
      this.a = $$0;
   }

   @Override
   public void a() {
      dmu $$0 = this.a.ai();
      eeb $$1 = $$0.c(this.a.cV().c(0.0, -0.4F, 0.0).h(1.0E-6)).filter($$0x -> $$0x.a(dqb.nK)).findFirst().orElse(null);
      if ($$1 != null) {
         if (!this.b && !this.c && $$1.a(dqb.nK) && !this.a.am()) {
            boolean $$2 = $$1.c(dqg.b);
            if ($$2) {
               this.a.a(ayz.db, 1.0F, 1.0F);
            } else {
               this.a.a(ayz.cZ, 1.0F, 1.0F);
            }
         }

         this.b = true;
      } else {
         this.b = false;
      }

      this.c = false;
   }
}
