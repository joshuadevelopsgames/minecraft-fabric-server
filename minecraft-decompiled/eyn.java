import com.mojang.serialization.Codec;

public abstract class eyn {
   public static final Codec<eyn> c = mm.o.q().dispatch("predicate_type", eyn::a, eyo::codec);

   public abstract boolean a(jb var1, jb var2, jb var3, bck var4);

   protected abstract eyo<?> a();
}
