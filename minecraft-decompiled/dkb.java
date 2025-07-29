import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dkb {
   Codec<dkb> b = mm.au.q().dispatch(dkb::a, Function.identity());

   static MapCodec<? extends dkb> a(jy<MapCodec<? extends dkb>> $$0) {
      jy.a($$0, "add", djs.a);
      jy.a($$0, "all_of", djt.c.a);
      jy.a($$0, "multiply", dke.a);
      jy.a($$0, "remove_binomial", dkg.a);
      return jy.a($$0, "set", dkl.a);
   }

   float a(int var1, bck var2, float var3);

   MapCodec<? extends dkb> a();
}
