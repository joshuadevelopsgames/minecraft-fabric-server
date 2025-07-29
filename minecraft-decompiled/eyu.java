import com.mojang.serialization.Codec;

public abstract class eyu {
   public static final Codec<eyu> c = mm.m.q().dispatch("predicate_type", eyu::a, eyv::codec);

   public abstract boolean a(eeb var1, bck var2);

   protected abstract eyv<?> a();
}
