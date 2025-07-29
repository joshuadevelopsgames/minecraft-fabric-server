import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class czm extends cym {
   public static final int m = 35;
   public static final int n = 0;
   public static final int o = 1;
   public static final int p = 2;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bxc u = new daf();
   final bxc v = new bxr(2) {
      @Override
      public void e() {
         super.e();
         czm.this.a(this);
      }
   };
   private final cyz w;

   public czm(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public czm(int $$0, cus $$1, final cyz $$2) {
      super(czv.p, $$0);
      this.w = $$2;
      this.a(new dak(this.v, 0, 49, 19) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.m() || djk.c($$0);
         }
      });
      this.a(new dak(this.v, 1, 49, 40) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.m() || djk.c($$0);
         }
      });
      this.a(new dak(this.u, 2, 129, 34) {
         @Override
         public boolean a(dcv $$0) {
            return false;
         }

         @Override
         public void a(cut $$0, dcv $$1x) {
            $$2.a(($$0x, $$1xx) -> {
               if ($$0x instanceof aub) {
                  caa.a((aub)$$0x, fis.b($$1xx), this.a($$0x));
               }

               $$0x.c(1042, $$1xx, 0);
            });
            czm.this.v.a(0, dcv.l);
            czm.this.v.a(1, dcv.l);
         }

         private int a(dmu $$0) {
            int $$1x = 0;
            $$1x += this.g(czm.this.v.a(0));
            $$1x += this.g(czm.this.v.a(1));
            if ($$1x > 0) {
               int $$2x = (int)Math.ceil($$1x / 2.0);
               return $$2x + $$0.A.a($$2x);
            } else {
               return 0;
            }
         }

         private int g(dcv $$0) {
            int $$1x = 0;
            djo $$2x = djk.b($$0);

            for (Entry<jl<dji>> $$3 : $$2x.b()) {
               jl<dji> $$4 = (jl<dji>)$$3.getKey();
               int $$5 = $$3.getIntValue();
               if (!$$4.a(azr.o)) {
                  $$1x += $$4.a().b($$5);
               }
            }

            return $$1x;
         }
      });
      this.c($$1, 8, 84);
   }

   @Override
   public void a(bxc $$0) {
      super.a($$0);
      if ($$0 == this.v) {
         this.l();
      }
   }

   private void l() {
      this.u.a(0, this.a(this.v.a(0), this.v.a(1)));
      this.d();
   }

   private dcv a(dcv $$0, dcv $$1) {
      boolean $$2 = !$$0.f() || !$$1.f();
      if (!$$2) {
         return dcv.l;
      } else if ($$0.M() <= 1 && $$1.M() <= 1) {
         boolean $$3 = !$$0.f() && !$$1.f();
         if (!$$3) {
            dcv $$4 = !$$0.f() ? $$0 : $$1;
            return !djk.c($$4) ? dcv.l : this.b($$4.v());
         } else {
            return this.b($$0, $$1);
         }
      } else {
         return dcv.l;
      }
   }

   private dcv b(dcv $$0, dcv $$1) {
      if (!$$0.a($$1.h())) {
         return dcv.l;
      } else {
         int $$2 = Math.max($$0.p(), $$1.p());
         int $$3 = $$0.p() - $$0.o();
         int $$4 = $$1.p() - $$1.o();
         int $$5 = $$3 + $$4 + $$2 * 5 / 100;
         int $$6 = 1;
         if (!$$0.m()) {
            if ($$0.k() < 2 || !dcv.a($$0, $$1)) {
               return dcv.l;
            }

            $$6 = 2;
         }

         dcv $$7 = $$0.c($$6);
         if ($$7.m()) {
            $$7.b(kq.d, $$2);
            $$7.b(Math.max($$2 - $$5, 0));
         }

         this.c($$7, $$1);
         return this.b($$7);
      }
   }

   private void c(dcv $$0, dcv $$1) {
      djk.a($$0, $$1x -> {
         djo $$2 = djk.b($$1);

         for (Entry<jl<dji>> $$3 : $$2.b()) {
            jl<dji> $$4 = (jl<dji>)$$3.getKey();
            if (!$$4.a(azr.o) || $$1x.a($$4) == 0) {
               $$1x.b($$4, $$3.getIntValue());
            }
         }
      });
   }

   private dcv b(dcv $$0) {
      djo $$1 = djk.a($$0, $$0x -> $$0x.a($$0xx -> !$$0xx.a(azr.o)));
      if ($$0.a(dcz.vY) && $$1.d()) {
         $$0 = $$0.a((dmt)dcz.rW);
      }

      int $$2 = 0;

      for (int $$3 = 0; $$3 < $$1.c(); $$3++) {
         $$2 = cyp.e($$2);
      }

      $$0.b(kq.r, $$2);
      return $$0;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.w.a(($$1, $$2) -> this.a($$0, this.v));
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.w, $$0, dqb.oG);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         dcv $$5 = this.v.a(0);
         dcv $$6 = this.v.a(1);
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if (!$$5.f() && !$$6.f()) {
               if ($$1 >= 3 && $$1 < 30) {
                  if (!this.a($$4, 30, 39, false)) {
                     return dcv.l;
                  }
               } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
                  return dcv.l;
               }
            } else if (!this.a($$4, 0, 2, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
