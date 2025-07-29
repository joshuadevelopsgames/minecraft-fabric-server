import com.mojang.serialization.MapCodec;

public class dyz extends drw {
   public static final MapCodec<dyz> a = b(dyz::new);
   public static final int b = 1;
   public static final efb c = eer.at;
   private static final fjm[] g = dpz.a(1, $$0 -> dpz.b(6.0, 0.0, 6 + $$0 * 4));
   private static final int h = 1;

   @Override
   public MapCodec<dyz> a() {
      return a;
   }

   public dyz(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected efb b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dmt d() {
      return dcz.wL;
   }

   @Override
   public eeb b(int $$0) {
      return $$0 == 2 ? dqb.cc.m() : super.b($$0);
   }

   @Override
   public void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dmu $$0) {
      return 1;
   }
}
