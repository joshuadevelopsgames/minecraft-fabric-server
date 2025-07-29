import java.util.EnumSet;

public class cid extends chi {
   private final cao a;
   private double b;
   private double c;
   private int d;

   public cid(cao $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      return this.a.ec().i() < 0.02F;
   }

   @Override
   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public void d() {
      double $$0 = (Math.PI * 2) * this.a.ec().j();
      this.b = Math.cos($$0);
      this.c = Math.sin($$0);
      this.d = 20 + this.a.ec().a(20);
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      this.d--;
      this.a.P().a(this.a.dC() + this.b, this.a.dG(), this.a.dI() + this.c);
   }
}
