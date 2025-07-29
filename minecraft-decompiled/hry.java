import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class hry {
   private static final Logger a = LogUtils.getLogger();
   private static final alx b = new alx("atlases", ".json");
   private final List<hrx> c;

   private hry(List<hrx> $$0) {
      this.c = $$0;
   }

   public List<Function<hrw, hrm>> a(axo $$0) {
      final Map<ame, hrx.b> $$1 = new HashMap<>();
      hrx.a $$2 = new hrx.a() {
         @Override
         public void a(ame $$0, hrx.b $$1x) {
            hrx.b $$2x = $$1.put($$0, $$1);
            if ($$2x != null) {
               $$2x.a();
            }
         }

         @Override
         public void a(Predicate<ame> $$0) {
            Iterator<Entry<ame, hrx.b>> $$1x = $$1.entrySet().iterator();

            while ($$1x.hasNext()) {
               Entry<ame, hrx.b> $$2x = $$1x.next();
               if ($$0.test($$2x.getKey())) {
                  $$2x.getValue().a();
                  $$1x.remove();
               }
            }
         }
      };
      this.c.forEach($$2x -> $$2x.a($$0, $$2));
      Builder<Function<hrw, hrm>> $$3 = ImmutableList.builder();
      $$3.add((Function<hrw, hrm>)$$0x -> hrh.b());
      $$3.addAll($$1.values());
      return $$3.build();
   }

   public static hry a(axo $$0, ame $$1) {
      ame $$2 = b.a($$1);
      List<hrx> $$3 = new ArrayList<>();

      for (axm $$4 : $$0.a($$2)) {
         try (BufferedReader $$5 = $$4.e()) {
            Dynamic<JsonElement> $$6 = new Dynamic(JsonOps.INSTANCE, bcy.a($$5));
            $$3.addAll((Collection<? extends hrx>)hrz.b.parse($$6).getOrThrow());
         } catch (Exception var11) {
            a.error("Failed to parse atlas definition {} in pack {}", new Object[]{$$2, $$4.b(), var11});
         }
      }

      return new hry($$3);
   }
}
