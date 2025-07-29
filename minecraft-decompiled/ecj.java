import com.google.common.annotations.VisibleForTesting;

public class ecj extends eaz implements ejd.b<ecj.a> {
   private final ecj.a a;

   public ecj(jb $$0, eeb $$1) {
      super(ebb.L, $$0, $$1);
      this.a = new ecj.a($$1, new eix($$0));
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecj $$3) {
      $$3.a.d().a($$0, $$1, $$0.H_(), true);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a.b.a($$0);
   }

   @Override
   protected void a(fdc $$0) {
      this.a.b.a($$0);
      super.a($$0);
   }

   public ecj.a a() {
      return this.a;
   }

   public static class a implements ejd {
      public static final int a = 8;
      final dxd b;
      private final eeb c;
      private final ejf d;

      public a(eeb $$0, ejf $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dxd.a();
      }

      @Override
      public ejf a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ejd.a c() {
         return ejd.a.b;
      }

      @Override
      public boolean a(aub $$0, jl<ejb> $$1, ejb.a $$2, fis $$3) {
         if ($$1.a(ejb.p) && $$2.a() instanceof cam $$4) {
            if (!$$4.eQ()) {
               byb $$5 = $$4.eN();
               int $$6 = $$4.a($$0, y.a($$5, byb::d));
               if ($$4.et() && $$6 > 0) {
                  this.b.a(jb.a((jv)$$3.a(jh.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eP();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jb.a((jv)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dxd d() {
         return this.b;
      }

      private void a(aub $$0, jb $$1, eeb $$2, bck $$3) {
         $$0.a($$1, $$2.b(dxa.b, true), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(me.K, $$1.u() + 0.5, $$1.v() + 1.15, $$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, ayz.xo, aza.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dmu $$0, cam $$1) {
         if ($$1.ew() instanceof auc $$3) {
            byb $$4 = $$1.eN() == null ? $$0.al().a((cut)$$3) : $$1.eN();
            aq.aa.a($$3, $$1, $$4);
         }
      }
   }
}
