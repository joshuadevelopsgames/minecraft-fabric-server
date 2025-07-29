import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface fdr {
   fdr c = ($$0, $$1) -> false;
   fdr d = ($$0, $$1) -> true;

   boolean expand(fdj var1, Consumer<fdy> var2);

   default fdr and(fdr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default fdr or(fdr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
