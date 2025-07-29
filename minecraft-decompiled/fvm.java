import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvm(int b, int c) implements fvq {
   public static final MapCodec<fvm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.o.optionalFieldOf("index", 0).forGetter(fvm::b), bbi.l.fieldOf("default").forGetter(fvm::c)).apply($$0, fvm::new)
   );

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      dfe $$3 = $$0.a(kq.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return baj.f($$4);
         }
      }

      return baj.f(this.c);
   }

   @Override
   public MapCodec<fvm> a() {
      return a;
   }
}
