import org.joml.Vector2i;

public class fwx implements fxd {
   private final fue a;
   private final fun b;

   public fwx(fue $$0) {
      this.a = $$0;
      this.b = new fun();
   }

   @Override
   public boolean a(dak $$0) {
      return $$0.g().a(azx.bV);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, dcv $$3) {
      int $$4 = dbk.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = dbk.h($$3);
            int $$8 = fun.a($$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(dak $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(dak $$0, cyx $$1) {
      if ($$1 == cyx.b || $$1 == cyx.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(dcv $$0, int $$1, int $$2) {
      if (this.a.M() != null && $$2 < dbk.j($$0)) {
         grl $$3 = this.a.M();
         dbk.a($$0, $$2);
         $$3.b(new ajb($$1, $$2));
      }
   }

   public void a(dcv $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
