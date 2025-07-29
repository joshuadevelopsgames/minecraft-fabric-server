import java.util.List;
import java.util.Optional;

public class czi extends cym {
   static final ame p = ame.b("container/slot/lapis_lazuli");
   private final bxc q = new bxr(2) {
      @Override
      public void e() {
         super.e();
         czi.this.a(this);
      }
   };
   private final cyz r;
   private final bck s = bck.a();
   private final czg t = czg.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public czi(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public czi(int $$0, cus $$1, cyz $$2) {
      super(czv.n, $$0);
      this.r = $$2;
      this.a(new dak(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new dak(this.q, 1, 35, 47) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.a(dcz.pG);
         }

         @Override
         public ame c() {
            return czi.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(czg.a(this.m, 0));
      this.a(czg.a(this.m, 1));
      this.a(czg.a(this.m, 2));
      this.a(this.t).a($$1.j.gB());
      this.a(czg.a(this.n, 0));
      this.a(czg.a(this.n, 1));
      this.a(czg.a(this.n, 2));
      this.a(czg.a(this.o, 0));
      this.a(czg.a(this.o, 1));
      this.a(czg.a(this.o, 2));
   }

   @Override
   public void a(bxc $$0) {
      if ($$0 == this.q) {
         dcv $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jq<jl<dji>> $$3 = $$1x.K_().f(mn.aW).t();
               int $$4 = 0;

               for (jb $$5 : dso.b) {
                  if (dso.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = djk.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<djl> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        djl $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.b());
                        this.o[$$7] = $$9.c();
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.m[$$2] = 0;
               this.n[$$2] = -1;
               this.o[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean a(cut $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         dcv $$2 = this.q.a(0);
         dcv $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.gc()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cB < $$4 || $$0.cB < this.m[$$1]) && !$$0.gc()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               dcv $$7 = $$2;
               List<djl> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(dcz.rW)) {
                     $$7 = $$2.a((dmt)dcz.vY);
                     this.q.a(0, $$7);
                  }

                  for (djl $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (cam)$$0);
                  if ($$3.f()) {
                     this.q.a(1, dcv.l);
                  }

                  $$0.a(azj.al);
                  if ($$0 instanceof auc) {
                     aq.j.a((auc)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gB());
                  this.a(this.q);
                  $$5.a(null, $$6, ayz.iE, aza.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ag.b($$0.aj() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<djl> a(jz $$0, dcv $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jp.c<dji>> $$4 = $$0.f(mn.aW).a(azr.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<djl> $$5 = djk.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(dcz.rW) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      dcv $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.r, $$0, dqb.fQ);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return dcv.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return dcv.l;
            }
         } else if ($$4.a(dcz.pG)) {
            if (!this.a($$4, 1, 2, true)) {
               return dcv.l;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return dcv.l;
            }

            dcv $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
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
