import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record htz(Map<htz.d, List<htz.c>> b) {
   private static final Codec<List<htz.c>> c = bbi.b(htz.c.a.listOf());
   public static final Codec<htz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bbi.d(Codec.unboundedMap(htz.d.p, c)).fieldOf("layers").forGetter(htz::b)).apply($$0, htz::new)
   );

   public static htz.a a() {
      return new htz.a();
   }

   public List<htz.c> a(htz.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<htz.d, List<htz.c>> a = new EnumMap<>(htz.d.class);

      a() {
      }

      public htz.a a(ame $$0) {
         return this.a($$0, false);
      }

      public htz.a a(ame $$0, boolean $$1) {
         this.a(htz.d.b, htz.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public htz.a b(ame $$0, boolean $$1) {
         return this.a(htz.d.a, htz.c.a($$0, $$1));
      }

      public htz.a a(htz.d $$0, htz.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public htz a() {
         return new htz(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public record b(Optional<Integer> b) {
      public static final Codec<htz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bbi.l.optionalFieldOf("color_when_undyed").forGetter(htz.b::a)).apply($$0, htz.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public record c(ame b, Optional<htz.b> c, boolean d) {
      public static final Codec<htz.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ame.a.fieldOf("texture").forGetter(htz.c::a),
               htz.b.a.optionalFieldOf("dyeable").forGetter(htz.c::b),
               Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(htz.c::c)
            )
            .apply($$0, htz.c::new)
      );

      public c(ame $$0) {
         this($$0, Optional.empty(), false);
      }

      public static htz.c a(ame $$0, boolean $$1) {
         return new htz.c($$0, $$1 ? Optional.of(new htz.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static htz.c b(ame $$0, boolean $$1) {
         return new htz.c($$0, $$1 ? Optional.of(new htz.b(Optional.empty())) : Optional.empty(), false);
      }

      public ame a(htz.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public ame a() {
         return this.b;
      }

      public Optional<htz.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bda {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body"),
      g("pig_saddle"),
      h("strider_saddle"),
      i("camel_saddle"),
      j("horse_saddle"),
      k("donkey_saddle"),
      l("mule_saddle"),
      m("zombie_horse_saddle"),
      n("skeleton_horse_saddle"),
      o("happy_ghast_body");

      public static final Codec<htz.d> p = bda.a(htz.d::values);
      private final String q;

      private d(final String $$0) {
         this.q = $$0;
      }

      @Override
      public String c() {
         return this.q;
      }

      public String a() {
         return "trims/entity/" + this.q;
      }
   }
}
