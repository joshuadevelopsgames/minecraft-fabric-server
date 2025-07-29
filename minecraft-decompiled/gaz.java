import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface gaz {
   MapCodec<gaz> b = gba.f.dispatchMap(gaz::a, gba::a);

   gba a();

   Either<gaz.b, gaz.c> b();

   public record a(gaz b, gan.a c) {
      public static final Codec<gaz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gaz.b.forGetter(gaz.a::a), gan.a.a.optionalFieldOf("filter", gan.a.b).forGetter(gaz.a::b)).apply($$0, gaz.a::new)
      );

      public gaz a() {
         return this.b;
      }

      public gan.a b() {
         return this.c;
      }
   }

   public interface b {
      flq load(axo var1) throws IOException;
   }

   public record c(ame a) {
   }
}
