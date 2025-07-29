import java.lang.reflect.Constructor;
import java.util.Arrays;

public class cqi<T extends cqc> {
   private static cqi<?>[] l = new cqi[0];
   public static final cqi<cpy> a = a(cpy.class, "HoldingPattern");
   public static final cqi<cqg> b = a(cqg.class, "StrafePlayer");
   public static final cqi<cqa> c = a(cqa.class, "LandingApproach");
   public static final cqi<cqb> d = a(cqb.class, "Landing");
   public static final cqi<cqh> e = a(cqh.class, "Takeoff");
   public static final cqi<cqe> f = a(cqe.class, "SittingFlaming");
   public static final cqi<cqf> g = a(cqf.class, "SittingScanning");
   public static final cqi<cqd> h = a(cqd.class, "SittingAttacking");
   public static final cqi<cpw> i = a(cpw.class, "ChargingPlayer");
   public static final cqi<cpx> j = a(cpx.class, "Dying");
   public static final cqi<cpz> k = a(cpz.class, "Hover");
   private final Class<? extends cqc> m;
   private final int n;
   private final String o;

   private cqi(int $$0, Class<? extends cqc> $$1, String $$2) {
      this.n = $$0;
      this.m = $$1;
      this.o = $$2;
   }

   public cqc a(cps $$0) {
      try {
         Constructor<? extends cqc> $$1 = this.a();
         return $$1.newInstance($$0);
      } catch (Exception var3) {
         throw new Error(var3);
      }
   }

   protected Constructor<? extends cqc> a() throws NoSuchMethodException {
      return this.m.getConstructor(cps.class);
   }

   public int b() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.o + " (#" + this.n + ")";
   }

   public static cqi<?> a(int $$0) {
      return $$0 >= 0 && $$0 < l.length ? l[$$0] : a;
   }

   public static int c() {
      return l.length;
   }

   private static <T extends cqc> cqi<T> a(Class<T> $$0, String $$1) {
      cqi<T> $$2 = new cqi<>(l.length, $$0, $$1);
      l = Arrays.copyOf(l, l.length + 1);
      l[$$2.b()] = $$2;
      return $$2;
   }
}
