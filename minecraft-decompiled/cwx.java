import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface cwx extends cww.b<cwz> {
   Codec<cwx> b = mm.aD.q().dispatch(cwx::a, $$0 -> $$0);

   MapCodec<? extends cwx> a();
}
