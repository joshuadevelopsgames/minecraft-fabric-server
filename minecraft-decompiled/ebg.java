import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebg extends eaz implements bxa {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 2;
   private static final int c = 4;
   private final ju<dcv> d = ju.a(4, dcv.l);
   private final int[] e = new int[4];
   private final int[] f = new int[4];

   public ebg(jb $$0, eeb $$1) {
      super(ebb.H, $$0, $$1);
   }

   public static void a(aub $$0, jb $$1, eeb $$2, ebg $$3, dht.a<dif, dgx> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.d.size(); $$6++) {
         dcv $$7 = $$3.d.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.e[$$6]++;
            if ($$3.e[$$6] >= $$3.f[$$6]) {
               dif $$8 = new dif($$7);
               dcv $$9 = $$4.a($$8, $$0).map($$2x -> ((dgx)$$2x.b()).a($$8, $$0.K_())).orElse($$7);
               if ($$9.a($$0.L())) {
                  bxf.a($$0, $$1.u(), $$1.v(), $$1.w(), $$9);
                  $$3.d.set($$6, dcv.l);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(ejb.c, $$1, ejb.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebg $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.d.size(); $$5++) {
         if ($$3.e[$$5] > 0) {
            $$4 = true;
            $$3.e[$$5] = bcb.a($$3.e[$$5] - 2, 0, $$3.f[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dmu $$0, jb $$1, eeb $$2, ebg $$3) {
      bck $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dqp.a($$0, $$1, $$2.c(dqp.c), false);
         }
      }

      int $$6 = $$2.c(dqp.e).e();

      for (int $$7 = 0; $$7 < $$3.d.size(); $$7++) {
         if (!$$3.d.get($$7).f() && $$4.i() < 0.2F) {
            jh $$8 = jh.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = $$1.u() + 0.5 - $$8.j() * 0.3125F + $$8.h().j() * 0.3125F;
            double $$11 = $$1.v() + 0.5;
            double $$12 = $$1.w() + 0.5 - $$8.l() * 0.3125F + $$8.h().l() * 0.3125F;

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(me.ah, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public ju<dcv> c() {
      return this.d;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d.clear();
      bxd.a($$0, this.d);
      $$0.h("CookingTimes").ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.e, 0, Math.min(this.f.length, $$0x.length)), () -> Arrays.fill(this.e, 0));
      $$0.h("CookingTotalTimes")
         .ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.f, 0, Math.min(this.f.length, $$0x.length)), () -> Arrays.fill(this.f, 0));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      bxd.a($$0, this.d, true);
      $$0.a("CookingTimes", this.e);
      $$0.a("CookingTotalTimes", this.f);
   }

   public acw d() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      ui var4;
      try (bci.j $$1 = new bci.j(this.t(), a)) {
         fcz $$2 = fcz.a($$1, $$0);
         bxd.a($$2, this.d, true);
         var4 = $$2.b();
      }

      return var4;
   }

   public boolean a(aub $$0, @Nullable cam $$1, dcv $$2) {
      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         dcv $$4 = this.d.get($$3);
         if ($$4.f()) {
            Optional<dhr<dgx>> $$5 = $$0.u().a(dhx.e, new dif($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.f[$$3] = $$5.get().b().d();
            this.e[$$3] = 0;
            this.d.set($$3, $$2.b(1, $$1));
            $$0.a(ejb.c, this.aA_(), ejb.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aA_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.d.clear();
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      if (this.n != null) {
         bxf.a(this.n, $$0, this.c());
      }
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      $$0.a(kq.ap, dfn.a).a(this.c());
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.ap, dfn.a(this.c()));
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("Items");
   }
}
