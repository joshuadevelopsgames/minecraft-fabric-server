import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hty extends axs<htz> {
   public static final htz a = new htz(Map.of());
   private static final alx b = alx.a("equipment");
   private Map<amd<dlc>, htz> c = Map.of();

   public hty() {
      super(htz.a, b);
   }

   protected void a(Map<ame, htz> $$0, axo $$1, btt $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> amd.a(dld.a, (ame)$$0x.getKey()), Entry::getValue));
   }

   public htz a(amd<dlc> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}
