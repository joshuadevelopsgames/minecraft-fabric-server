import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class fwt {
   public static final fwt.a a = a(fwr::a, fwq.c);
   public static final fwt.a b = a(fwr::a, fwq.d);
   public static final fwt.a c = a(fwr::a, fwq.e);
   public static final fwt.a d = a(fwr::n, fwq.j);
   public static final fwt.a e = a(fwr::n, fwq.k);
   public static final fwt.a f = a(fwr::t, fwq.n);
   public static final fwt.a g = a(fwr::o, fwq.m);
   public static final fwt.a h = a(fwr::E, fwq.p);
   public static final fwt.a i = a(fwr::D, fwq.q);
   public static final fwt.a j = a(fwr::i, fwq.ay);
   public static final fwt.a k = a(fwr::d, fwq.az);
   public static final fwt.a l = a(fwr::j, fwq.aA);
   public static final fwt.a m = a(fwr::j, fwq.aB);
   public static final fwt.a n = a(fwr::j, fwq.aC);
   public static final fwt.a o = a(fwr::j, fwq.aD);
   public static final fwt.a p = a(fwr::b, fwq.aE);
   public static final fwt.a q = a(fwr::b, fwq.aF);
   public static final fwt.a r = a(fwr::b, fwq.aG);
   public static final fwt.a s = a(fwr::b, fwq.aH);
   public static final fwt.a t = a(fwr::l, fwq.aK);
   public static final fwt.a u = a(fwr::m, fwq.aI);
   public static final fwt.a v = a(fwr::G, fwq.aZ);
   public static final fwt.a w = a(fwr::a, fwq.ad);
   public static final fwt.a x = a(fwr::A, fwq.bk);
   public static final fwt.a y = a(fwr::A, fwq.bl);
   public static final fwt.a z = a(fwr::b, fwq.bv);
   public static final fwt.a A = a(fwr::q, fwq.j);
   public static final fwt.a B = a(fwr::q, fwq.k);
   public static final fwt.a C = a(fwr::u, fwq.n);
   public static final fwt.a D = a(fwr::v, fwq.j);
   private final fwr E;
   private final fwp F;

   private fwt(fwr $$0, fwp $$1) {
      this.E = $$0;
      this.F = $$1;
   }

   public fwp a() {
      return this.F;
   }

   public fwr b() {
      return this.E;
   }

   public fwt a(Consumer<fwr> $$0) {
      $$0.accept(this.E);
      return this;
   }

   public ame a(dpz $$0, BiConsumer<ame, fwn> $$1) {
      return this.F.a($$0, this.E, $$1);
   }

   public ame a(dpz $$0, String $$1, BiConsumer<ame, fwn> $$2) {
      return this.F.a($$0, $$1, this.E, $$2);
   }

   private static fwt.a a(Function<dpz, fwr> $$0, fwp $$1) {
      return $$2 -> new fwt($$0.apply($$2), $$1);
   }

   public static fwt a(ame $$0) {
      return new fwt(fwr.b($$0), fwq.c);
   }

   @FunctionalInterface
   public interface a {
      fwt get(dpz var1);

      default ame create(dpz $$0, BiConsumer<ame, fwn> $$1) {
         return this.get($$0).a($$0, $$1);
      }

      default ame createWithSuffix(dpz $$0, String $$1, BiConsumer<ame, fwn> $$2) {
         return this.get($$0).a($$0, $$1, $$2);
      }

      default fwt.a updateTexture(Consumer<fwr> $$0) {
         return $$1 -> this.get($$1).a($$0);
      }
   }
}
