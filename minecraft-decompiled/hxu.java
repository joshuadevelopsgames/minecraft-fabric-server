import javax.annotation.Nullable;

public class hxu implements hya {
   private static final int a = 1200;
   private static final xo b = xo.c("tutorial.craft_planks.title");
   private static final xo c = xo.c("tutorial.craft_planks.description");
   private final hxz d;
   @Nullable
   private gae e;
   private int f;

   public hxu(hxz $$0) {
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
            if ($$1 != null) {
               if ($$1.gs().a(azx.b)) {
                  this.d.a(hyb.f);
                  return;
               }

               if (a($$1, azx.b)) {
                  this.d.a(hyb.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new gae($$0.h, gae.a.e, b, c, false);
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
   public void a(dcv $$0) {
      if ($$0.a(azx.b)) {
         this.d.a(hyb.f);
      }
   }

   public static boolean a(gwi $$0, bae<dcr> $$1) {
      for (jl<dcr> $$2 : mm.g.c($$1)) {
         if ($$0.l().a(azj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
