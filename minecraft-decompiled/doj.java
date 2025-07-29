import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doj {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final bvt<doj.c> a = bvt.a();
   public static final doj b = new doj.a().a();
   public static final MapCodec<doj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
            Codec.simpleMap(cap.i, bvt.a(doj.c.a).promotePartial(ag.a("Spawn data: ", d::error)), bda.a(cap.values()))
               .fieldOf("spawners")
               .forGetter($$0x -> $$0x.g),
            Codec.simpleMap(mm.f.q(), doj.b.a, mm.f).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
         )
         .apply($$0, doj::new)
   );
   private final float f;
   private final Map<cap, bvt<doj.c>> g;
   private final Map<bzv<?>, doj.b> h;

   doj(float $$0, Map<cap, bvt<doj.c>> $$1, Map<bzv<?>, doj.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public bvt<doj.c> a(cap $$0) {
      return this.g.getOrDefault($$0, a);
   }

   @Nullable
   public doj.b a(bzv<?> $$0) {
      return this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<cap, bvt.a<doj.c>> a = ag.a(cap.class, $$0 -> bvt.b());
      private final Map<bzv<?>, doj.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public doj.a a(cap $$0, int $$1, doj.c $$2) {
         this.a.get($$0).a($$2, $$1);
         return this;
      }

      public doj.a a(bzv<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new doj.b($$2, $$1));
         return this;
      }

      public doj.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public doj a() {
         return new doj(
            this.c,
            this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((bvt.a)$$0.getValue()).a())),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public record b(double b, double c) {
      public static final Codec<doj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
            .apply($$0, doj.b::new)
      );

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public record c(bzv<?> b, int c, int d) {
      public static final MapCodec<doj.c> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  mm.f.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  bbi.p.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                  bbi.p.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, doj.c::new)
         )
         .validate($$0 -> $$0.c > $$0.d ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success($$0));

      public c(bzv<?> b, int c, int d) {
         b = b.f() == cap.h ? bzv.aS : b;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      @Override
      public String toString() {
         return bzv.a(this.b) + "*(" + this.c + "-" + this.d + ")";
      }

      public bzv<?> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
