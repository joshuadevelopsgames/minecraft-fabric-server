import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class euy {
   public static final Codec<euy> a = mm.R.q().dispatch(euy::e, evh::codec);
   public static final Codec<jl<euy>> b = ama.a(mn.bj, a);
   protected final euy.c c;

   public static <S extends euy> RecordCodecBuilder<S, euy.c> a(Instance<S> $$0) {
      return euy.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends euy> MapCodec<S> a(Function<euy.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected euy(euy.c $$0) {
      this.c = $$0;
   }

   public jp<dnx> a() {
      return this.c.b;
   }

   public Map<cap, evf> b() {
      return this.c.c;
   }

   public ejw.a c() {
      return this.c.d;
   }

   public evj d() {
      return this.c.e;
   }

   public euq a(euq $$0) {
      return this.d() != evj.a ? $$0.a(12) : $$0;
   }

   public evg a(jl<euy> $$0, amd<dmu> $$1, jz $$2, efz $$3, dob $$4, eko $$5, ezb $$6, long $$7, dlz $$8, int $$9, dmw $$10, Predicate<jl<dnx>> $$11) {
      bue $$12 = bub.f.a($$8, $$1, $$0);
      euy.a $$13 = new euy.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<euy.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         evq $$15 = $$14.get().a();
         evg $$16 = new evg(this, $$8, $$9, $$15.a());
         if ($$16.b()) {
            if ($$12 != null) {
               $$12.finish(true);
            }

            return $$16;
         }
      }

      if ($$12 != null) {
         $$12.finish(false);
      }

      return evg.b;
   }

   protected static Optional<euy.b> a(euy.a $$0, eka.a $$1, Consumer<evq> $$2) {
      dlz $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new euy.b(new jb($$4, $$6, $$5), $$2));
   }

   private static boolean a(euy.b $$0, euy.a $$1) {
      jb $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jw.a($$2.u()), jw.a($$2.v()), jw.a($$2.w()), $$1.d.b()));
   }

   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, evn $$6) {
   }

   private static int[] c(euy.a $$0, int $$1, int $$2, int $$3, int $$4) {
      efz $$5 = $$0.b();
      dmw $$6 = $$0.i();
      eko $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, eka.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, eka.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, eka.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, eka.a.a, $$6, $$7)
      };
   }

   public static int a(euy.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(euy.a $$0, int $$1, int $$2) {
      dlz $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(euy.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jb a(euy.a $$0, dwu $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dwu.b) {
         $$2 = -5;
      } else if ($$1 == dwu.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dwu.d) {
         $$3 = -5;
      }

      dlz $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jb($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<euy.b> a(euy.a var1);

   public Optional<euy.b> b(euy.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract evh<?> e();

   public record a(jz a, efz b, dob c, eko d, ezb e, ekz f, long g, dlz h, dmw i, Predicate<jl<dnx>> j) {

      public a(jz $$0, efz $$1, dob $$2, eko $$3, ezb $$4, long $$5, dlz $$6, dmw $$7, Predicate<jl<dnx>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ekz a(long $$0, dlz $$1) {
         ekz $$2 = new ekz(new ekb(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public record b(jb a, Either<Consumer<evq>, evq> b) {
      public b(jb $$0, Consumer<evq> $$1) {
         this($$0, Either.left($$1));
      }

      public evq a() {
         return (evq)this.b.map($$0 -> {
            evq $$1 = new evq();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jb b() {
         return this.a;
      }

      public Either<Consumer<evq>, evq> c() {
         return this.b;
      }
   }

   public record c(jp<dnx> b, Map<cap, evf> c, ejw.a d, evj e) {
      static final euy.c f = new euy.c(jp.a(), Map.of(), ejw.a.e, evj.a);
      public static final MapCodec<euy.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ka.a(mn.aK).fieldOf("biomes").forGetter(euy.c::a),
               Codec.simpleMap(cap.i, evf.a, bda.a(cap.values())).fieldOf("spawn_overrides").forGetter(euy.c::b),
               ejw.a.l.fieldOf("step").forGetter(euy.c::c),
               evj.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(euy.c::d)
            )
            .apply($$0, euy.c::new)
      );

      public c(jp<dnx> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public jp<dnx> a() {
         return this.b;
      }

      public Map<cap, evf> b() {
         return this.c;
      }

      public ejw.a c() {
         return this.d;
      }

      public evj d() {
         return this.e;
      }

      public static class a {
         private final jp<dnx> a;
         private Map<cap, evf> b = euy.c.f.c;
         private ejw.a c = euy.c.f.d;
         private evj d = euy.c.f.e;

         public a(jp<dnx> $$0) {
            this.a = $$0;
         }

         public euy.c.a a(Map<cap, evf> $$0) {
            this.b = $$0;
            return this;
         }

         public euy.c.a a(ejw.a $$0) {
            this.c = $$0;
            return this;
         }

         public euy.c.a a(evj $$0) {
            this.d = $$0;
            return this;
         }

         public euy.c a() {
            return new euy.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
