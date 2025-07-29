import com.mojang.serialization.MapCodec;

public interface eyo<P extends eyn> {
   eyo<eym> a = a("always_true", eym.a);
   eyo<eyj> b = a("linear_pos", eyj.a);
   eyo<exy> c = a("axis_aligned_linear_pos", exy.a);

   MapCodec<P> codec();

   static <P extends eyn> eyo<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.o, $$0, () -> $$1);
   }
}
