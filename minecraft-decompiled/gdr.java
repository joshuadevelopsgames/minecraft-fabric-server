import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import javax.annotation.Nullable;

public class gdr extends get {
   private final xo u;
   protected gbo a = gbo.d().a(8);
   protected xo b;
   protected xo c;
   @Nullable
   protected fxo d;
   @Nullable
   protected fxo e;
   private int v;
   protected final BooleanConsumer f;

   public gdr(BooleanConsumer $$0, xo $$1, xo $$2) {
      this($$0, $$1, $$2, xn.f, xn.g);
   }

   public gdr(BooleanConsumer $$0, xo $$1, xo $$2, xo $$3, xo $$4) {
      super($$1);
      this.f = $$0;
      this.u = $$2;
      this.b = $$3;
      this.c = $$4;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.u);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.a.c().b();
      this.a.a(new fyx(this.m, this.q));
      this.a.a(new fyj(this.u, this.q).d(this.o - 50).e(15).b(true));
      this.k();
      gbo $$0 = this.a.a(gbo.e().a(4));
      $$0.c().c(16);
      this.a($$0);
      this.a.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.a.a();
      gbi.a(this.a, this.I());
   }

   protected void k() {
   }

   protected void a(gbo $$0) {
      this.d = $$0.a(fxo.a(this.b, $$0x -> this.f.accept(true)).a());
      this.e = $$0.a(fxo.a(this.c, $$0x -> this.f.accept(false)).a());
   }

   public void a(int $$0) {
      this.v = $$0;
      this.d.j = false;
      this.e.j = false;
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         this.d.j = true;
         this.e.j = true;
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }
}
