import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ezi {
   Codec<ezi> c = mm.n.q().dispatch(ezi::a, ezj::codec);

   @Nullable
   ui a(bck var1, @Nullable ui var2);

   ezj<?> a();
}
