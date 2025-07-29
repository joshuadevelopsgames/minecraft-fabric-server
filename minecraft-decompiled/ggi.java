import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class ggi extends get {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   private static final int x = 256;
   private static final int y = 256;
   private static final xo z = xo.c("book.view.title");
   public static final ggi.a d = new ggi.a(List.of());
   public static final ame e = ame.b("textures/gui/book.png");
   protected static final int f = 114;
   protected static final int u = 128;
   protected static final int v = 192;
   protected static final int w = 192;
   private ggi.a A;
   private int B;
   private List<bbm> C = Collections.emptyList();
   private int D = -1;
   private xo E = xn.a;
   private ghj F;
   private ghj G;
   private final boolean H;

   public ggi(ggi.a $$0) {
      this($$0, true);
   }

   public ggi() {
      this(d, false);
   }

   private ggi(ggi.a $$0, boolean $$1) {
      super(z);
      this.A = $$0;
      this.H = $$1;
   }

   public void a(ggi.a $$0) {
      this.A = $$0;
      this.B = bcb.a(this.B, 0, $$0.a());
      this.K();
      this.D = -1;
   }

   public boolean a(int $$0) {
      int $$1 = bcb.a($$0, 0, this.A.a() - 1);
      if ($$1 != this.B) {
         this.B = $$1;
         this.K();
         this.D = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aV_() {
      this.l();
      this.m();
   }

   @Override
   public xo i() {
      return xn.b(super.i(), this.n(), this.A.a(this.B));
   }

   private xo n() {
      return xo.a("book.pageIndicator", this.B + 1, Math.max(this.H(), 1));
   }

   protected void l() {
      this.c(fxo.a(xn.d, $$0 -> this.aP_()).a(this.o / 2 - 100, 196, 200, 20).a());
   }

   protected void m() {
      int $$0 = (this.o - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new ghj($$0 + 116, 159, true, $$0x -> this.F(), this.H));
      this.G = this.c(new ghj($$0 + 43, 159, false, $$0x -> this.E(), this.H));
      this.K();
   }

   private int H() {
      return this.A.a();
   }

   protected void E() {
      if (this.B > 0) {
         this.B--;
      }

      this.K();
   }

   protected void F() {
      if (this.B < this.H() - 1) {
         this.B++;
      }

      this.K();
   }

   private void K() {
      this.F.k = this.B < this.H() - 1;
      this.G.k = this.B > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.G.b();
               return true;
            case 267:
               this.F.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 192) / 2;
      int $$5 = 2;
      if (this.D != this.B) {
         xt $$6 = this.A.a(this.B);
         this.C = this.q.c($$6, 114);
         this.E = this.n();
      }

      this.D = this.B;
      int $$7 = this.q.a(this.E);
      $$0.a(this.q, this.E, $$4 - $$7 + 192 - 44, 18, -16777216, false);
      int $$8 = Math.min(128 / 9, this.C.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         bbm $$10 = this.C.get($$9);
         $$0.a(this.q, $$10, $$4 + 36, 32 + $$9 * 9, -16777216, false);
      }

      yl $$11 = this.b($$1, $$2);
      if ($$11 != null) {
         $$0.a(this.q, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
      $$0.a(gxx.ar, e, (this.o - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         yl $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fue $$0, xm $$1) {
      gwi $$2 = Objects.requireNonNull($$0.t, "Player not available");
      switch ($$1) {
         case xm.b var6:
            xm.b var15 = var6;

            try {
               var16 = var15.b();
            } catch (Throwable var12) {
               throw new MatchException(var12.toString(), var12);
            }

            int var13 = var16;
            this.b(var13 - 1);
            break;
         case xm.g var8:
            xm.g var10000 = var8;

            try {
               var14 = var10000.b();
            } catch (Throwable var11) {
               throw new MatchException(var11.toString(), var11);
            }

            String var10 = var14;
            this.G();
            a($$2, var10, null);
            break;
         default:
            a($$1, $$0, this);
      }
   }

   protected void G() {
   }

   @Nullable
   public yl b(double $$0, double $$1) {
      if (this.C.isEmpty()) {
         return null;
      } else {
         int $$2 = bcb.a($$0 - (this.o - 192) / 2 - 36.0);
         int $$3 = bcb.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.C.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.C.size()) {
                  bbm $$6 = this.C.get($$5);
                  return this.n.h.b().a($$6, $$2);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public record a(List<xo> a) {
      public int a() {
         return this.a.size();
      }

      public xo a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xn.a;
      }

      @Nullable
      public static ggi.a a(dcv $$0) {
         boolean $$1 = fue.R().aU();
         dgf $$2 = $$0.a(kq.V);
         if ($$2 != null) {
            return new ggi.a($$2.a($$1));
         } else {
            dge $$3 = $$0.a(kq.U);
            return $$3 != null ? new ggi.a($$3.a($$1).map(xo::b).toList()) : null;
         }
      }

      public List<xo> b() {
         return this.a;
      }
   }
}
