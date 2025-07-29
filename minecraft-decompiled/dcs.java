import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class dcs {
   private final Map<ame, dcs.a> a = Maps.newHashMap();
   private int b;

   public boolean a(dcv $$0) {
      return this.a($$0, 0.0F) > 0.0F;
   }

   public float a(dcv $$0, float $$1) {
      ame $$2 = this.b($$0);
      dcs.a $$3 = this.a.get($$2);
      if ($$3 != null) {
         float $$4 = $$3.b - $$3.a;
         float $$5 = $$3.b - (this.b + $$1);
         return bcb.a($$5 / $$4, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void a() {
      this.b++;
      if (!this.a.isEmpty()) {
         Iterator<Entry<ame, dcs.a>> $$0 = this.a.entrySet().iterator();

         while ($$0.hasNext()) {
            Entry<ame, dcs.a> $$1 = $$0.next();
            if ($$1.getValue().b <= this.b) {
               $$0.remove();
               this.b($$1.getKey());
            }
         }
      }
   }

   public ame b(dcv $$0) {
      dgb $$1 = $$0.a(kq.y);
      ame $$2 = mm.g.b($$0.h());
      return $$1 == null ? $$2 : $$1.c().orElse($$2);
   }

   public void a(dcv $$0, int $$1) {
      this.a(this.b($$0), $$1);
   }

   public void a(ame $$0, int $$1) {
      this.a.put($$0, new dcs.a(this.b, this.b + $$1));
      this.b($$0, $$1);
   }

   public void a(ame $$0) {
      this.a.remove($$0);
      this.b($$0);
   }

   protected void b(ame $$0, int $$1) {
   }

   protected void b(ame $$0) {
   }

   record a(int a, int b) {
   }
}
