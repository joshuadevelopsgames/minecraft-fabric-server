import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class cyc {
   private static final Logger a = LogUtils.getLogger();
   private final cye b;
   private final Map<ame, cyb> c;
   private final cyd d;

   cyc(cye $$0, cyd $$1, Map<ame, cyb> $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public boolean a(cyd $$0) {
      return $$0.a(this.d);
   }

   public cyd a() {
      return this.d;
   }

   public cyd a(Iterable<ame> $$0) {
      return this.a($$0, $$0x -> a.warn("Unknown feature flag: {}", $$0x));
   }

   public cyd a(cyb... $$0) {
      return cyd.a(this.b, Arrays.asList($$0));
   }

   public cyd a(Iterable<ame> $$0, Consumer<ame> $$1) {
      Set<cyb> $$2 = Sets.newIdentityHashSet();

      for (ame $$3 : $$0) {
         cyb $$4 = this.c.get($$3);
         if ($$4 == null) {
            $$1.accept($$3);
         } else {
            $$2.add($$4);
         }
      }

      return cyd.a(this.b, $$2);
   }

   public Set<ame> b(cyd $$0) {
      Set<ame> $$1 = new HashSet<>();
      this.c.forEach(($$2, $$3) -> {
         if ($$0.b($$3)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   public Codec<cyd> b() {
      return ame.a.listOf().comapFlatMap($$0 -> {
         Set<ame> $$1 = new HashSet<>();
         cyd $$2 = this.a($$0, $$1::add);
         return !$$1.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + $$1, $$2) : DataResult.success($$2);
      }, $$0 -> List.copyOf(this.b($$0)));
   }

   public static class a {
      private final cye a;
      private int b;
      private final Map<ame, cyb> c = new LinkedHashMap<>();

      public a(String $$0) {
         this.a = new cye($$0);
      }

      public cyb a(String $$0) {
         return this.a(ame.b($$0));
      }

      public cyb a(ame $$0) {
         if (this.b >= 64) {
            throw new IllegalStateException("Too many feature flags");
         } else {
            cyb $$1 = new cyb(this.a, this.b++);
            cyb $$2 = this.c.put($$0, $$1);
            if ($$2 != null) {
               throw new IllegalStateException("Duplicate feature flag " + $$0);
            } else {
               return $$1;
            }
         }
      }

      public cyc a() {
         cyd $$0 = cyd.a(this.a, this.c.values());
         return new cyc(this.a, $$0, Map.copyOf(this.c));
      }
   }
}
