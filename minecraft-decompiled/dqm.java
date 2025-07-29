import com.mojang.serialization.MapCodec;

public class dqm extends dzl {
   public static final MapCodec<dqm> a = b(dqm::new);
   private static final fjm b = dpz.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dqm> a() {
      return a;
   }

   public dqm(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2);
      return $$3.a(dqb.eg) || $$3.a(dqb.cN) || $$3.a($$1, $$2, jh.b, dyl.b);
   }
}
