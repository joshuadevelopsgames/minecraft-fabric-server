import java.util.EnumSet;

public class chz extends chi {
   private static final clc b = clc.b().a(6.0);
   public static final int a = 400;
   private final cmv c;
   private cuf d;
   private int e;

   public chz(cmv $$0) {
      this.c = $$0;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      if (!this.c.ai().W()) {
         return false;
      } else if (this.c.ec().a(8000) != 0) {
         return false;
      } else {
         this.d = a(this.c).a(cuf.class, b, this.c, this.c.dC(), this.c.dE(), this.c.dI(), this.c.cV().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   @Override
   public void d() {
      this.e = this.a(400);
      this.c.x(true);
   }

   @Override
   public void e() {
      this.c.x(false);
      this.d = null;
   }

   @Override
   public void a() {
      this.c.P().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
