import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fee extends feb {
   public static final MapCodec<fee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bae.a(mn.N).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
         .and(b($$0))
         .apply($$0, fee::new)
   );
   private final bae<dcr> j;
   private final boolean k;

   private fee(bae<dcr> $$0, boolean $$1, int $$2, int $$3, List<fgs> $$4, List<fex> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public fea a() {
      return fdx.f;
   }

   @Override
   public void a(Consumer<dcv> $$0, fdj $$1) {
      mm.g.c(this.j).forEach($$1x -> $$0.accept(new dcv($$1x)));
   }

   private boolean a(fdj $$0, Consumer<fdy> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jl<dcr> $$2 : mm.g.c(this.j)) {
            $$1.accept(new feb.c() {
               @Override
               public void a(Consumer<dcv> $$0, fdj $$1x) {
                  $$0.accept(new dcv($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(fdj $$0, Consumer<fdy> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static feb.a<?> a(bae<dcr> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fee($$0, false, $$1, $$2, $$3, $$4));
   }

   public static feb.a<?> b(bae<dcr> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fee($$0, true, $$1, $$2, $$3, $$4));
   }
}
