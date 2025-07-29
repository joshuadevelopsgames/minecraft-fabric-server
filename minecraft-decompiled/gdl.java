import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class gdl extends get {
   private static final xo a = xo.c("accessibility.onboarding.screen.title");
   private static final xo b = xo.c("accessibility.onboarding.screen.narrator");
   private static final int c = 4;
   private static final int d = 16;
   private static final float e = 1000.0F;
   private final fyg f;
   private final fui u;
   private final boolean v;
   private boolean w;
   private float x;
   private final Runnable y;
   @Nullable
   private fxz z;
   private final gbk A = new gbk(this, this.l(), 33);
   private float B;
   private boolean C = true;
   private float D;

   public gdl(fui $$0, Runnable $$1) {
      super(a);
      this.u = $$0;
      this.y = $$1;
      this.f = new fyg(true);
      this.v = fue.R().aZ().a();
   }

   @Override
   public void aV_() {
      gbo $$0 = this.A.c(gbo.d());
      $$0.c().b().a(4);
      this.z = $$0.a(new fxz(this.o, this.m, this.q), $$0x -> $$0x.a(8));
      if (this.u.aw().a(this.u) instanceof fxv $$1) {
         this.r = $$1;
         this.r.j = this.v;
         $$0.a(this.r);
      }

      $$0.a(fxs.b(150, $$0x -> this.a(new gij(this, this.n.n)), false));
      $$0.a(fxs.a(150, $$0x -> this.a(new gim(this, this.n.n, this.n.ai())), false));
      this.A.b(fxo.a(xn.j, $$0x -> this.aP_()).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.b(this.o);
      }

      this.A.a();
   }

   @Override
   protected void aF_() {
      if (this.v && this.r != null) {
         this.b(this.r);
      } else {
         super.aF_();
      }
   }

   private int l() {
      return 90;
   }

   @Override
   public void aP_() {
      this.D = (float)ag.c();
   }

   private void a(get $$0) {
      this.a(false, () -> this.n.a($$0));
   }

   private void a(boolean $$0, Runnable $$1) {
      if ($$0) {
         this.u.ay();
      }

      Narrator.getNarrator().clear();
      $$1.run();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.m();
      if (this.B == 0.0F && this.C) {
         this.B = (float)ag.c();
      }

      if (this.B > 0.0F) {
         float $$4 = ((float)ag.c() - this.B) / 2000.0F;
         float $$5 = 1.0F;
         if ($$4 >= 1.0F) {
            this.C = false;
            this.B = 0.0F;
         } else {
            $$4 = bcb.a($$4, 0.0F, 1.0F);
            $$5 = bcb.b($$4, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.a($$5);
      }

      if (this.D > 0.0F) {
         float $$6 = 1.0F - ((float)ag.c() - this.D) / 1000.0F;
         float $$7 = 0.0F;
         if ($$6 <= 0.0F) {
            this.D = 0.0F;
            this.a(true, this.y);
         } else {
            $$6 = bcb.a($$6, 0.0F, 1.0F);
            $$7 = bcb.b($$6, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.a($$7);
      }

      this.f.a($$0, this.o, 1.0F);
   }

   @Override
   protected void a(fxb $$0, float $$1) {
      this.n.j.q().a($$0, this.o, this.p, false);
   }

   private void m() {
      if (!this.w && this.v) {
         if (this.x < 40.0F) {
            this.x++;
         } else if (this.n.aD()) {
            Narrator.getNarrator().say(b.getString(), true, 1.0F);
            this.w = true;
         }
      }
   }
}
