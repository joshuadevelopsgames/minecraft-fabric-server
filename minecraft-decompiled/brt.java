import com.google.common.collect.Maps;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class brt {
   public static final int a = 200;
   public static final int b = 10000;
   private final ayb c;
   private final Map<brv, Map<auc, brt.b>> d;
   private final Queue<brt.a> e = new LinkedList<>();

   public brt(ayb $$0) {
      this.c = $$0;
      this.d = ag.a(brv.class, $$0x -> Maps.newHashMap());
   }

   public boolean a(brv $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(adq $$0) {
      for (auc $$2 : this.d.get($$0.e()).keySet()) {
         $$2.g.b($$0);
      }
   }

   public void a(auc $$0, brv $$1) {
      if (this.c.f($$0.gr())) {
         this.e.add(new brt.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ag.c();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (brt.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new brt.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<auc, brt.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((auc)$$2x.getKey()).gr());
            brt.b $$4 = (brt.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   record a(auc a, brv b) {
   }

   record b(long a, int b) {
   }
}
