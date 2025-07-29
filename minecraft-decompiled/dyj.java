import com.mojang.serialization.MapCodec;

public class dyj extends dpz {
   public static final MapCodec<dyj> a = b(dyj::new);
   private static final fjm b = dpz.a(6.0);

   @Override
   public MapCodec<dyj> a() {
      return a;
   }

   protected dyj(eea.d $$0) {
      super($$0);
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 1.0F;
   }
}
