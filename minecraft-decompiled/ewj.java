import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ewj(amd<ewi> c, amd<ewi> d) implements ewk {
   static MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.bk).fieldOf("alias").forGetter(ewj::c), amd.a(mn.bk).fieldOf("target").forGetter(ewj::d)).apply($$0, ewj::new)
   );

   @Override
   public void a(bck $$0, BiConsumer<amd<ewi>, amd<ewi>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<amd<ewi>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ewj> b() {
      return a;
   }
}
