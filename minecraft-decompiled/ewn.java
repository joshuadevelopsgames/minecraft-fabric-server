import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ewn(bvt<List<ewk>> c) implements ewk {
   static MapCodec<ewn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bvt.b(Codec.list(ewk.b)).fieldOf("groups").forGetter(ewn::c)).apply($$0, ewn::new));

   @Override
   public void a(bck $$0, BiConsumer<amd<ewi>, amd<ewi>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<amd<ewi>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(ewk::a);
   }

   @Override
   public MapCodec<ewn> b() {
      return a;
   }
}
