import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cpw extends cpu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private fis d;
   private int e;

   public cpw(cps $$0) {
      super($$0);
   }

   @Override
   public void a(aub $$0) {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.gD().a(cqi.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.gD().a(cqi.a);
      } else {
         double $$1 = this.d.c(this.a.dC(), this.a.dE(), this.a.dI());
         if ($$1 < 100.0 || $$1 > 22500.0 || this.a.ac || this.a.ad) {
            this.e++;
         }
      }
   }

   @Override
   public void c() {
      this.d = null;
      this.e = 0;
   }

   public void a(fis $$0) {
      this.d = $$0;
   }

   @Override
   public float e() {
      return 3.0F;
   }

   @Nullable
   @Override
   public fis f() {
      return this.d;
   }

   @Override
   public cqi<cpw> h() {
      return cqi.i;
   }
}
