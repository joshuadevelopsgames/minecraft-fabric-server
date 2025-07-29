import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ji {
   a(jh.c),
   b(jh.c, jh.f),
   c(jh.f),
   d(jh.d, jh.f),
   e(jh.d),
   f(jh.d, jh.e),
   g(jh.e),
   h(jh.c, jh.e);

   private final Set<jh> i;
   private final kg j;

   private ji(final jh... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kg(0, 0, 0);

      for (jh $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jh> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
