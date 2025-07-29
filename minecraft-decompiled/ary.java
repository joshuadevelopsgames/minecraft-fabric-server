import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ary(String b, asq c) {
   public static final Codec<ary> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ash.b.fieldOf("key").forGetter(ary::a), asq.b.forGetter(ary::b)).apply($$0, ary::new)
   );

   public String a() {
      return this.b;
   }

   public asq b() {
      return this.c;
   }
}
