import java.util.Optional;
import javax.annotation.Nullable;

public class ghr extends get {
   private static final xo a = xo.c("test_instance_block.test_id");
   private static final xo b = xo.c("test_instance_block.size");
   private static final xo c = xo.c("test_instance_block.entities");
   private static final xo d = xo.c("test_instance_block.rotation");
   private static final int e = 8;
   private static final int f = 316;
   private static final int u = -4144960;
   private final ecu v;
   @Nullable
   private fxx w;
   @Nullable
   private fxx x;
   @Nullable
   private fxx y;
   @Nullable
   private fxx z;
   @Nullable
   private fxy A;
   @Nullable
   private fxo B;
   @Nullable
   private fxo C;
   @Nullable
   private fxv<Boolean> D;
   @Nullable
   private fxv<dwu> E;

   public ghr(ecu $$0) {
      super($$0.m().b().f());
      this.v = $$0;
   }

   @Override
   protected void aV_() {
      int $$0 = this.o / 2 - 158;
      boolean $$1 = ac.aZ;
      int $$2 = $$1 ? 3 : 2;
      int $$3 = a($$2);
      this.w = new fxx(this.q, $$0, 40, 316, 20, xo.c("test_instance_block.test_id"));
      this.w.f(128);
      Optional<amd<ta>> $$4 = this.v.j();
      if ($$4.isPresent()) {
         this.w.a($$4.get().a().toString());
      }

      this.w.b($$0x -> this.c(false));
      this.c(this.w);
      this.A = new fxy($$0, 70, 316, 8 * 9, xo.b(""), this.q);
      this.c(this.A);
      kg $$5 = this.v.v();
      int $$6 = 0;
      this.x = new fxx(this.q, this.a($$6++, 5), 160, a(5), 20, xo.c("structure_block.size.x"));
      this.x.f(15);
      this.c(this.x);
      this.y = new fxx(this.q, this.a($$6++, 5), 160, a(5), 20, xo.c("structure_block.size.y"));
      this.y.f(15);
      this.c(this.y);
      this.z = new fxx(this.q, this.a($$6++, 5), 160, a(5), 20, xo.c("structure_block.size.z"));
      this.z.f(15);
      this.c(this.z);
      this.a($$5);
      this.E = this.c(fxv.<dwu>a(ghr::a).a(dwu.values()).a(this.v.w()).a().a(this.a($$6++, 5), 160, a(5), 20, d, ($$0x, $$1x) -> this.l()));
      this.D = this.c(fxv.b(!this.v.u()).a().a(this.a($$6++, 5), 160, a(5), 20, c));
      $$6 = 0;
      this.c(fxo.a(xo.c("test_instance.action.reset"), $$0x -> {
         this.a(ajo.a.d);
         this.n.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      this.B = this.c(fxo.a(xo.c("test_instance.action.save"), $$0x -> {
         this.a(ajo.a.e);
         this.n.a(null);
      }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      if ($$1) {
         this.C = this.c(fxo.a(xo.b("Export Structure"), $$0x -> {
            this.a(ajo.a.f);
            this.n.a(null);
         }).a(this.a($$6++, $$2), 185, $$3, 20).a());
      }

      this.c(fxo.a(xo.c("test_instance.action.run"), $$0x -> {
         this.a(ajo.a.g);
         this.n.a(null);
      }).a(this.a(0, 3), 210, a(3), 20).a());
      this.c(fxo.a(xn.d, $$0x -> this.m()).a(this.a(1, 3), 210, a(3), 20).a());
      this.c(fxo.a(xn.e, $$0x -> this.n()).a(this.a(2, 3), 210, a(3), 20).a());
      this.c(true);
   }

   private void l() {
      boolean $$0 = this.E.a() == dwu.a && ame.c(this.w.a()) != null;
      this.B.j = $$0;
      if (this.C != null) {
         this.C.j = $$0;
      }
   }

   private static xo a(dwu $$0) {
      return xo.b(switch ($$0) {
         case a -> "0";
         case b -> "90";
         case c -> "180";
         case d -> "270";
      });
   }

   private void a(kg $$0) {
      this.x.a(Integer.toString($$0.u()));
      this.y.a(Integer.toString($$0.v()));
      this.z.a(Integer.toString($$0.w()));
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.o / 2 - 158;
      float $$3 = b($$1);
      return (int)($$2 + $$0 * (8.0F + $$3));
   }

   private static int a(int $$0) {
      return (int)b($$0);
   }

   private static float b(int $$0) {
      return (float)(316 - ($$0 - 1) * 8) / $$0;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.o / 2 - 158;
      $$0.a(this.q, this.m, this.o / 2, 10, -1);
      $$0.b(this.q, a, $$4, 30, -4144960);
      $$0.b(this.q, b, $$4, 150, -4144960);
      $$0.b(this.q, d, this.E.E(), 150, -4144960);
      $$0.b(this.q, c, this.D.E(), 150, -4144960);
   }

   private void c(boolean $$0) {
      boolean $$1 = this.a($$0 ? ajo.a.a : ajo.a.b);
      if (!$$1) {
         this.A.b(xo.c("test_instance.description.invalid_id").a(o.m));
      }

      this.l();
   }

   private void m() {
      this.a(ajo.a.c);
      this.aP_();
   }

   private boolean a(ajo.a $$0) {
      Optional<ame> $$1 = Optional.ofNullable(ame.c(this.w.a()));
      Optional<amd<ta>> $$2 = $$1.map($$0x -> amd.a(mn.bm, $$0x));
      kg $$3 = new kg(a(this.x.a()), a(this.y.a()), a(this.z.a()));
      boolean $$4 = !this.D.a();
      this.n.M().b(new ajo(this.v.aA_(), $$0, $$2, $$3, this.E.a(), $$4));
      return $$1.isPresent();
   }

   public void a(xo $$0, Optional<kg> $$1) {
      yc $$2 = xo.i();
      this.v.x().ifPresent($$1x -> $$2.b(xo.a("test_instance.description.failed", xo.i().a(o.m).b($$1x))).f("\n\n"));
      $$2.b($$0);
      this.A.b($$2);
      $$1.ifPresent(this::a);
   }

   private void n() {
      this.aP_();
   }

   private static int a(String $$0) {
      try {
         return bcb.a(Integer.parseInt($$0), 1, 48);
      } catch (NumberFormatException var2) {
         return 1;
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }
}
