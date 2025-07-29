import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;

public interface wj {
   wj a = new wj() {
      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public boolean a(dcv $$0, wi.a $$1) {
         return $$0.f();
      }
   };
   zm<wx, wj> b = zk.a(wj.a.c).a($$0 -> (wj)DataFixUtils.orElse($$0, a), $$0 -> $$0 instanceof wj.a $$1 ? Optional.of($$1) : Optional.empty());

   boolean a(dcv var1, wi.a var2);

   static wj b(dcv $$0, wi.a $$1) {
      return (wj)($$0.f() ? a : new wj.a($$0.i(), $$0.M(), wi.a($$0.d(), $$1)));
   }

   public record a(jl<dcr> d, int e, wi f) implements wj {
      public static final zm<wx, wj.a> c = zm.a(zk.b(mn.N), wj.a::a, zk.h, wj.a::b, wi.a, wj.a::c, wj.a::new);

      @Override
      public boolean a(dcv $$0, wi.a $$1) {
         if (this.e != $$0.M()) {
            return false;
         } else {
            return !this.d.equals($$0.i()) ? false : this.f.b($$0.d(), $$1);
         }
      }

      public jl<dcr> a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public wi c() {
         return this.f;
      }
   }
}
