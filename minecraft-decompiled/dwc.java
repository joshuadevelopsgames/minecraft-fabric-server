import com.mojang.serialization.MapCodec;

public class dwc extends dpz {
   public static final MapCodec<dwc> a = b(dwc::new);

   @Override
   public MapCodec<dwc> a() {
      return a;
   }

   public dwc(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return 15;
   }
}
