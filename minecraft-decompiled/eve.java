import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eve(List<eve.a> c, evv d) {
   public static final Codec<eve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eve.a.a.listOf().fieldOf("structures").forGetter(eve::a), evv.b.fieldOf("placement").forGetter(eve::b)).apply($$0, eve::new)
   );
   public static final Codec<jl<eve>> b = ama.a(mn.bi, a);

   public eve(jl<euy> $$0, evv $$1) {
      this(List.of(new eve.a($$0, 1)), $$1);
   }

   public static eve.a a(jl<euy> $$0, int $$1) {
      return new eve.a($$0, $$1);
   }

   public static eve.a a(jl<euy> $$0) {
      return new eve.a($$0, 1);
   }

   public List<eve.a> a() {
      return this.c;
   }

   public evv b() {
      return this.d;
   }

   public record a(jl<euy> b, int c) {
      public static final Codec<eve.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(euy.b.fieldOf("structure").forGetter(eve.a::a), bbi.p.fieldOf("weight").forGetter(eve.a::b)).apply($$0, eve.a::new)
      );

      public jl<euy> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
