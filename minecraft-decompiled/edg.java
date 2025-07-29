import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class edg {
   private static final String j = "spawn_data";
   private static final String k = "next_mob_spawns_at";
   private static final int l = 20;
   private static final int m = 18000;
   final Set<UUID> a = new HashSet<>();
   final Set<UUID> b = new HashSet<>();
   long c;
   long d;
   int e;
   Optional<dno> f = Optional.empty();
   Optional<amd<fdo>> g = Optional.empty();
   @Nullable
   private bzm n;
   @Nullable
   private bvt<dcv> o;
   double h;
   double i;

   public edg.a a() {
      return new edg.a(Set.copyOf(this.a), Set.copyOf(this.b), this.c, this.d, this.e, this.f, this.g);
   }

   public void a(edg.a $$0) {
      this.a.clear();
      this.a.addAll($$0.b);
      this.b.clear();
      this.b.addAll($$0.c);
      this.c = $$0.d;
      this.d = $$0.e;
      this.e = $$0.f;
      this.f = $$0.g;
      this.g = $$0.h;
   }

   public void b() {
      this.b.clear();
      this.f = Optional.empty();
      this.c();
   }

   public void c() {
      this.a.clear();
      this.e = 0;
      this.d = 0L;
      this.c = 0L;
   }

   public boolean a(edc $$0, bck $$1) {
      boolean $$2 = this.b($$0, $$1).a().i("id").isPresent();
      return $$2 || !$$0.a().i().c();
   }

   public boolean a(edd $$0, int $$1) {
      return this.e >= $$0.a($$1);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public boolean a(aub $$0, edd $$1, int $$2) {
      return $$0.ae() >= this.d && this.b.size() < $$1.b($$2);
   }

   public int a(jb $$0) {
      if (this.a.isEmpty()) {
         ag.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.a.size() - 1);
   }

   public void a(aub $$0, jb $$1, edc $$2) {
      boolean $$3 = ($$1.a() + $$0.ae()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.g().equals(edf.f) || !$$2.d()) {
            List<UUID> $$4 = $$2.j().detect($$0, $$2.k(), $$1, $$2.f(), true);
            boolean $$7;
            if (!$$2.d() && !$$4.isEmpty()) {
               Optional<Pair<cut, jl<byo>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cut $$4x = (cut)$$3x.getFirst();
                  if ($$3x.getSecond() == bys.E) {
                     a($$4x);
                  }

                  $$0.c(3020, jb.a((jv)$$4x.bI()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.g().equals(edf.f) || $$7) {
               boolean $$8 = $$2.h().a.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.j().detect($$0, $$2.k(), $$1, $$2.f(), false);
               if (this.a.addAll($$9)) {
                  this.d = Math.max($$0.ae() + 40L, this.d);
                  if (!$$7) {
                     int $$10 = $$2.d() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.a.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<cut, jl<byo>>> a(aub $$0, List<UUID> $$1) {
      cut $$2 = null;

      for (UUID $$3 : $$1) {
         cut $$4 = $$0.a($$3);
         if ($$4 != null) {
            jl<byo> $$5 = bys.H;
            if ($$4.d($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.d(bys.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bys.E));
   }

   public void a(edc $$0, aub $$1) {
      this.b.stream().map($$1::b).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dx(), edc.a.a.a());
            if ($$1x instanceof cao $$2) {
               $$2.b($$1);
            }

            $$1x.a(bzm.e.b);
         }
      });
      if (!$$0.c().i().c()) {
         this.f = Optional.empty();
      }

      this.e = 0;
      this.b.clear();
      this.d = $$1.ae() + $$0.c().h();
      $$0.i();
      this.c = $$1.ae() + $$0.c().a();
   }

   private static void a(cut $$0) {
      byq $$1 = $$0.e(bys.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.g(bys.E);
         $$0.a(new byq(bys.H, $$3, 0));
      }
   }

   public boolean a(aub $$0, float $$1, int $$2) {
      long $$3 = this.c - $$2;
      return (float)$$0.ae() >= (float)$$3 + $$1;
   }

   public boolean b(aub $$0, float $$1, int $$2) {
      long $$3 = this.c - $$2;
      return (float)($$0.ae() - $$3) % $$1 == 0.0F;
   }

   public boolean a(aub $$0) {
      return $$0.ae() >= this.c;
   }

   protected dno b(edc $$0, bck $$1) {
      if (this.f.isPresent()) {
         return this.f.get();
      } else {
         bvt<dno> $$2 = $$0.a().i();
         Optional<dno> $$3 = $$2.c() ? this.f : $$2.a($$1);
         this.f = Optional.of($$3.orElseGet(dno::new));
         $$0.i();
         return this.f.get();
      }
   }

   @Nullable
   public bzm a(edc $$0, dmu $$1, edf $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.n == null) {
            ui $$3 = this.b($$0, $$1.H_()).a();
            if ($$3.i("id").isPresent()) {
               this.n = bzv.a($$3, $$1, bzu.q, Function.identity());
            }
         }

         return this.n;
      }
   }

   public ui a(edf $$0) {
      ui $$1 = new ui();
      if ($$0 == edf.c) {
         $$1.a("next_mob_spawns_at", this.d);
      }

      this.f.ifPresent($$1x -> $$1.a("spawn_data", dno.b, $$1x));
      return $$1;
   }

   public double e() {
      return this.h;
   }

   public double f() {
      return this.i;
   }

   bvt<dcv> a(aub $$0, edd $$1, jb $$2) {
      if (this.o != null) {
         return this.o;
      } else {
         fdo $$3 = $$0.q().bc().a($$1.k());
         fdm $$4 = new fdm.a($$0).a(fgc.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<dcv> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bvt.a();
         } else {
            bvt.a<dcv> $$7 = bvt.b();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               dcv $$8 = (dcv)var10.next();
               $$7.a($$8.c(1), $$8.M());
            }

            this.o = $$7.a();
            return this.o;
         }
      }
   }

   private static long a(aub $$0, jb $$1) {
      jb $$2 = new jb(bcb.d($$1.u() / 30.0F), bcb.d($$1.v() / 20.0F), bcb.d($$1.w() / 30.0F));
      return $$0.F() + $$2.a();
   }

   public record a(Set<UUID> b, Set<UUID> c, long d, long e, int f, Optional<dno> g, Optional<amd<fdo>> h) {
      public static final MapCodec<edg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               kf.b.lenientOptionalFieldOf("registered_players", Set.of()).forGetter(edg.a::a),
               kf.b.lenientOptionalFieldOf("current_mobs", Set.of()).forGetter(edg.a::b),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter(edg.a::c),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter(edg.a::d),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter(edg.a::e),
               dno.b.lenientOptionalFieldOf("spawn_data").forGetter(edg.a::f),
               fdo.a.lenientOptionalFieldOf("ejecting_loot_table").forGetter(edg.a::g)
            )
            .apply($$0, edg.a::new)
      );

      public Set<UUID> a() {
         return this.b;
      }

      public Set<UUID> b() {
         return this.c;
      }

      public long c() {
         return this.d;
      }

      public long d() {
         return this.e;
      }

      public int e() {
         return this.f;
      }

      public Optional<dno> f() {
         return this.g;
      }

      public Optional<amd<fdo>> g() {
         return this.h;
      }
   }
}
