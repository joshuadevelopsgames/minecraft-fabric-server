import javax.annotation.Nullable;

public class hxy implements hya {
   private static final int a = 600;
   private static final xo b = xo.c("tutorial.punch_tree.title");
   private static final xo c = xo.a("tutorial.punch_tree.description", hxz.a("attack"));
   private final hxz d;
   @Nullable
   private gae e;
   private int f;
   private int g;

   public hxy(hxz $$0) {
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
               if ($$1.gs().a(azx.D)) {
                  this.d.a(hyb.e);
                  return;
               }

               if (hxv.a($$1)) {
                  this.d.a(hyb.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new gae($$0.h, gae.a.c, b, c, true);
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
   public void a(grk $$0, jb $$1, eeb $$2, float $$3) {
      boolean $$4 = $$2.a(azo.D);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hyb.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(dcv $$0) {
      if ($$0.a(azx.D)) {
         this.d.a(hyb.e);
      }
   }
}
