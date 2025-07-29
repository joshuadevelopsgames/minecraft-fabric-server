import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class hdd extends hcy<cnu, hju, gmb> {
   private static final Map<cnu.e, ame> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (cnu.e $$1 : cnu.e.values()) {
         $$0.put($$1, ame.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public hdd(hee.a $$0) {
      super($$0, new gmb($$0.a(gqm.m)), new gmb($$0.a(gqm.n)), 0.5F);
   }

   public ame a(hju $$0) {
      return a.get($$0.a);
   }

   public hju a() {
      return new hju();
   }

   public void a(cnu $$0, hju $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gH();
      $$1.b = $$0.cr.a($$2);
      $$1.d = $$0.cs.a($$2);
      $$1.e = $$0.ct.a($$2);
      $$1.c = $$0.cu.a($$2);
   }
}
