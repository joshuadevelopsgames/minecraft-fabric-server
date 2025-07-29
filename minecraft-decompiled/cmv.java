import java.util.UUID;
import javax.annotation.Nullable;

public class cmv extends cma implements car {
   protected static final alh<Byte> c = all.a(cmv.class, alj.a);
   private static final int d = 25;
   private static final boolean e = false;
   private int f;
   private int ck;
   private static final bwu cl = bdg.a(20, 39);
   private int cm;
   @Nullable
   private UUID cn;

   public cmv(bzv<? extends cmv> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chs(this, 1.0, true));
      this.ch.a(2, new chx(this, 0.9, 32.0F));
      this.ch.a(2, new cht(this, 0.6, false));
      this.ch.a(4, new chk(this, 0.6));
      this.ch.a(5, new chz(this));
      this.ch.a(7, new chq(this, cut.class, 6.0F));
      this.ch.a(8, new cid(this));
      this.ci.a(1, new ciz(this));
      this.ci.a(2, new cja(this));
      this.ci.a(3, new cjb<>(this, cut.class, 10, true, false, this::a));
      this.ci.a(3, new cjb<>(this, cao.class, 5, false, false, ($$0, $$1) -> $$0 instanceof crn && !($$0 instanceof crh)));
      this.ci.a(4, new cjh<>(this, false));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 100.0).a(cbs.w, 0.25).a(cbs.q, 1.0).a(cbs.c, 15.0).a(cbs.C, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bzm $$0) {
      if ($$0 instanceof crn && !($$0 instanceof crh) && this.ec().a(20) == 0) {
         this.g((cam)$$0);
      }

      super.E($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.f > 0) {
         this.f--;
      }

      if (this.ck > 0) {
         this.ck--;
      }

      if (!this.ai().C) {
         this.a((aub)this.ai(), true);
      }
   }

   @Override
   public boolean by() {
      return this.dA().j() > 2.5000003E-7F && this.ar.a(5) == 0;
   }

   @Override
   public boolean a(bzv<?> $$0) {
      if (this.gH() && $$0 == bzv.bU) {
         return false;
      } else {
         return $$0 == bzv.F ? false : super.a($$0);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("PlayerCreated", this.gH());
      this.a_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.y($$0.a("PlayerCreated", false));
      this.a(this.ai(), $$0);
   }

   @Override
   public void c() {
      this.a(cl.a(this.ar));
   }

   @Override
   public void a(int $$0) {
      this.cm = $$0;
   }

   @Override
   public int a() {
      return this.cm;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cn = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cn;
   }

   private float gI() {
      return (float)this.i(cbs.c);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      this.f = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gI();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + this.ar.a((int)$$2) : $$2;
      byb $$4 = this.ea().b((cam)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof cam $$6 ? $$6.i(cbs.q) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dA().b(0.0, 0.4F * $$8, 0.0));
         djk.a($$0, $$1, $$4);
      }

      this.a(ayz.or, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      bzi.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(ayz.os, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bzi.a m() {
      return bzi.a.a(this.eL() / this.fa());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.f = 10;
         this.a(ayz.or, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.ck = 400;
      } else if ($$0 == 34) {
         this.ck = 0;
      } else {
         super.b($$0);
      }
   }

   public int n() {
      return this.f;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.ck = 400;
         this.ai().a(this, (byte)11);
      } else {
         this.ck = 0;
         this.ai().a(this, (byte)34);
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.ou;
   }

   @Override
   protected ayy f_() {
      return ayz.ot;
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (!$$2.a(dcz.pK)) {
         return bxj.e;
      } else {
         float $$3 = this.eL();
         this.d(25.0F);
         if (this.eL() == $$3) {
            return bxj.e;
         } else {
            float $$4 = 1.0F + (this.ar.i() - this.ar.i()) * 0.2F;
            this.a(ayz.ov, 1.0F, $$4);
            $$2.a(1, $$0);
            return bxj.a;
         }
      }
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.ow, 1.0F, 1.0F);
   }

   public int t() {
      return this.ck;
   }

   public boolean gH() {
      return (this.ay.a(c) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.ay.a(c);
      if ($$0) {
         this.ay.a(c, (byte)($$1 | 1));
      } else {
         this.ay.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(byb $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dmx $$0) {
      jb $$1 = this.dx();
      jb $$2 = $$1.e();
      eeb $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jb $$5 = $$1.b($$4);
            eeb $$6 = $$0.a_($$5);
            if (!dnf.a($$0, $$5, $$6, $$6.y(), bzv.ar)) {
               return false;
            }
         }

         return dnf.a($$0, $$1, $$0.a_($$1), fam.a.g(), bzv.ar) && $$0.f(this);
      }
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.875F * this.cW(), this.ds() * 0.4F);
   }
}
