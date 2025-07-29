import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvy extends dpz implements dsx, dxl {
   public static final MapCodec<dvy> a = b(dvy::new);
   public static final eez<jh> b = eer.bq;
   public static final eez<eey> c = eer.br;
   public static final ees d = eer.I;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float D = 0.17578125F;
   private static final float R = 0.05859375F;
   private static final double S = 0.6;
   private static final float T = 1.0F;
   private static final int U = 40;
   private static final int V = 6;
   private static final float W = 2.5F;
   private static final int X = 2;
   private static final float Y = 5.0F;
   private static final float Z = 0.011377778F;
   private static final int aa = 7;
   private static final int ab = 10;
   private static final fjm ac = dpz.b(6.0, 0.0, 16.0);
   private static final fjm ad = dpz.b(6.0, 0.0, 11.0);
   private static final fjm ae = dpz.b(6.0, 5.0, 16.0);
   private static final fjm af = dpz.b(8.0, 0.0, 16.0);
   private static final fjm ag = dpz.b(10.0, 0.0, 16.0);
   private static final fjm ah = dpz.b(12.0, 0.0, 16.0);
   private static final double ai = ae.b(jh.a.b);
   private static final float aj = (float)ah.b(jh.a.a);
   private static final fjm ak = dpz.b(4.0, 0.0, 16.0);

   @Override
   public MapCodec<dvy> a() {
      return a;
   }

   public dvy(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.b).b(c, eey.b).b(d, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      if ($$4 != jh.b && $$4 != jh.a) {
         return $$0;
      } else {
         jh $$8 = $$0.c(b);
         if ($$8 == jh.a && $$2.V().a($$3, this)) {
            return $$0;
         } else if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == jh.a) {
               $$2.a($$3, this, 2);
            } else {
               $$2.a($$3, this, 1);
            }

            return $$0;
         } else {
            boolean $$9 = $$0.c(c) == eey.a;
            eey $$10 = a($$1, $$3, $$8, $$9);
            return $$0.b(c, $$10);
         }
      }
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      if (!$$0.C) {
         jb $$4 = $$2.b();
         if ($$0 instanceof aub $$5 && $$3.c($$5, $$4) && $$3.a($$5) && $$3 instanceof cwc && $$3.dA().g() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      if ($$1.c(b) == jh.b && $$1.c(c) == eey.b) {
         $$3.a($$4 + 2.5, 2.0F, $$0.al().w());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if (o($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (r($$0) && !this.a($$0, (dmx)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (dmx)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(eeb $$0, aub $$1, jb $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (dmx)$$1, $$2)) {
            Optional<dvy.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               fak $$5 = $$4.get().b;
               float $$6;
               if ($$5 == fam.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != fam.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  jb $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(dqb.tt) && $$5 == fam.c) {
                        eeb $$10 = dqb.ei.m();
                        $$1.c($$4.get().a, $$10);
                        dpz.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(ejb.c, $$4.get().a, ejb.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        jb $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           eeb $$14 = $$1.a_($$11);
                           $$1.a($$11, $$14.b(), $$13);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      dmv $$1 = $$0.q();
      jb $$2 = $$0.a();
      jh $$3 = $$0.e().g();
      jh $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         eey $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.m().b(b, $$4).b(c, $$6).b(d, $$1.b_($$2).a() == fam.c);
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected fjm d_(eeb $$0) {
      return fjj.a();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      fjm $$4 = switch ((eey)$$0.c(c)) {
         case a -> ac;
         case b -> $$0.c(b) == jh.a ? ae : ad;
         case c -> af;
         case d -> ag;
         case e -> ah;
      };
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eeb $$0, dly $$1, jb $$2) {
      return false;
   }

   @Override
   protected float ar_() {
      return aj;
   }

   @Override
   public void a(dmu $$0, jb $$1, cqy $$2) {
      if (!$$2.be()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public byb a(bzm $$0) {
      return $$0.ea().c($$0);
   }

   private static void a(eeb $$0, aub $$1, jb $$2) {
      jb.a $$3 = $$2.k();
      eeb $$4 = $$0;

      while (q($$4)) {
         cqy $$5 = cqy.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * $$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(jh.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(eeb $$0, aub $$1, jb $$2, bck $$3) {
      eeb $$4 = $$1.a_($$2.b(1));
      eeb $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         jb $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            eeb $$7 = $$1.a_($$6);
            if (o($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, jh.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(aub $$0, jb $$1) {
      jb.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(jh.a);
         eeb $$4 = $$0.a_($$2);
         if (!$$4.y().c()) {
            return;
         }

         if (a($$4, jh.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, jh.b);
            return;
         }

         if (c($$0, $$2, jh.b) && !$$0.B($$2.e())) {
            a($$0, $$2.e(), jh.b);
            return;
         }

         if (!a((dly)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aub $$0, jb $$1, jh $$2) {
      jb $$3 = $$1.a($$2);
      eeb $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (dmv)$$0, $$3);
      } else if ($$4.l() || $$4.a(dqb.J)) {
         a($$0, $$3, $$2, eey.b);
      }
   }

   private static void a(dmv $$0, jb $$1, jh $$2, eey $$3) {
      eeb $$4 = dqb.tc.m().b(b, $$2).b(c, $$3).b(d, $$0.b_($$1).a() == fam.c);
      $$0.a($$1, $$4, 3);
   }

   private static void a(eeb $$0, dmv $$1, jb $$2) {
      jb $$4;
      jb $$3;
      if ($$0.c(b) == jh.b) {
         $$3 = $$2;
         $$4 = $$2.d();
      } else {
         $$4 = $$2;
         $$3 = $$2.e();
      }

      a($$1, $$4, jh.a, eey.a);
      a($$1, $$3, jh.b, eey.a);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(dmu $$0, jb $$1, eeb $$2, fak $$3) {
      fis $$4 = $$2.a($$1);
      double $$5 = 0.0625;
      double $$6 = $$1.u() + 0.5 + $$4.d;
      double $$7 = $$1.v() + ai - 0.0625;
      double $$8 = $$1.w() + 0.5 + $$4.f;
      fak $$9 = a($$0, $$3);
      mc $$10 = $$9.a(azu.b) ? me.aO : me.aQ;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static jb a(eeb $$0, dmv $$1, jb $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         jh $$5 = $$0.c(b);
         BiPredicate<jb, eeb> $$6 = ($$1x, $$2x) -> $$2x.a(dqb.tc) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static jh b(dmx $$0, jb $$1, jh $$2) {
      jh $$3;
      if (c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private static eey a(dmx $$0, jb $$1, jh $$2, boolean $$3) {
      jh $$4 = $$2.g();
      eeb $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != eey.a ? eey.b : eey.a;
      } else if (!b($$5, $$2)) {
         return eey.b;
      } else {
         eey $$6 = $$5.c(c);
         if ($$6 != eey.b && $$6 != eey.a) {
            eeb $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? eey.e : eey.d;
         } else {
            return eey.c;
         }
      }
   }

   public static boolean o(eeb $$0) {
      return q($$0) && $$0.c(c) == eey.b && !$$0.c(d);
   }

   private static boolean b(eeb $$0, aub $$1, jb $$2) {
      jh $$3 = $$0.c(b);
      jb $$4 = $$2.a($$3);
      eeb $$5 = $$1.a_($$4);
      if (!$$5.y().c()) {
         return false;
      } else {
         return $$5.l() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<jb> a(dmu $$0, jb $$1, eeb $$2, int $$3) {
      jh $$4 = $$2.c(b);
      BiPredicate<jb, eeb> $$5 = ($$1x, $$2x) -> $$2x.a(dqb.tc) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(dqb.tc), $$3);
   }

   private static boolean c(dmx $$0, jb $$1, jh $$2) {
      jb $$3 = $$1.a($$2.g());
      eeb $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(eeb $$0, boolean $$1) {
      if (!$$0.a(dqb.tc)) {
         return false;
      } else {
         eey $$2 = $$0.c(c);
         return $$2 == eey.b || $$1 && $$2 == eey.a;
      }
   }

   private static boolean a(eeb $$0, jh $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean q(eeb $$0) {
      return b($$0, jh.a);
   }

   private static boolean r(eeb $$0) {
      return b($$0, jh.b);
   }

   private static boolean b(eeb $$0, dmx $$1, jb $$2) {
      return q($$0) && !$$1.a_($$2.d()).a(dqb.tc);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   private static boolean b(eeb $$0, jh $$1) {
      return $$0.a(dqb.tc) && $$0.c(b) == $$1;
   }

   @Nullable
   private static jb a(dmu $$0, jb $$1, fak $$2) {
      Predicate<eeb> $$3 = $$1x -> $$1x.b() instanceof dos && ((dos)$$1x.b()).a($$2);
      BiPredicate<jb, eeb> $$4 = ($$1x, $$2x) -> a((dly)$$0, $$1x, $$2x);
      return a($$0, $$1, jh.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static jb a(dmu $$0, jb $$1) {
      BiPredicate<jb, eeb> $$2 = ($$1x, $$2x) -> a((dly)$$0, $$1x, $$2x);
      return a($$0, $$1, jh.b.f(), $$2, dvy::o, 11).orElse(null);
   }

   public static fak a(aub $$0, jb $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dvy::a).orElse(fam.a);
   }

   private static Optional<dvy.a> b(dmu $$0, jb $$1, eeb $$2) {
      return !q($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         jb $$2x = $$1x.d();
         eeb $$3 = $$0.a_($$2x);
         fak $$4;
         if ($$3.a(dqb.tt) && !$$0.G_().i()) {
            $$4 = fam.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dvy.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(fak $$0) {
      return $$0 == fam.e || $$0 == fam.c;
   }

   private static boolean a(eeb $$0, eeb $$1) {
      return $$0.a(dqb.td) && $$1.a(dqb.J) && $$1.y().b();
   }

   private static fak a(dmu $$0, fak $$1) {
      if ($$1.a(fam.a)) {
         return $$0.G_().i() ? fam.e : fam.c;
      } else {
         return $$1;
      }
   }

   private static Optional<jb> a(dmv $$0, jb $$1, jh.b $$2, BiPredicate<jb, eeb> $$3, Predicate<eeb> $$4, int $$5) {
      jh $$6 = jh.a($$2, jh.a.b);
      jb.a $$7 = $$1.k();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         eeb $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.j());
         }

         if ($$0.e($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(dly $$0, jb $$1, eeb $$2) {
      if ($$2.l()) {
         return true;
      } else if ($$2.s()) {
         return false;
      } else if (!$$2.y().c()) {
         return false;
      } else {
         fjm $$3 = $$2.g($$0, $$1);
         return !fjj.c(ak, $$3, fiw.i);
      }
   }

   record a(jb a, fak b, eeb c) {
   }
}
