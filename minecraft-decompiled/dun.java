import com.mojang.serialization.MapCodec;

public class dun extends dos {
   public static final MapCodec<dun> d = b(dun::new);
   private static final fjm e = dpz.b(12.0, 4.0, 15.0);
   private static final fjm f = fjj.a(dos.b, e);

   @Override
   public MapCodec<dun> a() {
      return d;
   }

   public dun(eea.d $$0) {
      super($$0, ki.e);
   }

   @Override
   protected double b(eeb $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      return f;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      $$4.a(caf.c);
      $$4.b(caf.c, bzm::aF);
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return 3;
   }
}
