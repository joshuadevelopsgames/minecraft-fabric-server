import com.mojang.serialization.MapCodec;

public class dxs extends dpz {
   public static final MapCodec<dxs> a = b(dxs::new);
   public static final int b = 2;
   public static final efb c = eer.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fjm g = dpz.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dxs> a() {
      return a;
   }

   public dxs(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g;
   }

   public int o(eeb $$0) {
      return $$0.c(c);
   }

   private boolean q(eeb $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, ayz.Ab, aza.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, this.o($$0) + 1), 2);
      } else {
         $$1.a(null, $$2, ayz.Ac, aza.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cpg $$4 = bzv.bl.a($$1, bzu.e);
         if ($$4 != null) {
            fis $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), bcb.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ejb.i, $$2, ejb.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(eeb $$0, fba $$1) {
      return false;
   }

   public static boolean a(dly $$0, jb $$1) {
      return $$0.a_($$1.e()).a(azo.cA);
   }
}
