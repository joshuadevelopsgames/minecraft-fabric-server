public class exs extends euw {
   private boolean h;
   private boolean i;

   public exs(bck $$0, int $$1, int $$2) {
      super(evp.K, $$1, 64, $$2, 7, 7, 9, a($$0));
   }

   public exs(ui $$0) {
      super(evp.K, $$0);
      this.h = $$0.b("Witch", false);
      this.i = $$0.b("Cat", false);
   }

   @Override
   protected void a(evo $$0, ui $$1) {
      super.a($$0, $$1);
      $$1.a("Witch", this.h);
      $$1.a("Cat", this.i);
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
      if (this.a($$0, $$4, 0)) {
         this.a($$0, $$4, 1, 1, 1, 5, 1, 7, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 1, 4, 2, 5, 4, 7, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 2, 1, 0, 4, 1, 0, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 2, 2, 2, 3, 3, 2, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 1, 2, 3, 1, 3, 6, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 5, 2, 3, 5, 3, 6, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 2, 2, 7, 4, 3, 7, dqb.o.m(), dqb.o.m(), false);
         this.a($$0, $$4, 1, 0, 2, 1, 3, 2, dqb.X.m(), dqb.X.m(), false);
         this.a($$0, $$4, 5, 0, 2, 5, 3, 2, dqb.X.m(), dqb.X.m(), false);
         this.a($$0, $$4, 1, 0, 7, 1, 3, 7, dqb.X.m(), dqb.X.m(), false);
         this.a($$0, $$4, 5, 0, 7, 5, 3, 7, dqb.X.m(), dqb.X.m(), false);
         this.a($$0, dqb.el.m(), 2, 3, 2, $$4);
         this.a($$0, dqb.el.m(), 3, 3, 7, $$4);
         this.a($$0, dqb.a.m(), 1, 3, 4, $$4);
         this.a($$0, dqb.a.m(), 5, 3, 4, $$4);
         this.a($$0, dqb.a.m(), 5, 3, 5, $$4);
         this.a($$0, dqb.gP.m(), 1, 3, 5, $$4);
         this.a($$0, dqb.cL.m(), 3, 2, 6, $$4);
         this.a($$0, dqb.fS.m(), 4, 2, 6, $$4);
         this.a($$0, dqb.el.m(), 1, 2, 1, $$4);
         this.a($$0, dqb.el.m(), 5, 2, 1, $$4);
         eeb $$7 = dqb.gj.m().b(dye.b, jh.c);
         eeb $$8 = dqb.gj.m().b(dye.b, jh.f);
         eeb $$9 = dqb.gj.m().b(dye.b, jh.e);
         eeb $$10 = dqb.gj.m().b(dye.b, jh.d);
         this.a($$0, $$4, 0, 4, 1, 6, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 4, 2, 0, 4, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 4, 2, 6, 4, 7, $$9, $$9, false);
         this.a($$0, $$4, 0, 4, 8, 6, 4, 8, $$10, $$10, false);
         this.a($$0, $$7.b(dye.d, efk.e), 0, 4, 1, $$4);
         this.a($$0, $$7.b(dye.d, efk.d), 6, 4, 1, $$4);
         this.a($$0, $$10.b(dye.d, efk.d), 0, 4, 8, $$4);
         this.a($$0, $$10.b(dye.d, efk.e), 6, 4, 8, $$4);

         for (int $$11 = 2; $$11 <= 7; $$11 += 5) {
            for (int $$12 = 1; $$12 <= 5; $$12 += 4) {
               this.b($$0, dqb.X.m(), $$12, -1, $$11, $$4);
            }
         }

         if (!this.h) {
            jb $$13 = this.b(2, 2, 5);
            if ($$4.b($$13)) {
               this.h = true;
               csl $$14 = bzv.bK.a($$0.a(), bzu.d);
               if ($$14 != null) {
                  $$14.gp();
                  $$14.b($$13.u() + 0.5, $$13.v(), $$13.w() + 0.5, 0.0F, 0.0F);
                  $$14.a($$0, $$0.d_($$13), bzu.d, null);
                  $$0.a_($$14);
               }
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dnl $$0, euq $$1) {
      if (!this.i) {
         jb $$2 = this.b(2, 2, 5);
         if ($$1.b($$2)) {
            this.i = true;
            cmg $$3 = bzv.v.a($$0.a(), bzu.d);
            if ($$3 != null) {
               $$3.gp();
               $$3.b($$2.u() + 0.5, $$2.v(), $$2.w() + 0.5, 0.0F, 0.0F);
               $$3.a($$0, $$0.d_($$2), bzu.d, null);
               $$0.a_($$3);
            }
         }
      }
   }
}
