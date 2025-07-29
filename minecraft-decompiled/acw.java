import java.util.function.BiFunction;

public class acw implements zw<acq> {
   public static final zm<wx, acw> a = zm.a(jb.b, acw::b, zk.a(mn.e), acw::e, zk.t, acw::f, acw::new);
   private final jb b;
   private final ebb<?> c;
   private final ui d;

   public static acw a(eaz $$0, BiFunction<eaz, jz, ui> $$1) {
      jz $$2 = $$0.i().K_();
      return new acw($$0.aA_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static acw a(eaz $$0) {
      return a($$0, eaz::a);
   }

   private acw(jb $$0, ebb<?> $$1, ui $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zy<acw> a() {
      return ahk.h;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public jb b() {
      return this.b;
   }

   public ebb<?> e() {
      return this.c;
   }

   public ui f() {
      return this.d;
   }
}
