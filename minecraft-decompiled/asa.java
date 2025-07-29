import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record asa(arr i, aro j) implements asc {
   public static final aro a = new aro(new arq(xn.h, 150), Optional.empty());
   public static final MapCodec<asa> h = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(arr.a.forGetter(asa::A_), aro.a.optionalFieldOf("action", a).forGetter(asa::e)).apply($$0, asa::new)
   );

   @Override
   public MapCodec<asa> a() {
      return h;
   }

   @Override
   public Optional<asd> d() {
      return this.j.b();
   }

   @Override
   public List<aro> b() {
      return List.of(this.j);
   }

   @Override
   public arr A_() {
      return this.i;
   }

   public aro e() {
      return this.j;
   }
}
