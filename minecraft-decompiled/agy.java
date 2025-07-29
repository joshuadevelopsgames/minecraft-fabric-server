import java.util.Set;

public record agy(int b, caz c, Set<cba> d, boolean e) implements zw<acq> {
   public static final zm<wg, agy> a = zm.a(zk.h, agy::b, caz.a, agy::e, cba.m, agy::f, zk.b, agy::g, agy::new);

   public static agy a(int $$0, caz $$1, Set<cba> $$2, boolean $$3) {
      return new agy($$0, $$1, $$2, $$3);
   }

   @Override
   public zy<agy> a() {
      return ahk.bd;
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

   public boolean g() {
      return this.e;
   }
}
