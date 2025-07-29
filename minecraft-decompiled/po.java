import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class po extends pv<dji> {
   public po(mv $$0, CompletableFuture<jn.a> $$1) {
      super($$0, mn.aW, $$1);
   }

   protected void a(jn.a $$0, amd<dji>... $$1) {
      this.a(azr.a).a($$1);
      Set<amd<dji>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.e(mn.aW).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jl::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
