import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cqp extends bzm {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected jb a;

   protected cqp(bzv<? extends cqp> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected cqp(bzv<? extends cqp> $$0, dmu $$1, jb $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void e();

   @Override
   public void g() {
      if (this.ai() instanceof aub $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dU() && !this.f()) {
               this.at();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean f();

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public boolean w(bzm $$0) {
      if ($$0 instanceof cut $$1) {
         return !this.ai().a($$1, this.a) ? true : this.b(this.ea().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(byb $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.P().c(dmq.d) && $$1.d() instanceof cao) {
         return false;
      } else {
         if (!this.dU()) {
            this.c($$0);
            this.bG();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dmn $$0) {
      bzm $$1 = $$0.d();
      if ($$1 != null && $$1.bm()) {
         return true;
      } else {
         return $$0.h() ? super.a($$0) : true;
      }
   }

   @Override
   public void a(caq $$0, fis $$1) {
      if (this.ai() instanceof aub $$2 && !this.dU() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.ai() instanceof aub $$3 && !this.dU() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("block_pos", jb.a, this.i());
   }

   @Override
   protected void a(fda $$0) {
      jb $$1 = $$0.<jb>a("block_pos", jb.a).orElse(null);
      if ($$1 != null && $$1.a(this.dx(), 16.0)) {
         this.a = $$1;
      } else {
         b.error("Block-attached entity at invalid position: {}", $$1);
      }
   }

   public abstract void a(aub var1, @Nullable bzm var2);

   @Override
   protected boolean bM() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = jb.a($$0, $$1, $$2);
      this.e();
      this.aE = true;
   }

   public jb i() {
      return this.a;
   }

   @Override
   public void a(aub $$0, cal $$1) {
   }

   @Override
   public void j_() {
   }
}
