import java.util.LinkedHashMap;
import java.util.Map;

public class ot {
   private final ol a;
   private final dhi b;
   private final dhi c;
   private final dhi d;
   private final jl<dlk> e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public ot(ol $$0, dhi $$1, dhi $$2, dhi $$3, jl<dlk> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static ot a(dhi $$0, dhi $$1, dhi $$2, jl<dlk> $$3, ol $$4) {
      return new ot($$4, $$0, $$1, $$2, $$3);
   }

   public ot a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dik $$3 = new dik(this.b, this.c, this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.a.a() + "/")));
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
