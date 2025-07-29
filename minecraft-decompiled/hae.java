import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class hae {
   private static final Map<ebb<?>, had<?>> a = Maps.newHashMap();

   private static <T extends eaz> void a(ebb<? extends T> $$0, had<T> $$1) {
      a.put($$0, $$1);
   }

   public static Map<ebb<?>, hac<?>> a(had.a $$0) {
      Builder<ebb<?>, hac<?>> $$1 = ImmutableMap.builder();
      a.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalStateException("Failed to create model for " + mm.j.b((ebb<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   static {
      a(ebb.h, har::new);
      a(ebb.i, han::new);
      a(ebb.j, hat::new);
      a(ebb.l, hap::new);
      a(ebb.b, haj::new);
      a(ebb.d, haj::new);
      a(ebb.c, haj::new);
      a(ebb.n, ham::new);
      a(ebb.E, hao::new);
      a(ebb.o, haw::new);
      a(ebb.w, hav::new);
      a(ebb.p, gzy::new);
      a(ebb.q, has::new);
      a(ebb.u, gzx::new);
      a(ebb.v, haf::new);
      a(ebb.U, hau::new);
      a(ebb.y, haq::new);
      a(ebb.z, gzz::new);
      a(ebb.A, hak::new);
      a(ebb.F, haa::new);
      a(ebb.H, hai::new);
      a(ebb.O, hah::new);
      a(ebb.P, hal::new);
      a(ebb.R, hax::new);
      a(ebb.S, hay::new);
   }
}
