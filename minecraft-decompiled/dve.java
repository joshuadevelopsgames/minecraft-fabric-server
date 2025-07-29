import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dve extends dpz implements dqc {
   public static final MapCodec<dve> a = b(dve::new);
   public static final ees b = eer.d;
   public static final eez<efo> c = eer.aa;
   public static final eez<efo> d = eer.Z;
   public static final eez<efo> e = eer.ab;
   public static final eez<efo> f = eer.ac;
   public static final Map<jh, eez<efo>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jh.c, c, jh.f, d, jh.d, e, jh.e, f)));
   private final Function<eeb, fjm> h;

   @Override
   public MapCodec<dve> a() {
      return a;
   }

   public dve(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true).b(c, efo.a).b(d, efo.a).b(e, efo.a).b(f, efo.a));
      this.h = this.b();
   }

   @Override
   protected fjm d_(eeb $$0) {
      return fjj.a();
   }

   public Function<eeb, fjm> b() {
      Map<jh, fjm> $$0 = fjj.c(dpz.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jh, fjm> $$1 = fjj.d(dpz.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fjm $$3 = $$2.c(b) ? $$1.get(jh.a) : fjj.a();

         for (Entry<jh, eez<efo>> $$4 : g.entrySet()) {
            switch ((efo)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fjj.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fjj.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fjj.b() : $$3;
      });
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fjj.a();
   }

   @Override
   protected boolean e_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(eeb $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (eez<efo> $$1 : g.values()) {
            if ($$0.c($$1) != efo.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dly $$0, jb $$1, jh $$2) {
      return $$2 == jh.b ? false : dvg.a($$0, $$1, $$2);
   }

   private static eeb a(eeb $$0, dly $$1, jb $$2, boolean $$3) {
      eeb $$4 = null;
      eeb $$5 = null;
      $$3 |= $$0.c(b);

      for (jh $$6 : jh.c.a) {
         eez<efo> $$7 = a($$6);
         efo $$8 = a($$1, $$2, $$6) ? ($$3 ? efo.b : $$0.c($$7)) : efo.a;
         if ($$8 == efo.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dqb.ug) && $$4.c($$7) != efo.a && !$$4.c(b)) {
               $$8 = efo.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dqb.ug) && $$5.c($$7) == efo.a) {
                  $$8 = efo.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dmv $$0, jb $$1, bck $$2, int $$3) {
      eeb $$4 = dqb.ug.m();
      eeb $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      eeb $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         eeb $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      if (!$$0.C) {
         bck $$5 = $$0.H_();
         eeb $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static eeb a(dly $$0, jb $$1, BooleanSupplier $$2) {
      jb $$3 = $$1.d();
      eeb $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dqb.ug);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         eeb $$6 = dqb.ug.m().b(b, false);
         eeb $$7 = a($$6, $$0, $$1.d(), true);

         for (jh $$8 : jh.c.a) {
            eez<efo> $$9 = a($$8);
            if ($$7.c($$9) != efo.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, efo.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dqb.a.m();
      } else {
         return dqb.a.m();
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         eeb $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dqb.a.m() : $$8;
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return switch ($$1) {
         case c -> (eeb)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (eeb)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (eeb)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return switch ($$1) {
         case b -> (eeb)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (eeb)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static eez<efo> a(jh $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      eeb $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
