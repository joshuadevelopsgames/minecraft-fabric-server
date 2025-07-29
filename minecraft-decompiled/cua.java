import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;

public abstract class cua extends bzc implements cud, cue, dlp {
   private static final alh<Integer> cm = all.a(cua.class, alj.b);
   public static final int ck = 300;
   private static final int cn = 8;
   @Nullable
   private cut co;
   @Nullable
   protected dlr cl;
   private final bxr cp = new bxr(8);

   public cua(bzv<? extends cua> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.n, 16.0F);
      this.a(fbc.o, -1.0F);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 == null) {
         $$3 = new bzc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int m() {
      return this.ay.a(cm);
   }

   public void r(int $$0) {
      this.ay.a(cm, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cm, 0);
   }

   @Override
   public void g(@Nullable cut $$0) {
      this.co = $$0;
   }

   @Nullable
   @Override
   public cut gH() {
      return this.co;
   }

   public boolean gI() {
      return this.co != null;
   }

   @Override
   public dlr gJ() {
      if (this.ai().C) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.cl == null) {
            this.cl = new dlr();
            this.gO();
         }

         return this.cl;
      }
   }

   @Override
   public void a(@Nullable dlr $$0) {
   }

   @Override
   public void s(int $$0) {
   }

   @Override
   public void a(dlq $$0) {
      $$0.l();
      this.cb = -this.W();
      this.b($$0);
      if (this.co instanceof auc) {
         aq.t.a((auc)this.co, this, $$0.f());
      }
   }

   protected abstract void b(dlq var1);

   @Override
   public boolean gK() {
      return true;
   }

   @Override
   public void i(dcv $$0) {
      if (!this.ai().C && this.cb > -this.W() + 20) {
         this.cb = -this.W();
         this.b(this.x(!$$0.f()));
      }
   }

   @Override
   public ayy gL() {
      return ayz.CB;
   }

   protected ayy x(boolean $$0) {
      return $$0 ? ayz.CB : ayz.Cz;
   }

   public void gM() {
      this.b(ayz.Cw);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.ai().C) {
         dlr $$1 = this.gJ();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", dlr.a, $$1);
         }
      }

      this.b_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cl = $$0.<dlr>a("Offers", dlr.a).orElse(null);
      this.a_($$0);
   }

   @Nullable
   @Override
   public bzm b(fbl $$0) {
      this.gN();
      return super.b($$0);
   }

   protected void gN() {
      this.g(null);
   }

   @Override
   public void a(byb $$0) {
      super.a($$0);
      this.gN();
   }

   protected void a(mc $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ar.k() * 0.02;
         double $$3 = this.ar.k() * 0.02;
         double $$4 = this.ar.k() * 0.02;
         this.ai().a($$0, this.d(1.0), this.dF() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   public bxr n() {
      return this.cp;
   }

   @Override
   public cbd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cp.b() ? cbd.a(this.cp, $$1) : super.a_($$0);
   }

   protected abstract void gO();

   protected void a(dlr $$0, cuj.g[] $$1, int $$2) {
      ArrayList<cuj.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dlq $$5 = $$3.remove(this.ar.a($$3.size())).a(this, this.ar);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public fis u(float $$0) {
      float $$1 = bcb.h($$0, this.bs, this.br) * (float) (Math.PI / 180.0);
      fis $$2 = new fis(0.0, this.cV().c() - 1.0, 0.2);
      return this.p($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gP() {
      return this.ai().C;
   }

   @Override
   public boolean h(cut $$0) {
      return this.gH() == $$0 && this.bO() && $$0.b(this, 4.0);
   }
}
