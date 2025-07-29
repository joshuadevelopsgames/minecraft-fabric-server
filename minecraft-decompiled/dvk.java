import com.mojang.serialization.MapCodec;

public class dvk extends dyb {
   public static final MapCodec<dvk> a = b(dvk::new);

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   public dvk(eea.d $$0) {
      super($$0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(me.ac, $$2.u() + $$3.j(), $$2.v() + 1.1, $$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
