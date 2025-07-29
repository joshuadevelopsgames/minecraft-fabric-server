public class gah implements gag {
   private static final ame e = ame.b("hud/experience_bar_background");
   private static final ame f = ame.b("hud/experience_bar_progress");
   private final fue g;

   public gah(fue $$0) {
      this.g = $$0;
   }

   @Override
   public void a(fxb $$0, ftu $$1) {
      gwi $$2 = this.g.t;
      int $$3 = this.a(this.g.aP());
      int $$4 = this.b(this.g.aP());
      int $$5 = $$2.gC();
      if ($$5 > 0) {
         int $$6 = (int)($$2.cD * 183.0F);
         $$0.a(gxx.ar, e, $$3, $$4, 182, 5);
         if ($$6 > 0) {
            $$0.a(gxx.ar, f, 182, 5, 0, 0, $$3, $$4, $$6, 5);
         }
      }
   }

   @Override
   public void b(fxb $$0, ftu $$1) {
   }
}
