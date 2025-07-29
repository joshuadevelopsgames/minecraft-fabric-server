import com.mojang.serialization.MapCodec;

public class dqt extends drw {
   public static final MapCodec<dqt> a = b(dqt::new);
   private static final fjm[] b = dpz.a(7, $$0 -> dpz.b(16.0, 0.0, 2 + $$0));

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(eea.d $$0) {
      super($$0);
   }

   @Override
   protected dmt d() {
      return dcz.vH;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b[this.h($$0)];
   }
}
