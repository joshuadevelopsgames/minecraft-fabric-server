import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record asf(ash c) implements asd {
   public static final MapCodec<asf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ash.a.fieldOf("template").forGetter(asf::b)).apply($$0, asf::new));

   @Override
   public MapCodec<asf> a() {
      return b;
   }

   @Override
   public Optional<xm> a(Map<String, asd.a> $$0) {
      String $$1 = this.c.a(asd.a.a($$0));
      return Optional.of(new xm.g($$1));
   }

   public ash b() {
      return this.c;
   }
}
