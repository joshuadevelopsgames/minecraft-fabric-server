public class gie extends gih {
   private static final xo b = xo.c("multiplayerWarning.header").a(o.r);
   private static final xo c = xo.c("multiplayerWarning.message");
   private static final xo d = xo.c("multiplayerWarning.check");
   private static final xo e = b.f().f("\n").b(c);
   private final get f;

   public gie(get $$0) {
      super(b, c, d, e);
      this.f = $$0;
   }

   @Override
   protected gbl l() {
      gbo $$0 = gbo.e().a(8);
      $$0.a(fxo.a(xn.i, $$0x -> {
         if (this.a.a()) {
            this.n.n.u = true;
            this.n.n.aC();
         }

         this.n.a(new gid(this.f));
      }).a());
      $$0.a(fxo.a(xn.k, $$0x -> this.aP_()).a());
      return $$0;
   }

   @Override
   public void aP_() {
      this.n.a(this.f);
   }
}
