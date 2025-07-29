import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public abstract class hed<T extends bzm, S extends hkn> {
   protected static final float b = 0.025F;
   public static final int c = 24;
   public static final float d = 0.05F;
   protected final hec e;
   private final fwz a;
   protected float f;
   protected float g = 1.0F;
   private final S h = this.d();

   protected hed(hee.a $$0) {
      this.e = $$0.a();
      this.a = $$0.j();
   }

   public final int a(T $$0, float $$1) {
      jb $$2 = jb.a((jv)$$0.o($$1));
      return gxj.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, jb $$1) {
      return $$0.ai().a(dnd.a, $$1);
   }

   protected int a(T $$0, jb $$1) {
      return $$0.cb() ? 15 : $$0.ai().a(dnd.b, $$1);
   }

   public boolean a(T $$0, hbq $$1, double $$2, double $$3, double $$4) {
      if (!$$0.j($$2, $$3, $$4)) {
         return false;
      } else if (!this.b($$0)) {
         return true;
      } else {
         fin $$5 = this.a($$0).g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new fin($$0.dC() - 2.0, $$0.dE() - 2.0, $$0.dI() - 2.0, $$0.dC() + 2.0, $$0.dE() + 2.0, $$0.dI() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof cak $$6) {
               bzm $$7 = $$6.aj_();
               if ($$7 != null) {
                  fin $$8 = this.e.a($$7).a($$7);
                  return $$1.a($$8) || $$1.a($$5.b($$8));
               }
            }

            return false;
         }
      }
   }

   protected fin a(T $$0) {
      return $$0.cV();
   }

   protected boolean b(T $$0) {
      return true;
   }

   public fis a(S $$0) {
      return $$0.D != null ? $$0.D : fis.c;
   }

   public void a(S $$0, fod $$1, gxn $$2, int $$3) {
      if ($$0.G != null) {
         for (hkn.a $$4 : $$0.G) {
            a($$1, $$2, $$4);
         }
      }

      if ($$0.E != null) {
         this.a($$0, $$0.E, $$1, $$2, $$3);
      }
   }

   private static void a(fod $$0, gxn $$1, hkn.a $$2) {
      float $$3 = (float)($$2.c.d - $$2.b.d);
      float $$4 = (float)($$2.c.e - $$2.b.e);
      float $$5 = (float)($$2.c.f - $$2.b.f);
      float $$6 = bcb.j($$3 * $$3 + $$5 * $$5) * 0.05F / 2.0F;
      float $$7 = $$5 * $$6;
      float $$8 = $$3 * $$6;
      $$0.a();
      $$0.a($$2.a);
      fog $$9 = $$1.getBuffer(gxz.h());
      Matrix4f $$10 = $$0.c().a();

      for (int $$11 = 0; $$11 <= 24; $$11++) {
         a($$9, $$10, $$3, $$4, $$5, 0.05F, 0.05F, $$7, $$8, $$11, false, $$2);
      }

      for (int $$12 = 24; $$12 >= 0; $$12--) {
         a($$9, $$10, $$3, $$4, $$5, 0.05F, 0.0F, $$7, $$8, $$12, true, $$2);
      }

      $$0.b();
   }

   private static void a(fog $$0, Matrix4f $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, boolean $$10, hkn.a $$11) {
      float $$12 = $$9 / 24.0F;
      int $$13 = (int)bcb.h($$12, $$11.d, $$11.e);
      int $$14 = (int)bcb.h($$12, $$11.f, $$11.g);
      int $$15 = gxj.a($$13, $$14);
      float $$16 = $$9 % 2 == ($$10 ? 1 : 0) ? 0.7F : 1.0F;
      float $$17 = 0.5F * $$16;
      float $$18 = 0.4F * $$16;
      float $$19 = 0.3F * $$16;
      float $$20 = $$2 * $$12;
      float $$21;
      if ($$11.h) {
         $$21 = $$3 > 0.0F ? $$3 * $$12 * $$12 : $$3 - $$3 * (1.0F - $$12) * (1.0F - $$12);
      } else {
         $$21 = $$3 * $$12;
      }

      float $$23 = $$4 * $$12;
      $$0.a($$1, $$20 - $$7, $$21 + $$6, $$23 + $$8).a($$17, $$18, $$19, 1.0F).c($$15);
      $$0.a($$1, $$20 + $$7, $$21 + $$5 - $$6, $$23 - $$8).a($$17, $$18, $$19, 1.0F).c($$15);
   }

   protected boolean a(T $$0, double $$1) {
      return $$0.cQ() || $$0.i_() && $$0 == this.e.c;
   }

   public fwz e() {
      return this.a;
   }

   protected void a(S $$0, xo $$1, fod $$2, gxn $$3, int $$4) {
      fis $$5 = $$0.F;
      if ($$5 != null) {
         boolean $$6 = !$$0.B;
         int $$7 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a($$5.d, $$5.e + 0.5, $$5.f);
         $$2.a(this.e.b());
         $$2.b(0.025F, -0.025F, 0.025F);
         Matrix4f $$8 = $$2.c().a();
         fwz $$9 = this.e();
         float $$10 = -$$9.a($$1) / 2.0F;
         int $$11 = (int)(fue.R().n.a(0.25F) * 255.0F) << 24;
         $$9.a($$1, $$10, (float)$$7, -2130706433, false, $$8, $$3, $$6 ? fwz.a.b : fwz.a.a, $$11, $$4);
         if ($$6) {
            $$9.a($$1, $$10, (float)$$7, -1, false, $$8, $$3, fwz.a.a, 0, gxj.b($$4, 2));
         }

         $$2.b();
      }
   }

   @Nullable
   protected xo c(T $$0) {
      return $$0.Q_();
   }

   protected float c(S $$0) {
      return this.f;
   }

   protected float b(S $$0) {
      return this.g;
   }

   public abstract S d();

   public final S b(T $$0, float $$1) {
      S $$2 = this.h;
      this.a($$0, $$2, $$1);
      return $$2;
   }

   public void a(T $$0, S $$1, float $$2) {
      $$1.r = $$0.ap();
      $$1.s = bcb.d((double)$$2, $$0.an, $$0.dC());
      $$1.t = bcb.d((double)$$2, $$0.ao, $$0.dE());
      $$1.u = bcb.d((double)$$2, $$0.ap, $$0.dI());
      $$1.A = $$0.cs();
      $$1.v = $$0.as + $$2;
      $$1.w = $$0.ds();
      $$1.x = $$0.dt();
      $$1.y = $$0.cW();
      if ($$0.cc() && $$0.dm() instanceof cxg $$3 && $$3.f() instanceof cxv $$4 && $$4.o()) {
         double $$5 = bcb.d((double)$$2, $$3.an, $$3.dC());
         double $$6 = bcb.d((double)$$2, $$3.ao, $$3.dE());
         double $$7 = bcb.d((double)$$2, $$3.ap, $$3.dI());
         $$1.D = $$4.e($$2).d(new fis($$5, $$6, $$7));
      } else {
         $$1.D = null;
      }

      $$1.z = this.e.b($$0);
      boolean $$8 = $$1.z < 4096.0 && this.a($$0, $$1.z);
      if ($$8) {
         $$1.E = this.c($$0);
         $$1.F = $$0.du().a(bzn.c, 0, $$0.l($$2));
      } else {
         $$1.E = null;
      }

      label77: {
         $$1.B = $$0.cj();
         if ($$0 instanceof cak $$9) {
            bzm $$11 = $$9.aj_();
            if ($$11 instanceof bzm) {
               float $$11x = $$0.t($$2) * (float) (Math.PI / 180.0);
               fis $$12 = $$9.a_($$2);
               jb $$13 = jb.a((jv)$$0.n($$2));
               jb $$14 = jb.a((jv)$$11.n($$2));
               int $$15 = this.a($$0, $$13);
               int $$16 = this.e.a($$11).a($$11, $$14);
               int $$17 = $$0.ai().a(dnd.a, $$13);
               int $$18 = $$0.ai().a(dnd.a, $$14);
               boolean $$19 = $$11.dL() && $$9.D();
               int $$20 = $$19 ? 4 : 1;
               if ($$1.G == null || $$1.G.size() != $$20) {
                  $$1.G = new ArrayList<>($$20);

                  for (int $$21 = 0; $$21 < $$20; $$21++) {
                     $$1.G.add(new hkn.a());
                  }
               }

               if ($$19) {
                  float $$22 = $$11.t($$2) * (float) (Math.PI / 180.0);
                  fis $$23 = $$11.p($$2);
                  fis[] $$24 = $$9.E();
                  fis[] $$25 = $$11.dK();
                  int $$26 = 0;

                  while (true) {
                     if ($$26 >= $$20) {
                        break label77;
                     }

                     hkn.a $$27 = $$1.G.get($$26);
                     $$27.a = $$24[$$26].b(-$$11x);
                     $$27.b = $$0.p($$2).e($$27.a);
                     $$27.c = $$23.e($$25[$$26].b(-$$22));
                     $$27.d = $$15;
                     $$27.e = $$16;
                     $$27.f = $$17;
                     $$27.g = $$18;
                     $$27.h = false;
                     $$26++;
                  }
               } else {
                  fis $$28 = $$12.b(-$$11x);
                  hkn.a $$29 = $$1.G.getFirst();
                  $$29.a = $$28;
                  $$29.b = $$0.p($$2).e($$28);
                  $$29.c = $$11.u($$2);
                  $$29.d = $$15;
                  $$29.e = $$16;
                  $$29.f = $$17;
                  $$29.g = $$18;
                  break label77;
               }
            }
         }

         $$1.G = null;
      }

      $$1.C = $$0.cJ();
      fue $$30 = fue.R();
      if ($$30.ar().a() && !$$1.A && !$$30.aA()) {
         this.b($$0, $$1, $$2);
      } else {
         $$1.H = null;
         $$1.I = null;
      }
   }

   private void b(T $$0, S $$1, float $$2) {
      $$1.H = this.a($$0, $$2, false);
      $$1.I = null;
   }

   private hld a(T $$0, float $$1, boolean $$2) {
      Builder<hlc> $$3 = new Builder();
      fin $$4 = $$0.cV();
      hlc $$5;
      if ($$2) {
         $$5 = new hlc($$4.a - $$0.dC(), $$4.b - $$0.dE(), $$4.c - $$0.dI(), $$4.d - $$0.dC(), $$4.e - $$0.dE(), $$4.f - $$0.dI(), 0.0F, 1.0F, 0.0F);
      } else {
         $$5 = new hlc($$4.a - $$0.dC(), $$4.b - $$0.dE(), $$4.c - $$0.dI(), $$4.d - $$0.dC(), $$4.e - $$0.dE(), $$4.f - $$0.dI(), 1.0F, 1.0F, 1.0F);
      }

      $$3.add($$5);
      bzm $$7 = $$0.dm();
      if ($$7 != null) {
         float $$8 = Math.min($$7.ds(), $$0.ds()) / 2.0F;
         float $$9 = 0.0625F;
         fis $$10 = $$7.n($$0).d($$0.dv());
         hlc $$11 = new hlc($$10.d - $$8, $$10.e, $$10.f - $$8, $$10.d + $$8, $$10.e + 0.0625, $$10.f + $$8, 1.0F, 1.0F, 0.0F);
         $$3.add($$11);
      }

      this.a($$0, $$3, $$1);
      fis $$12 = $$0.h($$1);
      return new hld($$12.d, $$12.e, $$12.f, $$3.build());
   }

   protected void a(T $$0, Builder<hlc> $$1, float $$2) {
   }

   @Nullable
   private static bzm d(bzm $$0) {
      hwf $$1 = fue.R().W();
      if ($$1 != null) {
         aub $$2 = $$1.a($$0.ai().aj());
         if ($$2 != null) {
            return $$2.a($$0.ar());
         }
      }

      return null;
   }
}
