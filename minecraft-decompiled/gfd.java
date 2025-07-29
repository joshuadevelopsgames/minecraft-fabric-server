import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gfd extends get implements grf.a {
   private static final ame w = ame.b("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int x = 9;
   private static final int y = 18;
   public static final int c = 234;
   public static final int d = 113;
   private static final int z = 8;
   private static final int A = 6;
   private static final int B = 256;
   private static final int C = 256;
   public static final int e = 16;
   public static final int f = 16;
   public static final int u = 14;
   public static final int v = 7;
   private static final double D = 16.0;
   private static final xo E = xo.c("advancements.sad_label");
   private static final xo F = xo.c("advancements.empty");
   private static final xo G = xo.c("gui.advancements");
   private final gbk H = new gbk(this);
   @Nullable
   private final get I;
   private final grf J;
   private final Map<aj, gez> K = Maps.newLinkedHashMap();
   @Nullable
   private gez L;
   private boolean M;

   public gfd(grf $$0) {
      this($$0, null);
   }

   public gfd(grf $$0, @Nullable get $$1) {
      super(G);
      this.J = $$0;
      this.I = $$1;
   }

   @Override
   protected void aV_() {
      this.H.a(G, this.q);
      this.K.clear();
      this.L = null;
      this.J.a(this);
      if (this.L == null && !this.K.isEmpty()) {
         gez $$0 = this.K.values().iterator().next();
         this.J.a($$0.c().b(), true);
      } else {
         this.J.a(this.L == null ? null : this.L.c().b(), true);
      }

      this.H.b(fxo.a(xn.d, $$0x -> this.aP_()).a(200).a());
      this.H.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.H.a();
   }

   @Override
   public void aP_() {
      this.n.a(this.I);
   }

   @Override
   public void aI_() {
      this.J.a(null);
      grl $$0 = this.n.M();
      if ($$0 != null) {
         $$0.b(aja.b());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.o - 252) / 2;
         int $$4 = (this.p - 140) / 2;

         for (gez $$5 : this.K.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.J.a($$5.c().b(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.n.n.R.a($$0, $$1)) {
         this.n.a(null);
         this.n.o.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 252) / 2;
      int $$5 = (this.p - 140) / 2;
      $$0.c();
      this.b($$0, $$4, $$5);
      $$0.c();
      this.a($$0, $$4, $$5);
      this.b($$0, $$1, $$2, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if ($$2 != 0) {
         this.M = false;
         return false;
      } else {
         if (!this.M) {
            this.M = true;
         } else if (this.L != null) {
            this.L.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.L != null) {
         this.L.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void b(fxb $$0, int $$1, int $$2) {
      gez $$3 = this.L;
      if ($$3 == null) {
         $$0.a($$1 + 9, $$2 + 18, $$1 + 9 + 234, $$2 + 18 + 113, -16777216);
         int $$4 = $$1 + 9 + 117;
         $$0.a(this.q, F, $$4, $$2 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.q, E, $$4, $$2 + 18 + 113 - 9, -1);
      } else {
         $$3.b($$0, $$1 + 9, $$2 + 18);
      }
   }

   public void a(fxb $$0, int $$1, int $$2) {
      $$0.a(gxx.ar, w, $$1, $$2, 0.0F, 0.0F, 252, 140, 256, 256);
      if (this.K.size() > 1) {
         for (gez $$3 : this.K.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.L);
         }

         for (gez $$4 : this.K.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.q, this.L != null ? this.L.d() : G, $$1 + 8, $$2 + 6, -12566464, false);
   }

   private void b(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L != null) {
         $$0.e().pushMatrix();
         $$0.e().translate($$3 + 9, $$4 + 18);
         $$0.c();
         this.L.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         $$0.e().popMatrix();
      }

      if (this.K.size() > 1) {
         for (gez $$5 : this.K.values()) {
            if ($$5.a($$3, $$4, $$1, $$2)) {
               $$0.a(this.q, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ak $$0) {
      gez $$1 = gez.a(this.n, this, this.K.size(), $$0);
      if ($$1 != null) {
         this.K.put($$0.b(), $$1);
      }
   }

   @Override
   public void b(ak $$0) {
   }

   @Override
   public void c(ak $$0) {
      gez $$1 = this.f($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ak $$0) {
   }

   @Override
   public void a(ak $$0, al $$1) {
      gfb $$2 = this.e($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void a(@Nullable aj $$0) {
      this.L = this.K.get($$0);
   }

   @Override
   public void a() {
      this.K.clear();
      this.L = null;
   }

   @Nullable
   public gfb e(ak $$0) {
      gez $$1 = this.f($$0);
      return $$1 == null ? null : $$1.a($$0.b());
   }

   @Nullable
   private gez f(ak $$0) {
      ak $$1 = $$0.d();
      return this.K.get($$1.b());
   }
}
