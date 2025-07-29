import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class egv {
   private static final Logger b = LogUtils.getLogger();
   public static final egv a = new egv(dmk.a);
   private static final String c = "Indices";
   private static final ji[] d = ji.values();
   private static final Codec<List<fkj<dpz>>> e = fkj.a(mm.e.q().orElse(dqb.a)).listOf();
   private static final Codec<List<fkj<fak>>> f = fkj.a(mm.c.q().orElse(fam.a)).listOf();
   private final EnumSet<ji> g = EnumSet.noneOf(ji.class);
   private final List<fkj<dpz>> h = Lists.newArrayList();
   private final List<fkj<fak>> i = Lists.newArrayList();
   private final int[][] j;
   static final Map<dpz, egv.a> k = new IdentityHashMap<>();
   static final Set<egv.a> l = Sets.newHashSet();

   private egv(dmw $$0) {
      this.j = new int[$$0.ap()][];
   }

   public egv(ui $$0, dmw $$1) {
      this($$1);
      $$0.m("Indices").ifPresent($$0x -> {
         for (int $$1x = 0; $$1x < this.j.length; $$1x++) {
            this.j[$$1x] = $$0x.k(String.valueOf($$1x)).orElse(null);
         }
      });
      int $$2 = $$0.b("Sides", 0);

      for (ji $$3 : ji.values()) {
         if (($$2 & 1 << $$3.ordinal()) != 0) {
            this.g.add($$3);
         }
      }

      $$0.<Collection<? extends E>>a("neighbor_block_ticks", e).ifPresent(this.h::addAll);
      $$0.<Collection<? extends E>>a("neighbor_fluid_ticks", f).ifPresent(this.i::addAll);
   }

   private egv(egv $$0) {
      this.g.addAll($$0.g);
      this.h.addAll($$0.h);
      this.i.addAll($$0.i);
      this.j = new int[$$0.j.length][];

      for (int $$1 = 0; $$1 < $$0.j.length; $$1++) {
         int[] $$2 = $$0.j[$$1];
         this.j[$$1] = $$2 != null ? IntArrays.copy($$2) : null;
      }
   }

   public void a(egi $$0) {
      this.b($$0);

      for (ji $$1 : d) {
         a($$0, $$1);
      }

      dmu $$2 = $$0.I();
      this.h.forEach($$1x -> {
         dpz $$2x = $$1x.a() == dqb.a ? $$2.a_($$1x.b()).b() : (dpz)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      this.i.forEach($$1x -> {
         fak $$2x = $$1x.a() == fam.a ? $$2.b_($$1x.b()).a() : (fak)$$1x.a();
         $$2.a($$1x.b(), $$2x, $$1x.c(), $$1x.d());
      });
      l.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(egi $$0, ji $$1) {
      dmu $$2 = $$0.I();
      if ($$0.t().g.remove($$1)) {
         Set<jh> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(jh.f);
         boolean $$7 = $$3.contains(jh.e);
         boolean $$8 = $$3.contains(jh.d);
         boolean $$9 = $$3.contains(jh.c);
         boolean $$10 = $$3.size() == 1;
         dlz $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         jh[] $$16 = jh.values();
         jb.a $$17 = new jb.a();

         for (jb $$18 : jb.b($$12, $$2.L_(), $$14, $$13, $$2.ao(), $$15)) {
            eeb $$19 = $$2.a_($$18);
            eeb $$20 = $$19;

            for (jh $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            dpz.a($$19, $$20, $$2, $$18, 18);
         }
      }
   }

   private static eeb a(eeb $$0, jh $$1, dmv $$2, jb $$3, jb $$4) {
      return k.getOrDefault($$0.b(), egv.b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(egi $$0) {
      jb.a $$1 = new jb.a();
      jb.a $$2 = new jb.a();
      dlz $$3 = $$0.f();
      dmv $$4 = $$0.I();

      for (int $$5 = 0; $$5 < this.j.length; $$5++) {
         egj $$6 = $$0.b($$5);
         int[] $$7 = this.j[$$5];
         this.j[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            jh[] $$8 = jh.values();
            egq<eeb> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = ke.c($$10);

            for (int $$12 : $$7) {
               int $$13 = $$12 & 15;
               int $$14 = $$12 >> 8 & 15;
               int $$15 = $$12 >> 4 & 15;
               $$1.d($$3.d() + $$13, $$11 + $$14, $$3.e() + $$15);
               eeb $$16 = $$9.a($$12);
               eeb $$17 = $$16;

               for (jh $$18 : $$8) {
                  $$2.a($$1, $$18);
                  if (ke.a($$1.u()) == $$3.h && ke.a($$1.w()) == $$3.i) {
                     $$17 = a($$17, $$18, $$4, $$1, $$2);
                  }
               }

               dpz.a($$16, $$17, $$4, $$1, 18);
            }
         }
      }

      for (int $$19 = 0; $$19 < this.j.length; $$19++) {
         if (this.j[$$19] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.h, $$3.i});
         }

         this.j[$$19] = null;
      }
   }

   public boolean a() {
      for (int[] $$0 : this.j) {
         if ($$0 != null) {
            return false;
         }
      }

      return this.g.isEmpty();
   }

   public ui b() {
      ui $$0 = new ui();
      ui $$1 = new ui();

      for (int $$2 = 0; $$2 < this.j.length; $$2++) {
         String $$3 = String.valueOf($$2);
         if (this.j[$$2] != null && this.j[$$2].length != 0) {
            $$1.a($$3, this.j[$$2]);
         }
      }

      if (!$$1.j()) {
         $$0.a("Indices", $$1);
      }

      int $$4 = 0;

      for (ji $$5 : this.g) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.h.isEmpty()) {
         $$0.a("neighbor_block_ticks", e, this.h);
      }

      if (!this.i.isEmpty()) {
         $$0.a("neighbor_fluid_ticks", f, this.i);
      }

      return $$0;
   }

   public egv c() {
      return this == a ? a : new egv(this);
   }

   public interface a {
      eeb a(eeb var1, jh var2, eeb var3, dmv var4, jb var5, jb var6);

      default void a(dmv $$0) {
      }
   }

   static enum b implements egv.a {
      a(
         dqb.lu,
         dqb.eu,
         dqb.ms,
         dqb.mt,
         dqb.mu,
         dqb.mv,
         dqb.mw,
         dqb.mx,
         dqb.my,
         dqb.mz,
         dqb.mA,
         dqb.mB,
         dqb.mC,
         dqb.mD,
         dqb.mE,
         dqb.mF,
         dqb.mG,
         dqb.mH,
         dqb.ht,
         dqb.hu,
         dqb.hv,
         dqb.fZ,
         dqb.O,
         dqb.L,
         dqb.N,
         dqb.cP,
         dqb.cQ,
         dqb.cR,
         dqb.cS,
         dqb.cT,
         dqb.cU,
         dqb.cV,
         dqb.cW,
         dqb.dd,
         dqb.de,
         dqb.df,
         dqb.dg,
         dqb.di,
         dqb.dj,
         dqb.dk,
         dqb.dn,
         dqb.do,
         dqb.dp,
         dqb.dq,
         dqb.ds,
         dqb.dt,
         dqb.du,
         dqb.dz,
         dqb.dA,
         dqb.dB,
         dqb.dC,
         dqb.dE,
         dqb.dF,
         dqb.dG
      ) {
         @Override
         public eeb a(eeb $$0, jh $$1, eeb $$2, dmv $$3, jb $$4, jb $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public eeb a(eeb $$0, jh $$1, eeb $$2, dmv $$3, jb $$4, jb $$5) {
            return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
         }
      },
      c(dqb.cG, dqb.hw) {
         @Override
         public eeb a(eeb $$0, jh $$1, eeb $$2, dmv $$3, jb $$4, jb $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(drd.d) == eet.a && $$2.c(drd.d) == eet.a) {
               jh $$6 = $$0.c(drd.c);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(drd.c)) {
                  eet $$7 = $$1 == $$6.h() ? eet.b : eet.c;
                  $$3.a($$5, $$2.b(drd.d, $$7.a()), 18);
                  if ($$6 == jh.c || $$6 == jh.f) {
                     eaz $$8 = $$3.c_($$4);
                     eaz $$9 = $$3.c_($$5);
                     if ($$8 instanceof ebh && $$9 instanceof ebh) {
                        ebh.a((ebh)$$8, (ebh)$$9);
                     }
                  }

                  return $$0.b(drd.d, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, dqb.aO, dqb.aP, dqb.aM, dqb.aR, dqb.aQ, dqb.aN, dqb.aK, dqb.aL) {
         private final ThreadLocal<List<ObjectSet<jb>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public eeb a(eeb $$0, jh $$1, eeb $$2, dmv $$3, jb $$4, jb $$5) {
            eeb $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.H_());
            if ($$0 != $$6) {
               int $$7 = $$6.c(eer.aF);
               List<ObjectSet<jb>> $$8 = this.g.get();
               if ($$8.isEmpty()) {
                  for (int $$9 = 0; $$9 < 7; $$9++) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               $$8.get($$7).add($$4.j());
            }

            return $$0;
         }

         @Override
         public void a(dmv $$0) {
            jb.a $$1 = new jb.a();
            List<ObjectSet<jb>> $$2 = this.g.get();

            for (int $$3 = 2; $$3 < $$2.size(); $$3++) {
               int $$4 = $$3 - 1;
               ObjectSet<jb> $$5 = $$2.get($$4);
               ObjectSet<jb> $$6 = $$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while (var8.hasNext()) {
                  jb $$7 = (jb)var8.next();
                  eeb $$8 = $$0.a_($$7);
                  if ($$8.c(eer.aF) >= $$4) {
                     $$0.a($$7, $$8.b(eer.aF, $$4), 18);
                     if ($$3 != 7) {
                        for (jh $$9 : f) {
                           $$1.a($$7, $$9);
                           eeb $$10 = $$0.a_($$1);
                           if ($$10.b(eer.aF) && $$8.c(eer.aF) > $$3) {
                              $$6.add($$1.j());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(dqb.fw, dqb.fv) {
         @Override
         public eeb a(eeb $$0, jh $$1, eeb $$2, dmv $$3, jb $$4, jb $$5) {
            if ($$0.c(dyg.c) == 7) {
               dpz $$6 = $$0.a(dqb.fv) ? dqb.fr : dqb.fs;
               if ($$2.a($$6)) {
                  return ($$0.a(dqb.fv) ? dqb.ft : dqb.fu).m().b(dub.f, $$1);
               }
            }

            return $$0;
         }
      };

      public static final jh[] f = jh.values();

      b(final dpz... $$0) {
         this(false, $$0);
      }

      b(final boolean $$0, final dpz... $$1) {
         for (dpz $$2 : $$1) {
            egv.k.put($$2, this);
         }

         if ($$0) {
            egv.l.add(this);
         }
      }
   }
}
