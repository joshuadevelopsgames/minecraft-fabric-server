import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cul extends cua implements dfa.b {
   private static final int cm = 0;
   @Nullable
   private jb cn;
   private int co = 0;

   public cul(bzv<? extends cul> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(0, new cit<>(this, der.a(dcz.tK, des.g), ayz.Db, $$0 -> this.ai().X() && !$$0.cs()));
      this.ch.a(0, new cit<>(this, new dcv(dcz.rL), ayz.Dg, $$0 -> this.ai().W() && $$0.cs()));
      this.ch.a(1, new cir(this));
      this.ch.a(1, new cgp<>(this, cso.class, 8.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, cro.class, 12.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, csk.class, 8.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, csj.class, 8.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, cry.class, 15.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, crt.class, 12.0F, 0.5, 0.5));
      this.ch.a(1, new cgp<>(this, csn.class, 10.0F, 0.5, 0.5));
      this.ch.a(1, new cib(this, 0.5));
      this.ch.a(1, new chr(this));
      this.ch.a(2, new cul.a(this, 2.0, 0.35));
      this.ch.a(4, new chw(this, 0.35));
      this.ch.a(8, new civ(this, 0.35));
      this.ch.a(9, new chl(this, cut.class, 3.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return null;
   }

   @Override
   public boolean gK() {
      return false;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (!$$2.a(dcz.vj) && this.bO() && !this.gI() && !this.g_()) {
         if ($$1 == bxi.a) {
            $$0.a(azj.T);
         }

         if (!this.ai().C) {
            if (this.gJ().isEmpty()) {
               return bxj.c;
            }

            this.g($$0);
            this.a($$0, this.Q_(), 1);
         }

         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gO() {
      dlr $$0 = this.gJ();

      for (Pair<cuj.g[], Integer> $$1 : cuj.b) {
         cuj.g[] $$2 = (cuj.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("DespawnDelay", this.co);
      $$0.b("wander_target", jb.a, this.cn);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.co = $$0.a("DespawnDelay", 0);
      this.cn = $$0.<jb>a("wander_target", jb.a).orElse(null);
      this.c_(Math.max(0, this.Z_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dlq $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ar.a(4);
         this.ai().b(new caa(this.ai(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   protected ayy p() {
      return this.gI() ? ayz.Dh : ayz.CZ;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.De;
   }

   @Override
   protected ayy f_() {
      return ayz.Da;
   }

   @Override
   public ayy j(dcv $$0) {
      return $$0.a(dcz.rL) ? ayz.Dc : ayz.Dd;
   }

   @Override
   protected ayy x(boolean $$0) {
      return $$0 ? ayz.Di : ayz.Df;
   }

   @Override
   public ayy gL() {
      return ayz.Di;
   }

   public void t(int $$0) {
      this.co = $$0;
   }

   public int gQ() {
      return this.co;
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C) {
         this.gR();
      }
   }

   private void gR() {
      if (this.co > 0 && !this.gI() && --this.co == 0) {
         this.at();
      }
   }

   public void h(@Nullable jb $$0) {
      this.cn = $$0;
   }

   @Nullable
   jb gS() {
      return this.cn;
   }

   class a extends chi {
      final cul a;
      final double b;
      final double c;

      a(final cul $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cul.this.cg.n();
      }

      @Override
      public boolean b() {
         jb $$0 = this.a.gS();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jb $$0 = this.a.gS();
         if ($$0 != null && cul.this.cg.l()) {
            if (this.a($$0, 10.0)) {
               fis $$1 = new fis($$0.u() - this.a.dC(), $$0.v() - this.a.dE(), $$0.w() - this.a.dI()).d();
               fis $$2 = $$1.c(10.0).b(this.a.dC(), this.a.dE(), this.a.dI());
               cul.this.cg.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cul.this.cg.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jb $$0, double $$1) {
         return !$$0.a(this.a.dv(), $$1);
      }
   }
}
