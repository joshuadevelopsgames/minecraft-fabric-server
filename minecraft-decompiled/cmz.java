import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmz extends cnh implements cmr {
   private static final alh<Integer> cs = all.a(cmz.class, alj.b);
   private static final Predicate<cao> ct = new Predicate<cao>() {
      public boolean a(@Nullable cao $$0) {
         return $$0 != null && cmz.cu.containsKey($$0.ap());
      }
   };
   static final Map<bzv<?>, ayy> cu = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bzv.p, ayz.tX);
      $$0.put(bzv.r, ayz.tY);
      $$0.put(bzv.s, ayz.tZ);
      $$0.put(bzv.w, ayz.uw);
      $$0.put(bzv.E, ayz.ua);
      $$0.put(bzv.F, ayz.ub);
      $$0.put(bzv.L, ayz.uc);
      $$0.put(bzv.N, ayz.ud);
      $$0.put(bzv.Q, ayz.ue);
      $$0.put(bzv.P, ayz.uf);
      $$0.put(bzv.T, ayz.ug);
      $$0.put(bzv.ae, ayz.uh);
      $$0.put(bzv.af, ayz.sk);
      $$0.put(bzv.ak, ayz.ui);
      $$0.put(bzv.al, ayz.uj);
      $$0.put(bzv.ao, ayz.uk);
      $$0.put(bzv.ap, ayz.ul);
      $$0.put(bzv.aB, ayz.um);
      $$0.put(bzv.aR, ayz.un);
      $$0.put(bzv.aT, ayz.uo);
      $$0.put(bzv.aU, ayz.up);
      $$0.put(bzv.aV, ayz.uq);
      $$0.put(bzv.bb, ayz.ur);
      $$0.put(bzv.be, ayz.us);
      $$0.put(bzv.bg, ayz.ut);
      $$0.put(bzv.bh, ayz.uu);
      $$0.put(bzv.bj, ayz.uv);
      $$0.put(bzv.bq, ayz.uw);
      $$0.put(bzv.bu, ayz.ux);
      $$0.put(bzv.bE, ayz.uy);
      $$0.put(bzv.bG, ayz.uz);
      $$0.put(bzv.bI, ayz.uA);
      $$0.put(bzv.bK, ayz.uB);
      $$0.put(bzv.bL, ayz.uC);
      $$0.put(bzv.bM, ayz.uD);
      $$0.put(bzv.bP, ayz.uE);
      $$0.put(bzv.bQ, ayz.uF);
      $$0.put(bzv.bS, ayz.uG);
   });
   public float co;
   public float cp;
   public float cq;
   public float cr;
   private float cv = 1.0F;
   private float cw = 1.0F;
   private boolean cx;
   @Nullable
   private jb cy;

   public cmz(bzv<? extends cmz> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgi(this, 10, false);
      this.a(fbc.n, -1.0F);
      this.a(fbc.o, -1.0F);
      this.a(fbc.x, -1.0F);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.a(ag.a(cmz.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bzc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean g_() {
      return false;
   }

   @Override
   protected void H() {
      this.ch.a(0, new cbi.a(1.25));
      this.ch.a(0, new chc(this));
      this.ch.a(1, new chq(this, cut.class, 8.0F));
      this.ch.a(2, new cin(this));
      this.ch.a(2, new chg(this, 1.0, 5.0F, 1.0F));
      this.ch.a(2, new cmz.a(this, 1.0));
      this.ch.a(3, new chn(this));
      this.ch.a(3, new chf(this, 1.0, 3.0F, 7.0F));
   }

   public static cbr.a gT() {
      return cmd.gM().a(cbs.t, 6.0).a(cbs.m, 0.4F).a(cbs.w, 0.2F).a(cbs.c, 3.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      cju $$1 = new cju(this, $$0);
      $$1.d(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void e_() {
      if (this.cy == null || !this.cy.a(this.dv(), 3.46) || !this.ai().a_(this.cy).a(dqb.ek)) {
         this.cx = false;
         this.cy = null;
      }

      if (this.ai().A.a(400) == 0) {
         a(this.ai(), this);
      }

      super.e_();
      this.gY();
   }

   @Override
   public void a(jb $$0, boolean $$1) {
      this.cy = $$0;
      this.cx = $$1;
   }

   public boolean gU() {
      return this.cx;
   }

   private void gY() {
      this.cr = this.co;
      this.cq = this.cp;
      this.cp = this.cp + (!this.aK() && !this.cc() ? 4 : -1) * 0.3F;
      this.cp = bcb.a(this.cp, 0.0F, 1.0F);
      if (!this.aK() && this.cv < 1.0F) {
         this.cv = 1.0F;
      }

      this.cv *= 0.9F;
      fis $$0 = this.dA();
      if (!this.aK() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.co = this.co + this.cv * 2.0F;
   }

   public static boolean a(dmu $$0, bzm $$1) {
      if ($$1.bO() && !$$1.be() && $$0.A.a(2) == 0) {
         List<cao> $$2 = $$0.a(cao.class, $$1.cV().g(20.0), ct);
         if (!$$2.isEmpty()) {
            cao $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.be()) {
               ayy $$4 = b($$3.ap());
               $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$4, $$1.do(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (!this.m() && $$2.a(azx.aV)) {
         this.a($$0, $$1, $$2);
         if (!this.be()) {
            this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.tU, this.do(), 1.0F, 1.0F + (this.ar.i() - this.ar.i()) * 0.2F);
         }

         if (!this.ai().C) {
            if (this.ar.a(10) == 0) {
               this.g($$0);
               this.ai().a(this, (byte)7);
            } else {
               this.ai().a(this, (byte)6);
            }
         }

         return bxj.a;
      } else if (!$$2.a(azx.aW)) {
         if (!this.gW() && this.m() && this.j($$0)) {
            if (!this.ai().C) {
               this.z(!this.gH());
            }

            return bxj.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new byq(bys.s, 900));
         if ($$0.gI() || !this.cG()) {
            this.a(this.ea().a($$0), Float.MAX_VALUE);
         }

         return bxj.a;
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return false;
   }

   public static boolean c(bzv<cmz> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cg) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean a(cmd $$0) {
      return false;
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return null;
   }

   @Nullable
   @Override
   public ayy p() {
      return a(this.ai(), this.ai().A);
   }

   public static ayy a(dmu $$0, bck $$1) {
      if ($$0.an() != bxg.a && $$1.a(1000) == 0) {
         List<bzv<?>> $$2 = Lists.newArrayList(cu.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return ayz.tS;
      }
   }

   private static ayy b(bzv<?> $$0) {
      return cu.getOrDefault($$0, ayz.tS);
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.tW;
   }

   @Override
   protected ayy f_() {
      return ayz.tT;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.uH, 0.15F, 1.0F);
   }

   @Override
   protected boolean bd() {
      return this.al > this.cw;
   }

   @Override
   protected void bc() {
      this.a(ayz.tV, 0.15F, 1.0F);
      this.cw = this.al + this.cp / 2.0F;
   }

   @Override
   public float fl() {
      return a(this.ar);
   }

   public static float a(bck $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aza do() {
      return aza.g;
   }

   @Override
   public boolean bL() {
      return true;
   }

   @Override
   protected void E(bzm $$0) {
      if (!($$0 instanceof cut)) {
         super.E($$0);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cmz.b gV() {
      return cmz.b.a(this.ay.a(cs));
   }

   private void a(cmz.b $$0) {
      this.ay.a(cs, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aB ? c((kp<T>)$$0, this.gV()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aB);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aB) {
         this.a(c(kq.aB, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cs, cmz.b.f.k);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Variant", cmz.b.h, this.gV());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cmz.b>a("Variant", cmz.b.h).orElse(cmz.b.f));
   }

   @Override
   public boolean gW() {
      return !this.aK();
   }

   @Override
   protected boolean gL() {
      return true;
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.5F * this.cW(), this.ds() * 0.4F);
   }

   static class a extends ciu {
      public a(cau $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fis h() {
         fis $$0 = null;
         if (this.b.bm()) {
            $$0 = clj.a(this.b, 15, 15);
         }

         if (this.b.ec().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fis k() {
         jb $$0 = this.b.dx();
         jb.a $$1 = new jb.a();
         jb.a $$2 = new jb.a();

         for (jb $$4 : jb.b(
            bcb.a(this.b.dC() - 3.0),
            bcb.a(this.b.dE() - 6.0),
            bcb.a(this.b.dI() - 3.0),
            bcb.a(this.b.dC() + 3.0),
            bcb.a(this.b.dE() + 6.0),
            bcb.a(this.b.dI() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               eeb $$5 = this.b.ai().a_($$2.a($$4, jh.a));
               boolean $$6 = $$5.b() instanceof duq || $$5.a(azo.D);
               if ($$6 && this.b.ai().w($$4) && this.b.ai().w($$1.a($$4, jh.b))) {
                  return fis.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bda {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final cmz.b f = a;
      private static final IntFunction<cmz.b> j = baq.a(cmz.b::a, values(), baq.a.c);
      public static final Codec<cmz.b> g = bda.a(cmz.b::values);
      @Deprecated
      public static final Codec<cmz.b> h = Codec.INT.xmap(j::apply, cmz.b::a);
      public static final zm<ByteBuf, cmz.b> i = zk.a(j, cmz.b::a);
      final int k;
      private final String l;

      private b(final int $$0, final String $$1) {
         this.k = $$0;
         this.l = $$1;
      }

      public int a() {
         return this.k;
      }

      public static cmz.b a(int $$0) {
         return j.apply($$0);
      }

      @Override
      public String c() {
         return this.l;
      }
   }
}
