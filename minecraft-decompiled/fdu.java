import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fdu extends feb {
   public static final MapCodec<fdu> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, fdu::new));

   private fdu(int $$0, int $$1, List<fgs> $$2, List<fex> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public fea a() {
      return fdx.b;
   }

   @Override
   public void a(Consumer<dcv> $$0, fdj $$1) {
   }

   public static feb.a<?> b() {
      return a(fdu::new);
   }
}
