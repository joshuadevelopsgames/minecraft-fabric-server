import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class emg<C extends elz> {
   public static final emg<emc> a = a("cave", new emd(emc.a));
   public static final emg<emc> b = a("nether_cave", new emf(emc.a));
   public static final emg<elx> c = a("canyon", new ely(elx.a));
   protected static final eeb d = dqb.a.m();
   protected static final eeb e = dqb.nJ.m();
   protected static final fal f = fam.c.g();
   protected static final fal g = fam.e.g();
   protected Set<fak> h = ImmutableSet.of(fam.c);
   private final MapCodec<eme<C>> i;

   private static <C extends elz, F extends emg<C>> F a(String $$0, F $$1) {
      return jy.a(mm.N, $$0, $$1);
   }

   public emg(Codec<C> $$0) {
      this.i = $$0.fieldOf("config").xmap(this::a, eme::b);
   }

   public eme<C> a(C $$0) {
      return new eme<>(this, $$0);
   }

   public MapCodec<eme<C>> c() {
      return this.i;
   }

   public int d() {
      return 4;
   }

   protected boolean a(
      emb $$0, C $$1, efy $$2, Function<jb, jl<dnx>> $$3, ejm $$4, double $$5, double $$6, double $$7, double $$8, double $$9, efx $$10, emg.a $$11
   ) {
      dlz $$12 = $$2.f();
      double $$13 = $$12.b();
      double $$14 = $$12.c();
      double $$15 = 16.0 + $$8 * 2.0;
      if (!(Math.abs($$5 - $$13) > $$15) && !(Math.abs($$7 - $$14) > $$15)) {
         int $$16 = $$12.d();
         int $$17 = $$12.e();
         int $$18 = Math.max(bcb.a($$5 - $$8) - $$16 - 1, 0);
         int $$19 = Math.min(bcb.a($$5 + $$8) - $$16, 15);
         int $$20 = Math.max(bcb.a($$6 - $$9) - 1, $$0.a() + 1);
         int $$21 = $$2.A() ? 0 : 7;
         int $$22 = Math.min(bcb.a($$6 + $$9) + 1, $$0.a() + $$0.b() - 1 - $$21);
         int $$23 = Math.max(bcb.a($$7 - $$8) - $$17 - 1, 0);
         int $$24 = Math.min(bcb.a($$7 + $$8) - $$17, 15);
         boolean $$25 = false;
         jb.a $$26 = new jb.a();
         jb.a $$27 = new jb.a();

         for (int $$28 = $$18; $$28 <= $$19; $$28++) {
            int $$29 = $$12.a($$28);
            double $$30 = ($$29 + 0.5 - $$5) / $$8;

            for (int $$31 = $$23; $$31 <= $$24; $$31++) {
               int $$32 = $$12.b($$31);
               double $$33 = ($$32 + 0.5 - $$7) / $$8;
               if (!($$30 * $$30 + $$33 * $$33 >= 1.0)) {
                  MutableBoolean $$34 = new MutableBoolean(false);

                  for (int $$35 = $$22; $$35 > $$20; $$35--) {
                     double $$36 = ($$35 - 0.5 - $$6) / $$9;
                     if (!$$11.shouldSkip($$0, $$30, $$36, $$33, $$35) && (!$$10.b($$28, $$35, $$31) || b($$1))) {
                        $$10.a($$28, $$35, $$31);
                        $$26.d($$29, $$35, $$32);
                        $$25 |= this.a($$0, $$1, $$2, $$3, $$10, $$26, $$27, $$4, $$34);
                     }
                  }
               }
            }
         }

         return $$25;
      } else {
         return false;
      }
   }

   protected boolean a(emb $$0, C $$1, efy $$2, Function<jb, jl<dnx>> $$3, efx $$4, jb.a $$5, jb.a $$6, ejm $$7, MutableBoolean $$8) {
      eeb $$9 = $$2.a_($$5);
      if ($$9.a(dqb.i) || $$9.a(dqb.fE)) {
         $$8.setTrue();
      }

      if (!this.a($$1, $$9) && !b($$1)) {
         return false;
      } else {
         eeb $$10 = this.a($$0, $$1, $$5, $$7);
         if ($$10 == null) {
            return false;
         } else {
            $$2.a($$5, $$10);
            if ($$7.a() && !$$10.y().c()) {
               $$2.e($$5);
            }

            if ($$8.isTrue()) {
               $$6.a($$5, jh.a);
               if ($$2.a_($$6).a(dqb.j)) {
                  $$0.a($$3, $$2, $$6, !$$10.y().c()).ifPresent($$2x -> {
                     $$2.a($$6, $$2x);
                     if (!$$2x.y().c()) {
                        $$2.e($$6);
                     }
                  });
               }
            }

            return true;
         }
      }
   }

   @Nullable
   private eeb a(emb $$0, C $$1, jb $$2, ejm $$3) {
      if ($$2.v() <= $$1.g.a($$0)) {
         return g.g();
      } else {
         eeb $$4 = $$3.a(new ejt.e($$2.u(), $$2.v(), $$2.w()), 0.0);
         if ($$4 == null) {
            return b($$1) ? $$1.h.e() : null;
         } else {
            return b($$1) ? b($$1, $$4) : $$4;
         }
      }
   }

   private static eeb b(elz $$0, eeb $$1) {
      if ($$1.a(dqb.a)) {
         return $$0.h.b();
      } else if ($$1.a(dqb.J)) {
         eeb $$2 = $$0.h.c();
         return $$2.b(eer.I) ? $$2.b(eer.I, true) : $$2;
      } else {
         return $$1.a(dqb.K) ? $$0.h.d() : $$1;
      }
   }

   public abstract boolean a(emb var1, C var2, efy var3, Function<jb, jl<dnx>> var4, bck var5, ejm var6, dlz var7, efx var8);

   public abstract boolean a(C var1, bck var2);

   protected boolean a(C $$0, eeb $$1) {
      return $$1.a($$0.i);
   }

   protected static boolean a(dlz $$0, double $$1, double $$2, int $$3, int $$4, float $$5) {
      double $$6 = $$0.b();
      double $$7 = $$0.c();
      double $$8 = $$1 - $$6;
      double $$9 = $$2 - $$7;
      double $$10 = $$4 - $$3;
      double $$11 = $$5 + 2.0F + 16.0F;
      return $$8 * $$8 + $$9 * $$9 - $$10 * $$10 <= $$11 * $$11;
   }

   private static boolean b(elz $$0) {
      return $$0.h.a();
   }

   public interface a {
      boolean shouldSkip(emb var1, double var2, double var4, double var6, int var8);
   }
}
