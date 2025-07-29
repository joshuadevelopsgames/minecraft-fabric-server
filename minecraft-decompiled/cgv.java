import java.util.EnumSet;

public class cgv extends chv {
   private final cmg g;

   public cgv(cmg $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(chi.a.c, chi.a.a));
   }

   @Override
   public boolean b() {
      return this.g.m() && !this.g.gH() && !this.g.gU() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   protected int a(cau $$0) {
      return 40;
   }

   @Override
   public void e() {
      super.e();
      this.g.A(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(false);
      if (!this.m()) {
         this.g.A(false);
      } else if (!this.g.gU()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(dmx $$0, jb $$1) {
      return $$0.w($$1.d()) && $$0.a_($$1).a(azo.Q);
   }
}
