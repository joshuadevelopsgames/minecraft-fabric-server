import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public record hse(ame c, Optional<ame> d) implements hrx {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<hse> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("resource").forGetter(hse::b), ame.a.optionalFieldOf("sprite").forGetter(hse::c)).apply($$0, hse::new)
   );

   public hse(ame $$0) {
      this($$0, Optional.empty());
   }

   @Override
   public void a(axo $$0, hrx.a $$1) {
      ame $$2 = a.a(this.c);
      Optional<axm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.d.orElse(this.c), $$3.get());
      } else {
         e.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hse> a() {
      return b;
   }

   public ame b() {
      return this.c;
   }

   public Optional<ame> c() {
      return this.d;
   }
}
