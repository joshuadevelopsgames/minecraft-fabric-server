import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ars(arr h, aro i, aro j) implements asc {
   public static final MapCodec<ars> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(arr.a.forGetter(ars::A_), aro.a.fieldOf("yes").forGetter(ars::e), aro.a.fieldOf("no").forGetter(ars::f)).apply($$0, ars::new)
   );

   @Override
   public MapCodec<ars> a() {
      return a;
   }

   @Override
   public Optional<asd> d() {
      return this.j.b();
   }

   @Override
   public List<aro> b() {
      return List.of(this.i, this.j);
   }

   @Override
   public arr A_() {
      return this.h;
   }

   public aro e() {
      return this.i;
   }

   public aro f() {
      return this.j;
   }
}
