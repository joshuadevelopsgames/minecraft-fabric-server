import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class cnh extends cbi {
   private static final Logger co = LogUtils.getLogger();
   private static final int cp = 100;
   private int cq;

   protected cnh(bzv<? extends cnh> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public boolean b(auc $$0) {
      try (bci.j $$1 = new bci.j(this.ef(), co)) {
         fcz $$2 = fcz.a($$1, this.eb());
         this.d($$2);
         $$2.a("id", this.bN());
         if ($$0.a($$2.b())) {
            this.at();
            return true;
         }
      }

      return false;
   }

   @Override
   public void g() {
      this.cq++;
      super.g();
   }

   public boolean gX() {
      return this.cq > 100;
   }
}
