import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record evy(int c, int d) {
   private static final Codec<evy> e = RecordCodecBuilder.create(
      $$0 -> $$0.group(bbi.o.lenientOptionalFieldOf("bottom", 0).forGetter($$0x -> $$0x.c), bbi.o.lenientOptionalFieldOf("top", 0).forGetter($$0x -> $$0x.d))
         .apply($$0, evy::new)
   );
   public static final Codec<evy> a = Codec.either(bbi.o, e)
      .xmap($$0 -> (evy)$$0.map(evy::new, Function.identity()), $$0 -> $$0.a() ? Either.left($$0.c) : Either.right($$0));
   public static final evy b = new evy(0);

   public evy(int $$0) {
      this($$0, $$0);
   }

   public boolean a() {
      return this.d == this.c;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
