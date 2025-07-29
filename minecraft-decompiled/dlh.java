import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dlh(dlh.a o, Map<amd<dlc>, dlh.a> p) {
   public static final String a = "_";
   public static final MapCodec<dlh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            dlh.a.a.fieldOf("asset_name").forGetter(dlh::a),
            Codec.unboundedMap(amd.a(dld.a), dlh.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dlh::b)
         )
         .apply($$0, dlh::new)
   );
   public static final zm<ByteBuf, dlh> c = zm.a(dlh.a.b, dlh::a, zk.a(Object2ObjectOpenHashMap::new, amd.b(dld.a), dlh.a.b), dlh::b, dlh::new);
   public static final dlh d = a("quartz");
   public static final dlh e = a("iron", Map.of(dld.d, "iron_darker"));
   public static final dlh f = a("netherite", Map.of(dld.h, "netherite_darker"));
   public static final dlh g = a("redstone");
   public static final dlh h = a("copper");
   public static final dlh i = a("gold", Map.of(dld.e, "gold_darker"));
   public static final dlh j = a("emerald");
   public static final dlh k = a("diamond", Map.of(dld.f, "diamond_darker"));
   public static final dlh l = a("lapis");
   public static final dlh m = a("amethyst");
   public static final dlh n = a("resin");

   public static dlh a(String $$0) {
      return new dlh(new dlh.a($$0), Map.of());
   }

   public static dlh a(String $$0, Map<amd<dlc>, String> $$1) {
      return new dlh(new dlh.a($$0), Map.copyOf(Maps.transformValues($$1, dlh.a::new)));
   }

   public dlh.a a(amd<dlc> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dlh.a a() {
      return this.o;
   }

   public Map<amd<dlc>, dlh.a> b() {
      return this.p;
   }

   public record a(String c) {
      public static final Codec<dlh.a> a = bbi.F.xmap(dlh.a::new, dlh.a::a);
      public static final zm<ByteBuf, dlh.a> b = zk.p.a(dlh.a::new, dlh.a::a);

      public a(String c) {
         if (!ame.i(c)) {
            throw new IllegalArgumentException("Invalid string to use as a resource path element: " + c);
         } else {
            this.c = c;
         }
      }

      public String a() {
         return this.c;
      }
   }
}
