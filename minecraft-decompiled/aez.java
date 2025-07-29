import java.util.Set;

public record aez(int b, caz c, Set<cba> d) implements zw<acq> {
   public static final zm<wg, aez> a = zm.a(zk.h, aez::b, caz.a, aez::e, cba.m, aez::f, aez::new);

   public static aez a(int $$0, caz $$1, Set<cba> $$2) {
      return new aez($$0, $$1, $$2);
   }

   @Override
   public zy<aez> a() {
      return ahk.ai;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public caz e() {
      return this.c;
   }

   public Set<cba> f() {
      return this.d;
   }
}
