import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public class ctw extends crv implements ejk {
   private static final int ck = 40;
   private static final int cl = 200;
   private static final int cm = 500;
   private static final float cn = 0.3F;
   private static final float co = 1.0F;
   private static final float cp = 1.5F;
   private static final int cq = 30;
   private static final int cr = 24;
   private static final alh<Integer> cs = all.a(ctw.class, alj.b);
   private static final int ct = 200;
   private static final int cu = 260;
   private static final int cv = 20;
   private static final int cw = 120;
   private static final int cx = 20;
   private static final int cy = 35;
   private static final int cz = 10;
   private static final int cA = 20;
   private static final int cB = 100;
   private static final int cC = 20;
   private static final int cD = 30;
   private static final float cE = 4.5F;
   private static final float cF = 0.7F;
   private static final int cG = 30;
   private int cH;
   private int cI;
   private int cJ;
   private int cM;
   public bzd a = new bzd();
   public bzd b = new bzd();
   public bzd c = new bzd();
   public bzd d = new bzd();
   public bzd e = new bzd();
   public bzd f = new bzd();
   private final eiy<ejk.b> cN;
   private final ejk.d cO;
   private ejk.a cP;
   ctv cQ = new ctv(this::G, Collections.emptyList());

   public ctw(bzv<? extends crv> $$0, dmu $$1) {
      super($$0, $$1);
      this.cO = new ctw.a();
      this.cP = new ejk.a();
      this.cN = new eiy<>(new ejk.b(this));
      this.cc = 5;
      this.S().a(true);
      this.a(fbc.m, 0.0F);
      this.a(fbc.q, 8.0F);
      this.a(fbc.f, 8.0F);
      this.a(fbc.i, 8.0F);
      this.a(fbc.o, 0.0F);
      this.a(fbc.n, 0.0F);
   }

   @Override
   public zw<acq> a(atz $$0) {
      return new acr(this, $$0, this.c(cay.n) ? 1 : 0);
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(cay.n);
      }
   }

   @Override
   public boolean a(dmx $$0) {
      return super.a($$0) && $$0.a(this, this.ap().n().a(this.dv()));
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(aub $$0, byb $$1) {
      return this.gK() && !$$1.a(azp.d) ? true : super.a($$0, $$1);
   }

   boolean gK() {
      return this.c(cay.o) || this.c(cay.n);
   }

   @Override
   protected boolean p(bzm $$0) {
      return false;
   }

   @Override
   public float gb() {
      return 5.0F;
   }

   @Override
   protected float aX() {
      return this.ak + 0.55F;
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 500.0).a(cbs.w, 0.3F).a(cbs.q, 1.0).a(cbs.d, 1.5).a(cbs.c, 30.0).a(cbs.n, 24.0);
   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   protected float fk() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected ayy p() {
      return !this.c(cay.l) && !this.gK() ? this.n().b() : null;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Dr;
   }

   @Override
   protected ayy f_() {
      return ayz.Dn;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.DB, 10.0F, 1.0F);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      $$0.a(this, (byte)4);
      this.a(ayz.Dm, 10.0F, this.fl());
      cgd.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cs, 0);
   }

   public int m() {
      return this.ay.a(cs);
   }

   private void gN() {
      this.ay.a(cs, this.gQ());
   }

   @Override
   public void g() {
      if (this.ai() instanceof aub $$0) {
         ejk.c.a($$0, this.cP, this.cO);
         if (this.gq() || this.af()) {
            ctx.a((cam)this);
         }
      }

      super.g();
      if (this.ai().B_()) {
         if (this.as % this.gO() == 0) {
            this.cJ = 10;
            if (!this.be()) {
               this.ai().a(this.dC(), this.dE(), this.dI(), ayz.Dq, this.do(), 5.0F, this.fl(), false);
            }
         }

         this.cI = this.cH;
         if (this.cH > 0) {
            this.cH--;
         }

         this.cM = this.cJ;
         if (this.cJ > 0) {
            this.cJ--;
         }

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("wardenBrain");
      this.eh().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.as + this.ar()) % 120 == 0) {
         a($$0, this.dv(), this, 20);
      }

      if (this.as % 20 == 0) {
         this.cQ.a($$0, this::G);
         this.gN();
      }

      ctx.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.e.a(this.as);
      } else if ($$0 == 61) {
         this.cH = 10;
      } else if ($$0 == 62) {
         this.f.a(this.as);
      } else {
         super.b($$0);
      }
   }

   private int gO() {
      float $$0 = (float)this.m() / ctu.c.a();
      return 40 - bcb.d(bcb.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cI, this.cH) / 10.0F;
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cM, this.cJ) / 10.0F;
   }

   private void a(bzd $$0) {
      if ((float)$$0.a((float)this.as) < 4500.0F) {
         bck $$1 = this.ec();
         eeb $$2 = this.bx();
         if ($$2.o() != dwn.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dC() + bcb.b($$1, -0.7F, 0.7F);
               double $$5 = this.dE();
               double $$6 = this.dI() + bcb.b($$1, -0.7F, 0.7F);
               this.ai().a(new lw(me.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(alh<?> $$0) {
      if (aD.equals($$0)) {
         switch (this.aw()) {
            case n:
               this.c.a(this.as);
               break;
            case o:
               this.d.a(this.as);
               break;
            case l:
               this.a.a(this.as);
               break;
            case m:
               this.b.a(this.as);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dmn $$0) {
      return this.gK();
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return ctx.a(this, $$0);
   }

   @Override
   public cbm<ctw> eh() {
      return (cbm<ctw>)super.eh();
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public void a(BiConsumer<eiy<?>, aub> $$0) {
      if (this.ai() instanceof aub $$1) {
         $$0.accept(this.cN, $$1);
      }
   }

   @Contract("null->false")
   public boolean G(@Nullable bzm $$0) {
      return $$0 instanceof cam $$1
         && this.ai() == $$0.ai()
         && bzt.e.test($$0)
         && !this.t($$0)
         && $$1.ap() != bzv.g
         && $$1.ap() != bzv.bI
         && !$$1.cG()
         && !$$1.eM()
         && this.ai().F_().a($$1.cV());
   }

   public static void a(aub $$0, fis $$1, @Nullable bzm $$2, int $$3) {
      byq $$4 = new byq(bys.G, 260, 0, false, false);
      byr.a($$0, $$2, $$1, $$3, $$4, 200);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("anger", ctv.a(this::G), this.cQ);
      $$0.a("listener", ejk.a.a, this.cP);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cQ = $$0.<ctv>a("anger", ctv.a(this::G)).orElseGet(() -> new ctv(this::G, Collections.emptyList()));
      this.gN();
      this.cP = $$0.<ejk.a>a("listener", ejk.a.a).orElseGet(ejk.a::new);
   }

   private void gP() {
      if (!this.c(cay.l)) {
         this.a(this.n().c(), 10.0F, this.fl());
      }
   }

   public ctu n() {
      return ctu.a(this.gQ());
   }

   private int gQ() {
      return this.cQ.b(this.e());
   }

   public void H(bzm $$0) {
      this.cQ.a($$0);
   }

   public void I(@Nullable bzm $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bzm $$0, int $$1, boolean $$2) {
      if (!this.gw() && this.G($$0)) {
         ctx.a((cam)this);
         boolean $$3 = !(this.e() instanceof cut);
         int $$4 = this.cQ.a($$0, $$1);
         if ($$0 instanceof cut && $$3 && ctu.a($$4).d()) {
            this.eh().b(cjo.p);
         }

         if ($$2) {
            this.gP();
         }
      }
   }

   public Optional<cam> t() {
      return this.n().d() ? this.cQ.a() : Optional.empty();
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.eh().a(cjo.aF, bdk.a, 1200L);
      if ($$2 == bzu.k) {
         this.b(cay.n);
         this.eh().a(cjo.aD, bdk.a, ctx.a);
         this.a(ayz.Dj, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gw() && !this.gK()) {
         bzm $$4 = $$1.d();
         this.a($$4, ctu.c.a() + 20, false);
         if (this.bO.c(cjo.p).isEmpty() && $$4 instanceof cam $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.i($$5);
         }
      }

      return $$3;
   }

   public void i(cam $$0) {
      this.eh().b(cjo.az);
      this.eh().a(cjo.p, $$0);
      this.eh().b(cjo.F);
      cgd.a(this, 200);
   }

   @Override
   public bzp e(cay $$0) {
      bzp $$1 = super.e($$0);
      return this.gK() ? bzp.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bL() {
      return !this.gK() && super.bL();
   }

   @Override
   protected void E(bzm $$0) {
      if (!this.gw() && !this.eh().a(cjo.aI)) {
         this.eh().a(cjo.aI, bdk.a, 20L);
         this.I($$0);
         ctx.a(this, $$0.dx());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public ctv gH() {
      return this.cQ;
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjv(this, $$0) {
         @Override
         protected fbb a(int $$0) {
            this.o = new fbh();
            return new fbb(this.o, $$0) {
               @Override
               protected float a(fax $$0, fax $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ejk.a gI() {
      return this.cP;
   }

   @Override
   public ejk.d gJ() {
      return this.cO;
   }

   class a implements ejk.d {
      private static final int b = 16;
      private final ejf c = new eiz(ctw.this, ctw.this.cW());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ejf b() {
         return this.c;
      }

      @Override
      public bae<ejb> c() {
         return azv.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aub $$0, jb $$1, jl<ejb> $$2, ejb.a $$3) {
         return !ctw.this.gw() && !ctw.this.eM() && !ctw.this.eh().a(cjo.aJ) && !ctw.this.gK() && $$0.F_().a($$1)
            ? !($$3.a() instanceof cam $$4 && !ctw.this.G($$4))
            : false;
      }

      @Override
      public void a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable bzm $$3, @Nullable bzm $$4, float $$5) {
         if (!ctw.this.eM()) {
            ctw.this.bO.a(cjo.aJ, bdk.a, 40L);
            $$0.a(ctw.this, (byte)61);
            ctw.this.a(ayz.DC, 5.0F, ctw.this.fl());
            jb $$6 = $$1;
            if ($$4 != null) {
               if (ctw.this.a($$4, 30.0)) {
                  if (ctw.this.eh().a(cjo.aB)) {
                     if (ctw.this.G($$4)) {
                        $$6 = $$4.dx();
                     }

                     ctw.this.I($$4);
                  } else {
                     ctw.this.a($$4, 10, true);
                  }
               }

               ctw.this.eh().a(cjo.aB, bdk.a, 100L);
            } else {
               ctw.this.I($$3);
            }

            if (!ctw.this.n().d()) {
               Optional<cam> $$7 = ctw.this.cQ.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ctx.a(ctw.this, $$6);
               }
            }
         }
      }
   }
}
