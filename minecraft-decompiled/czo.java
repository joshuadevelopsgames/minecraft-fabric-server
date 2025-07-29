public class czo extends cym {
   private static final ame m = ame.b("container/slot/saddle");
   private static final ame n = ame.b("container/slot/llama_armor");
   private static final ame o = ame.b("container/slot/horse_armor");
   private final bxc p;
   private final coq q;
   private static final int r = 0;
   private static final int s = 1;
   private static final int t = 2;

   public czo(int $$0, cus $$1, bxc $$2, final coq $$3, int $$4) {
      super(null, $$0);
      this.p = $$2;
      this.q = $$3;
      $$2.e_($$1.j);
      bxc $$5 = $$3.h(bzw.h);
      this.a(new cyq($$5, $$3, bzw.h, 0, 8, 18, m) {
         @Override
         public boolean b() {
            return $$3.e(bzw.h) && $$3.ap().a(azs.J);
         }
      });
      final boolean $$6 = $$3 instanceof cot;
      ame $$7 = $$6 ? n : o;
      bxc $$8 = $$3.h(bzw.g);
      this.a(new cyq($$8, $$3, bzw.g, 0, 8, 36, $$7) {
         @Override
         public boolean b() {
            return $$3.e(bzw.g) && ($$3.ap().a(azs.L) || $$6);
         }
      });
      if ($$4 > 0) {
         for (int $$9 = 0; $$9 < 3; $$9++) {
            for (int $$10 = 0; $$10 < $$4; $$10++) {
               this.a(new dak($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
            }
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cut $$0) {
      return !this.q.a(this.p) && this.p.a($$0) && this.q.bO() && $$0.b(this.q, 4.0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = 2 + this.p.b();
         if ($$1 < $$5) {
            if (!this.a($$4, $$5, this.k.size(), true)) {
               return dcv.l;
            }
         } else if (this.b(1).a($$4) && !this.b(1).h()) {
            if (!this.a($$4, 1, 2, false)) {
               return dcv.l;
            }
         } else if (this.b(0).a($$4) && !this.b(0).h()) {
            if (!this.a($$4, 0, 1, false)) {
               return dcv.l;
            }
         } else if (this.p.b() == 0 || !this.a($$4, 2, $$5, false)) {
            int $$6 = $$5 + 27;
            int $$8 = $$6 + 9;
            if ($$1 >= $$6 && $$1 < $$8) {
               if (!this.a($$4, $$5, $$6, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= $$5 && $$1 < $$6) {
               if (!this.a($$4, $$6, $$8, false)) {
                  return dcv.l;
               }
            } else if (!this.a($$4, $$6, $$6, false)) {
               return dcv.l;
            }

            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.p.c($$0);
   }
}
