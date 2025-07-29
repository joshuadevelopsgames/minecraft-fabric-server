import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cnr extends cmd {
   public static final float ck = 0.6F;
   public static final float cl = 32.5F;
   public static final int cm = 80;
   private static final double cr = 7.0;
   private static final double cs = 2.0;
   private static final alh<cnr.a> ct = all.a(cnr.class, alj.F);
   private long cu = 0L;
   public final bzd co = new bzd();
   public final bzd cp = new bzd();
   public final bzd cq = new bzd();
   private int cv;
   private boolean cw = false;

   public cnr(bzv<? extends cmd> $$0, dmu $$1) {
      super($$0, $$1);
      this.S().a(true);
      this.cv = this.gU();
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.f.a($$0, bzu.e);
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 12.0).a(cbs.w, 0.14);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ct, cnr.a.a);
   }

   public boolean n() {
      return this.ay.a(ct) != cnr.a.a;
   }

   public boolean t() {
      return this.gI().a(this.cu);
   }

   public boolean gH() {
      return this.gI() == cnr.a.b && this.cu > cnr.a.b.b();
   }

   public cnr.a gI() {
      return this.ay.a(ct);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   public void a(cnr.a $$0) {
      this.ay.a(ct, $$0);
   }

   @Override
   public void a(alh<?> $$0) {
      if (ct.equals($$0)) {
         this.cu = 0L;
      }

      super.a($$0);
   }

   @Override
   protected cbm.b<cnr> ei() {
      return cns.a();
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cns.a(this.ei().a($$0));
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("armadilloBrain");
      ((cbm<cnr>)this.bO).a($$0, this);
      $$1.c();
      $$1.a("armadilloActivityUpdate");
      cns.a(this);
      $$1.c();
      if (this.bO() && !this.g_() && --this.cv <= 0) {
         if (this.a($$0, fdf.aJ, this::a)) {
            this.a(ayz.ak, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
            this.c(ejb.t);
         }

         this.cv = this.gU();
      }

      super.a($$0);
   }

   private int gU() {
      return this.ar.a(20 * bdg.e * 5) + 20 * bdg.e * 5;
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().B_()) {
         this.gV();
      }

      if (this.n()) {
         this.gi();
      }

      this.cu++;
   }

   @Override
   public float ep() {
      return this.g_() ? 0.6F : 1.0F;
   }

   private void gV() {
      switch (this.gI()) {
         case a:
            this.co.a();
            this.cp.a();
            this.cq.a();
            break;
         case b:
            this.co.a();
            this.cp.b(this.as);
            this.cq.a();
            break;
         case c:
            this.co.a();
            this.cp.a();
            if (this.cw) {
               this.cq.a();
               this.cw = false;
            }

            if (this.cu == 0L) {
               this.cq.a(this.as);
               this.cq.a(cnr.a.c.b(), 1.0F);
            } else {
               this.cq.b(this.as);
            }
            break;
         case d:
            this.co.b(this.as);
            this.cp.a();
            this.cq.a();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 64 && this.ai().C) {
         this.cw = true;
         this.ai().a(this.dC(), this.dE(), this.dI(), ayz.am, this.do(), 1.0F, 1.0F, false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aH);
   }

   public static boolean c(bzv<cnr> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cc) && a($$1, $$3);
   }

   public boolean i(cam $$0) {
      if (!this.cV().c(7.0, 2.0, 7.0).c($$0.cV())) {
         return false;
      } else if ($$0.ap().a(azs.d)) {
         return true;
      } else if (this.ew() == $$0) {
         return true;
      } else if ($$0 instanceof cut $$1) {
         return $$1.am() ? false : $$1.cm() || $$1.cc();
      } else {
         return false;
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("state", cnr.a.f, this.gI());
      $$0.a("scute_time", this.cv);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cnr.a>a("state", cnr.a.f).orElse(cnr.a.a));
      $$0.e("scute_time").ifPresent($$0x -> this.cv = $$0x);
   }

   public void gJ() {
      if (!this.n()) {
         this.aa();
         this.gS();
         this.c(ejb.u);
         this.b(ayz.ai);
         this.a(cnr.a.b);
      }
   }

   public void gK() {
      if (this.n()) {
         this.c(ejb.u);
         this.b(ayz.al);
         this.a(cnr.a.a);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.n()) {
         $$2 = ($$2 - 1.0F) / 2.0F;
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void c(aub $$0, byb $$1, float $$2) {
      super.c($$0, $$1, $$2);
      if (!this.gw() && !this.eM()) {
         if ($$1.d() instanceof cam) {
            this.eh().a(cjo.H, true, 80L);
            if (this.gT()) {
               this.gJ();
            }
         } else if ($$1.a(azp.G)) {
            this.gK();
         }
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.za) && this.gL()) {
         $$2.a(16, $$0, d($$1));
         return bxj.a;
      } else {
         return (bxj)(this.n() ? bxj.d : super.b($$0, $$1));
      }
   }

   public boolean gL() {
      if (this.g_()) {
         return false;
      } else {
         if (this.ai() instanceof aub $$0) {
            this.a($$0, new dcv(dcz.pv));
            this.c(ejb.r);
            this.a(ayz.ao);
         }

         return true;
      }
   }

   public boolean gT() {
      return !this.gE() && !this.bp() && !this.R_() && !this.cc() && !this.cd();
   }

   @Override
   public boolean gO() {
      return super.gO() && !this.n();
   }

   @Override
   protected ayy p() {
      return this.n() ? null : ayz.af;
   }

   @Override
   protected void gN() {
      this.b(ayz.ac);
   }

   @Override
   protected ayy f_() {
      return ayz.ah;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.n() ? ayz.ae : ayz.ad;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.ag, 0.15F, 1.0F);
   }

   @Override
   public int gh() {
      return this.n() ? 0 : 32;
   }

   @Override
   protected cgg O() {
      return new cgg(this) {
         @Override
         public void a() {
            if (!cnr.this.n()) {
               super.a();
            }
         }
      };
   }

   public static enum a implements bda {
      a("idle", false, 0, 0) {
         @Override
         public boolean a(long $$0) {
            return false;
         }
      },
      b("rolling", true, 10, 1) {
         @Override
         public boolean a(long $$0) {
            return $$0 > 5L;
         }
      },
      c("scared", true, 50, 2) {
         @Override
         public boolean a(long $$0) {
            return true;
         }
      },
      d("unrolling", true, 30, 3) {
         @Override
         public boolean a(long $$0) {
            return $$0 < 26L;
         }
      };

      static final Codec<cnr.a> f = bda.a(cnr.a::values);
      private static final IntFunction<cnr.a> g = baq.a(cnr.a::d, values(), baq.a.a);
      public static final zm<ByteBuf, cnr.a> e = zk.a(g, cnr.a::d);
      private final String h;
      private final boolean i;
      private final int j;
      private final int k;

      a(final String $$0, final boolean $$1, final int $$2, final int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }

      @Override
      public String c() {
         return this.h;
      }

      private int d() {
         return this.k;
      }

      public abstract boolean a(long var1);

      public boolean a() {
         return this.i;
      }

      public int b() {
         return this.j;
      }
   }
}
