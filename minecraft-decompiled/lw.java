import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lw implements mc {
   private static final Codec<eeb> a = Codec.withAlternative(eeb.a, mm.e.q(), dpz::m);
   private final md<lw> b;
   private final eeb c;

   public static MapCodec<lw> a(md<lw> $$0) {
      return a.xmap($$1 -> new lw($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zm<? super wx, lw> b(md<lw> $$0) {
      return zk.a(dpz.k).a($$1 -> new lw($$0, $$1), $$0x -> $$0x.c);
   }

   public lw(md<lw> $$0, eeb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public md<lw> a() {
      return this.b;
   }

   public eeb b() {
      return this.c;
   }
}
