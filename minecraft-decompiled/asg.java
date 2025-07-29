import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record asg(ame c, Optional<ui> d) implements asd {
   public static final MapCodec<asg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("id").forGetter(asg::b), ui.a.optionalFieldOf("additions").forGetter(asg::c)).apply($$0, asg::new)
   );

   @Override
   public MapCodec<asg> a() {
      return b;
   }

   @Override
   public Optional<xm> a(Map<String, asd.a> $$0) {
      ui $$1 = this.d.<ui>map(ui::l).orElseGet(ui::new);
      $$0.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.b()));
      return Optional.of(new xm.d(this.c, Optional.of($$1)));
   }

   public ame b() {
      return this.c;
   }

   public Optional<ui> c() {
      return this.d;
   }
}
