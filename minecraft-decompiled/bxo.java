import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bxo {
   public static final Codec<bxo> a = RecordCodecBuilder.create($$0 -> $$0.group(elb.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bxo::new));
   private final elb b;

   public bxo(elb $$0) {
      this.b = $$0;
   }

   public bxo(long $$0, ame $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bxo(long $$0, Optional<ame> $$1) {
      this(a($$0, $$1));
   }

   private static elb a(long $$0, Optional<ame> $$1) {
      ekp.a $$2 = ekp.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new elb($$2.a());
   }

   public static ekp.a a(ame $$0) {
      return ekp.a($$0.toString());
   }

   public bck a() {
      return this.b;
   }
}
