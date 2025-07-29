import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hph implements hpq {
   public static final MapCodec<hph> a = hpi.a.xmap(hph::new, $$0 -> $$0.b);
   private final hpi b;

   public hph(boolean $$0, hpi.a $$1) {
      this(new hpi($$0, $$1));
   }

   private hph(hpi $$0) {
      this.b = $$0;
   }

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hph> a() {
      return a;
   }
}
