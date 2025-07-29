import java.util.EnumSet;

public class cin extends chi {
   private final cbi a;

   public cin(cbi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.c, chi.a.a));
   }

   @Override
   public boolean c() {
      return this.a.gH();
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.gH();
      if (!$$0 && !this.a.m()) {
         return false;
      } else if (this.a.bm()) {
         return false;
      } else if (!this.a.aK()) {
         return false;
      } else {
         cam $$1 = this.a.U_();
         if ($$1 == null || $$1.ai() != this.a.ai()) {
            return true;
         } else {
            return this.a.g($$1) < 144.0 && $$1.ew() != null ? false : $$0;
         }
      }
   }

   @Override
   public void d() {
      this.a.S().n();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
