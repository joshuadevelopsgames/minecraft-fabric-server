public abstract class cgz extends chi {
   protected cao d;
   protected jb e = jb.c;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public cgz(cao $$0) {
      this.d = $$0;
      if (!clh.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         eeb $$0 = this.d.ai().a_(this.e);
         if (!($$0.b() instanceof dsg)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(dsg.e);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         eeb $$1 = this.d.ai().a_(this.e);
         if ($$1.b() instanceof dsg) {
            ((dsg)$$1.b()).a(this.d, this.d.ai(), $$1, this.e, $$0);
         }
      }
   }

   @Override
   public boolean b() {
      if (!clh.a(this.d)) {
         return false;
      } else if (!this.d.ac) {
         return false;
      } else {
         faz $$0 = this.d.S().j();
         if ($$0 != null && !$$0.c()) {
            for (int $$1 = 0; $$1 < Math.min($$0.f() + 2, $$0.e()); $$1++) {
               fax $$2 = $$0.a($$1);
               this.e = new jb($$2.a, $$2.b + 1, $$2.c);
               if (!(this.d.h(this.e.u(), this.d.dE(), this.e.w()) > 2.25)) {
                  this.f = dsg.a(this.d.ai(), this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.dx().d();
            this.f = dsg.a(this.d.ai(), this.e);
            return this.f;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a;
   }

   @Override
   public void d() {
      this.a = false;
      this.b = (float)(this.e.u() + 0.5 - this.d.dC());
      this.c = (float)(this.e.w() + 0.5 - this.d.dI());
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      float $$0 = (float)(this.e.u() + 0.5 - this.d.dC());
      float $$1 = (float)(this.e.w() + 0.5 - this.d.dI());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }
   }
}
