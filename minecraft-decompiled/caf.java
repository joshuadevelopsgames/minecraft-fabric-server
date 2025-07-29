import java.util.function.Consumer;

public enum caf {
   a($$0 -> {
      $$0.q(true);
      if ($$0.dN()) {
         $$0.k(Math.min($$0.cB(), $$0.cy() + 1));
      }
   }),
   b(dpm::a),
   c(bzm::aE),
   d(bzm::aI);

   private final Consumer<bzm> e;

   private caf(final Consumer<bzm> $$0) {
      this.e = $$0;
   }

   public Consumer<bzm> a() {
      return this.e;
   }
}
