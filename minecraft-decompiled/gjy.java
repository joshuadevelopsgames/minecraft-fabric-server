import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gjy extends get {
   private static final xo a = xo.c("gui.abuseReport.reason.title");
   private static final xo b = xo.c("gui.abuseReport.reason.description");
   private static final xo c = xo.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int e = 62;
   private static final int f = 4;
   @Nullable
   private final get u;
   @Nullable
   private gjy.a v;
   @Nullable
   gsr w;
   private final Consumer<gsr> x;
   final gbk y = new gbk(this);
   final gss z;

   public gjy(@Nullable get $$0, @Nullable gsr $$1, gss $$2, Consumer<gsr> $$3) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$3;
      this.z = $$2;
   }

   @Override
   protected void aV_() {
      this.y.a(a, this.q);
      gbo $$0 = this.y.c(gbo.d().a(4));
      this.v = $$0.a(new gjy.a(this.n));
      gjy.a.a $$1 = y.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(gbp.b(this.G()));
      gbo $$2 = this.y.b(gbo.e().a(8));
      $$2.a(fxo.a(c, gdq.b(this, bav.m)).a());
      $$2.a(fxo.a(xn.d, $$0x -> {
         gjy.a.a $$1x = this.v.p();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.n.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.o, this.H(), this.y.c());
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.l(), this.n(), this.m(), this.E(), -16777216);
      $$0.b(this.l(), this.n(), this.F(), this.G(), -1);
      $$0.b(this.q, b, this.l() + 4, this.n() + 4, -1);
      gjy.a.a $$4 = this.v.p();
      if ($$4 != null) {
         int $$5 = this.l() + 4 + 16;
         int $$6 = this.m() - 4;
         int $$7 = this.n() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.q.b($$4.b.c(), $$9);
         $$0.a(this.q, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int l() {
      return (this.o - 320) / 2;
   }

   private int m() {
      return (this.o + 320) / 2;
   }

   private int n() {
      return this.E() - this.G();
   }

   private int E() {
      return this.p - this.y.b() - 4;
   }

   private int F() {
      return 320;
   }

   private int G() {
      return 62;
   }

   int H() {
      return this.y.d() - this.G() - 8;
   }

   @Override
   public void aP_() {
      this.n.a(this.u);
   }

   public class a extends fyl<gjy.a.a> {
      public a(final fue $$1) {
         super($$1, gjy.this.o, gjy.this.H(), gjy.this.y.c(), 18);

         for (gsr $$2 : gsr.values()) {
            if (!gsr.a(gjy.this.z).contains($$2)) {
               this.b(new gjy.a.a($$2));
            }
         }
      }

      @Nullable
      public gjy.a.a a(gsr $$0) {
         return this.aH_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable gjy.a.a $$0) {
         super.a($$0);
         gjy.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fyl.a<gjy.a.a> {
         final gsr b;

         public a(final gsr $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(gjy.this.q, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xo a() {
            return xo.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gsr b() {
            return this.b;
         }
      }
   }
}
