import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpw extends dub implements dqc, dxl {
   public static final MapCodec<dpw> a = b(dpw::new);
   private static final ees b = eer.I;
   private static final eez<efn> c = eer.bp;
   private static final int d = -1;
   private static final Object2IntMap<efn> e = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(efn.b, 10);
      $$0.put(efn.c, 10);
      $$0.put(efn.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<efn, fjm> D = Maps.newEnumMap(
      Map.of(efn.a, dpz.b(16.0, 11.0, 15.0), efn.b, dpz.b(16.0, 11.0, 15.0), efn.c, dpz.b(16.0, 11.0, 13.0), efn.d, fjj.a())
   );
   private final Function<eeb, fjm> R;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   protected dpw(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(f, jh.c).b(c, efn.a));
      this.R = this.q();
   }

   private Function<eeb, fjm> q() {
      Map<jh, fjm> $$0 = fjj.c(dpz.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fjj.a(D.get($$1.c(c)), $$0.get($$1.c(f))), new efe[]{b});
   }

   public static void a(dmv $$0, bck $$1, jb $$2, jh $$3) {
      int $$4 = bcb.a($$1, 2, 5);
      jb.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dmw)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jh.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dpx.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jh.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(eeb $$0) {
      return $$0.l() || $$0.a(dqb.J) || $$0.a(dqb.tq);
   }

   protected static boolean a(dmw $$0, jb $$1, eeb $$2) {
      return !$$0.u($$1) && o($$2);
   }

   protected static boolean a(dmv $$0, jb $$1, fal $$2, jh $$3) {
      eeb $$4 = dqb.to.m().b(b, $$2.a(fam.c)).b(f, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      this.a($$1, $$0, $$2.b(), efn.d, ayz.ii);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      eeb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dqb.tp) || $$4.a(azo.bC);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.a && !$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return $$4 == jh.b && $$6.a(this) ? dqb.tp.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      eeb $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      jb $$4 = $$2.d();
      eeb $$5 = $$0.a_($$4);
      if (a((dmw)$$0, $$4, $$5)) {
         jh $$6 = $$3.c(f);
         dpx.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == efn.a && a($$2, $$3) && !$$1.E($$2)) {
            this.a($$0, $$1, $$2, efn.b, null);
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.E($$2)) {
         d($$0, $$1, $$2);
      } else {
         efn $$4 = $$0.c(c);
         if ($$4 == efn.b) {
            this.a($$0, $$1, $$2, efn.c, ayz.ii);
         } else if ($$4 == efn.c) {
            this.a($$0, $$1, $$2, efn.d, ayz.ii);
         } else if ($$4 == efn.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$1.E($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dmu $$0, jb $$1, ayy $$2) {
      float $$3 = bcb.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aza.e, 1.0F, $$3);
   }

   private static boolean a(jb $$0, bzm $$1) {
      return $$1.aK() && $$1.dv().e > $$0.v() + 0.6875F;
   }

   private void a(eeb $$0, dmu $$1, jb $$2, efn $$3, @Nullable ayy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(eeb $$0, dmu $$1, jb $$2) {
      a($$0, $$1, $$2, efn.a);
      if ($$0.c(c) != efn.a) {
         a($$1, $$2, ayz.ij);
      }
   }

   private static void a(eeb $$0, dmu $$1, jb $$2, efn $$3) {
      efn $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ejb.c, $$2);
      }
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a().e());
      fal $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dqb.to) || $$1.a(dqb.tp);
      return this.m().b(b, $$2.a(fam.c)).b(f, $$3 ? $$1.c(f) : $$0.g().g());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, f, c);
   }
}
