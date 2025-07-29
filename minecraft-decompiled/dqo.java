import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends dxb {
   public static final MapCodec<dqo> a = b(dqo::new);
   public static final eez<jh> b = eer.T;

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   public dqo(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, jh.c));
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return !$$0.C ? a($$2, ebb.K, ($$0x, $$1x, $$2x, $$3) -> ejk.c.a($$0x, $$3.gI(), $$3.gJ())) : null;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
