import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eyq extends eyx {
   public final bae<dpz> a;
   public static final MapCodec<eyq> b = bae.b(mn.i).xmap(eyq::new, $$0 -> $$0.a).fieldOf("value");

   public eyq(bae<dpz> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      return enh.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eyz<?> a() {
      return eyz.n;
   }
}
