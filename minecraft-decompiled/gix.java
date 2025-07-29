import javax.annotation.Nullable;

public class gix extends giq {
   private static final xo u = xo.c("controls.keybinds.title");
   @Nullable
   public fuc a;
   public long f;
   private giw v;
   private fxo w;

   public gix(get $$0, fui $$1) {
      super($$0, $$1, u);
   }

   @Override
   protected void n() {
      this.v = this.e.c(new giw(this, this.n));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void m() {
      this.w = fxo.a(xo.c("controls.resetAll"), $$0x -> {
         for (fuc $$1 : this.c.W) {
            $$1.b($$1.i());
         }

         this.v.c();
      }).a();
      gbo $$0 = this.e.b(gbo.e().a(8));
      $$0.a(this.w);
      $$0.a(fxo.a(xn.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.e.a();
      this.v.a(this.o, this.e);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fna.b.c.a($$2));
         this.a = null;
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(fna.bv);
         } else {
            this.a.b(fna.a($$0, $$1));
         }

         this.a = null;
         this.f = ag.c();
         this.v.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (fuc $$5 : this.c.W) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.w.j = $$4;
   }
}
