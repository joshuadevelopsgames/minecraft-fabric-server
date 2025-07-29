import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dzo extends dpz implements dxl {
   public static final MapCodec<dzo> a = b(dzo::new);
   public static final ees b = eer.L;
   public static final eez<efo> c = eer.Z;
   public static final eez<efo> d = eer.aa;
   public static final eez<efo> e = eer.ab;
   public static final eez<efo> f = eer.ac;
   public static final Map<jh, eez<efo>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jh.c, d, jh.f, c, jh.d, e, jh.e, f)));
   public static final ees h = eer.I;
   private final Function<eeb, fjm> i;
   private final Function<eeb, fjm> D;
   private static final fjm R = dpz.b(2.0, 0.0, 16.0);
   private static final Map<jh, fjm> S = fjj.c(dpz.b(2.0, 16.0, 0.0, 9.0));

   @Override
   public MapCodec<dzo> a() {
      return a;
   }

   public dzo(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true).b(d, efo.a).b(c, efo.a).b(e, efo.a).b(f, efo.a).b(h, false));
      this.i = this.a(16.0F, 14.0F);
      this.D = this.a(24.0F, 24.0F);
   }

   private Function<eeb, fjm> a(float $$0, float $$1) {
      fjm $$2 = dpz.b(8.0, 0.0, $$0);
      int $$3 = 6;
      Map<jh, fjm> $$4 = fjj.c(dpz.a(6.0, 0.0, $$1, 0.0, 11.0));
      Map<jh, fjm> $$5 = fjj.c(dpz.a(6.0, 0.0, $$0, 0.0, 11.0));
      return this.a($$3x -> {
         fjm $$4x = $$3x.c(b) ? $$2 : fjj.a();

         for (Entry<jh, eez<efo>> $$5x : g.entrySet()) {
            $$4x = fjj.a($$4x, switch ((efo)$$3x.c($$5x.getValue())) {
               case a -> fjj.a();
               case b -> (fjm)$$4.get($$5x.getKey());
               case c -> (fjm)$$5.get($$5x.getKey());
            });
         }

         return $$4x;
      }, new efe[]{h});
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.i.apply($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.D.apply($$0);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   private boolean a(eeb $$0, boolean $$1, jh $$2) {
      dpz $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dtb && dtb.a($$0, $$2);
      return $$0.a(azo.H) || !k($$0) && $$1 || $$3 instanceof dug || $$4;
   }

   @Override
   public eeb a(dgo $$0) {
      dmx $$1 = $$0.q();
      jb $$2 = $$0.a();
      fal $$3 = $$0.q().b_($$0.a());
      jb $$4 = $$2.f();
      jb $$5 = $$2.i();
      jb $$6 = $$2.g();
      jb $$7 = $$2.h();
      jb $$8 = $$2.d();
      eeb $$9 = $$1.a_($$4);
      eeb $$10 = $$1.a_($$5);
      eeb $$11 = $$1.a_($$6);
      eeb $$12 = $$1.a_($$7);
      eeb $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jh.d), jh.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jh.e), jh.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jh.c), jh.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jh.f), jh.f);
      eeb $$18 = this.m().b(h, $$3.a() == fam.c);
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      if ($$4 == jh.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jh.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(eeb $$0, efe<efo> $$1) {
      return $$0.c($$1) != efo.a;
   }

   private static boolean a(fjm $$0, fjm $$1) {
      return !fjj.c($$1, $$0, fiw.e);
   }

   private eeb a(dmx $$0, eeb $$1, jb $$2, eeb $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private eeb a(dmx $$0, jb $$1, eeb $$2, jb $$3, eeb $$4, jh $$5) {
      jh $$6 = $$5.g();
      boolean $$7 = $$5 == jh.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jh.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jh.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jh.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jb $$11 = $$1.d();
      eeb $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private eeb a(dmx $$0, eeb $$1, jb $$2, eeb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fjm $$8 = $$3.g($$0, $$2).a(jh.a);
      eeb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, this.a($$9, $$3, $$8));
   }

   private boolean a(eeb $$0, eeb $$1, fjm $$2) {
      boolean $$3 = $$1.b() instanceof dzo && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         efo $$4 = $$0.c(d);
         efo $$5 = $$0.c(e);
         efo $$6 = $$0.c(c);
         efo $$7 = $$0.c(f);
         boolean $$8 = $$5 == efo.a;
         boolean $$9 = $$7 == efo.a;
         boolean $$10 = $$6 == efo.a;
         boolean $$11 = $$4 == efo.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == efo.c && $$5 == efo.c || $$6 == efo.c && $$7 == efo.c;
            return $$13 ? false : $$1.a(azo.aU) || a($$2, R);
         }
      }
   }

   private eeb a(eeb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fjm $$5) {
      return $$0.b(d, this.a($$1, $$5, S.get(jh.c)))
         .b(c, this.a($$2, $$5, S.get(jh.f)))
         .b(e, this.a($$3, $$5, S.get(jh.d)))
         .b(f, this.a($$4, $$5, S.get(jh.e)));
   }

   private efo a(boolean $$0, fjm $$1, fjm $$2) {
      if ($$0) {
         return a($$1, $$2) ? efo.c : efo.b;
      } else {
         return efo.a;
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(h) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return !$$0.c(h);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, d, c, f, e, h);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(d, $$0.c(e)).b(c, $$0.c(f)).b(e, $$0.c(d)).b(f, $$0.c(c));
         case d:
            return $$0.b(d, $$0.c(c)).b(c, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(d));
         case b:
            return $$0.b(d, $$0.c(f)).b(c, $$0.c(d)).b(e, $$0.c(c)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(d, $$0.c(e)).b(e, $$0.c(d));
         case c:
            return $$0.b(c, $$0.c(f)).b(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
