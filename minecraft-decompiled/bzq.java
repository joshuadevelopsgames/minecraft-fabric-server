import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class bzq {
   public static final Codec<bzq> a = Codec.unboundedMap(bzw.l, dcv.b).xmap($$0 -> {
      EnumMap<bzw, dcv> $$1 = new EnumMap<>(bzw.class);
      $$1.putAll($$0);
      return new bzq($$1);
   }, $$0 -> {
      Map<bzw, dcv> $$1 = new EnumMap<>($$0.b);
      $$1.values().removeIf(dcv::f);
      return $$1;
   });
   private final EnumMap<bzw, dcv> b;

   private bzq(EnumMap<bzw, dcv> $$0) {
      this.b = $$0;
   }

   public bzq() {
      this(new EnumMap<>(bzw.class));
   }

   public dcv a(bzw $$0, dcv $$1) {
      $$1.h().l($$1);
      return Objects.requireNonNullElse(this.b.put($$0, $$1), dcv.l);
   }

   public dcv a(bzw $$0) {
      return this.b.getOrDefault($$0, dcv.l);
   }

   public boolean a() {
      for (dcv $$0 : this.b.values()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   public void a(bzm $$0) {
      for (Entry<bzw, dcv> $$1 : this.b.entrySet()) {
         dcv $$2 = $$1.getValue();
         if (!$$2.f()) {
            $$2.a($$0.ai(), $$0, $$1.getKey());
         }
      }
   }

   public void a(bzq $$0) {
      this.b.clear();
      this.b.putAll($$0.b);
   }

   public void a(cam $$0) {
      for (dcv $$1 : this.b.values()) {
         $$0.a($$1, true, false);
      }

      this.b();
   }

   public void b() {
      this.b.replaceAll(($$0, $$1) -> dcv.l);
   }
}
