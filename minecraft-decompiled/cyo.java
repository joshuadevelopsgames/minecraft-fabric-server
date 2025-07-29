import java.util.List;

public abstract class cyo extends dab {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bxc w;
   private final cyy x;
   protected final dmu r;
   private final dhx<? extends dgs> y;
   private final dhv z;
   private final dac A;

   protected cyo(czv<?> $$0, dhx<? extends dgs> $$1, amd<dhv> $$2, dac $$3, int $$4, cus $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bxr(3), new daj(4));
   }

   protected cyo(czv<?> $$0, dhx<? extends dgs> $$1, amd<dhv> $$2, dac $$3, int $$4, cus $$5, bxc $$6, cyy $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.j.ai();
      this.z = this.r.R().a($$2);
      this.a(new dak($$6, 0, 56, 17));
      this.a(new czj(this, $$6, 1, 56, 53));
      this.a(new czl($$5.j, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cuz $$0) {
      if (this.w instanceof dap) {
         ((dap)this.w).fillStackedContents($$0);
      }
   }

   public dak l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cut $$0) {
      return this.w.a($$0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.b($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return dcv.l;
               }
            } else if (this.c($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean b(dcv $$0) {
      return this.z.a($$0);
   }

   protected boolean c(dcv $$0) {
      return this.r.N().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? bcb.a((float)$$0 / $$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return bcb.a((float)this.x.a(0) / $$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public dac am_() {
      return this.A;
   }

   @Override
   public dab.a a(boolean $$0, boolean $$1, dhr<?> $$2, final aub $$3, cus $$4) {
      final List<dak> $$5 = List.of(this.b(0), this.b(2));
      return alq.a(new alq.a<dgs>() {
         @Override
         public void a(cuz $$0) {
            cyo.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0x -> $$0x.f(dcv.l));
         }

         @Override
         public boolean a(dhr<dgs> $$0) {
            return $$0.b().a(new dif(cyo.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dhr<dgs>)$$2, $$0, $$1);
   }
}
