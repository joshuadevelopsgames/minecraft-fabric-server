import javax.annotation.Nullable;

public class crg extends csg {
   public crg(bzv<? extends crg> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static cbr.a l() {
      return csg.m().a(cbs.t, 12.0);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof cam) {
            int $$2 = 0;
            if (this.ai().an() == bxg.c) {
               $$2 = 7;
            } else if (this.ai().an() == bxg.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((cam)$$1).b(new byq(bys.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      return $$3;
   }

   @Override
   public fis m(bzm $$0) {
      return $$0.ds() <= this.ds() ? new fis(0.0, 0.21875 * this.eq(), 0.0) : super.m($$0);
   }
}
