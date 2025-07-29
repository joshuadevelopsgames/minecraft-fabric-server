import java.util.Collection;
import javax.annotation.Nullable;

public class crh extends crv {
   private static final alh<Integer> a = all.a(crh.class, alj.b);
   private static final alh<Boolean> b = all.a(crh.class, alj.k);
   private static final alh<Boolean> c = all.a(crh.class, alj.k);
   private static final boolean d = false;
   private static final boolean e = false;
   private static final short f = 30;
   private static final byte ck = 3;
   private int cl;
   private int cm;
   private int cn = 30;
   private int co = 3;
   private int cp;

   public crh(bzv<? extends crh> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chc(this));
      this.ch.a(2, new cip(this));
      this.ch.a(3, new cgp<>(this, cmx.class, 6.0F, 1.0, 1.2));
      this.ch.a(3, new cgp<>(this, cmg.class, 6.0F, 1.0, 1.2));
      this.ch.a(4, new chs(this, 1.0, false));
      this.ch.a(5, new civ(this, 0.8));
      this.ch.a(6, new chq(this, cut.class, 8.0F));
      this.ch.a(6, new cid(this));
      this.ci.a(1, new cjb<>(this, cut.class, true));
      this.ci.a(2, new cja(this));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.w, 0.25);
   }

   @Override
   public int cI() {
      return this.e() == null ? this.y(0.0F) : this.y(this.eL() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.cm += (int)($$0 * 1.5);
      if (this.cm > this.cn - 5) {
         this.cm = this.cn - 5;
      }

      return $$3;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("powered", this.m());
      $$0.a("Fuse", (short)this.cn);
      $$0.a("ExplosionRadius", (byte)this.co);
      $$0.a("ignited", this.t());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.ay.a(b, $$0.a("powered", false));
      this.cn = $$0.a("Fuse", (short)30);
      this.co = $$0.a("ExplosionRadius", (byte)3);
      if ($$0.a("ignited", false)) {
         this.gH();
      }
   }

   @Override
   public void g() {
      if (this.bO()) {
         this.cl = this.cm;
         if (this.t()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.cm == 0) {
            this.a(ayz.gH, 1.0F, 0.5F);
            this.c(ejb.I);
         }

         this.cm += $$0;
         if (this.cm < 0) {
            this.cm = 0;
         }

         if (this.cm >= this.cn) {
            this.cm = this.cn;
            this.gK();
         }
      }

      super.g();
   }

   @Override
   public void g(@Nullable cam $$0) {
      if (!($$0 instanceof cok)) {
         super.g($$0);
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.gG;
   }

   @Override
   protected ayy f_() {
      return ayz.gF;
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bzm $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof crh $$4 && $$4.gI()) {
         $$4.gJ();
         this.a($$0, dcz.vR);
      }
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      return true;
   }

   public boolean m() {
      return this.ay.a(b);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cl, this.cm) / (this.cn - 2);
   }

   public int n() {
      return this.ay.a(a);
   }

   public void b(int $$0) {
      this.ay.a(a, $$0);
   }

   @Override
   public void a(aub $$0, cal $$1) {
      super.a($$0, $$1);
      this.ay.a(b, true);
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(azx.bA)) {
         ayy $$3 = $$2.a(dcz.vy) ? ayz.jw : ayz.jM;
         this.ai().a($$0, this.dC(), this.dE(), this.dI(), $$3, this.do(), 1.0F, this.ar.i() * 0.4F + 0.8F);
         if (!this.ai().C) {
            this.gH();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gK() {
      if (this.ai() instanceof aub $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.by = true;
         $$0.a(this, this.dC(), this.dE(), this.dI(), this.co * $$1, dmu.a.c);
         this.gN();
         this.a($$0, bzm.e.a);
         this.at();
      }
   }

   private void gN() {
      Collection<byq> $$0 = this.eI();
      if (!$$0.isEmpty()) {
         bze $$1 = new bze(this.ai(), this.dC(), this.dE(), this.dI());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a(300);
         $$1.b(0.25F);
         $$1.d(-$$1.c() / $$1.h());

         for (byq $$2 : $$0) {
            $$1.a(new byq($$2));
         }

         this.ai().b($$1);
      }
   }

   public boolean t() {
      return this.ay.a(c);
   }

   public void gH() {
      this.ay.a(c, true);
   }

   public boolean gI() {
      return this.m() && this.cp < 1;
   }

   public void gJ() {
      this.cp++;
   }
}
