import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dpm extends dpz {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final fjm a = dpz.b(16.0, 0.0, 1.0);

   public dpm(eea.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dpm> a();

   @Override
   public eeb a(dgo $$0) {
      return a($$0.q(), $$0.a());
   }

   public static eeb a(dly $$0, jb $$1) {
      jb $$2 = $$1.e();
      eeb $$3 = $$0.a_($$2);
      return dxv.o($$3) ? dqb.cC.m() : ((dtc)dqb.cB).b($$0, $$1);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(24) == 0) {
         $$1.a($$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.jG, aza.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jb $$4 = $$2.e();
      eeb $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jh.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = $$2.u() + $$3.j() * 0.1F;
               double $$12 = $$2.v() + $$3.j();
               double $$13 = $$2.w() + $$3.j();
               $$1.a(me.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = $$2.u() + 1 - $$3.j() * 0.1F;
               double $$16 = $$2.v() + $$3.j();
               double $$17 = $$2.w() + $$3.j();
               $$1.a(me.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = $$2.u() + $$3.j();
               double $$20 = $$2.v() + $$3.j();
               double $$21 = $$2.w() + $$3.j() * 0.1F;
               $$1.a(me.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = $$2.u() + $$3.j();
               double $$24 = $$2.v() + $$3.j();
               double $$25 = $$2.w() + 1 - $$3.j() * 0.1F;
               $$1.a(me.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = $$2.u() + $$3.j();
               double $$28 = $$2.v() + 1 - $$3.j() * 0.1F;
               double $$29 = $$2.w() + $$3.j();
               $$1.a(me.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = $$2.u() + $$3.j();
            double $$8 = $$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = $$2.w() + $$3.j();
            $$1.a(me.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(eeb var1);

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      $$4.a(caf.b);
      $$4.b(caf.b, $$0x -> $$0x.a($$0x.ai().al().a(), this.e));
   }

   public static void a(bzm $$0) {
      if (!$$0.bl()) {
         if ($$0.aH() < 0) {
            $$0.h($$0.aH() + 1);
         } else if ($$0 instanceof auc) {
            int $$1 = $$0.ai().H_().b(1, 3);
            $$0.h($$0.aH() + $$1);
         }

         if ($$0.aH() >= 0) {
            $$0.e(8.0F);
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<fbk> $$5 = fbk.a((dmv)$$1, $$2, jh.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dmx)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dmu $$0) {
      return $$0.aj() == dmu.i || $$0.aj() == dmu.j;
   }

   @Override
   protected void a(dmu $$0, cut $$1, jb $$2, eeb $$3) {
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.B_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dmu $$0, jb $$1, jh $$2) {
      eeb $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dmx)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dmu $$0, jb $$1, jh $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jb.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jh $$5 : jh.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dqb.cy)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jh.a $$6 = $$2.o().d() ? $$2.i().o() : jh.c.a.b($$0.A);
            return fbk.a((dmv)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
