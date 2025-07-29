import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;

public class eeb extends eea.a {
   public static final Codec<eeb> a = a(mm.e.q(), dpz::m).stable();

   public eeb(dpz $$0, Reference2ObjectArrayMap<efe<?>, Comparable<?>> $$1, MapCodec<eeb> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eeb B() {
      return this;
   }
}
