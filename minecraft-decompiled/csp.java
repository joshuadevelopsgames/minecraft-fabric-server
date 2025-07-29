import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class csp extends cso implements cuh {
   private static final alh<Boolean> a = all.a(csp.class, alj.k);
   private static final alh<cug> f = all.a(csp.class, alj.u);
   private static final int ck = 3600;
   private static final int cl = 6000;
   private static final int cm = 14;
   private static final int cn = 4;
   private static final int co = -1;
   private static final int cp = 0;
   private int cq;
   @Nullable
   private UUID cr;
   @Nullable
   private cjk cs;
   @Nullable
   private dlr ct;
   private int cu = 0;

   public csp(bzv<? extends csp> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(f, cuf.gW());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("VillagerData", cug.c, this.gR());
      $$0.b("Offers", dlr.a, this.ct);
      $$0.b("Gossips", cjk.a, this.cs);
      $$0.a("ConversionTime", this.gQ() ? this.cq : -1);
      $$0.b("ConversionPlayer", kf.a, this.cr);
      $$0.a("Xp", this.cu);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.ay.a(f, $$0.<cug>a("VillagerData", cug.c).orElseGet(cuf::gW));
      this.ct = $$0.<dlr>a("Offers", dlr.a).orElse(null);
      this.cs = $$0.<cjk>a("Gossips", cjk.a).orElse(null);
      int $$1 = $$0.a("ConversionTime", -1);
      if ($$1 != -1) {
         UUID $$2 = $$0.<UUID>a("ConversionPlayer", kf.a).orElse(null);
         this.b($$2, $$1);
      } else {
         this.au().a(a, false);
         this.cq = -1;
      }

      this.cu = $$0.a("Xp", 0);
   }

   @Override
   public void g() {
      if (!this.ai().C && this.bO() && this.gQ()) {
         int $$0 = this.gT();
         this.cq -= $$0;
         if (this.cq <= 0) {
            this.g((aub)this.ai());
         }
      }

      super.g();
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.rf)) {
         if (this.d(bys.r)) {
            $$2.a(1, $$0);
            if (!this.ai().C) {
               this.b($$0.cK(), this.ar.a(2401) + 3600);
            }

            return bxj.b;
         } else {
            return bxj.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gI() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gQ() && this.cu == 0;
   }

   public boolean gQ() {
      return this.au().a(a);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.cr = $$0;
      this.cq = $$1;
      this.au().a(a, true);
      this.g(bys.r);
      this.a(new byq(bys.e, $$1, Math.min(this.ai().an().a() - 1, 0)));
      this.ai().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.be()) {
            this.ai().a(this.dC(), this.dG(), this.dI(), ayz.Fj, this.do(), 1.0F + this.ar.i(), this.ar.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(aub $$0) {
      this.a(bzv.bF, bzg.a(this, false, false), $$1 -> {
         for (bzw $$2 : this.a($$0, $$0xx -> !djk.a($$0xx, djj.E))) {
            cbd $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gR());
         if (this.cs != null) {
            $$1.a(this.cs);
         }

         if (this.ct != null) {
            $$1.b(this.ct.a());
         }

         $$1.t(this.cu);
         $$1.a($$0, $$0.d_($$1.dx()), bzu.i, null);
         $$1.g($$0);
         if (this.cr != null) {
            cut $$4 = $$0.a(this.cr);
            if ($$4 instanceof auc) {
               aq.s.a((auc)$$4, this, $$1);
               $$0.a(clm.a, $$4, $$1);
            }
         }

         $$1.a(new byq(bys.i, 200, 0));
         if (!this.be()) {
            $$0.a(null, 1027, this.dx(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.cq = $$0;
   }

   private int gT() {
      int $$0 = 1;
      if (this.ar.i() < 0.01F) {
         int $$1 = 0;
         jb.a $$2 = new jb.a();

         for (int $$3 = (int)this.dC() - 4; $$3 < (int)this.dC() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dE() - 4; $$4 < (int)this.dE() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dI() - 4; $$5 < (int)this.dI() + 4 && $$1 < 14; $$5++) {
                  eeb $$6 = this.ai().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dqb.fo) || $$6.b() instanceof dps) {
                     if (this.ar.i() < 0.3F) {
                        $$0++;
                     }

                     $$1++;
                  }
               }
            }
         }
      }

      return $$0;
   }

   @Override
   public float fl() {
      return this.g_() ? (this.ar.i() - this.ar.i()) * 0.2F + 2.0F : (this.ar.i() - this.ar.i()) * 0.2F + 1.0F;
   }

   @Override
   public ayy p() {
      return ayz.Fh;
   }

   @Override
   public ayy e(byb $$0) {
      return ayz.Fl;
   }

   @Override
   public ayy f_() {
      return ayz.Fk;
   }

   @Override
   public ayy n() {
      return ayz.Fm;
   }

   @Override
   protected dcv gH() {
      return dcv.l;
   }

   public void a(dlr $$0) {
      this.ct = $$0;
   }

   public void a(cjk $$0) {
      this.cs = $$0;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cug $$4 = this.gR().a($$0.K_(), cuk.a($$0.v(this.dx())));
      Optional<jl.c<cui>> $$5 = mm.x.a(this.ar);
      if ($$5.isPresent()) {
         $$4 = $$4.b($$5.get());
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cug $$0) {
      cug $$1 = this.gR();
      if (!$$1.b().equals($$0.b())) {
         this.ct = null;
      }

      this.ay.a(f, $$0);
   }

   @Override
   public cug gR() {
      return this.ay.a(f);
   }

   public int gS() {
      return this.cu;
   }

   public void s(int $$0) {
      this.cu = $$0;
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.av ? c((kp<T>)$$0, this.gR().a()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.av) {
         jl<cuk> $$2 = c(kq.av, $$1);
         this.a(this.gR().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
