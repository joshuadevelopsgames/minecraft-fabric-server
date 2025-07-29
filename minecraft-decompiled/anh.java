import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anh {
   private static final Logger a = LogUtils.getLogger();
   private static final Codec<Map<ame, ang.a>> b = Codec.unboundedMap(ame.a, ang.a.a);
   private final Map<ame, ang> c = Maps.newHashMap();

   @Nullable
   public ang a(ame $$0) {
      return this.c.get($$0);
   }

   public ang a(ame $$0, xo $$1) {
      ang $$2 = new ang($$0, $$1);
      this.c.put($$0, $$2);
      return $$2;
   }

   public void a(ang $$0) {
      this.c.remove($$0.a());
   }

   public Collection<ame> a() {
      return this.c.keySet();
   }

   public Collection<ang> b() {
      return this.c.values();
   }

   public ui a(jn.a $$0) {
      Map<ame, ang.a> $$1 = ag.a(this.c, ang::f);
      return (ui)b.encodeStart($$0.a(uw.a), $$1).getOrThrow();
   }

   public void a(ui $$0, jn.a $$1) {
      Map<ame, ang.a> $$2 = b.parse($$1.a(uw.a), $$0).resultOrPartial($$0x -> a.error("Failed to parse boss bar events: {}", $$0x)).orElse(Map.of());
      $$2.forEach(($$0x, $$1x) -> this.c.put($$0x, ang.a($$0x, $$1x)));
   }

   public void a(auc $$0) {
      for (ang $$1 : this.c.values()) {
         $$1.c($$0);
      }
   }

   public void b(auc $$0) {
      for (ang $$1 : this.c.values()) {
         $$1.d($$0);
      }
   }
}
