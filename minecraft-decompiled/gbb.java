import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gbb(ame c) implements gaz {
   public static final MapCodec<gbb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ame.a.fieldOf("id").forGetter(gbb::c)).apply($$0, gbb::new));

   @Override
   public gba a() {
      return gba.e;
   }

   @Override
   public Either<gaz.b, gaz.c> b() {
      return Either.right(new gaz.c(this.c));
   }
}
