import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ewd extends ewf {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, ewd::new));

   protected ewd(Either<ame, eza> $$0, jl<eyy> $$1, ewi.a $$2, Optional<eyk> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eyw a(dwu $$0, euq $$1, eyk $$2, boolean $$3) {
      eyw $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eyb.b);
      $$4.a(eyb.d);
      return $$4;
   }

   @Override
   public ewh<?> a() {
      return ewh.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
