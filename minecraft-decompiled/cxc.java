import java.util.Optional;
import java.util.stream.Stream;

public class cxc {
   public static final String a = "variant";

   public static <T> jl<T> a(jz $$0, amd<T> $$1) {
      jy<T> $$2 = $$0.f($$1.c());
      return $$2.a($$1).or($$2::a).orElseThrow();
   }

   public static <T> jl<T> b(jz $$0, amd<? extends jy<T>> $$1) {
      return $$0.f($$1).a().orElseThrow();
   }

   public static <T> void a(fdc $$0, jl<T> $$1) {
      $$1.e().ifPresent($$1x -> $$0.a("variant", ame.a, $$1x.a()));
   }

   public static <T> Optional<jl<T>> a(fda $$0, amd<? extends jy<T>> $$1) {
      return $$0.<ame>a("variant", ame.a).map($$1x -> amd.a($$1, $$1x)).flatMap($$0.a()::c);
   }

   public static <T extends cww<cwz, ?>> Optional<jl.c<T>> a(cwz $$0, amd<jy<T>> $$1) {
      dnl $$2 = $$0.b();
      Stream<jl.c<T>> $$3 = $$2.K_().f($$1).c();
      return cww.a($$3, jl::a, $$2.H_(), $$0);
   }
}
