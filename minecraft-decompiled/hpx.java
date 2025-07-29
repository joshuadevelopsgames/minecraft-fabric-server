import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpx<T>(kp<T> a) implements hqg<T> {
   private static final hqg.a<? extends hpx<?>, ?> b = e();

   private static <T> hqg.a<hpx<T>, T> e() {
      Codec<? extends kp<?>> $$0 = mm.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hol.d<hpx<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hpx)$$0x.a()).a, $$0x -> hqg.a.a($$0x.c()).xmap($$1 -> new hol.d<>(new hpx($$0x), $$1), hol.d::b)
      );
      return new hqg.a<>($$2);
   }

   public static <T> hqg.a<hpx<T>, T> c() {
      return (hqg.a<hpx<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hqg.a<hpx<T>, T> a() {
      return c();
   }

   @Override
   public Codec<T> b() {
      return this.a.c();
   }

   public kp<T> d() {
      return this.a;
   }
}
