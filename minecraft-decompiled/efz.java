import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class efz {
   public static final Codec<efz> a = mm.aa.q().dispatchStable(efz::b, Function.identity());
   protected final dob b;
   private final Supplier<List<doh.b>> c;
   private final Function<jl<dnx>, dny> d;

   public efz(dob $$0) {
      this($$0, $$0x -> ((dnx)$$0x.a()).d());
   }

   public efz(dob $$0, Function<jl<dnx>, dny> $$1) {
      this.b = $$0;
      this.d = $$1;
      this.c = Suppliers.memoize(() -> doh.a(List.copyOf($$0.c()), $$1xx -> $$1.apply($$1xx).c(), true));
   }

   public void a() {
      this.c.get();
   }

   protected abstract MapCodec<? extends efz> b();

   public ega a(jn<eve> $$0, eko $$1, long $$2) {
      return ega.a($$1, $$2, this.b, $$0);
   }

   public Optional<amd<MapCodec<? extends efz>>> c() {
      return mm.aa.d(this.b());
   }

   public CompletableFuture<efy> a(eko $$0, elc $$1, dnq $$2, efy $$3) {
      return CompletableFuture.supplyAsync(() -> {
         $$3.a(this.b, $$0.b());
         return $$3;
      }, ag.h().a("init_biomes"));
   }

   public abstract void a(auj var1, long var2, eko var4, dnz var5, dnq var6, efy var7);

   @Nullable
   public Pair<jb, jl<euy>> a(aub $$0, jp<euy> $$1, jb $$2, int $$3, boolean $$4) {
      ega $$5 = $$0.n().h();
      Map<evv, Set<jl<euy>>> $$6 = new Object2ObjectArrayMap();

      for (jl<euy> $$7 : $$1) {
         for (evv $$8 : $$5.a($$7)) {
            $$6.computeIfAbsent($$8, $$0x -> new ObjectArraySet()).add($$7);
         }
      }

      if ($$6.isEmpty()) {
         return null;
      } else {
         Pair<jb, jl<euy>> $$9 = null;
         double $$10 = Double.MAX_VALUE;
         dnq $$11 = $$0.b();
         List<Entry<evv, Set<jl<euy>>>> $$12 = new ArrayList<>($$6.size());

         for (Entry<evv, Set<jl<euy>>> $$13 : $$6.entrySet()) {
            evv $$14 = $$13.getKey();
            if ($$14 instanceof evs $$15) {
               Pair<jb, jl<euy>> $$16 = this.a($$13.getValue(), $$0, $$11, $$2, $$4, $$15);
               if ($$16 != null) {
                  jb $$17 = (jb)$$16.getFirst();
                  double $$18 = $$2.j($$17);
                  if ($$18 < $$10) {
                     $$10 = $$18;
                     $$9 = $$16;
                  }
               }
            } else if ($$14 instanceof evt) {
               $$12.add($$13);
            }
         }

         if (!$$12.isEmpty()) {
            int $$19 = ke.a($$2.u());
            int $$20 = ke.a($$2.w());

            for (int $$21 = 0; $$21 <= $$3; $$21++) {
               boolean $$22 = false;

               for (Entry<evv, Set<jl<euy>>> $$23 : $$12) {
                  evt $$24 = (evt)$$23.getKey();
                  Pair<jb, jl<euy>> $$25 = a($$23.getValue(), $$0, $$11, $$19, $$20, $$21, $$4, $$5.d(), $$24);
                  if ($$25 != null) {
                     $$22 = true;
                     double $$26 = $$2.j((kg)$$25.getFirst());
                     if ($$26 < $$10) {
                        $$10 = $$26;
                        $$9 = $$25;
                     }
                  }
               }

               if ($$22) {
                  return $$9;
               }
            }
         }

         return $$9;
      }
   }

   @Nullable
   private Pair<jb, jl<euy>> a(Set<jl<euy>> $$0, aub $$1, dnq $$2, jb $$3, boolean $$4, evs $$5) {
      List<dlz> $$6 = $$1.n().h().a($$5);
      if ($$6 == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair<jb, jl<euy>> $$7 = null;
         double $$8 = Double.MAX_VALUE;
         jb.a $$9 = new jb.a();

         for (dlz $$10 : $$6) {
            $$9.d(ke.a($$10.h, 8), 32, ke.a($$10.i, 8));
            double $$11 = $$9.j($$3);
            boolean $$12 = $$7 == null || $$11 < $$8;
            if ($$12) {
               Pair<jb, jl<euy>> $$13 = a($$0, $$1, $$2, $$4, $$5, $$10);
               if ($$13 != null) {
                  $$7 = $$13;
                  $$8 = $$11;
               }
            }
         }

         return $$7;
      }
   }

   @Nullable
   private static Pair<jb, jl<euy>> a(Set<jl<euy>> $$0, dmx $$1, dnq $$2, int $$3, int $$4, int $$5, boolean $$6, long $$7, evt $$8) {
      int $$9 = $$8.a();

      for (int $$10 = -$$5; $$10 <= $$5; $$10++) {
         boolean $$11 = $$10 == -$$5 || $$10 == $$5;

         for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
            boolean $$13 = $$12 == -$$5 || $$12 == $$5;
            if ($$11 || $$13) {
               int $$14 = $$3 + $$9 * $$10;
               int $$15 = $$4 + $$9 * $$12;
               dlz $$16 = $$8.a($$7, $$14, $$15);
               Pair<jb, jl<euy>> $$17 = a($$0, $$1, $$2, $$6, $$8, $$16);
               if ($$17 != null) {
                  return $$17;
               }
            }
         }
      }

      return null;
   }

   @Nullable
   private static Pair<jb, jl<euy>> a(Set<jl<euy>> $$0, dmx $$1, dnq $$2, boolean $$3, evv $$4, dlz $$5) {
      for (jl<euy> $$6 : $$0) {
         eva $$7 = $$2.a($$5, $$6.a(), $$4, $$3);
         if ($$7 != eva.b) {
            if (!$$3 && $$7 == eva.a) {
               return Pair.of($$4.a($$5), $$6);
            }

            efy $$8 = $$1.a($$5.h, $$5.i, egz.d);
            evg $$9 = $$2.a(ke.a($$8), $$6.a(), $$8);
            if ($$9 != null && $$9.b() && (!$$3 || a($$2, $$9))) {
               return Pair.of($$4.a($$9.c()), $$6);
            }
         }
      }

      return null;
   }

   private static boolean a(dnq $$0, evg $$1) {
      if ($$1.d()) {
         $$0.a($$1);
         return true;
      } else {
         return false;
      }
   }

   public void a(dnt $$0, efy $$1, dnq $$2) {
      dlz $$3 = $$1.f();
      if (!ac.a($$3)) {
         ke $$4 = ke.a($$3, $$0.aq());
         jb $$5 = $$4.j();
         jy<euy> $$6 = $$0.K_().f(mn.bj);
         Map<Integer, List<euy>> $$7 = $$6.s().collect(Collectors.groupingBy($$0x -> $$0x.c().ordinal()));
         List<doh.b> $$8 = this.c.get();
         ekz $$9 = new ekz(new elb(ekp.a()));
         long $$10 = $$9.a($$0.F(), $$5.u(), $$5.w());
         Set<jl<dnx>> $$11 = new ObjectArraySet();
         dlz.a($$4.r(), 1).forEach($$2x -> {
            efy $$3x = $$0.a($$2x.h, $$2x.i);

            for (egj $$4x : $$3x.d()) {
               $$4x.i().a($$11::add);
            }
         });
         $$11.retainAll(this.b.c());
         int $$12 = $$8.size();

         try {
            jy<euc> $$13 = $$0.K_().f(mn.bg);
            int $$14 = Math.max(ejw.a.values().length, $$12);

            for (int $$15 = 0; $$15 < $$14; $$15++) {
               int $$16 = 0;
               if ($$2.a()) {
                  for (euy $$18 : $$7.getOrDefault($$15, Collections.emptyList())) {
                     $$9.b($$10, $$16, $$15);
                     Supplier<String> $$19 = () -> $$6.d($$18).map(Object::toString).orElseGet($$18::toString);

                     try {
                        $$0.a($$19);
                        $$2.a($$4, $$18).forEach($$5x -> $$5x.a($$0, $$2, this, $$9, a($$1), $$3));
                     } catch (Exception var29) {
                        p $$21 = p.a(var29, "Feature placement");
                        $$21.a("Feature").a("Description", $$19::get);
                        throw new aa($$21);
                     }

                     $$16++;
                  }
               }

               if ($$15 < $$12) {
                  IntSet $$22 = new IntArraySet();

                  for (jl<dnx> $$23 : $$11) {
                     List<jp<euc>> $$24 = this.d.apply($$23).c();
                     if ($$15 < $$24.size()) {
                        jp<euc> $$25 = $$24.get($$15);
                        doh.b $$26 = $$8.get($$15);
                        $$25.a().map(jl::a).forEach($$2x -> $$22.add($$26.b().applyAsInt($$2x)));
                     }
                  }

                  int $$27 = $$22.size();
                  int[] $$28 = $$22.toIntArray();
                  Arrays.sort($$28);
                  doh.b $$29 = $$8.get($$15);

                  for (int $$30 = 0; $$30 < $$27; $$30++) {
                     int $$31 = $$28[$$30];
                     euc $$32 = $$29.a().get($$31);
                     Supplier<String> $$33 = () -> $$13.d($$32).map(Object::toString).orElseGet($$32::toString);
                     $$9.b($$10, $$31, $$15);

                     try {
                        $$0.a($$33);
                        $$32.b($$0, this, $$9, $$5);
                     } catch (Exception var30) {
                        p $$35 = p.a(var30, "Feature placement");
                        $$35.a("Feature").a("Description", $$33::get);
                        throw new aa($$35);
                     }
                  }
               }
            }

            $$0.a(null);
         } catch (Exception var31) {
            p $$37 = p.a(var31, "Biome decoration");
            $$37.a("Generation").a("CenterX", $$3.h).a("CenterZ", $$3.i).a("Decoration Seed", $$10);
            throw new aa($$37);
         }
      }
   }

   private static euq a(efy $$0) {
      dlz $$1 = $$0.f();
      int $$2 = $$1.d();
      int $$3 = $$1.e();
      dmw $$4 = $$0.B();
      int $$5 = $$4.L_() + 1;
      int $$6 = $$4.ao();
      return new euq($$2, $$5, $$3, $$2 + 15, $$6, $$3 + 15);
   }

   public abstract void a(auj var1, dnq var2, eko var3, efy var4);

   public abstract void a(auj var1);

   public int a(dmw $$0) {
      return 64;
   }

   public dob d() {
      return this.b;
   }

   public abstract int e();

   public bvt<doj.c> a(jl<dnx> $$0, dnq $$1, cap $$2, jb $$3) {
      Map<euy, LongSet> $$4 = $$1.b($$3);

      for (Entry<euy, LongSet> $$5 : $$4.entrySet()) {
         euy $$6 = $$5.getKey();
         evf $$7 = $$6.b().get($$2);
         if ($$7 != null) {
            MutableBoolean $$8 = new MutableBoolean(false);
            Predicate<evg> $$9 = $$7.a() == evf.a.a ? $$2x -> $$1.a($$3, $$2x) : $$1x -> $$1x.a().b($$3);
            $$1.a($$6, $$5.getValue(), $$2x -> {
               if ($$8.isFalse() && $$9.test($$2x)) {
                  $$8.setTrue();
               }
            });
            if ($$8.isTrue()) {
               return $$7.b();
            }
         }
      }

      return $$0.a().b().a($$2);
   }

   public void a(jz $$0, ega $$1, dnq $$2, efy $$3, ezb $$4, amd<dmu> $$5) {
      dlz $$6 = $$3.f();
      ke $$7 = ke.a($$3);
      eko $$8 = $$1.c();
      $$1.a().forEach($$9 -> {
         evv $$10 = $$9.a().b();
         List<eve.a> $$11 = $$9.a().a();

         for (eve.a $$12 : $$11) {
            evg $$13 = $$2.a($$7, $$12.a().a(), $$3);
            if ($$13 != null && $$13.b()) {
               return;
            }
         }

         if ($$10.b($$1, $$6.h, $$6.i)) {
            if ($$11.size() == 1) {
               this.a($$11.get(0), $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5);
            } else {
               ArrayList<eve.a> $$14 = new ArrayList<>($$11.size());
               $$14.addAll($$11);
               ekz $$15 = new ekz(new ekb(0L));
               $$15.c($$1.d(), $$6.h, $$6.i);
               int $$16 = 0;

               for (eve.a $$17 : $$14) {
                  $$16 += $$17.b();
               }

               while (!$$14.isEmpty()) {
                  int $$18 = $$15.a($$16);
                  int $$19 = 0;

                  for (eve.a $$20 : $$14) {
                     $$18 -= $$20.b();
                     if ($$18 < 0) {
                        break;
                     }

                     $$19++;
                  }

                  eve.a $$21 = $$14.get($$19);
                  if (this.a($$21, $$2, $$0, $$8, $$4, $$1.d(), $$3, $$6, $$7, $$5)) {
                     return;
                  }

                  $$14.remove($$19);
                  $$16 -= $$21.b();
               }
            }
         }
      });
   }

   private boolean a(eve.a $$0, dnq $$1, jz $$2, eko $$3, ezb $$4, long $$5, efy $$6, dlz $$7, ke $$8, amd<dmu> $$9) {
      euy $$10 = $$0.a().a();
      int $$11 = a($$1, $$6, $$8, $$10);
      jp<dnx> $$12 = $$10.a();
      Predicate<jl<dnx>> $$13 = $$12::a;
      evg $$14 = $$10.a($$0.a(), $$9, $$2, this, this.b, $$3, $$4, $$5, $$7, $$11, $$6, $$13);
      if ($$14.b()) {
         $$1.a($$8, $$10, $$14, $$6);
         return true;
      } else {
         return false;
      }
   }

   private static int a(dnq $$0, efy $$1, ke $$2, euy $$3) {
      evg $$4 = $$0.a($$2, $$3, $$1);
      return $$4 != null ? $$4.f() : 0;
   }

   public void a(dnt $$0, dnq $$1, efy $$2) {
      int $$3 = 8;
      dlz $$4 = $$2.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;
      int $$7 = $$4.d();
      int $$8 = $$4.e();
      ke $$9 = ke.a($$2);

      for (int $$10 = $$5 - 8; $$10 <= $$5 + 8; $$10++) {
         for (int $$11 = $$6 - 8; $$11 <= $$6 + 8; $$11++) {
            long $$12 = dlz.c($$10, $$11);

            for (evg $$13 : $$0.a($$10, $$11).g().values()) {
               try {
                  if ($$13.b() && $$13.a().a($$7, $$8, $$7 + 15, $$8 + 15)) {
                     $$1.a($$9, $$13.h(), $$12, $$2);
                     ahj.a($$0, $$13);
                  }
               } catch (Exception var21) {
                  p $$15 = p.a(var21, "Generating structure reference");
                  q $$16 = $$15.a("Structure");
                  Optional<? extends jy<euy>> $$17 = $$0.K_().a(mn.bj);
                  $$16.a("Id", () -> $$17.<String>map($$1xx -> $$1xx.b($$13.h()).toString()).orElse("UNKNOWN"));
                  $$16.a("Name", () -> mm.R.b($$13.h().e()).toString());
                  $$16.a("Class", () -> $$13.h().getClass().getCanonicalName());
                  throw new aa($$15);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<efy> a(elc var1, eko var2, dnq var3, efy var4);

   public abstract int f();

   public abstract int g();

   public abstract int a(int var1, int var2, eka.a var3, dmw var4, eko var5);

   public abstract dng a(int var1, int var2, dmw var3, eko var4);

   public int b(int $$0, int $$1, eka.a $$2, dmw $$3, eko $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   public int c(int $$0, int $$1, eka.a $$2, dmw $$3, eko $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4) - 1;
   }

   public abstract void a(List<String> var1, eko var2, jb var3);

   @Deprecated
   public dny a(jl<dnx> $$0) {
      return this.d.apply($$0);
   }
}
