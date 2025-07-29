import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector2i;

public abstract class gfz<T extends cym> extends get implements ghg<T> {
   public static final ame a = ame.b("textures/gui/container/inventory.png");
   private static final ame E = ame.b("container/slot_highlight_back");
   private static final ame F = ame.b("container/slot_highlight_front");
   protected static final int b = 256;
   protected static final int c = 256;
   private static final float G = 100.0F;
   private static final int H = 500;
   protected int d = 176;
   protected int e = 166;
   protected int f;
   protected int u;
   protected int v;
   protected int w;
   private final List<fxd> I;
   protected final T x;
   protected final xo y;
   @Nullable
   protected dak z;
   @Nullable
   private dak J;
   @Nullable
   private dak K;
   @Nullable
   private dak L;
   @Nullable
   private gfz.a M;
   protected int A;
   protected int B;
   private boolean N;
   private dcv O = dcv.l;
   private long P;
   protected final Set<dak> C = Sets.newHashSet();
   protected boolean D;
   private int Q;
   private int R;
   private boolean S;
   private int T;
   private long U;
   private int V;
   private boolean W;
   private dcv X = dcv.l;

   public gfz(T $$0, cus $$1, xo $$2) {
      super($$2);
      this.x = $$0;
      this.y = $$1.Q_();
      this.S = true;
      this.f = 8;
      this.u = 6;
      this.v = 8;
      this.w = this.e - 94;
      this.I = new ArrayList<>();
   }

   @Override
   protected void aV_() {
      this.A = (this.o - this.d) / 2;
      this.B = (this.p - this.e) / 2;
      this.I.clear();
      this.a(new fwx(this.n));
   }

   protected void a(fxd $$0) {
      this.I.add($$0);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      this.d($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      this.d($$0);
   }

   public void d(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      super.a($$0, $$1, $$2, $$3);
      $$0.e().pushMatrix();
      $$0.e().translate($$4, $$5);
      this.c($$0, $$1, $$2);
      dak $$6 = this.z;
      this.z = this.b($$1, $$2);
      this.f($$0);
      this.e($$0);
      this.g($$0);
      if ($$6 != null && $$6 != this.z) {
         this.a($$6);
      }

      $$0.e().popMatrix();
   }

   public void a(fxb $$0, int $$1, int $$2) {
      dcv $$3 = this.O.f() ? this.x.g() : this.O;
      if (!$$3.f()) {
         int $$4 = 8;
         int $$5 = this.O.f() ? 8 : 16;
         String $$6 = null;
         if (!this.O.f() && this.N) {
            $$3 = $$3.c(bcb.f($$3.M() / 2.0F));
         } else if (this.D && this.C.size() > 1) {
            $$3 = $$3.c(this.T);
            if ($$3.f()) {
               $$6 = o.o + "0";
            }
         }

         $$0.c();
         this.a($$0, $$3, $$1 - 8, $$2 - $$5, $$6);
      }
   }

   public void d(fxb $$0) {
      if (this.M != null) {
         float $$1 = bcb.a((float)(ag.c() - this.M.d) / 100.0F, 0.0F, 1.0F);
         int $$2 = this.M.c.x - this.M.b.x;
         int $$3 = this.M.c.y - this.M.b.y;
         int $$4 = this.M.b.x + (int)($$2 * $$1);
         int $$5 = this.M.b.y + (int)($$3 * $$1);
         $$0.c();
         this.a($$0, this.M.a, $$4, $$5, null);
         if ($$1 >= 1.0F) {
            this.M = null;
         }
      }
   }

   protected void e(fxb $$0) {
      for (dak $$1 : this.x.k) {
         if ($$1.b()) {
            this.a($$0, $$1);
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.z != null && this.z.h()) {
         for (fxd $$4 : this.I) {
            if ($$4.a(this.z) && $$4.a($$2, $$3, this.z.d, this.z.g())) {
               return true;
            }
         }
      }

      return false;
   }

   private void f(fxb $$0) {
      if (this.z != null && this.z.e()) {
         $$0.a(gxx.ar, E, this.z.e - 4, this.z.f - 4, 24, 24);
      }
   }

   private void g(fxb $$0) {
      if (this.z != null && this.z.e()) {
         $$0.a(gxx.ar, F, this.z.e - 4, this.z.f - 4, 24, 24);
      }
   }

   protected void b(fxb $$0, int $$1, int $$2) {
      if (this.z != null && this.z.h()) {
         dcv $$3 = this.z.g();
         if (this.x.g().f() || this.b($$3)) {
            $$0.a(this.q, this.a($$3), $$3.b(), $$1, $$2, $$3.a(kq.G));
         }
      }
   }

   private boolean b(dcv $$0) {
      return $$0.b().map(ghx::a).map(ghx::a).orElse(false);
   }

   protected List<xo> a(dcv $$0) {
      return a(this.n, $$0);
   }

   private void a(fxb $$0, dcv $$1, int $$2, int $$3, @Nullable String $$4) {
      $$0.a($$1, $$2, $$3);
      $$0.a(this.q, $$1, $$2, $$3 - (this.O.f() ? 0 : 8), $$4);
   }

   protected void c(fxb $$0, int $$1, int $$2) {
      $$0.a(this.q, this.m, this.f, this.u, -12566464, false);
      $$0.a(this.q, this.y, this.v, this.w, -12566464, false);
   }

   protected abstract void a(fxb var1, float var2, int var3, int var4);

   protected void a(fxb $$0, dak $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      dcv $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.J && !this.O.f() && !this.N;
      dcv $$7 = this.x.g();
      String $$8 = null;
      if ($$1 == this.J && !this.O.f() && this.N && !$$4.f()) {
         $$4 = $$4.c($$4.M() / 2);
      } else if (this.D && this.C.contains($$1) && !$$7.f()) {
         if (this.C.size() == 1) {
            return;
         }

         if (cym.a($$1, $$7, true) && this.x.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.k(), $$1.b_($$7));
            int $$10 = $$1.g().f() ? 0 : $$1.g().M();
            int $$11 = cym.a(this.C, this.Q, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = o.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.C.remove($$1);
            this.E();
         }
      }

      if ($$4.f() && $$1.b()) {
         ame $$12 = $$1.c();
         if ($$12 != null) {
            $$0.a(gxx.ar, $$12, $$2, $$3, 16, 16);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         int $$13 = $$1.e + $$1.f * this.d;
         if ($$1.f()) {
            $$0.b($$4, $$2, $$3, $$13);
         } else {
            $$0.a($$4, $$2, $$3, $$13);
         }

         $$0.a(this.q, $$4, $$2, $$3, $$8);
      }
   }

   private void E() {
      dcv $$0 = this.x.g();
      if (!$$0.f() && this.D) {
         if (this.Q == 2) {
            this.T = $$0.k();
         } else {
            this.T = $$0.M();

            for (dak $$1 : this.C) {
               dcv $$2 = $$1.g();
               int $$3 = $$2.f() ? 0 : $$2.M();
               int $$4 = Math.min($$0.k(), $$1.b_($$0));
               int $$5 = Math.min(cym.a(this.C, this.Q, $$0) + $$3, $$4);
               this.T -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private dak b(double $$0, double $$1) {
      for (dak $$2 : this.x.k) {
         if ($$2.b() && this.a($$2, $$0, $$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         boolean $$3 = this.n.n.H.a($$2) && this.n.t.gc();
         dak $$4 = this.b($$0, $$1);
         long $$5 = ag.c();
         this.W = this.L == $$4 && $$5 - this.U < 250L && this.V == $$2;
         this.S = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.A;
            int $$7 = this.B;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.d;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.n.n.ad().c() && $$8 && this.x.g().f()) {
               this.aP_();
               return true;
            }

            if ($$9 != -1) {
               if (this.n.n.ad().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.J = $$4;
                     this.O = dcv.l;
                     this.N = $$2 == 1;
                  } else {
                     this.J = null;
                  }
               } else if (!this.D) {
                  if (this.x.g().f()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cyx.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fna.a(fue.R().aP().h(), 340) || fna.a(fue.R().aP().h(), 344));
                        cyx $$11 = cyx.a;
                        if ($$10) {
                           this.X = $$4 != null && $$4.h() ? $$4.g().v() : dcv.l;
                           $$11 = cyx.b;
                        } else if ($$9 == -999) {
                           $$11 = cyx.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.S = true;
                  } else {
                     this.D = true;
                     this.R = $$2;
                     this.C.clear();
                     if ($$2 == 0) {
                        this.Q = 0;
                     } else if ($$2 == 1) {
                        this.Q = 1;
                     } else if ($$3) {
                        this.Q = 2;
                     }
                  }
               }
            }
         }

         this.L = $$4;
         this.U = $$5;
         this.V = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.z != null && this.x.g().f()) {
         if (this.n.n.D.a($$0)) {
            this.a(this.z, this.z.d, 40, cyx.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.n.n.T[$$1].a($$0)) {
               this.a(this.z, this.z.d, $$1, cyx.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < $$2 || $$1 < $$3 || $$0 >= $$2 + this.d || $$1 >= $$3 + this.e;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      dak $$5 = this.b($$0, $$1);
      dcv $$6 = this.x.g();
      if (this.J != null && this.n.n.ad().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.O.f()) {
               if ($$5 != this.J && !this.J.g().f()) {
                  this.O = this.J.g().v();
               }
            } else if (this.O.M() > 1 && $$5 != null && cym.a($$5, this.O, false)) {
               long $$7 = ag.c();
               if (this.K == $$5) {
                  if ($$7 - this.P > 500L) {
                     this.a(this.J, this.J.d, 0, cyx.a);
                     this.a($$5, $$5.d, 1, cyx.a);
                     this.a(this.J, this.J.d, 0, cyx.a);
                     this.P = $$7 + 750L;
                     this.O.h(1);
                  }
               } else {
                  this.K = $$5;
                  this.P = $$7;
               }
            }
         }
      } else if (this.D && $$5 != null && !$$6.f() && ($$6.M() > this.C.size() || this.Q == 2) && cym.a($$5, $$6, true) && $$5.a($$6) && this.x.b($$5)) {
         this.C.add($$5);
         this.E();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      dak $$3 = this.b($$0, $$1);
      int $$4 = this.A;
      int $$5 = this.B;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.d;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.W && $$3 != null && $$2 == 0 && this.x.a(dcv.l, $$3)) {
         if (t()) {
            if (!this.X.f()) {
               for (dak $$8 : this.x.k) {
                  if ($$8 != null && $$8.a(this.n.t) && $$8.h() && $$8.c == $$3.c && cym.a($$8, this.X, true)) {
                     this.a($$8, $$8.d, $$2, cyx.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cyx.g);
         }

         this.W = false;
         this.U = 0L;
      } else {
         if (this.D && this.R != $$2) {
            this.D = false;
            this.C.clear();
            this.S = true;
            return true;
         }

         if (this.S) {
            this.S = false;
            return true;
         }

         if (this.J != null && this.n.n.ad().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.O.f() && $$3 != this.J) {
                  this.O = this.J.g();
               }

               boolean $$9 = cym.a($$3, this.O, false);
               if ($$7 != -1 && !this.O.f() && $$9) {
                  this.a(this.J, this.J.d, $$2, cyx.a);
                  this.a($$3, $$7, 0, cyx.a);
                  if (this.x.g().f()) {
                     this.M = null;
                  } else {
                     this.a(this.J, this.J.d, $$2, cyx.a);
                     this.M = new gfz.a(this.O, new Vector2i((int)$$0, (int)$$1), new Vector2i(this.J.e + $$4, this.J.f + $$5), ag.c());
                  }
               } else if (!this.O.f()) {
                  this.M = new gfz.a(this.O, new Vector2i((int)$$0, (int)$$1), new Vector2i(this.J.e + $$4, this.J.f + $$5), ag.c());
               }

               this.l();
            }
         } else if (this.D && !this.C.isEmpty()) {
            this.a(null, -999, cym.c(0, this.Q), cyx.f);

            for (dak $$10 : this.C) {
               this.a($$10, $$10.d, cym.c(1, this.Q), cyx.f);
            }

            this.a(null, -999, cym.c(2, this.Q), cyx.f);
         } else if (!this.x.g().f()) {
            if (this.n.n.H.a($$2)) {
               this.a($$3, $$7, $$2, cyx.d);
            } else {
               boolean $$11 = $$7 != -999 && (fna.a(fue.R().aP().h(), 340) || fna.a(fue.R().aP().h(), 344));
               if ($$11) {
                  this.X = $$3 != null && $$3.h() ? $$3.g().v() : dcv.l;
               }

               this.a($$3, $$7, $$2, $$11 ? cyx.b : cyx.a);
            }
         }
      }

      if (this.x.g().f()) {
         this.U = 0L;
      }

      this.D = false;
      return true;
   }

   public void l() {
      this.O = dcv.l;
      this.J = null;
   }

   private boolean a(dak $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.A;
      int $$7 = this.B;
      $$4 -= $$6;
      $$5 -= $$7;
      return $$4 >= $$0 - 1 && $$4 < $$0 + $$2 + 1 && $$5 >= $$1 - 1 && $$5 < $$1 + $$3 + 1;
   }

   private void a(dak $$0) {
      if ($$0.h()) {
         for (fxd $$1 : this.I) {
            if ($$1.a($$0)) {
               $$1.b($$0);
            }
         }
      }
   }

   protected void a(dak $$0, int $$1, int $$2, cyx $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.a($$0, $$3);
      this.n.r.a(this.x.l, $$1, $$2, $$3, this.n.t);
   }

   void a(@Nullable dak $$0, cyx $$1) {
      if ($$0 != null && $$0.h()) {
         for (fxd $$2 : this.I) {
            if ($$2.a($$0)) {
               $$2.a($$0, $$1);
            }
         }
      }
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.n.r.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.n.n.C.a($$0, $$1)) {
         this.aP_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.z != null && this.z.h()) {
            if (this.n.n.H.a($$0, $$1)) {
               this.a(this.z, this.z.d, 0, cyx.d);
            } else if (this.n.n.E.a($$0, $$1)) {
               this.a(this.z, this.z.d, s() ? 1 : 0, cyx.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.x.g().f() && this.z != null) {
         if (this.n.n.D.a($$0, $$1)) {
            this.a(this.z, this.z.d, 40, cyx.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.n.n.T[$$2].a($$0, $$1)) {
               this.a(this.z, this.z.d, $$2, cyx.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void aI_() {
      if (this.n.t != null) {
         this.x.a(this.n.t);
      }
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.n.t.bO() && !this.n.t.dU()) {
         this.m();
      } else {
         this.n.t.p();
      }
   }

   protected void m() {
   }

   @Override
   public T n() {
      return this.x;
   }

   @Override
   public void aP_() {
      this.n.t.p();
      if (this.z != null) {
         this.a(this.z);
      }

      super.aP_();
   }

   record a(dcv a, Vector2i b, Vector2i c, long d) {
   }
}
