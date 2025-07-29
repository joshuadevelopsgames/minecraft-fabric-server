import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class azf extends azk {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<Map<azg<?>, Integer>> c = Codec.dispatchedMap(mm.v.q(), ag.b(azf::a)).xmap($$0 -> {
      Map<azg<?>, Integer> $$1 = new HashMap<>();
      $$0.forEach(($$1x, $$2) -> $$1.putAll((Map<? extends azg<?>, ? extends Integer>)$$2));
      return $$1;
   }, $$0 -> $$0.entrySet().stream().collect(Collectors.groupingBy($$0x -> ((azg)$$0x.getKey()).a(), ag.a())));
   private final MinecraftServer d;
   private final File e;
   private final Set<azg<?>> f = Sets.newHashSet();

   private static <T> Codec<Map<azg<?>, Integer>> a(azi<T> $$0) {
      Codec<T> $$1 = $$0.b().q();
      Codec<azg<?>> $$2 = $$1.flatComapMap(
         $$0::b, $$1x -> $$1x.a() == $$0 ? DataResult.success($$1x.b()) : DataResult.error(() -> "Expected type " + $$0 + ", but got " + $$1x.a())
      );
      return Codec.unboundedMap($$2, Codec.INT);
   }

   public azf(MinecraftServer $$0, File $$1) {
      this.d = $$0;
      this.e = $$1;
      if ($$1.isFile()) {
         try {
            this.a($$0.aC(), FileUtils.readFileToString($$1));
         } catch (IOException var4) {
            b.error("Couldn't read statistics file {}", $$1, var4);
         } catch (JsonParseException var5) {
            b.error("Couldn't parse statistics file {}", $$1, var5);
         }
      }
   }

   public void a() {
      try {
         FileUtils.writeStringToFile(this.e, this.b());
      } catch (IOException var2) {
         b.error("Couldn't save stats", var2);
      }
   }

   @Override
   public void a(cut $$0, azg<?> $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f.add($$1);
   }

   private Set<azg<?>> d() {
      Set<azg<?>> $$0 = Sets.newHashSet(this.f);
      this.f.clear();
      return $$0;
   }

   public void a(DataFixer $$0, String $$1) {
      try {
         JsonElement $$2 = bcy.a($$1);
         if ($$2.isJsonNull()) {
            b.error("Unable to parse Stat data from {}", this.e);
            return;
         }

         Dynamic<JsonElement> $$3 = new Dynamic(JsonOps.INSTANCE, $$2);
         $$3 = bdr.h.a($$0, $$3, ux.a($$3, 1343));
         this.a
            .putAll(
               c.parse($$3.get("stats").orElseEmptyMap())
                  .resultOrPartial($$0x -> b.error("Failed to parse statistics for {}: {}", this.e, $$0x))
                  .orElse(Map.of())
            );
      } catch (JsonParseException var5) {
         b.error("Unable to parse Stat data from {}", this.e, var5);
      }
   }

   protected String b() {
      JsonObject $$0 = new JsonObject();
      $$0.add("stats", (JsonElement)c.encodeStart(JsonOps.INSTANCE, this.a).getOrThrow());
      $$0.addProperty("DataVersion", ac.b().a().b());
      return $$0.toString();
   }

   public void c() {
      this.f.addAll(this.a.keySet());
   }

   public void a(auc $$0) {
      Object2IntMap<azg<?>> $$1 = new Object2IntOpenHashMap();

      for (azg<?> $$2 : this.d()) {
         $$1.put($$2, this.a($$2));
      }

      $$0.g.b(new act($$1));
   }
}
