import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fdt extends feb {
   public static final MapCodec<fdt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fdt::new)
   );
   private final ame j;

   private fdt(ame $$0, int $$1, int $$2, List<fgs> $$3, List<fex> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fea a() {
      return fdx.e;
   }

   @Override
   public void a(Consumer<dcv> $$0, fdj $$1) {
      $$1.a(this.j, $$0);
   }

   public static feb.a<?> a(ame $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fdt($$0, $$1, $$2, $$3, $$4));
   }
}
