import com.mojang.serialization.MapCodec;

public class dvf extends dpz {
   public static final MapCodec<dvf> a = b(dvf::new);
   private static final fjm b = dpz.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dvf> a() {
      return a;
   }

   public dvf(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return fjj.b();
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.b();
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 0.2F;
   }
}
