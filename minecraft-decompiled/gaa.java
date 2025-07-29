import java.util.ArrayList;
import java.util.List;

public class gaa implements gac {
   private static final ame a = ame.b("toast/recipe");
   private static final long e = 5000L;
   private static final xo f = xo.c("recipe.toast.title");
   private static final xo g = xo.c("recipe.toast.description");
   private final List<gaa.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private gac.a k = gac.a.b;
   private int l;

   private gaa() {
   }

   @Override
   public gac.a a() {
      return this.k;
   }

   @Override
   public void a(gad $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = gac.a.b;
      } else {
         this.k = $$1 - this.i >= 5000.0 * $$0.h() ? gac.a.b : gac.a.a;
      }

      this.l = (int)($$1 / Math.max(1.0, 5000.0 * $$0.h() / this.h.size()) % this.h.size());
   }

   @Override
   public void a(fxb $$0, fwz $$1, long $$2) {
      $$0.a(gxx.ar, a, 0, 0, this.e(), this.f());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      gaa.a $$3 = this.h.get(this.l);
      $$0.e().pushMatrix();
      $$0.e().scale(0.6F, 0.6F);
      $$0.b($$3.a(), 3, 3);
      $$0.e().popMatrix();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(dcv $$0, dcv $$1) {
      this.h.add(new gaa.a($$0, $$1));
      this.j = true;
   }

   public static void a(gad $$0, dis $$1) {
      gaa $$2 = $$0.a(gaa.class, b);
      if ($$2 == null) {
         $$2 = new gaa();
         $$0.a($$2);
      }

      bdp $$3 = diz.a($$0.g().s);
      dcv $$4 = $$1.e().b($$3);
      dcv $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   record a(dcv a, dcv b) {
   }
}
