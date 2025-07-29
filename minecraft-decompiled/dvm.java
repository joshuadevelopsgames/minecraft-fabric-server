import com.mojang.serialization.MapCodec;

public class dvm extends dzl {
   public static final MapCodec<dvm> a = b(dvm::new);
   private static final fjm b = dpz.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   public dvm(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(azo.aR) || $$0.a(dqb.eo) || super.b($$0, $$1, $$2);
   }
}
