import java.util.List;

public class cwb extends cvd {
   public cwb(bzv<? extends cwb> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cwb(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.aX, $$0, $$1, $$2);
   }

   public cwb(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.aX, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dcr f() {
      return dcz.wR;
   }

   @Override
   public void a(aub $$0, dcv $$1, fiq $$2) {
      der $$3 = $$1.a(kq.R, der.a);
      float $$4 = $$1.a(kq.S, 1.0F);
      Iterable<byq> $$5 = $$3.a();
      fin $$6 = this.cV().c($$2.g().d(this.dv()));
      fin $$7 = $$6.c(4.0, 2.0, 4.0);
      List<cam> $$8 = this.ai().a(cam.class, $$7);
      float $$9 = cvq.a(this);
      if (!$$8.isEmpty()) {
         bzm $$10 = this.y();

         for (cam $$11 : $$8) {
            if ($$11.fS()) {
               double $$12 = $$6.d($$11.cV().g($$9));
               if ($$12 < 16.0) {
                  double $$13 = 1.0 - Math.sqrt($$12) / 4.0;

                  for (byq $$14 : $$5) {
                     jl<byo> $$15 = $$14.c();
                     if ($$15.a().a()) {
                        $$15.a().a($$0, this, this.ah_(), $$11, $$14.e(), $$13);
                     } else {
                        int $$16 = $$14.a($$2x -> (int)($$13 * $$2x * $$4 + 0.5));
                        byq $$17 = new byq($$15, $$16, $$14.e(), $$14.f(), $$14.g());
                        if (!$$17.a(20)) {
                           $$11.b($$17, $$10);
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
