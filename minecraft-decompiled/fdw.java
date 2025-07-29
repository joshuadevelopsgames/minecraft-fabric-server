import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fdw extends feb {
   public static final MapCodec<fdw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcr.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fdw::new)
   );
   private final jl<dcr> j;

   private fdw(jl<dcr> $$0, int $$1, int $$2, List<fgs> $$3, List<fex> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fea a() {
      return fdx.c;
   }

   @Override
   public void a(Consumer<dcv> $$0, fdj $$1) {
      $$0.accept(new dcv(this.j));
   }

   public static feb.a<?> a(dmt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fdw($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
