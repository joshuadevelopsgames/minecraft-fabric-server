import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ewo(amd<ewi> c, bvt<amd<ewi>> d) implements ewk {
   static MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.bk).fieldOf("alias").forGetter(ewo::c), bvt.b(amd.a(mn.bk)).fieldOf("targets").forGetter(ewo::d)).apply($$0, ewo::new)
   );

   @Override
   public void a(bck $$0, BiConsumer<amd<ewi>, amd<ewi>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<amd<ewi>> a() {
      return this.d.d().stream().map(bvs::a);
   }

   @Override
   public MapCodec<ewo> b() {
      return a;
   }
}
