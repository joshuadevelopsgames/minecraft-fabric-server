import com.mojang.serialization.MapCodec;

public class erw extends ern {
   public static final MapCodec<erw> b = eeb.a.fieldOf("state").xmap(erw::new, $$0 -> $$0.c);
   private final eeb c;

   protected erw(eeb $$0) {
      this.c = $$0;
   }

   @Override
   protected ero<?> a() {
      return ero.a;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      return this.c;
   }
}
