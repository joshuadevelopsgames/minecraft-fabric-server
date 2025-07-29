import com.mojang.serialization.MapCodec;

public interface bwn<P extends bwm> {
   bwn<bwk> a = a("constant", bwk.b);
   bwn<bwt> b = a("uniform", bwt.a);
   bwn<bwi> c = a("clamped_normal", bwi.a);
   bwn<bws> d = a("trapezoid", bws.a);

   MapCodec<P> codec();

   static <P extends bwm> bwn<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.J, $$0, () -> $$1);
   }
}
