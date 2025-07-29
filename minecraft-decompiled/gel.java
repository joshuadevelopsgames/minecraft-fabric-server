import java.net.URI;

public class gel extends get {
   private static final xo a = xo.c("symlink_warning.title.world").a(o.r);
   private static final xo b = xo.a("symlink_warning.message.world", xo.a(bav.p));
   private static final xo c = xo.c("symlink_warning.title.pack").a(o.r);
   private static final xo d = xo.a("symlink_warning.message.pack", xo.a(bav.p));
   private final xo e;
   private final URI f;
   private final Runnable u;
   private final gbj v = new gbj().b(10);

   public gel(xo $$0, xo $$1, URI $$2, Runnable $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.u = $$3;
   }

   public static get a(Runnable $$0) {
      return new gel(a, b, bav.p, $$0);
   }

   public static get b(Runnable $$0) {
      return new gel(c, d, bav.p, $$0);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.v.c().b();
      gbj.b $$0 = this.v.d(1);
      $$0.a(new fyx(this.m, this.q));
      $$0.a(new fyj(this.e, this.q).d(this.o - 50).b(true));
      int $$1 = 120;
      gbj $$2 = new gbj().a(5);
      gbj.b $$3 = $$2.d(3);
      $$3.a(fxo.a(xn.n, $$0x -> ag.n().a(this.f)).b(120, 20).a());
      $$3.a(fxo.a(xn.o, $$0x -> this.n.p.a(this.f.toString())).b(120, 20).a());
      $$3.a(fxo.a(xn.k, $$0x -> this.aP_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.v.a(this::c);
   }

   @Override
   protected void c() {
      this.v.a();
      gbi.a(this.v, this.I());
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.e);
   }

   @Override
   public void aP_() {
      this.u.run();
   }
}
