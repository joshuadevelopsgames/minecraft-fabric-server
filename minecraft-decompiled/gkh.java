import javax.annotation.Nullable;

public class gkh extends get {
   private static final xo a = xo.c("telemetry_info.screen.title");
   private static final xo b = xo.c("telemetry_info.screen.description").b(-4539718);
   private static final xo c = xo.c("telemetry_info.button.privacy_statement");
   private static final xo d = xo.c("telemetry_info.button.give_feedback");
   private static final xo e = xo.c("telemetry_info.button.show_data");
   private static final xo f = xo.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fue.R().E();
   private final get w;
   private final fui x;
   private final gbk y = new gbk(this, 16 + 9 * 5 + 20, v ? 33 + fxq.a(fue.R().h) : 33);
   @Nullable
   private gkg z;
   @Nullable
   private fyj A;
   private double B;

   public gkh(get $$0, fui $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aV_() {
      gbo $$0 = this.y.a(gbo.d().a(4));
      $$0.c().b();
      $$0.a(new fyx(a, this.q));
      this.A = $$0.a(new fyj(b, this.q).b(true));
      gbo $$1 = $$0.a(gbo.e().a(8));
      $$1.a(fxo.a(c, this::a).a());
      $$1.a(fxo.a(d, this::b).a());
      gbo $$2 = this.y.b(gbo.d().a(4));
      if (v) {
         $$2.a(this.l());
      }

      gbo $$3 = $$2.a(gbo.e().a(8));
      $$3.a(fxo.a(e, this::c).a());
      $$3.a(fxo.a(xn.d, $$0x -> this.aP_()).a());
      gbo $$4 = this.y.c(gbo.d().a(8));
      this.z = $$4.a(new gkg(0, 0, this.o - 40, this.y.d(), this.q));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.h(this.o - 40);
         this.z.i(this.y.d());
         this.z.q();
      }

      if (this.A != null) {
         this.A.d(this.o - 16);
      }

      this.y.a();
   }

   @Override
   protected void aF_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fxm l() {
      fuh<Boolean> $$0 = this.x.am();
      return fxq.a(f, this.q).a($$0).a(this::a).a();
   }

   private void a(fxm $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fxo $$0) {
      gdq.a(this, bav.c);
   }

   private void b(fxo $$0) {
      gdq.a(this, bav.i);
   }

   private void c(fxo $$0) {
      ag.n().a(this.n.u().b());
   }

   @Override
   public void aP_() {
      this.n.a(this.w);
   }
}
