public class ewr {
   public static class a extends evc {
      public a(jb $$0) {
         super(evp.aa, 0, new euq($$0));
      }

      public a(ui $$0) {
         super(evp.aa, $$0);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         int $$7 = $$0.a(eka.a.c, this.f.h(), this.f.j());
         jb.a $$8 = new jb.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            eeb $$9 = $$0.a_($$8);
            eeb $$10 = $$0.a_($$8.e());
            if ($$10 == dqb.bc.m() || $$10 == dqb.b.m() || $$10 == dqb.g.m() || $$10 == dqb.c.m() || $$10 == dqb.e.m()) {
               eeb $$11 = !$$9.l() && !this.b($$9) ? $$9 : dqb.L.m();

               for (jh $$12 : jh.values()) {
                  jb $$13 = $$8.a($$12);
                  eeb $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jb $$15 = $$13.e();
                     eeb $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jh.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new euq($$8);
               this.a($$0, $$4, $$3, $$8, fdf.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(eeb $$0) {
         return $$0 == dqb.J.m() || $$0 == dqb.K.m();
      }
   }
}
