import javax.annotation.Nullable;

public class cpz extends cpu {
   @Nullable
   private fis b;

   public cpz(cps $$0) {
      super($$0);
   }

   @Override
   public void a(aub $$0) {
      if (this.b == null) {
         this.b = this.a.dv();
      }
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Override
   public float e() {
      return 1.0F;
   }

   @Nullable
   @Override
   public fis f() {
      return this.b;
   }

   @Override
   public cqi<cpz> h() {
      return cqi.k;
   }
}
