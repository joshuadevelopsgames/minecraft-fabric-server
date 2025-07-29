import com.mojang.serialization.Codec;

public abstract class ern {
   public static final Codec<ern> a = mm.T.q().dispatch(ern::a, ero::a);

   public static erw a(eeb $$0) {
      return new erw($$0);
   }

   public static erw a(dpz $$0) {
      return new erw($$0.m());
   }

   protected abstract ero<?> a();

   public abstract eeb a(bck var1, jb var2);
}
