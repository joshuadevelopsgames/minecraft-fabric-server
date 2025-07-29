import java.util.EnumSet;

public class cjg extends cji {
   private final cbi a;
   private cam b;
   private int c;

   public cjg(cbi $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(chi.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.m() && !this.a.gH()) {
         cam $$0 = this.a.U_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ez();
            int $$1 = $$0.eA();
            return $$1 != this.c && this.a(this.b, clc.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      cam $$0 = this.a.U_();
      if ($$0 != null) {
         this.c = $$0.eA();
      }

      super.d();
   }
}
