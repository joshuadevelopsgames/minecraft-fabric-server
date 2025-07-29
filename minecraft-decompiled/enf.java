public class enf extends enh<ept> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   private static final jb ap = jb.c;
   private final boolean aq;

   public static jb a(jb $$0) {
      return ap.a((kg)$$0);
   }

   public enf(boolean $$0) {
      super(ept.a);
      this.aq = $$0;
   }

   @Override
   public boolean a(enj<ept> $$0) {
      jb $$1 = $$0.e();
      dnt $$2 = $$0.b();

      for (jb $$3 : jb.c(new jb($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new jb($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, dqb.I.m());
               } else if ($$3.v() < $$1.v()) {
                  if (this.aq) {
                     this.a($$2, $$3, dqb.fY);
                  } else {
                     this.a($$2, $$3, dqb.fY.m());
                  }
               }
            } else if ($$3.v() > $$1.v()) {
               if (this.aq) {
                  this.a($$2, $$3, dqb.a);
               } else {
                  this.a($$2, $$3, dqb.a.m());
               }
            } else if (!$$4) {
               this.a($$2, $$3, dqb.I.m());
            } else if (this.aq) {
               this.a($$2, new jb($$3), dqb.fW);
            } else {
               this.a($$2, new jb($$3), dqb.a.m());
            }
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         this.a($$2, $$1.b($$5), dqb.I.m());
      }

      jb $$6 = $$1.b(2);

      for (jh $$7 : jh.c.a) {
         this.a($$2, $$6.a($$7), dqb.cA.m().b(dzs.e, $$7));
      }

      return true;
   }

   private void a(dnt $$0, jb $$1, dpz $$2) {
      if (!$$0.a_($$1).a($$2)) {
         $$0.a($$1, true, null);
         this.a($$0, $$1, $$2.m());
      }
   }
}
