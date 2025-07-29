import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ggq extends gfz<ggq.b> {
   private static final ame E = ame.b("container/creative_inventory/scroller");
   private static final ame F = ame.b("container/creative_inventory/scroller_disabled");
   private static final ame[] G = new ame[]{
      ame.b("container/creative_inventory/tab_top_unselected_1"),
      ame.b("container/creative_inventory/tab_top_unselected_2"),
      ame.b("container/creative_inventory/tab_top_unselected_3"),
      ame.b("container/creative_inventory/tab_top_unselected_4"),
      ame.b("container/creative_inventory/tab_top_unselected_5"),
      ame.b("container/creative_inventory/tab_top_unselected_6"),
      ame.b("container/creative_inventory/tab_top_unselected_7")
   };
   private static final ame[] H = new ame[]{
      ame.b("container/creative_inventory/tab_top_selected_1"),
      ame.b("container/creative_inventory/tab_top_selected_2"),
      ame.b("container/creative_inventory/tab_top_selected_3"),
      ame.b("container/creative_inventory/tab_top_selected_4"),
      ame.b("container/creative_inventory/tab_top_selected_5"),
      ame.b("container/creative_inventory/tab_top_selected_6"),
      ame.b("container/creative_inventory/tab_top_selected_7")
   };
   private static final ame[] I = new ame[]{
      ame.b("container/creative_inventory/tab_bottom_unselected_1"),
      ame.b("container/creative_inventory/tab_bottom_unselected_2"),
      ame.b("container/creative_inventory/tab_bottom_unselected_3"),
      ame.b("container/creative_inventory/tab_bottom_unselected_4"),
      ame.b("container/creative_inventory/tab_bottom_unselected_5"),
      ame.b("container/creative_inventory/tab_bottom_unselected_6"),
      ame.b("container/creative_inventory/tab_bottom_unselected_7")
   };
   private static final ame[] J = new ame[]{
      ame.b("container/creative_inventory/tab_bottom_selected_1"),
      ame.b("container/creative_inventory/tab_bottom_selected_2"),
      ame.b("container/creative_inventory/tab_bottom_selected_3"),
      ame.b("container/creative_inventory/tab_bottom_selected_4"),
      ame.b("container/creative_inventory/tab_bottom_selected_5"),
      ame.b("container/creative_inventory/tab_bottom_selected_6"),
      ame.b("container/creative_inventory/tab_bottom_selected_7")
   };
   private static final int K = 5;
   private static final int L = 9;
   private static final int M = 26;
   private static final int N = 32;
   private static final int O = 12;
   private static final int P = 15;
   static final bxr Q = new bxr(45);
   private static final xo R = xo.c("inventory.binSlot");
   private static dbm S = dbn.b();
   private float T;
   private boolean U;
   private fxx V;
   @Nullable
   private List<dak> W;
   @Nullable
   private dak X;
   private ggp Y;
   private boolean Z;
   private boolean aa;
   private final Set<bae<dcr>> ab = new HashSet<>();
   private final boolean ac;
   private final ggt ad;

   public ggq(gwi $$0, cyd $$1, boolean $$2) {
      super(new ggq.b($$0), $$0.gs(), xn.a);
      $$0.cn = this.x;
      this.e = 136;
      this.d = 195;
      this.ac = $$2;
      this.a($$0.j.F(), $$1, this.a($$0), $$0.ai().K_());
      this.ad = new ggt(this);
   }

   private boolean a(cut $$0) {
      return $$0.gQ() && this.ac;
   }

   private void a(cyd $$0, boolean $$1, jn.a $$2) {
      grl $$3 = this.n.M();
      if (this.a($$3 != null ? $$3.F() : null, $$0, $$1, $$2)) {
         for (dbm $$4 : dbn.d()) {
            Collection<dcv> $$5 = $$4.l();
            if ($$4 == S) {
               if ($$4.k() == dbm.h.a && $$5.isEmpty()) {
                  this.a(dbn.b());
               } else {
                  this.a($$5);
               }
            }
         }
      }
   }

   private boolean a(@Nullable gsc $$0, cyd $$1, boolean $$2, jn.a $$3) {
      if (!dbn.a($$1, $$2, $$3)) {
         return false;
      } else {
         if ($$0 != null) {
            List<dcv> $$4 = List.copyOf(dbn.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
         }

         return true;
      }
   }

   private void a(Collection<dcv> $$0) {
      int $$1 = this.x.a(this.T);
      this.x.m.clear();
      if (S.k() == dbm.h.d) {
         this.F();
      } else {
         this.x.m.addAll($$0);
      }

      this.T = this.x.e($$1);
      this.x.b(this.T);
   }

   @Override
   public void m() {
      super.m();
      if (this.n != null) {
         gwi $$0 = this.n.t;
         if ($$0 != null) {
            this.a($$0.j.A(), this.a($$0), $$0.ai().K_());
            if (!$$0.gc()) {
               this.n.a(new ghb($$0));
            }
         }
      }
   }

   @Override
   protected void a(@Nullable dak $$0, int $$1, int $$2, cyx $$3) {
      if (this.a($$0)) {
         this.V.c(false);
         this.V.o(0);
      }

      boolean $$4 = $$3 == cyx.b;
      $$3 = $$1 == -999 && $$3 == cyx.a ? cyx.e : $$3;
      if ($$3 != cyx.e || this.n.t.gw()) {
         this.a($$0, $$3);
         if ($$0 == null && S.k() != dbm.h.b && $$3 != cyx.f) {
            if (!this.x.g().f() && this.aa) {
               if (!this.n.t.gw()) {
                  return;
               }

               if ($$2 == 0) {
                  this.n.t.a(this.x.g(), true);
                  this.n.r.a(this.x.g());
                  this.x.a(dcv.l);
               }

               if ($$2 == 1) {
                  dcv $$17 = this.x.g().a(1);
                  this.n.t.a($$17, true);
                  this.n.r.a($$17);
               }
            }
         } else {
            if ($$0 != null && !$$0.a(this.n.t)) {
               return;
            }

            if ($$0 == this.X && $$4) {
               for (int $$5 = 0; $$5 < this.n.t.cm.c().size(); $$5++) {
                  this.n.t.cm.b($$5).f(dcv.l);
                  this.n.r.a(dcv.l, $$5);
               }
            } else if (S.k() == dbm.h.b) {
               if ($$0 == this.X) {
                  this.x.a(dcv.l);
               } else if ($$3 == cyx.e && $$0 != null && $$0.h()) {
                  dcv $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
                  dcv $$7 = $$0.g();
                  this.n.t.a($$6, true);
                  this.n.r.a($$6);
                  this.n.r.a($$7, ((ggq.c)$$0).a.d);
               } else if ($$3 == cyx.e && $$1 == -999 && !this.x.g().f()) {
                  this.n.t.a(this.x.g(), true);
                  this.n.r.a(this.x.g());
                  this.x.a(dcv.l);
               } else {
                  this.n.t.cm.a($$0 == null ? $$1 : ((ggq.c)$$0).a.d, $$2, $$3, this.n.t);
                  this.n.t.cm.d();
               }
            } else if ($$3 != cyx.f && $$0.c == Q) {
               dcv $$8 = this.x.g();
               dcv $$9 = $$0.g();
               if ($$3 == cyx.c) {
                  if (!$$9.f()) {
                     this.n.t.gs().a($$2, $$9.c($$9.k()));
                     this.n.t.cm.d();
                  }

                  return;
               }

               if ($$3 == cyx.d) {
                  if (this.x.g().f() && $$0.h()) {
                     dcv $$10 = $$0.g();
                     this.x.a($$10.c($$10.k()));
                  }

                  return;
               }

               if ($$3 == cyx.e) {
                  if (!$$9.f()) {
                     dcv $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                     this.n.t.a($$11, true);
                     this.n.r.a($$11);
                  }

                  return;
               }

               if (!$$8.f() && !$$9.f() && dcv.c($$8, $$9)) {
                  if ($$2 == 0) {
                     if ($$4) {
                        $$8.e($$8.k());
                     } else if ($$8.M() < $$8.k()) {
                        $$8.g(1);
                     }
                  } else {
                     $$8.h(1);
                  }
               } else if (!$$9.f() && $$8.f()) {
                  int $$12 = $$4 ? $$9.k() : $$9.M();
                  this.x.a($$9.c($$12));
               } else if ($$2 == 0) {
                  this.x.a(dcv.l);
               } else if (!this.x.g().f()) {
                  this.x.g().h(1);
               }
            } else if (this.x != null) {
               dcv $$13 = $$0 == null ? dcv.l : this.x.b($$0.d).g();
               this.x.a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.n.t);
               if (cym.d($$2) == 2) {
                  for (int $$14 = 0; $$14 < 9; $$14++) {
                     this.n.r.a(this.x.b(45 + $$14).g(), 36 + $$14);
                  }
               } else if ($$0 != null && cus.e($$0.i()) && S.k() != dbm.h.b) {
                  if ($$3 == cyx.e && !$$13.f() && !this.x.g().f()) {
                     int $$15 = $$2 == 0 ? 1 : $$13.M();
                     dcv $$16 = $$13.c($$15);
                     $$13.h($$15);
                     this.n.t.a($$16, true);
                     this.n.r.a($$16);
                  }

                  this.n.t.cm.d();
               }
            }
         }
      }
   }

   private boolean a(@Nullable dak $$0) {
      return $$0 != null && $$0.c == Q;
   }

   @Override
   protected void aV_() {
      if (this.n.t.gc()) {
         super.aV_();
         this.V = new fxx(this.q, this.A + 82, this.B + 6, 80, 9, xo.c("itemGroup.search"));
         this.V.f(50);
         this.V.d(false);
         this.V.i(false);
         this.V.m(-1);
         this.d(this.V);
         dbm $$0 = S;
         S = dbn.b();
         this.a($$0);
         this.n.t.cm.b(this.Y);
         this.Y = new ggp(this.n);
         this.n.t.cm.a(this.Y);
         if (!S.i()) {
            this.a(dbn.b());
         }
      } else {
         this.n.a(new ghb(this.n.t));
      }
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      int $$3 = this.x.a(this.T);
      String $$4 = this.V.a();
      this.b($$0, $$1, $$2);
      this.V.a($$4);
      if (!this.V.a().isEmpty()) {
         this.F();
      }

      this.T = this.x.e($$3);
      this.x.b(this.T);
   }

   @Override
   public void aI_() {
      super.aI_();
      if (this.n.t != null && this.n.t.gs() != null) {
         this.n.t.cm.b(this.Y);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.Z) {
         return false;
      } else if (S.k() != dbm.h.d) {
         return false;
      } else {
         String $$2 = this.V.a();
         if (this.V.a($$0, $$1)) {
            if (!Objects.equals($$2, this.V.a())) {
               this.F();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.Z = false;
      if (S.k() != dbm.h.d) {
         if (this.n.n.I.a($$0, $$1)) {
            this.Z = true;
            this.a(dbn.e());
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         boolean $$3 = !this.a(this.z) || this.z.h();
         boolean $$4 = fna.a($$0, $$1).e().isPresent();
         if ($$3 && $$4 && this.a($$0, $$1)) {
            this.Z = true;
            return true;
         } else {
            String $$5 = this.V.a();
            if (this.V.a($$0, $$1, $$2)) {
               if (!Objects.equals($$5, this.V.a())) {
                  this.F();
               }

               return true;
            } else {
               return this.V.aM_() && this.V.i() && $$0 != 256 ? true : super.a($$0, $$1, $$2);
            }
         }
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.Z = false;
      return super.c($$0, $$1, $$2);
   }

   private void F() {
      this.x.m.clear();
      this.ab.clear();
      String $$0 = this.V.a();
      if ($$0.isEmpty()) {
         this.x.m.addAll(S.l());
      } else {
         grl $$1 = this.n.M();
         if ($$1 != null) {
            gsc $$2 = $$1.F();
            hwb<dcv> $$3;
            if ($$0.startsWith("#")) {
               $$0 = $$0.substring(1);
               $$3 = $$2.c();
               this.a($$0);
            } else {
               $$3 = $$2.d();
            }

            this.x.m.addAll($$3.search($$0.toLowerCase(Locale.ROOT)));
         }
      }

      this.T = 0.0F;
      this.x.b(0.0F);
   }

   private void a(String $$0) {
      int $$1 = $$0.indexOf(58);
      Predicate<ame> $$2;
      if ($$1 == -1) {
         $$2 = $$1x -> $$1x.a().contains($$0);
      } else {
         String $$3 = $$0.substring(0, $$1).trim();
         String $$4 = $$0.substring($$1 + 1).trim();
         $$2 = $$2x -> $$2x.b().contains($$3) && $$2x.a().contains($$4);
      }

      mm.g.l().map(jp.c::h).filter($$1x -> $$2.test($$1x.b())).forEach(this.ab::add);
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2) {
      if (S.d()) {
         $$0.a(this.q, S.a(), 8, 6, -12566464, false);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - this.A;
         double $$4 = $$1 - this.B;

         for (dbm $$5 : dbn.c()) {
            if (this.a($$5, $$3, $$4)) {
               return true;
            }
         }

         if (S.k() != dbm.h.b && this.b($$0, $$1)) {
            this.U = this.G();
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         double $$3 = $$0 - this.A;
         double $$4 = $$1 - this.B;
         this.U = false;

         for (dbm $$5 : dbn.c()) {
            if (this.a($$5, $$3, $$4)) {
               this.a($$5);
               return true;
            }
         }
      }

      return super.b($$0, $$1, $$2);
   }

   private boolean G() {
      return S.e() && this.x.m();
   }

   private void a(dbm $$0) {
      dbm $$1 = S;
      S = $$0;
      this.C.clear();
      this.x.m.clear();
      this.l();
      if (S.k() == dbm.h.c) {
         ftz $$2 = this.n.aE();

         for (int $$3 = 0; $$3 < 9; $$3++) {
            gwk $$4 = $$2.a($$3);
            if ($$4.a()) {
               for (int $$5 = 0; $$5 < 9; $$5++) {
                  if ($$5 == $$3) {
                     dcv $$6 = new dcv(dcz.rV);
                     $$6.b(kq.s, bdk.a);
                     xo $$7 = this.n.n.T[$$3].k();
                     xo $$8 = this.n.n.U.k();
                     $$6.b(kq.h, xo.a("inventory.hotbarInfo", $$8, $$7));
                     this.x.m.add($$6);
                  } else {
                     this.x.m.add(dcv.l);
                  }
               }
            } else {
               this.x.m.addAll($$4.a(this.n.s.K_()));
            }
         }
      } else if (S.k() == dbm.h.a) {
         this.x.m.addAll(S.l());
      }

      if (S.k() == dbm.h.b) {
         cym $$9 = this.n.t.cm;
         if (this.W == null) {
            this.W = ImmutableList.copyOf(this.x.k);
         }

         this.x.k.clear();

         for (int $$10 = 0; $$10 < $$9.k.size(); $$10++) {
            int $$14;
            int $$15;
            if ($$10 >= 5 && $$10 < 9) {
               int $$11 = $$10 - 5;
               int $$12 = $$11 / 2;
               int $$13 = $$11 % 2;
               $$14 = 54 + $$12 * 54;
               $$15 = 6 + $$13 * 27;
            } else if ($$10 >= 0 && $$10 < 5) {
               $$14 = -2000;
               $$15 = -2000;
            } else if ($$10 == 45) {
               $$14 = 35;
               $$15 = 20;
            } else {
               int $$20 = $$10 - 9;
               int $$21 = $$20 % 9;
               int $$22 = $$20 / 9;
               $$14 = 9 + $$21 * 18;
               if ($$10 >= 36) {
                  $$15 = 112;
               } else {
                  $$15 = 54 + $$22 * 18;
               }
            }

            dak $$26 = new ggq.c($$9.k.get($$10), $$10, $$14, $$15);
            this.x.k.add($$26);
         }

         this.X = new dak(Q, 0, 173, 112);
         this.x.k.add(this.X);
      } else if ($$1.k() == dbm.h.b) {
         this.x.k.clear();
         this.x.k.addAll(this.W);
         this.W = null;
      }

      if (S.k() == dbm.h.d) {
         this.V.i(true);
         this.V.h(false);
         this.V.a(true);
         if ($$1 != $$0) {
            this.V.a("");
         }

         this.F();
      } else {
         this.V.i(false);
         this.V.h(true);
         this.V.a(false);
         this.V.a("");
      }

      this.T = 0.0F;
      this.x.b(0.0F);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (super.a($$0, $$1, $$2, $$3)) {
         return true;
      } else if (!this.G()) {
         return false;
      } else {
         this.T = this.x.a(this.T, $$3);
         this.x.b(this.T);
         return true;
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < $$2 || $$1 < $$3 || $$0 >= $$2 + this.d || $$1 >= $$3 + this.e;
      this.aa = $$5 && !this.a(S, $$0, $$1);
      return this.aa;
   }

   protected boolean b(double $$0, double $$1) {
      int $$2 = this.A;
      int $$3 = this.B;
      int $$4 = $$2 + 175;
      int $$5 = $$3 + 18;
      int $$6 = $$4 + 14;
      int $$7 = $$5 + 112;
      return $$0 >= $$4 && $$1 >= $$5 && $$0 < $$6 && $$1 < $$7;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.U) {
         int $$5 = this.B + 18;
         int $$6 = $$5 + 112;
         this.T = ((float)$$1 - $$5 - 7.5F) / ($$6 - $$5 - 15.0F);
         this.T = bcb.a(this.T, 0.0F, 1.0F);
         this.x.b(this.T);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      this.ad.a($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
      this.ad.b($$0, $$1, $$2);

      for (dbm $$4 : dbn.c()) {
         if (this.a($$0, $$4, $$1, $$2)) {
            break;
         }
      }

      if (this.X != null && S.k() == dbm.h.b && this.a(this.X.e, this.X.f, 16, 16, $$1, $$2)) {
         $$0.a(this.q, R, $$1, $$2);
      }

      this.b($$0, $$1, $$2);
   }

   @Override
   public boolean C() {
      return this.ad.a();
   }

   @Override
   public List<xo> a(dcv $$0) {
      boolean $$1 = this.z != null && this.z instanceof ggq.a;
      boolean $$2 = S.k() == dbm.h.a;
      boolean $$3 = S.k() == dbm.h.d;
      dek.a $$4 = this.n.n.m ? dek.a.b : dek.a.a;
      dek $$5 = $$1 ? $$4.c() : $$4;
      List<xo> $$6 = $$0.a(dcr.b.a(this.n.s), this.n.t, $$5);
      if ($$6.isEmpty()) {
         return $$6;
      } else if ($$2 && $$1) {
         return $$6;
      } else {
         List<xo> $$7 = Lists.newArrayList($$6);
         if ($$3 && $$1) {
            this.ab.forEach($$2x -> {
               if ($$0.a($$2x)) {
                  $$7.add(1, xo.b("#" + $$2x.b()).a(o.f));
               }
            });
         }

         int $$8 = 1;

         for (dbm $$9 : dbn.c()) {
            if ($$9.k() != dbm.h.d && $$9.a($$0)) {
               $$7.add($$8++, $$9.a().f().a(o.j));
            }
         }

         return $$7;
      }
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      for (dbm $$4 : dbn.c()) {
         if ($$4 != S) {
            this.a($$0, $$4);
         }
      }

      $$0.a(gxx.ar, S.c(), this.A, this.B, 0.0F, 0.0F, this.d, this.e, 256, 256);
      this.V.a($$0, $$2, $$3, $$1);
      int $$5 = this.A + 175;
      int $$6 = this.B + 18;
      int $$7 = $$6 + 112;
      if (S.e()) {
         ame $$8 = this.G() ? E : F;
         $$0.a(gxx.ar, $$8, $$5, $$6 + (int)(($$7 - $$6 - 17) * this.T), 12, 15);
      }

      this.a($$0, S);
      if (S.k() == dbm.h.b) {
         ghb.a($$0, this.A + 73, this.B + 6, this.A + 105, this.B + 49, 20, 0.0625F, $$2, $$3, this.n.t);
      }
   }

   private int b(dbm $$0) {
      int $$1 = $$0.f();
      int $$2 = 27;
      int $$3 = 27 * $$1;
      if ($$0.j()) {
         $$3 = this.d - 27 * (7 - $$1) + 1;
      }

      return $$3;
   }

   private int c(dbm $$0) {
      int $$1 = 0;
      if ($$0.g() == dbm.f.a) {
         $$1 -= 32;
      } else {
         $$1 += this.e;
      }

      return $$1;
   }

   protected boolean a(dbm $$0, double $$1, double $$2) {
      int $$3 = this.b($$0);
      int $$4 = this.c($$0);
      return $$1 >= $$3 && $$1 <= $$3 + 26 && $$2 >= $$4 && $$2 <= $$4 + 32;
   }

   protected boolean a(fxb $$0, dbm $$1, int $$2, int $$3) {
      int $$4 = this.b($$1);
      int $$5 = this.c($$1);
      if (this.a($$4 + 3, $$5 + 3, 21, 27, $$2, $$3)) {
         $$0.a(this.q, $$1.a(), $$2, $$3);
         return true;
      } else {
         return false;
      }
   }

   protected void a(fxb $$0, dbm $$1) {
      boolean $$2 = $$1 == S;
      boolean $$3 = $$1.g() == dbm.f.a;
      int $$4 = $$1.f();
      int $$5 = this.A + this.b($$1);
      int $$6 = this.B - ($$3 ? 28 : -(this.e - 4));
      ame[] $$7;
      if ($$3) {
         $$7 = $$2 ? H : G;
      } else {
         $$7 = $$2 ? J : I;
      }

      $$0.a(gxx.ar, $$7[bcb.a($$4, 0, $$7.length)], $$5, $$6, 26, 32);
      int $$9 = $$5 + 13 - 8;
      int $$10 = $$6 + 16 - 8 + ($$3 ? 1 : -1);
      $$0.a($$1.b(), $$9, $$10);
   }

   public boolean E() {
      return S.k() == dbm.h.b;
   }

   public static void a(fue $$0, int $$1, boolean $$2, boolean $$3) {
      gwi $$4 = $$0.t;
      jz $$5 = $$4.ai().K_();
      ftz $$6 = $$0.aE();
      gwk $$7 = $$6.a($$1);
      if ($$2) {
         List<dcv> $$8 = $$7.a($$5);

         for (int $$9 = 0; $$9 < cus.h(); $$9++) {
            dcv $$10 = $$8.get($$9);
            $$4.gs().a($$9, $$10);
            $$0.r.a($$10, 36 + $$9);
         }

         $$4.cm.d();
      } else if ($$3) {
         $$7.a($$4.gs(), $$5);
         xo $$11 = $$0.n.T[$$1].k();
         xo $$12 = $$0.n.V.k();
         xo $$13 = xo.a("inventory.hotbarSaved", $$12, $$11);
         $$0.m.a($$13, false);
         $$0.aZ().d($$13);
         $$6.a();
      }
   }

   static class a extends dak {
      public a(bxc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cut $$0) {
         dcv $$1 = this.g();
         return super.a($$0) && !$$1.f() ? $$1.a($$0.ai().L()) && !$$1.c(kq.s) : $$1.f();
      }
   }

   public static class b extends cym {
      public final ju<dcv> m = ju.a();
      private final cym n;

      public b(cut $$0) {
         super(null, 0);
         this.n = $$0.cm;
         cus $$1 = $$0.gs();

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               this.a(new ggq.a(ggq.Q, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
            }
         }

         this.a($$1, 9, 112);
         this.b(0.0F);
      }

      @Override
      public boolean b(cut $$0) {
         return true;
      }

      protected int l() {
         return bcb.e(this.m.size(), 9) - 5;
      }

      protected int a(float $$0) {
         return Math.max((int)($$0 * this.l() + 0.5), 0);
      }

      protected float e(int $$0) {
         return bcb.a((float)$$0 / this.l(), 0.0F, 1.0F);
      }

      protected float a(float $$0, double $$1) {
         return bcb.a($$0 - (float)($$1 / this.l()), 0.0F, 1.0F);
      }

      public void b(float $$0) {
         int $$1 = this.a($$0);

         for (int $$2 = 0; $$2 < 5; $$2++) {
            for (int $$3 = 0; $$3 < 9; $$3++) {
               int $$4 = $$3 + ($$2 + $$1) * 9;
               if ($$4 >= 0 && $$4 < this.m.size()) {
                  ggq.Q.a($$3 + $$2 * 9, this.m.get($$4));
               } else {
                  ggq.Q.a($$3 + $$2 * 9, dcv.l);
               }
            }
         }
      }

      public boolean m() {
         return this.m.size() > 45;
      }

      @Override
      public dcv b(cut $$0, int $$1) {
         if ($$1 >= this.k.size() - 9 && $$1 < this.k.size()) {
            dak $$2 = this.k.get($$1);
            if ($$2 != null && $$2.h()) {
               $$2.e(dcv.l);
            }
         }

         return dcv.l;
      }

      @Override
      public boolean a(dcv $$0, dak $$1) {
         return $$1.c != ggq.Q;
      }

      @Override
      public boolean b(dak $$0) {
         return $$0.c != ggq.Q;
      }

      @Override
      public dcv g() {
         return this.n.g();
      }

      @Override
      public void a(dcv $$0) {
         this.n.a($$0);
      }
   }

   static class c extends dak {
      final dak a;

      public c(dak $$0, int $$1, int $$2, int $$3) {
         super($$0.c, $$1, $$2, $$3);
         this.a = $$0;
      }

      @Override
      public void a(cut $$0, dcv $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public boolean a(dcv $$0) {
         return this.a.a($$0);
      }

      @Override
      public dcv g() {
         return this.a.g();
      }

      @Override
      public boolean h() {
         return this.a.h();
      }

      @Override
      public void a(dcv $$0, dcv $$1) {
         this.a.a($$0, $$1);
      }

      @Override
      public void f(dcv $$0) {
         this.a.f($$0);
      }

      @Override
      public void d() {
         this.a.d();
      }

      @Override
      public int a() {
         return this.a.a();
      }

      @Override
      public int b_(dcv $$0) {
         return this.a.b_($$0);
      }

      @Nullable
      @Override
      public ame c() {
         return this.a.c();
      }

      @Override
      public dcv a(int $$0) {
         return this.a.a($$0);
      }

      @Override
      public boolean b() {
         return this.a.b();
      }

      @Override
      public boolean a(cut $$0) {
         return this.a.a($$0);
      }
   }
}
