import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dne {
   private final Long2ObjectMap<List<auc>> a = new Long2ObjectOpenHashMap();
   private final Map<auc, dne.a> b = Maps.newHashMap();
   private final atf c;

   public dne(atf $$0) {
      this.c = $$0;
   }

   private List<auc> a(dlz $$0) {
      return (List<auc>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.c($$0));
   }

   public void a(dlz $$0, cap $$1) {
      for (auc $$2 : this.a($$0)) {
         this.b.computeIfAbsent($$2, $$0x -> new dne.a()).a($$1);
      }
   }

   public boolean a(cap $$0, dlz $$1) {
      for (auc $$2 : this.a($$1)) {
         dne.a $$3 = this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<cap> a = new Object2IntOpenHashMap(cap.values().length);

      public void a(cap $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(cap $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
