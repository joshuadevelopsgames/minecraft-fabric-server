import com.mojang.serialization.MapCodec;

public class dws extends dzl {
   public static final MapCodec<dws> a = b(dws::new);
   private static final fjm b = dpz.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dws> a() {
      return a;
   }

   protected dws(eea.d $$0) {
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
