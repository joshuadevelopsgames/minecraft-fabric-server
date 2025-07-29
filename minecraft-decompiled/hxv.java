import javax.annotation.Nullable;

public class hxv implements hya {
   private static final int a = 6000;
   private static final xo b = xo.c("tutorial.find_tree.title");
   private static final xo c = xo.c("tutorial.find_tree.description");
   private final hxz d;
   @Nullable
   private gae e;
   private int f;

   public hxv(hxz $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hyb.f);
      } else {
         fue $$0 = this.d.e();
         if (this.f == 1) {
            gwi $$1 = $$0.t;
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hyb.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new gae($$0.h, gae.a.c, b, c, false);
            $$0.aB().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(grk $$0, fiq $$1) {
      if ($$1.d() == fiq.a.b) {
         eeb $$2 = $$0.a_(((fio)$$1).b());
         if ($$2.a(azo.af)) {
            this.d.a(hyb.c);
         }
      }
   }

   @Override
   public void a(dcv $$0) {
      if ($$0.a(azx.af)) {
         this.d.a(hyb.e);
      }
   }

   private static boolean b(gwi $$0) {
      return $$0.gs().a_($$0x -> $$0x.a(azx.af));
   }

   public static boolean a(gwi $$0) {
      for (jl<dpz> $$1 : mm.e.c(azo.af)) {
         dpz $$2 = $$1.a();
         if ($$0.l().a(azj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
