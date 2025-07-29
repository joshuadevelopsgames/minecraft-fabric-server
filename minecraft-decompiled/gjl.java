import java.util.List;

public class gjl extends fyw {
   private static final fzd c = new fzd(ame.b("recipe_book/tab"), ame.b("recipe_book/tab_selected"));
   private final gjj.a d;
   private static final float e = 15.0F;
   private float f;

   public gjl(gjj.a $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ftp $$0, boolean $$1) {
      gjn.a $$2 = $$1 ? gjn.a.b : gjn.a.a;

      for (gjn $$4 : $$0.a(this.d.c())) {
         for (dit $$5 : $$4.a($$2)) {
            if ($$0.b($$5.a())) {
               this.f = 15.0F;
               return;
            }
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin(this.f / 15.0F * (float) Math.PI);
            $$0.e().pushMatrix();
            $$0.e().translate(this.E() + 8, this.F() + 12);
            $$0.e().scale(1.0F, $$4);
            $$0.e().translate(-(this.E() + 8), -(this.F() + 12));
         }

         ame $$5 = this.a.a(true, this.b);
         int $$6 = this.E();
         if (this.b) {
            $$6 -= 2;
         }

         $$0.a(gxx.ar, $$5, $$6, this.F(), this.g, this.h);
         this.a($$0);
         if (this.f > 0.0F) {
            $$0.e().popMatrix();
            this.f -= $$3;
         }
      }
   }

   private void a(fxb $$0) {
      int $$1 = this.b ? -2 : 0;
      if (this.d.b().isPresent()) {
         $$0.b(this.d.a(), this.E() + 3 + $$1, this.F() + 5);
         $$0.b(this.d.b().get(), this.E() + 14 + $$1, this.F() + 5);
      } else {
         $$0.b(this.d.a(), this.E() + 9 + $$1, this.F() + 5);
      }
   }

   public dhe c() {
      return this.d.c();
   }

   public boolean a(ftp $$0) {
      List<gjn> $$1 = $$0.a(this.d.c());
      this.k = false;

      for (gjn $$2 : $$1) {
         if ($$2.b()) {
            this.k = true;
            break;
         }
      }

      return this.k;
   }
}
