import javax.annotation.Nullable;

public abstract class gih extends get {
   private static final int b = 100;
   private final xo c;
   @Nullable
   private final xo d;
   private final xo e;
   @Nullable
   protected fxq a;
   @Nullable
   private fxz f;
   private final gbi u;

   protected gih(xo $$0, xo $$1, xo $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gih(xo $$0, xo $$1, @Nullable xo $$2, xo $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.u = new gbi(0, 0, this.o, this.p);
   }

   protected abstract gbl l();

   @Override
   protected void aV_() {
      gbo $$0 = this.u.a(gbo.d().a(8));
      $$0.c().b();
      $$0.a(new fyx(this.o(), this.q));
      this.f = $$0.a(new fxz(this.o - 100, this.c, this.q, 12), $$0x -> $$0x.a(12));
      this.f.b(false);
      gbo $$1 = $$0.a(gbo.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fxq.a(this.d, this.q).a());
      }

      $$1.a(this.l());
      this.u.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.f != null) {
         this.f.d(this.o - 100);
      }

      this.u.a();
      gbi.a(this.u, this.I());
   }

   @Override
   public xo i() {
      return this.e;
   }
}
