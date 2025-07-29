import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gge extends gfz<cyr> {
   private static final ame E = ame.b("textures/gui/container/beacon.png");
   static final ame F = ame.b("container/beacon/button_disabled");
   static final ame G = ame.b("container/beacon/button_selected");
   static final ame H = ame.b("container/beacon/button_highlighted");
   static final ame I = ame.b("container/beacon/button");
   static final ame J = ame.b("container/beacon/confirm");
   static final ame K = ame.b("container/beacon/cancel");
   private static final xo L = xo.c("block.minecraft.beacon.primary");
   private static final xo M = xo.c("block.minecraft.beacon.secondary");
   private final List<gge.a> N = Lists.newArrayList();
   @Nullable
   jl<byo> O;
   @Nullable
   jl<byo> P;

   public gge(final cyr $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.d = 230;
      this.e = 219;
      $$0.a(new cza() {
         @Override
         public void a(cym $$0x, int $$1x, dcv $$2x) {
         }

         @Override
         public void a(cym $$0x, int $$1x, int $$2x) {
            gge.this.O = $$0.m();
            gge.this.P = $$0.n();
         }
      });
   }

   private <T extends fxm & gge.a> void a(T $$0) {
      this.c($$0);
      this.N.add($$0);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.N.clear();
      this.a(new gge.c(this.A + 164, this.B + 107));
      this.a(new gge.b(this.A + 190, this.B + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = eau.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jl<byo> $$4 = eau.a.get($$0).get($$3);
            gge.d $$5 = new gge.d(this.A + 76 + $$3 * 24 - $$2 / 2, this.B + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = eau.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jl<byo> $$10 = eau.a.get(3).get($$9);
         gge.d $$11 = new gge.d(this.A + 167 + $$9 * 24 - $$8 / 2, this.B + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jl<byo> $$12 = eau.a.get(0).get(0);
      gge.d $$13 = new gge.g(this.A + 167 + ($$7 - 1) * 24 - $$8 / 2, this.B + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void m() {
      super.m();
      this.E();
   }

   @Override
   void E() {
      int $$0 = this.x.l();
      this.N.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2) {
      $$0.a(this.q, L, 62, 10, -2039584);
      $$0.a(this.q, M, 169, 10, -2039584);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.o - this.d) / 2;
      int $$5 = (this.p - this.e) / 2;
      $$0.a(gxx.ar, E, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      $$0.a(new dcv(dcz.pP), $$4 + 20, $$5 + 109);
      $$0.a(new dcv(dcz.pF), $$4 + 41, $$5 + 109);
      $$0.a(new dcv(dcz.pE), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new dcv(dcz.pO), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new dcv(dcz.pK), $$4 + 42 + 66, $$5 + 109);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.b($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends gge.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, gge.K, xn.e);
      }

      @Override
      public void b() {
         gge.this.n.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends gge.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, gge.J, xn.d);
      }

      @Override
      public void b() {
         gge.this.n.M().b(new ajd(Optional.ofNullable(gge.this.O), Optional.ofNullable(gge.this.P)));
         gge.this.n.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = gge.this.x.o() && gge.this.O != null;
      }
   }

   class d extends gge.e {
      private final boolean c;
      protected final int a;
      private jl<byo> d;
      private ame f;

      public d(final int $$0, final int $$1, final jl<byo> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jl<byo> $$0) {
         this.d = $$0;
         this.f = fxa.a($$0);
         this.a(fzb.a(this.b($$0), null));
      }

      protected yc b(jl<byo> $$0) {
         return xo.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               gge.this.O = this.d;
            } else {
               gge.this.P = this.d;
            }

            gge.this.E();
         }
      }

      @Override
      protected void a(fxb $$0) {
         $$0.a(gxx.ar, this.f, this.E() + 2, this.F() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? gge.this.O : gge.this.P));
      }

      @Override
      protected yc d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fxe implements gge.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xn.a);
      }

      protected e(int $$0, int $$1, xo $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         ame $$4;
         if (!this.j) {
            $$4 = gge.F;
         } else if (this.a) {
            $$4 = gge.G;
         } else if (this.C()) {
            $$4 = gge.H;
         } else {
            $$4 = gge.I;
         }

         $$0.a(gxx.ar, $$4, this.E(), this.F(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fxb var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(gbt $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends gge.e {
      private final ame a;

      protected f(int $$0, int $$1, ame $$2, xo $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fxb $$0) {
         $$0.a(gxx.ar, this.a, this.E() + 2, this.F() + 2, 18, 18);
      }
   }

   class g extends gge.d {
      public g(final int $$0, final int $$1, final jl<byo> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected yc b(jl<byo> $$0) {
         return xo.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (gge.this.O != null) {
            this.k = true;
            this.a(gge.this.O);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
