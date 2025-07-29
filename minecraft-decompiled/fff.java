import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fff extends few {
   public static final MapCodec<fff> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ko.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fff::new)
   );
   private final ko b;

   private fff(List<fgs> $$0, ko $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<fff> b() {
      return fez.k;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> few.a<?> a(kp<T> $$0, T $$1) {
      return a($$2 -> new fff($$2, ko.a().a($$0, $$1).a()));
   }
}
