import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dym {
   dfx c();

   static List<dym> d() {
      return mm.g.s().map(dym::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dym a(dmt $$0) {
      if ($$0.h() instanceof dbd $$1 && $$1.c() instanceof dym $$2) {
         return $$2;
      } else {
         return $$0.h() instanceof dym $$3 ? $$3 : null;
      }
   }
}
