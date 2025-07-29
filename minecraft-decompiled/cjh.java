import java.util.List;

public class cjh<T extends cao & car> extends chi {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cjh(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return a(this.b).P().c(dmq.Q) && this.h();
   }

   private boolean h() {
      return this.b.ew() != null && this.b.ew().ap() == bzv.bU && this.b.ey() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.ey();
      this.b.ab_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (car)$$0).forEach(car::ab_);
      }

      super.d();
   }

   private List<? extends cao> i() {
      double $$0 = this.b.i(cbs.n);
      fin $$1 = fin.a(this.b.dv()).c($$0, 10.0, $$0);
      return this.b.ai().a((Class<? extends cao>)this.b.getClass(), $$1, bzt.f);
   }
}
