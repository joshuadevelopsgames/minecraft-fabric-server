import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dhv {
   public static final amd<? extends jy<dhv>> a = amd.a(ame.b("recipe_property_set"));
   public static final amd<dhv> b = a("smithing_base");
   public static final amd<dhv> c = a("smithing_template");
   public static final amd<dhv> d = a("smithing_addition");
   public static final amd<dhv> e = a("furnace_input");
   public static final amd<dhv> f = a("blast_furnace_input");
   public static final amd<dhv> g = a("smoker_input");
   public static final amd<dhv> h = a("campfire_input");
   public static final zm<wx, dhv> i = dcr.f.a(zk.a()).a($$0 -> new dhv(Set.copyOf($$0)), $$0 -> List.copyOf($$0.k));
   public static final dhv j = new dhv(Set.of());
   private final Set<jl<dcr>> k;

   private dhv(Set<jl<dcr>> $$0) {
      this.k = $$0;
   }

   private static amd<dhv> a(String $$0) {
      return amd.a(a, ame.b($$0));
   }

   public boolean a(dcv $$0) {
      return this.k.contains($$0.i());
   }

   static dhv a(Collection<dhi> $$0) {
      Set<jl<dcr>> $$1 = $$0.stream().flatMap(dhi::a).collect(Collectors.toUnmodifiableSet());
      return new dhv($$1);
   }
}
