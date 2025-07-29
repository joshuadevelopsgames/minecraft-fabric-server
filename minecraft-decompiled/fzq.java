import javax.annotation.Nullable;

public class fzq implements glg {
   private static final ame a = ame.b("hud/hotbar");
   private static final ame b = ame.b("hud/hotbar_selection");
   private static final long c = 5000L;
   private static final long d = 2000L;
   private final fue e;
   private long f;
   @Nullable
   private gld g;

   public fzq(fue $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.f = ag.c();
      if (this.g != null) {
         this.g.b($$0);
      } else {
         this.g = new gld(this);
      }
   }

   private float c() {
      long $$0 = this.f - ag.c() + 5000L;
      return bcb.a((float)$$0 / 2000.0F, 0.0F, 1.0F);
   }

   public void a(fxb $$0) {
      if (this.g != null) {
         float $$1 = this.c();
         if ($$1 <= 0.0F) {
            this.g.d();
         } else {
            int $$2 = $$0.a() / 2;
            int $$3 = bcb.d($$0.b() - 22.0F * $$1);
            glh $$4 = this.g.f();
            this.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   protected void a(fxb $$0, float $$1, int $$2, int $$3, glh $$4) {
      int $$5 = baj.a($$1);
      $$0.a(gxx.ar, a, $$2 - 91, $$3, 182, 22, $$5);
      if ($$4.a() >= 0) {
         $$0.a(gxx.ar, b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 24, 23, $$5);
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a($$0, $$6, $$0.a() / 2 - 90 + $$6 * 20 + 2, $$3 + 3, $$1, $$4.a($$6));
      }
   }

   private void a(fxb $$0, int $$1, int $$2, float $$3, float $$4, glf $$5) {
      if ($$5 != gld.a) {
         $$0.e().pushMatrix();
         $$0.e().translate($$2, $$3);
         float $$6 = $$5.aX_() ? 1.0F : 0.25F;
         $$5.a($$0, $$6, $$4);
         $$0.e().popMatrix();
         if ($$4 > 0.0F && $$5.aX_()) {
            xo $$7 = this.e.n.T[$$1].k();
            $$0.b(this.e.h, $$7, $$2 + 19 - 2 - this.e.h.a($$7), (int)$$3 + 6 + 3, baj.a($$4, -1));
         }
      }
   }

   public void b(fxb $$0) {
      float $$1 = this.c();
      if ($$1 > 0.0F && this.g != null) {
         glf $$2 = this.g.b();
         xo $$3 = $$2 == gld.a ? this.g.c().b() : $$2.aW_();
         int $$4 = this.e.h.a($$3);
         int $$5 = ($$0.a() - $$4) / 2;
         int $$6 = $$0.b() - 35;
         $$0.a(this.e.h, $$3, $$5, $$6, $$4, baj.a($$1, -1));
      }
   }

   @Override
   public void a(gld $$0) {
      this.g = null;
      this.f = 0L;
   }

   public boolean a() {
      return this.g != null;
   }

   public void b(int $$0) {
      int $$1 = this.g.e() + $$0;

      while ($$1 >= 0 && $$1 <= 8 && (this.g.a($$1) == gld.a || !this.g.a($$1).aX_())) {
         $$1 += $$0;
      }

      if ($$1 >= 0 && $$1 <= 8) {
         this.g.b($$1);
         this.f = ag.c();
      }
   }

   public void b() {
      this.f = ag.c();
      if (this.a()) {
         int $$0 = this.g.e();
         if ($$0 != -1) {
            this.g.b($$0);
         }
      } else {
         this.g = new gld(this);
      }
   }
}
