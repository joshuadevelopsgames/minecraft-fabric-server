public class gom extends glr<hmb> {
   public gom(gqn $$0) {
      super($$0);
   }

   public void a(hmb $$0) {
      super.a($$0);
      float $$1 = (float) (Math.PI / 6);
      float $$2 = $$0.K;
      ctk $$3 = $$0.d;
      if ($$3 == ctk.e) {
         float $$4 = $$0.v / 60.0F;
         this.f.g = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * bcb.a($$4 * 30.0F) * 10.0F;
         this.g.g = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * bcb.b($$4 * 30.0F) * 10.0F;
         this.o.b = this.o.b + bcb.a($$4 * 10.0F);
         this.o.c = this.o.c + (bcb.a($$4 * 40.0F) + 0.4F);
         this.r.g = (float) (Math.PI / 180.0) * (70.0F + bcb.b($$4 * 40.0F) * 10.0F);
         this.s.g = this.r.g * -1.0F;
         this.r.c = this.r.c + (bcb.a($$4 * 40.0F) * 0.5F - 0.5F);
         this.s.c = this.s.c + (bcb.a($$4 * 40.0F) * 0.5F + 0.5F);
         this.q.c = this.q.c + bcb.a($$4 * 40.0F) * 0.35F;
      } else if ($$3 == ctk.a && $$2 == 0.0F) {
         this.b($$0);
      } else if ($$3 == ctk.b) {
         glv.a(this.r, this.s, this.o, $$0.e == cad.b);
      } else if ($$3 == ctk.c) {
         glv.a(this.r, this.s, $$0.c, $$0.N, $$0.e == cad.b);
      } else if ($$3 == ctk.d) {
         this.o.e = 0.5F;
         this.o.f = 0.0F;
         if ($$0.e == cad.a) {
            this.r.f = -0.5F;
            this.r.e = -0.9F;
         } else {
            this.s.f = 0.5F;
            this.s.e = -0.9F;
         }
      }
   }

   protected void a(hmb $$0, float $$1) {
      float $$2 = $$0.K;
      if ($$2 > 0.0F && $$0.d == ctk.a) {
         glv.a(this.r, this.s, $$0.e, $$2, $$0.v);
      } else {
         super.a($$0, $$1);
      }
   }

   private void b(hmb $$0) {
      if ($$0.e == cad.a) {
         this.s.e = -1.8F;
      } else {
         this.r.e = -1.8F;
      }
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      this.a.k = $$0;
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
      this.e.k = $$0;
   }
}
