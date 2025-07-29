import javax.annotation.Nullable;

public class hxx implements hya {
   private static final int a = 600;
   private static final xo b = xo.c("tutorial.open_inventory.title");
   private static final xo c = xo.a("tutorial.open_inventory.description", hxz.a("inventory"));
   private final hxz d;
   @Nullable
   private gae e;
   private int f;

   public hxx(hxz $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hyb.f);
      } else {
         if (this.f >= 600 && this.e == null) {
            fue $$0 = this.d.e();
            this.e = new gae($$0.h, gae.a.d, b, c, false);
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
   public void c() {
      this.d.a(hyb.e);
   }
}
