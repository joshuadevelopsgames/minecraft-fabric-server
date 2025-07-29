import java.util.List;
import javax.annotation.Nullable;

public class chd extends chi {
   private int a;
   private final cau b;
   @Nullable
   private cut c;
   private cgr d;

   public chd(cau $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cxe> $$0 = this.b.ai().a(cxe.class, this.b.cV().g(5.0));
      boolean $$1 = false;

      for (cxe $$2 : $$0) {
         bzm $$3 = $$2.cY();
         if ($$3 instanceof cut $$4 && (bcb.e($$4.bC) > 0.0F || bcb.e($$4.bE) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (bcb.e(this.c.bC) > 0.0F || bcb.e(this.c.bE) > 0.0F) || $$1;
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.cc() && (bcb.e(this.c.bC) > 0.0F || bcb.e(this.c.bE) > 0.0F);
   }

   @Override
   public void d() {
      for (cxe $$1 : this.b.ai().a(cxe.class, this.b.cV().g(5.0))) {
         if ($$1.cY() instanceof cut $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cgr.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = bcb.e(this.c.bC) > 0.0F || bcb.e(this.c.bE) > 0.0F;
      float $$1 = this.d == cgr.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fis(this.b.bC, this.b.bD, this.b.bE));
      this.b.a(caq.a, this.b.dA());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cgr.a) {
            jb $$2 = this.c.dx().a(this.c.cS().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.S().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f((bzm)this.c) < 4.0F) {
               this.a = 0;
               this.d = cgr.b;
            }
         } else if (this.d == cgr.b) {
            jh $$3 = this.c.cT();
            jb $$4 = this.c.dx().a($$3, 10);
            this.b.S().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f((bzm)this.c) > 12.0F) {
               this.a = 0;
               this.d = cgr.a;
            }
         }
      }
   }
}
