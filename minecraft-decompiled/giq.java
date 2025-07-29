import javax.annotation.Nullable;

public abstract class giq extends get {
   protected final get b;
   protected final fui c;
   @Nullable
   protected fym d;
   public final gbk e = new gbk(this);

   public giq(get $$0, fui $$1, xo $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aV_() {
      this.E();
      this.n();
      this.m();
      this.e.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   protected void E() {
      this.e.a(this.m, this.q);
   }

   protected void n() {
      this.d = this.e.c(new fym(this.n, this.o, this));
      this.l();
      if (this.d.b(this.c.aw()) instanceof fxv $$0) {
         this.r = $$0;
         this.r.j = this.n.aZ().a();
      }
   }

   protected abstract void l();

   protected void m() {
      this.e.b(fxo.a(xn.d, $$0 -> this.aP_()).a(200).a());
   }

   @Override
   protected void c() {
      this.e.a();
      if (this.d != null) {
         this.d.a(this.o, this.e);
      }
   }

   @Override
   public void aI_() {
      this.n.n.aC();
   }

   @Override
   public void aP_() {
      if (this.d != null) {
         this.d.b();
      }

      this.n.a(this.b);
   }
}
