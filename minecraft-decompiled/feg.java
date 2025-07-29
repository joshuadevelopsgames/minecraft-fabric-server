import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class feg extends few {
   private static final Map<ame, feg.c> b = Stream.of(feg.a.a, feg.d.b, feg.e.b).collect(Collectors.toMap(feg.c::a, Function.identity()));
   private static final Codec<feg.c> c = ame.a.comapFlatMap($$0 -> {
      feg.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, feg.c::a);
   private static final MapCodec<feg.b> d = bbi.a("formula", "parameters", c, feg.b::a, feg.c::b);
   public static final MapCodec<feg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dji.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, feg::new)
   );
   private final jl<dji> e;
   private final feg.b f;

   private feg(List<fgs> $$0, jl<dji> $$1, feg.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fey<feg> b() {
      return fez.x;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.i);
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      dcv $$2 = $$1.c(fgd.i);
      if ($$2 != null) {
         int $$3 = djk.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static few.a<?> a(jl<dji> $$0, float $$1, int $$2) {
      return a($$3 -> new feg($$3, $$0, new feg.a($$2, $$1)));
   }

   public static few.a<?> a(jl<dji> $$0) {
      return a($$1 -> new feg($$1, $$0, new feg.d()));
   }

   public static few.a<?> b(jl<dji> $$0) {
      return a($$1 -> new feg($$1, $$0, new feg.e(1)));
   }

   public static few.a<?> a(jl<dji> $$0, int $$1) {
      return a($$2 -> new feg($$2, $$0, new feg.e($$1)));
   }

   record a(int b, float c) implements feg.b {
      private static final Codec<feg.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(feg.a::b), Codec.FLOAT.fieldOf("probability").forGetter(feg.a::c)).apply($$0, feg.a::new)
      );
      public static final feg.c a = new feg.c(ame.b("binomial_with_bonus_count"), d);

      @Override
      public int a(bck $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public feg.c a() {
         return a;
      }
   }

   interface b {
      int a(bck var1, int var2, int var3);

      feg.c a();
   }

   record c(ame a, Codec<? extends feg.b> b) {
   }

   record d() implements feg.b {
      public static final Codec<feg.d> a = Codec.unit(feg.d::new);
      public static final feg.c b = new feg.c(ame.b("ore_drops"), a);

      @Override
      public int a(bck $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public feg.c a() {
         return b;
      }
   }

   record e(int c) implements feg.b {
      public static final Codec<feg.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(feg.e::b)).apply($$0, feg.e::new)
      );
      public static final feg.c b = new feg.c(ame.b("uniform_bonus_count"), a);

      @Override
      public int a(bck $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public feg.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
