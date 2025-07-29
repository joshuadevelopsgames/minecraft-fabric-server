import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hsy extends axs<hsx> {
   private static final alx a = alx.a("waypoint_style");
   private static final hsx b = new hsx(0, 1, List.of(hrh.c()));
   private Map<amd<fkv>, hsx> c = Map.of();

   public hsy() {
      super(hsx.c, a);
   }

   protected void a(Map<ame, hsx> $$0, axo $$1, btt $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> amd.a(fkw.a, (ame)$$0x.getKey()), Entry::getValue));
   }

   public hsx a(amd<fkv> $$0) {
      return this.c.getOrDefault($$0, b);
   }
}
