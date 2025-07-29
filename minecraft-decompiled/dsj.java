import com.mojang.serialization.MapCodec;

public class dsj extends dsy {
   public static final MapCodec<dsj> a = b(dsj::new);
   private static final fjm b = dpz.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   public dsj(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      this.d($$0, $$1, $$2);
      return bxj.a;
   }

   @Override
   protected void a_(eeb $$0, dmu $$1, jb $$2, cut $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(eeb $$0, dmu $$1, jb $$2) {
      eft $$3 = $$1.F_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         jb $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = bcb.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = bcb.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = bcb.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(me.af, $$11, $$12, $$13, $$8, $$9, $$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }
   }

   @Override
   protected int b() {
      return 5;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   public int b(eeb $$0, dly $$1, jb $$2) {
      return -16777216;
   }
}
