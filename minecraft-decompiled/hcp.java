public class hcp implements hbz.a {
   private final fue a;

   public hcp(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      jb $$5 = this.a.t.dx();
      dmx $$6 = this.a.t.ai();

      for (jb $$7 : jb.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         fal $$8 = $$6.b_($$7);
         if ($$8.a(azu.a)) {
            double $$9 = $$7.v() + $$8.a($$6, $$7);
            hbz.a(
               $$0,
               $$1,
               new fin($$7.u() + 0.01F, $$7.v() + 0.01F, $$7.w() + 0.01F, $$7.u() + 0.99F, $$9, $$7.w() + 0.99F).d(-$$2, -$$3, -$$4),
               0.0F,
               1.0F,
               0.0F,
               0.15F
            );
         }
      }

      for (jb $$10 : jb.c($$5.b(-10, -10, -10), $$5.b(10, 10, 10))) {
         fal $$11 = $$6.b_($$10);
         if ($$11.a(azu.a)) {
            hbz.a($$0, $$1, String.valueOf($$11.e()), $$10.u() + 0.5, (double)($$10.v() + $$11.a($$6, $$10)), $$10.w() + 0.5, -16777216);
         }
      }
   }
}
