import com.mojang.serialization.MapCodec;

public class ead extends dpz {
   public static final MapCodec<ead> a = b(ead::new);

   @Override
   public MapCodec<ead> a() {
      return a;
   }

   public ead(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      fis $$5 = new fis(0.25, 0.05F, 0.25);
      if ($$3 instanceof cam $$6 && $$6.d(bys.K)) {
         $$5 = new fis(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
