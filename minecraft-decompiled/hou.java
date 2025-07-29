import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hou(int b) implements hot {
   public static final MapCodec<hou> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.o.optionalFieldOf("index", 0).forGetter(hou::b)).apply($$0, hou::new));

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      dfe $$5 = $$0.a(kq.p);
      return $$5 != null ? $$5.b(this.b) == Boolean.TRUE : false;
   }

   @Override
   public MapCodec<hou> a() {
      return a;
   }
}
