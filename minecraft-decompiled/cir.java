import java.util.EnumSet;

public class cir extends chi {
   private final cua a;

   public cir(cua $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.c, chi.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bO()) {
         return false;
      } else if (this.a.bm()) {
         return false;
      } else if (!this.a.aK()) {
         return false;
      } else if (this.a.ag) {
         return false;
      } else {
         cut $$0 = this.a.gH();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cn != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.S().n();
   }

   @Override
   public void e() {
      this.a.g(null);
   }
}
