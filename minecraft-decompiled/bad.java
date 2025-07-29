import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record bad(List<bac> b, boolean c) {
   public static final Codec<bad> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bac.a.listOf().fieldOf("values").forGetter(bad::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(bad::b)).apply($$0, bad::new)
   );

   public List<bac> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
