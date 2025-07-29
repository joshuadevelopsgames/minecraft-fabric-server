import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gzk {
   public static final gzk a = new gzk(Map.of());
   private static final char b = '#';
   private final Map<String, hua> c;

   gzk(Map<String, hua> $$0) {
      this.c = $$0;
   }

   @Nullable
   public hua a(String $$0) {
      if (b($$0)) {
         $$0 = $$0.substring(1);
      }

      return this.c.get($$0);
   }

   private static boolean b(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public static gzk.a a(JsonObject $$0, ame $$1) {
      gzk.a.a $$2 = new gzk.a.a();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         a($$1, $$3.getKey(), $$3.getValue().getAsString(), $$2);
      }

      return $$2.a();
   }

   private static void a(ame $$0, String $$1, String $$2, gzk.a.a $$3) {
      if (b($$2)) {
         $$3.a($$1, $$2.substring(1));
      } else {
         ame $$4 = ame.c($$2);
         if ($$4 == null) {
            throw new JsonParseException($$2 + " is not valid resource location");
         }

         $$3.a($$1, new hua($$0, $$4));
      }
   }

   public record a(Map<String, gzk.d> b) {
      public static final gzk.a a = new gzk.a(Map.of());

      public Map<String, gzk.d> a() {
         return this.b;
      }

      public static class a {
         private final Map<String, gzk.d> a = new HashMap<>();

         public gzk.a.a a(String $$0, String $$1) {
            this.a.put($$0, new gzk.b($$1));
            return this;
         }

         public gzk.a.a a(String $$0, hua $$1) {
            this.a.put($$0, new gzk.e($$1));
            return this;
         }

         public gzk.a a() {
            return this.a.isEmpty() ? gzk.a.a : new gzk.a(Map.copyOf(this.a));
         }
      }
   }

   record b(String a) implements gzk.d {
   }

   public static class c {
      private static final Logger a = LogUtils.getLogger();
      private final List<gzk.a> b = new ArrayList<>();

      public gzk.c a(gzk.a $$0) {
         this.b.addLast($$0);
         return this;
      }

      public gzk.c b(gzk.a $$0) {
         this.b.addFirst($$0);
         return this;
      }

      public gzk a(hue $$0) {
         if (this.b.isEmpty()) {
            return gzk.a;
         } else {
            Object2ObjectMap<String, hua> $$1 = new Object2ObjectArrayMap();
            Object2ObjectMap<String, gzk.b> $$2 = new Object2ObjectArrayMap();

            for (gzk.a $$3 : Lists.reverse(this.b)) {
               $$3.b.forEach(($$2x, $$3x) -> {
                  switch ($$3x) {
                     case gzk.e $$6x:
                        $$2.remove($$2x);
                        $$1.put($$2x, $$6x.a());
                        break;
                     case gzk.b $$7x:
                        $$1.remove($$2x);
                        $$2.put($$2x, $$7x);
                        break;
                     default:
                        throw new MatchException(null, null);
                  }
               });
            }

            if ($$2.isEmpty()) {
               return new gzk($$1);
            } else {
               boolean $$4 = true;

               while ($$4) {
                  $$4 = false;
                  ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gzk.b>> $$5 = Object2ObjectMaps.fastIterator($$2);

                  while ($$5.hasNext()) {
                     it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gzk.b> $$6 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<String, gzk.b>)$$5.next();
                     hua $$7 = (hua)$$1.get(((gzk.b)$$6.getValue()).a);
                     if ($$7 != null) {
                        $$1.put((String)$$6.getKey(), $$7);
                        $$5.remove();
                        $$4 = true;
                     }
                  }
               }

               if (!$$2.isEmpty()) {
                  a.warn(
                     "Unresolved texture references in {}:\n{}",
                     $$0.debugName(),
                     $$2.entrySet()
                        .stream()
                        .map($$0x -> "\t#" + (String)$$0x.getKey() + "-> #" + ((gzk.b)$$0x.getValue()).a + "\n")
                        .collect(Collectors.joining())
                  );
               }

               return new gzk($$1);
            }
         }
      }
   }

   public sealed interface d permits gzk.e, gzk.b {
   }

   record e(hua a) implements gzk.d {
   }
}
