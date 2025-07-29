import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dti extends dpz {
   public static final MapCodec<dti> a = b(dti::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final fjm f = dpz.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.H_()));
   }

   private static int a(bck $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return !this.a($$0, $$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dmu)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$3.ap().equals(bzv.Y)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dly $$0, jb $$1) {
      fal $$2 = $$0.b_($$1);
      fal $$3 = $$0.b_($$1.d());
      return $$2.a() == fam.c && $$3.a() == fam.a;
   }

   private void a(aub $$0, jb $$1, bck $$2) {
      this.a((dmu)$$0, $$1);
      $$0.a(null, $$1, ayz.kv, aza.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dmu $$0, jb $$1) {
      $$0.b($$1, false);
   }

   private void b(aub $$0, jb $$1, bck $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         coh $$5 = bzv.bw.a($$0, bzu.e);
         if ($$5 != null) {
            double $$6 = $$1.u() + this.b($$2);
            double $$7 = $$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, $$1.v() - 0.5, $$7, $$8, 0.0F);
            $$5.gp();
            $$0.b($$5);
         }
      }
   }

   private double b(bck $$0) {
      double $$1 = 0.2F;
      return bcb.a($$0.j(), 0.2F, 0.7999999970197678);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      g = $$0;
      h = $$1;
   }

   @VisibleForTesting
   public static void b() {
      g = 3600;
      h = 12000;
   }
}
