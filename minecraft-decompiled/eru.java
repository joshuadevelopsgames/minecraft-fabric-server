import com.mojang.serialization.MapCodec;

public class eru extends ern {
   public static final MapCodec<eru> b = eeb.a.fieldOf("state").xmap(eea.a::b, dpz::m).xmap(eru::new, $$0 -> $$0.c);
   private final dpz c;

   public eru(dpz $$0) {
      this.c = $$0;
   }

   @Override
   protected ero<?> a() {
      return ero.f;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      jh.a $$2 = jh.a.a($$0);
      return this.c.m().c(dwt.d, $$2);
   }
}
