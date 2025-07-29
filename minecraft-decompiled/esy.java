import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class esy {
   public static final Codec<esy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ehy.c).fieldOf("height").forGetter(esy::a), mm.e.q().fieldOf("block").orElse(dqb.a).forGetter($$0x -> $$0x.b().b()))
         .apply($$0, esy::new)
   );
   private final dpz b;
   private final int c;

   public esy(int $$0, dpz $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public eeb b() {
      return this.b.m();
   }

   public esy a(int $$0) {
      return this.c > $$0 ? new esy($$0, this.b) : this;
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mm.e.b(this.b);
   }
}
