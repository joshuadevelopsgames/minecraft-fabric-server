import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public record bzk(Map<bzw, Float> f) {
   public static final float a = 0.085F;
   public static final float b = 1.0F;
   public static final int c = 2;
   public static final bzk d = new bzk(ag.a(bzw.class, $$0 -> 0.085F));
   public static final Codec<bzk> e = Codec.unboundedMap(bzw.l, bbi.q).xmap(bzk::b, bzk::a).xmap(bzk::new, bzk::a);

   private static Map<bzw, Float> a(Map<bzw, Float> $$0) {
      Map<bzw, Float> $$1 = new HashMap<>($$0);
      $$1.values().removeIf($$0x -> $$0x == 0.085F);
      return $$1;
   }

   private static Map<bzw, Float> b(Map<bzw, Float> $$0) {
      return ag.a(bzw.class, $$1 -> $$0.getOrDefault($$1, 0.085F));
   }

   public bzk a(bzw $$0) {
      return this.a($$0, 2.0F);
   }

   public bzk a(bzw $$0, float $$1) {
      if ($$1 < 0.0F) {
         throw new IllegalArgumentException("Tried to set invalid equipment chance " + $$1 + " for " + $$0);
      } else {
         return this.b($$0) == $$1 ? this : new bzk(ag.a(bzw.class, $$2 -> $$2 == $$0 ? $$1 : this.b($$2)));
      }
   }

   public float b(bzw $$0) {
      return this.f.getOrDefault($$0, 0.085F);
   }

   public boolean c(bzw $$0) {
      return this.b($$0) > 1.0F;
   }

   public Map<bzw, Float> a() {
      return this.f;
   }
}
