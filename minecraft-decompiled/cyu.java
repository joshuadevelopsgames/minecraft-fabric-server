public class cyu extends cym {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final cyz u;
   long v;
   public final bxc p = new bxr(2) {
      @Override
      public void e() {
         cyu.this.a(this);
         super.e();
      }
   };
   private final daf w = new daf() {
      @Override
      public void e() {
         cyu.this.a(this);
         super.e();
      }
   };

   public cyu(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public cyu(int $$0, cus $$1, final cyz $$2) {
      super(czv.x, $$0);
      this.u = $$2;
      this.a(new dak(this.p, 0, 15, 15) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.c(kq.M);
         }
      });
      this.a(new dak(this.p, 1, 15, 52) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.a(dcz.rV) || $$0.a(dcz.vL) || $$0.a(dcz.gp);
         }
      });
      this.a(new dak(this.w, 2, 145, 39) {
         @Override
         public boolean a(dcv $$0) {
            return false;
         }

         @Override
         public void a(cut $$0, dcv $$1x) {
            cyu.this.k.get(0).a(1);
            cyu.this.k.get(1).a(1);
            $$1x.h().c($$1x, $$0);
            $$2.a(($$0x, $$1xx) -> {
               long $$2xx = $$0x.ae();
               if (cyu.this.v != $$2xx) {
                  $$0x.a(null, $$1xx, ayz.BX, aza.e, 1.0F, 1.0F);
                  cyu.this.v = $$2xx;
               }
            });
            super.a($$0, $$1x);
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.u, $$0, dqb.oE);
   }

   @Override
   public void a(bxc $$0) {
      dcv $$1 = this.p.a(0);
      dcv $$2 = this.p.a(1);
      dcv $$3 = this.w.a(2);
      if ($$3.f() || !$$1.f() && !$$2.f()) {
         if (!$$1.f() && !$$2.f()) {
            this.a($$1, $$2, $$3);
         }
      } else {
         this.w.b(2);
      }
   }

   private void a(dcv $$0, dcv $$1, dcv $$2) {
      this.u.a(($$3, $$4) -> {
         fcg $$5 = ddi.b($$0, $$3);
         if ($$5 != null) {
            dcv $$6;
            if ($$1.a(dcz.rV) && !$$5.i && $$5.g < 4) {
               $$6 = $$0.c(1);
               $$6.b(kq.O, dfs.b);
               this.d();
            } else if ($$1.a(dcz.gp) && !$$5.i) {
               $$6 = $$0.c(1);
               $$6.b(kq.O, dfs.a);
               this.d();
            } else {
               if (!$$1.a(dcz.vL)) {
                  this.w.b(2);
                  this.d();
                  return;
               }

               $$6 = $$0.c(2);
               this.d();
            }

            if (!dcv.a($$6, $$2)) {
               this.w.a(2, $$6);
               this.d();
            }
         }
      });
   }

   @Override
   public boolean a(dcv $$0, dak $$1) {
      return $$1.c != this.w && super.a($$0, $$1);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            $$4.h().c($$4, $$0);
            if (!this.a($$4, 3, 39, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if ($$4.c(kq.M)) {
               if (!this.a($$4, 0, 1, false)) {
                  return dcv.l;
               }
            } else if (!$$4.a(dcz.rV) && !$$4.a(dcz.vL) && !$$4.a(dcz.gp)) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return dcv.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return dcv.l;
               }
            } else if (!this.a($$4, 1, 2, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.w.b(2);
      this.u.a(($$1, $$2) -> this.a($$0, this.p));
   }
}
