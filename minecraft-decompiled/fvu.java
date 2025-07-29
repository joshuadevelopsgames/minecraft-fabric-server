import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvu(int b) implements fvq {
   public static final MapCodec<fvu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("default").forGetter(fvu::b)).apply($$0, fvu::new));

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      if ($$2 != null) {
         fjz $$3 = $$2.cu();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return baj.f($$4.f());
            }
         }
      }

      return baj.f(this.b);
   }

   @Override
   public MapCodec<fvu> a() {
      return a;
   }
}
