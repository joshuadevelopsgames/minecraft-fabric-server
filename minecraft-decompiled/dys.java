import com.mojang.serialization.MapCodec;

public class dys extends dpz {
   public static final MapCodec<dys> a = b(dys::new);
   private static final efb b = eer.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dys> a() {
      return a;
   }

   public dys(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0));
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      int $$4 = a((dmv)$$0, $$1, $$2, (bzm)$$3);
      if ($$3.ah_() instanceof auc $$6) {
         $$6.a(azj.aF);
         aq.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dmv $$0, eeb $$1, fio $$2, bzm $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cvb ? 20 : 8;
      if (!$$0.V().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fio $$0, fis $$1) {
      jh $$2 = $$0.c();
      double $$3 = Math.abs(bcb.e($$1.d) - 0.5);
      double $$4 = Math.abs(bcb.e($$1.e) - 0.5);
      double $$5 = Math.abs(bcb.e($$1.f) - 0.5);
      jh.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jh.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jh.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, bcb.c(15.0 * bcb.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dmv $$0, eeb $$1, int $$2, jb $$3, int $$4) {
      $$0.a($$3, $$1.b(b, $$2), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, 0), 3);
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.V().a($$2, this)) {
            $$1.a($$2, $$0.b(b, 0), 18);
         }
      }
   }
}
