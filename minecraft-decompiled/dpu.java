import com.mojang.serialization.MapCodec;

public class dpu extends drw {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final int b = 3;
   public static final efb c = eer.av;
   private static final fjm[] g = dpz.a(3, $$0 -> dpz.b(16.0, 0.0, 2 + $$0 * 2));

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(eea.d $$0) {
      super($$0);
   }

   @Override
   protected efb b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dmt d() {
      return dcz.wO;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dmu $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g[this.h($$0)];
   }
}
