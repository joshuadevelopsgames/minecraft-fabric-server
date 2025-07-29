import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gdu extends get {
   private static final xo b = xo.c("createWorld.customize.flat.title");
   static final ame c = ame.b("container/slot");
   private static final int d = 18;
   private static final int e = 20;
   private static final int f = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private final gbk x = new gbk(this, 33, 64);
   protected final gkl a;
   private final Consumer<etb> y;
   etb z;
   @Nullable
   private gdu.a A;
   @Nullable
   private fxo B;

   public gdu(gkl $$0, Consumer<etb> $$1, etb $$2) {
      super(b);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   public etb k() {
      return this.z;
   }

   public void a(etb $$0) {
      this.z = $$0;
      if (this.A != null) {
         this.A.c();
         this.l();
      }
   }

   @Override
   protected void aV_() {
      this.x.a(this.m, this.q);
      this.A = this.x.c(new gdu.a());
      gbo $$0 = this.x.b(gbo.d().a(4));
      $$0.c().e();
      gbo $$1 = $$0.a(gbo.e().a(8));
      gbo $$2 = $$0.a(gbo.e().a(8));
      this.B = $$1.a(fxo.a(xo.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.m()) {
            List<esy> $$1x = this.z.e();
            int $$2x = this.A.aH_().indexOf(this.A.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.A.a($$1x.isEmpty() ? null : this.A.aH_().get(Math.min($$2x, $$1x.size() - 1)));
            this.z.g();
            this.A.c();
            this.l();
         }
      }).a());
      $$1.a(fxo.a(xo.c("createWorld.customize.presets"), $$0x -> {
         this.n.a(new gep(this));
         this.z.g();
         this.l();
      }).a());
      $$2.a(fxo.a(xn.d, $$0x -> {
         this.y.accept(this.z);
         this.aP_();
         this.z.g();
      }).a());
      $$2.a(fxo.a(xn.e, $$0x -> {
         this.aP_();
         this.z.g();
      }).a());
      this.z.g();
      this.l();
      this.x.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.o, this.x);
      }

      this.x.a();
   }

   void l() {
      if (this.B != null) {
         this.B.j = this.m();
      }
   }

   private boolean m() {
      return this.A != null && this.A.p() != null;
   }

   @Override
   public void aP_() {
      this.n.a(this.a);
   }

   class a extends fyl<gdu.a.a> {
      private static final xo m = xo.c("createWorld.customize.flat.tile").a(o.t);
      private static final xo n = xo.c("createWorld.customize.flat.height").a(o.t);

      public a() {
         super(gdu.this.n, gdu.this.o, gdu.this.p - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < gdu.this.z.e().size(); $$0++) {
            this.b(new gdu.a.a());
         }
      }

      public void a(@Nullable gdu.a.a $$0) {
         super.a($$0);
         gdu.this.l();
      }

      public void c() {
         int $$0 = this.aH_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < gdu.this.z.e().size(); $$1++) {
            this.b(new gdu.a.a());
         }

         List<gdu.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fxb $$0, int $$1, int $$2) {
         $$0.b(gdu.this.q, m, $$1, $$2, -1);
         $$0.b(gdu.this.q, n, $$1 + this.a() - gdu.this.q.a(n) - 8, $$2, -1);
      }

      class a extends fyl.a<gdu.a.a> {
         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            esy $$10 = gdu.this.z.e().get(gdu.this.z.e().size() - $$1 - 1);
            eeb $$11 = $$10.b();
            dcv $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(gdu.this.q, $$12.y(), $$3 + 18 + 5, $$13, -1);
            xo $$14;
            if ($$1 == 0) {
               $$14 = xo.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == gdu.this.z.e().size() - 1) {
               $$14 = xo.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = xo.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(gdu.this.q, $$14, $$3 + $$4 - gdu.this.q.a($$14) - 8, $$13, -1);
         }

         private dcv a(eeb $$0) {
            dcr $$1 = $$0.b().h();
            if ($$1 == dcz.a) {
               if ($$0.a(dqb.J)) {
                  $$1 = dcz.rG;
               } else if ($$0.a(dqb.K)) {
                  $$1 = dcz.rH;
               }
            }

            return new dcv($$1);
         }

         @Override
         public xo a() {
            esy $$0 = gdu.this.z.e().get(gdu.this.z.e().size() - a.this.aH_().indexOf(this) - 1);
            dcv $$1 = this.a($$0.b());
            return (xo)(!$$1.f() ? xo.a("narrator.select", $$1.y()) : xn.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fxb $$0, int $$1, int $$2, dcv $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fxb $$0, int $$1, int $$2) {
            $$0.a(gxx.ar, gdu.c, $$1, $$2, 18, 18);
         }
      }
   }
}
