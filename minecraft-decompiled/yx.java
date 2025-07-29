import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record yx(hf c, Optional<xo> d) implements xp {
   public static final MapCodec<yx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hf.a.fieldOf("selector").forGetter(yx::b), xq.a.optionalFieldOf("separator").forGetter(yx::c)).apply($$0, yx::new)
   );
   public static final xp.a<yx> b = new xp.a<>(a, "selector");

   @Override
   public xp.a<?> a() {
      return b;
   }

   @Override
   public yc a(@Nullable ek $$0, @Nullable bzm $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xo.i();
      } else {
         Optional<? extends xo> $$3 = xr.a($$0, this.d, $$1, $$2);
         return xr.a(this.c.b().b($$0), $$3, bzm::Q_);
      }
   }

   @Override
   public <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
      return $$0.accept($$1, this.c.a());
   }

   @Override
   public <T> Optional<T> a(xt.a<T> $$0) {
      return $$0.accept(this.c.a());
   }

   @Override
   public String toString() {
      return "pattern{" + this.c + "}";
   }

   public hf b() {
      return this.c;
   }

   public Optional<xo> c() {
      return this.d;
   }
}
