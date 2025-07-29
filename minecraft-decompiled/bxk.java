import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bxk(int b, dcv c) {
   public static final Codec<bxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bbi.n.fieldOf("Slot").orElse(0).forGetter(bxk::a), dcv.a.forGetter(bxk::b)).apply($$0, bxk::new)
   );

   public boolean a(int $$0) {
      return this.b >= 0 && this.b < $$0;
   }

   public int a() {
      return this.b;
   }

   public dcv b() {
      return this.c;
   }
}
