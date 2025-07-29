import java.util.function.Predicate;

public class cgs extends cgz {
   private static final int g = 240;
   private final Predicate<bxg> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cgs(cao $$0, Predicate<bxg> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cgs(cao $$0, int $$1, Predicate<bxg> $$2) {
      this($$0, $$2);
      this.c = $$1;
   }

   protected int f() {
      return Math.max(240, this.c);
   }

   @Override
   public boolean b() {
      if (!super.b()) {
         return false;
      } else {
         return !a(this.d).P().c(dmq.d) ? false : this.a(this.d.ai().an()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dv(), 2.0) && this.a(this.d.ai().an());
   }

   @Override
   public void e() {
      super.e();
      this.d.ai().a(this.d.ar(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.ec().a(20) == 0) {
         this.d.ai().c(1019, this.e, 0);
         if (!this.d.be) {
            this.d.a(this.d.fH());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.ai().a(this.d.ar(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.ai().an())) {
         this.d.ai().a(this.e, false);
         this.d.ai().c(1021, this.e, 0);
         this.d.ai().c(2001, this.e, dpz.j(this.d.ai().a_(this.e)));
      }
   }

   private boolean a(bxg $$0) {
      return this.h.test($$0);
   }
}
