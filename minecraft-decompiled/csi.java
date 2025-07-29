import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class csi extends cmd implements caj {
   private static final ame ck = ame.b("suffocating");
   private static final cbq cl = new cbq(ck, -0.34F, cbq.a.b);
   private static final float cm = 0.35F;
   private static final float co = 0.55F;
   private static final alh<Integer> cp = all.a(csi.class, alj.b);
   private static final alh<Boolean> cq = all.a(csi.class, alj.k);
   private final cai cr = new cai(this.ay, cp);
   @Nullable
   private ciq cs;

   public csi(bzv<? extends csi> $$0, dmu $$1) {
      super($$0, $$1);
      this.V = true;
      this.a(fbc.j, -1.0F);
      this.a(fbc.i, 0.0F);
      this.a(fbc.n, 0.0F);
      this.a(fbc.o, 0.0F);
   }

   public static boolean c(bzv<csi> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      jb.a $$5 = $$3.k();

      do {
         $$5.c(jh.b);
      } while ($$1.b_($$5).a(azu.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(alh<?> $$0) {
      if (cp.equals($$0) && this.ai().C) {
         this.cr.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cp, 0);
      $$0.a(cq, false);
   }

   @Override
   public boolean e(bzw $$0) {
      return $$0 != bzw.h ? super.e($$0) : this.bO() && !this.g_();
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.h || super.f($$0);
   }

   @Override
   protected jl<ayy> a(bzw $$0, dcv $$1, dle $$2) {
      return (jl<ayy>)($$0 == bzw.h ? ayz.zH : super.a($$0, $$1, $$2));
   }

   @Override
   protected void H() {
      this.ch.a(1, new cib(this, 1.65));
      this.ch.a(2, new cgu(this, 1.0));
      this.cs = new ciq(this, 1.4, $$0 -> $$0.a(azx.aT), false);
      this.ch.a(3, this.cs);
      this.ch.a(4, new csi.a(this, 1.0));
      this.ch.a(5, new chh(this, 1.0));
      this.ch.a(7, new cif(this, 1.0, 60));
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new cid(this));
      this.ch.a(9, new chq(this, csi.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.ay.a(cq, $$0);
      cbo $$1 = this.h(cbs.w);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(cl);
         } else {
            $$1.c(ck);
         }
      }
   }

   public boolean m() {
      return this.ay.a(cq);
   }

   @Override
   public boolean a(fal $$0) {
      return $$0.a(azu.b);
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      if (!this.ai().B_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.bp.b());
         float $$4 = this.bp.c();
         float $$5 = 0.12F * bcb.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, $$5 * $$2, 0.0);
      }
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public cam cY() {
      return (cam)(this.gm() && this.db() instanceof cut $$0 && $$0.b(dcz.oS) ? $$0 : super.cY());
   }

   @Override
   public fis b(cam $$0) {
      fis[] $$1 = new fis[]{
         a(this.ds(), $$0.ds(), $$0.dP()),
         a(this.ds(), $$0.ds(), $$0.dP() - 22.5F),
         a(this.ds(), $$0.ds(), $$0.dP() + 22.5F),
         a(this.ds(), $$0.ds(), $$0.dP() - 45.0F),
         a(this.ds(), $$0.ds(), $$0.dP() + 45.0F)
      };
      Set<jb> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cV().e;
      double $$4 = this.cV().b - 0.5;
      jb.a $$5 = new jb.a();

      for (fis $$6 : $$1) {
         $$5.b(this.dC() + $$6.d, $$3, this.dI() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jh.a);
         }
      }

      for (jb $$8 : $$2) {
         if (!this.ai().b_($$8).a(azu.b)) {
            double $$9 = this.ai().j($$8);
            if (cxm.a($$9)) {
               fis $$10 = fis.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fV().iterator();

               while (var14.hasNext()) {
                  cay $$11 = (cay)var14.next();
                  fin $$12 = $$0.f($$11);
                  if (cxm.a(this.ai(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fis(this.dC(), this.cV().e, this.dI());
   }

   @Override
   protected void a(cut $$0, fis $$1) {
      this.b($$0.dP(), $$0.dR() * 0.5F);
      this.aa = this.br = this.bt = this.dP();
      this.cr.b();
      super.a($$0, $$1);
   }

   @Override
   protected fis b(cut $$0, fis $$1) {
      return new fis(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cut $$0) {
      return (float)(this.i(cbs.w) * (this.m() ? 0.35F : 0.55F) * this.cr.c());
   }

   @Override
   protected float aX() {
      return this.ak + 0.6F;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(this.bA() ? ayz.zF : ayz.zE, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cr.a(this.ec());
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
      if (this.bA()) {
         this.j();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void g() {
      if (this.t() && this.ar.a(140) == 0) {
         this.b(ayz.zA);
      } else if (this.gE() && this.ar.a(60) == 0) {
         this.b(ayz.zB);
      }

      if (!this.gw()) {
         eeb $$0 = this.ai().a_(this.dx());
         eeb $$1 = this.bw();
         boolean $$2 = $$0.a(azo.aY) || $$1.a(azo.aY) || this.b(azu.b) > 0.0;
         boolean $$4 = this.dm() instanceof csi $$3 && $$3.m();
         this.x(!$$2 || $$4);
      }

      super.g();
      this.gH();
   }

   private boolean t() {
      return this.cs != null && this.cs.k();
   }

   @Override
   protected boolean J() {
      return true;
   }

   private void gH() {
      if (this.bA()) {
         fix $$0 = fix.a(this);
         if ($$0.a(duw.d, this.dx(), true) && !this.ai().b_(this.dx().d()).a(azu.b)) {
            this.e(true);
         } else {
            this.i(this.dA().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static cbr.a n() {
      return cmd.gM().a(cbs.w, 0.175F);
   }

   @Override
   protected ayy p() {
      return !this.gE() && !this.t() ? ayz.zz : null;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.zD;
   }

   @Override
   protected ayy f_() {
      return ayz.zC;
   }

   @Override
   protected boolean s(bzm $$0) {
      return !this.cd() && !this.a(azu.b);
   }

   @Override
   public boolean fx() {
      return true;
   }

   @Override
   public boolean cb() {
      return false;
   }

   @Override
   protected cjw b(dmu $$0) {
      return new csi.b(this, $$0);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      if ($$1.a_($$0).y().a(azu.b)) {
         return 10.0F;
      } else {
         return this.bA() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public csi b(aub $$0, bzc $$1) {
      return bzv.bv.a($$0, bzu.e);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aS);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.gm() && !this.cd() && !$$0.gh()) {
         if (!this.ai().C) {
            $$0.o(this);
         }

         return bxj.a;
      } else {
         bxj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            dcv $$4 = $$0.b($$1);
            return (bxj)(this.a($$4, bzw.h) ? $$4.a($$0, this, $$1) : bxj.e);
         } else {
            if ($$2 && !this.be()) {
               this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.zG, this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.6F * this.cW(), this.ds() * 0.4F);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if (this.g_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         bck $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            cao $$5 = bzv.bT.a($$0.a(), bzu.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cso.b(cso.a($$4), false));
               $$5.a(bzw.a, new dcv(dcz.oS));
               this.a(bzw.h, new dcv(dcz.ov));
               this.g(bzw.h);
            }
         } else if ($$4.a(10) == 0) {
            bzc $$6 = bzv.bv.a($$0.a(), bzu.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bzc.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private cbe a(dnl $$0, bxh $$1, cao $$2, @Nullable cbe $$3) {
      $$2.b(this.dC(), this.dE(), this.dI(), this.dP(), 0.0F);
      $$2.a($$0, $$1, bzu.g, $$3);
      $$2.a(this, true);
      return new bzc.a(0.0F);
   }

   static class a extends chv {
      private final csi g;

      a(csi $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jb k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bA() && this.a(this.g.ai(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bA() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         return $$0.a_($$1).a(dqb.K) && $$0.a_($$1.d()).a(fba.a);
      }
   }

   static class b extends cjv {
      b(csi $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      protected fbb a(int $$0) {
         this.o = new fbh();
         return new fbb(this.o, $$0);
      }

      @Override
      protected boolean a(fbc $$0) {
         return $$0 != fbc.i && $$0 != fbc.o && $$0 != fbc.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jb $$0) {
         return this.b.a_($$0).a(dqb.K) || super.a($$0);
      }
   }
}
