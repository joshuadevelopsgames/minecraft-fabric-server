import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cxg extends cxy {
   private static final fis b = new fis(0.0, 0.0, 0.0);
   private static final alh<Optional<eeb>> c = all.a(cxg.class, alj.j);
   private static final alh<Integer> d = all.a(cxg.class, alj.b);
   private static final ImmutableMap<cay, ImmutableList<Integer>> h = ImmutableMap.of(
      cay.a, ImmutableList.of(0, 1, -1), cay.f, ImmutableList.of(0, 1, -1), cay.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private static final boolean i = false;
   private boolean j;
   private boolean k = false;
   private final cxo l;
   private static final Map<eff, Pair<kg, kg>> m = Maps.newEnumMap(
      (Map)ag.a(
         () -> {
            kg $$0 = jh.e.q();
            kg $$1 = jh.f.q();
            kg $$2 = jh.c.q();
            kg $$3 = jh.d.q();
            kg $$4 = $$0.p();
            kg $$5 = $$1.p();
            kg $$6 = $$2.p();
            kg $$7 = $$3.p();
            return ImmutableMap.of(
               eff.a,
               Pair.of($$2, $$3),
               eff.b,
               Pair.of($$0, $$1),
               eff.c,
               Pair.of($$4, $$1),
               eff.d,
               Pair.of($$0, $$5),
               eff.e,
               Pair.of($$2, $$7),
               eff.f,
               Pair.of($$6, $$3),
               eff.g,
               Pair.of($$3, $$1),
               eff.h,
               Pair.of($$3, $$0),
               eff.i,
               Pair.of($$2, $$0),
               eff.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected cxg(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
      this.V = true;
      if (b($$1)) {
         this.l = new cxv(this);
      } else {
         this.l = new cxw(this);
      }
   }

   protected cxg(bzv<?> $$0, dmu $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.X = $$0;
      this.Y = $$1;
      this.Z = $$2;
   }

   @Nullable
   public static <T extends cxg> T a(dmu $$0, double $$1, double $$2, double $$3, bzv<T> $$4, bzu $$5, dcv $$6, @Nullable cut $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bzv.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof cxv $$9) {
            jb $$10 = $$8.l();
            eeb $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cxo f() {
      return this.l;
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, Optional.empty());
      $$0.a(d, this.w());
   }

   @Override
   public boolean i(bzm $$0) {
      return cxe.a(this, $$0);
   }

   @Override
   public boolean bL() {
      return true;
   }

   @Override
   public fis a(jh.a $$0, m.a $$1) {
      return cam.l(super.a($$0, $$1));
   }

   @Override
   protected fis a(bzm $$0, bzp $$1, float $$2) {
      boolean $$3 = $$0 instanceof cuf || $$0 instanceof cul;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fis b(cam $$0) {
      jh $$1 = this.cT();
      if ($$1.o() == jh.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cxm.a($$1);
         jb $$3 = this.dx();
         jb.a $$4 = new jb.a();
         ImmutableList<cay> $$5 = $$0.fV();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            cay $$6 = (cay)$$14.next();
            bzp $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)h.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.ai().a(cxm.a(this.ai(), $$4), () -> cxm.a(this.ai(), $$4.e()));
                  if (cxm.a($$11)) {
                     fin $$12 = new fin(-$$8, 0.0, -$$8, $$8, $$7.b(), $$8);
                     fis $$13 = fis.a($$4, $$11);
                     if (cxm.a(this.ai(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cV().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            cay $$15 = (cay)var22.next();
            double $$16 = $$0.a($$15).b();
            int $$17 = bcb.c($$14x - $$4.v() + $$16);
            double $$18 = cxm.a($$4, $$17, $$0x -> this.ai().a_($$0x).g(this.ai(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aW() {
      eeb $$0 = this.ai().a_(this.dx());
      return $$0.a(azo.K) ? 1.0F : super.aW();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.a(this.G() + this.G() * 10.0F);
   }

   @Override
   public boolean bK() {
      return !this.dU();
   }

   public static Pair<kg, kg> a(eff $$0) {
      return m.get($$0);
   }

   @Override
   public jh cT() {
      return this.l.l();
   }

   @Override
   protected double bg() {
      return this.bm() ? 0.005 : 0.04;
   }

   @Override
   public void g() {
      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.G() > 0.0F) {
         this.a(this.G() - 1.0F);
      }

      this.aA();
      this.bZ();
      this.l.b();
      this.bt();
      if (this.bA()) {
         this.aE();
         this.aF();
         this.am *= 0.5;
      }

      this.ax = false;
   }

   public boolean i() {
      return this.ax;
   }

   public jb l() {
      int $$0 = bcb.a(this.dC());
      int $$1 = bcb.a(this.dE());
      int $$2 = bcb.a(this.dI());
      if (b(this.ai())) {
         double $$3 = this.dE() - 0.1 - 1.0E-5F;
         if (this.ai().a_(jb.a((double)$$0, $$3, (double)$$2)).a(azo.K)) {
            $$1 = bcb.a($$3);
         }
      } else if (this.ai().a_(new jb($$0, $$1 - 1, $$2)).a(azo.K)) {
         $$1--;
      }

      return new jb($$0, $$1, $$2);
   }

   protected double a(aub $$0) {
      return this.l.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bi() {
      super.bi();
   }

   @Override
   public void ay() {
      super.ay();
   }

   @Override
   public boolean bt() {
      return super.bt();
   }

   @Override
   public fis ae() {
      return this.l.c(super.ae());
   }

   @Override
   public cah l_() {
      return this.l.a();
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      fis $$1 = this.dA();
      this.l.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(aub $$0) {
      this.l.a($$0);
   }

   protected void e(aub $$0) {
      double $$1 = this.a($$0);
      fis $$2 = this.dA();
      this.n(bcb.a($$2.d, -$$1, $$1), $$2.e, bcb.a($$2.f, -$$1, $$1));
      if (this.aK()) {
         this.i(this.dA().c(0.5));
      }

      this.a(caq.a, this.dA());
      if (!this.aK()) {
         this.i(this.dA().c(0.95));
      }
   }

   protected double a(jb $$0, eff $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(caq $$0, fis $$1) {
      if (b(this.ai())) {
         fis $$2 = this.dv().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dv()));
         }

         if ($$0.equals(caq.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aL();
      }
   }

   @Override
   public void aL() {
      if (b(this.ai())) {
         super.aL();
      } else {
         this.a(this.dv(), this.dv());
         this.aN();
      }
   }

   @Override
   public boolean ct() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   public boolean m() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public fis a(jb $$0) {
      eeb $$1 = this.ai().a_($$0);
      if ($$1.a(dqb.bw) && $$1.c(dwd.d)) {
         eff $$2 = $$1.c(((dpo)$$1.b()).c());
         if ($$2 == eff.b) {
            if (this.b($$0.h())) {
               return new fis(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fis(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == eff.a) {
            if (this.b($$0.f())) {
               return new fis(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fis(0.0, 0.0, -1.0);
            }
         }

         return fis.c;
      } else {
         return fis.c;
      }
   }

   public boolean b(jb $$0) {
      return this.ai().a_($$0).d(this.ai(), $$0);
   }

   @Override
   protected fis a(fis $$0) {
      double $$1 = this.l.m();
      fis $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bm()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.a("DisplayState", eeb.a));
      this.c($$0.a("DisplayOffset", this.w()));
      this.k = $$0.a("FlippedRotation", false);
      this.ax = $$0.a("HasTicked", false);
   }

   @Override
   protected void a(fdc $$0) {
      this.z().ifPresent($$1x -> $$0.a("DisplayState", eeb.a, $$1x));
      int $$1 = this.v();
      if ($$1 != this.w()) {
         $$0.a("DisplayOffset", $$1);
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ax);
   }

   @Override
   public void h(bzm $$0) {
      if (!this.ai().C) {
         if (!$$0.aq && !this.aq) {
            if (!this.z($$0)) {
               double $$1 = $$0.dC() - this.dC();
               double $$2 = $$0.dI() - this.dI();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof cxg $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.i(-$$1, 0.0, -$$2);
                     $$0.i($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(cxg $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.ai())) {
         $$3 = this.dA().d;
         $$4 = this.dA().f;
      } else {
         $$3 = $$0.dC() - this.dC();
         $$4 = $$0.dI() - this.dI();
      }

      fis $$7 = new fis($$3, 0.0, $$4).d();
      fis $$8 = new fis(bcb.b(this.dP() * (float) (Math.PI / 180.0)), 0.0, bcb.a(this.dP() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.ai())) {
         fis $$10 = this.dA();
         fis $$11 = $$0.dA();
         if ($$0.y() && !this.y()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.y() && this.y()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public eeb n() {
      return this.z().orElseGet(this::u);
   }

   private Optional<eeb> z() {
      return this.au().a(c);
   }

   public eeb u() {
      return dqb.a.m();
   }

   public int v() {
      return this.au().a(d);
   }

   public int w() {
      return 6;
   }

   public void a(Optional<eeb> $$0) {
      this.au().a(c, $$0);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
   }

   public static boolean b(dmu $$0) {
      return $$0.L().b(cyf.d);
   }

   @Override
   public abstract dcv dM();

   public boolean x() {
      return false;
   }

   public boolean y() {
      return false;
   }
}
