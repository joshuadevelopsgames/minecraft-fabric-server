import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ma implements mc {
   private static final Codec<dcv> a = Codec.withAlternative(dcv.c, dcr.e, dcv::new);
   private final md<ma> b;
   private final dcv c;

   public static MapCodec<ma> a(md<ma> $$0) {
      return a.xmap($$1 -> new ma($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zm<? super wx, ma> b(md<ma> $$0) {
      return dcv.j.a($$1 -> new ma($$0, $$1), $$0x -> $$0x.c);
   }

   public ma(md<ma> $$0, dcv $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public md<ma> a() {
      return this.b;
   }

   public dcv b() {
      return this.c;
   }
}
