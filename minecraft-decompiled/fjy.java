import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fjy extends fbx {
   public static final String a = "scoreboard";
   private final fjx b;

   public fjy(fjx $$0) {
      this.b = $$0;
   }

   public void a(fjy.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         fjp $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fjy.a a() {
      Map<fjo, String> $$0 = new EnumMap<>(fjo.class);

      for (fjo $$1 : fjo.values()) {
         fjp $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fjy.a(this.b.b().stream().map(fjp::a).toList(), this.b.g(), $$0, this.b.f().stream().map(fjs::a).toList());
   }

   public record a(List<fjp.a> b, List<fjx.a> c, Map<fjo, String> d, List<fjs.a> e) {
      public static final Codec<fjy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               fjp.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fjy.a::a),
               fjx.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fjy.a::b),
               Codec.unboundedMap(fjo.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fjy.a::c),
               fjs.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fjy.a::d)
            )
            .apply($$0, fjy.a::new)
      );

      public List<fjp.a> a() {
         return this.b;
      }

      public List<fjx.a> b() {
         return this.c;
      }

      public Map<fjo, String> c() {
         return this.d;
      }

      public List<fjs.a> d() {
         return this.e;
      }
   }
}
