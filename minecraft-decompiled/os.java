import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class os {
   private final dhi a;
   private final dhi b;
   private final dhi c;
   private final ol d;
   private final dcr e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();

   public os(dhi $$0, dhi $$1, dhi $$2, ol $$3, dcr $$4) {
      this.d = $$3;
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.e = $$4;
   }

   public static os a(dhi $$0, dhi $$1, dhi $$2, ol $$3, dcr $$4) {
      return new os($$0, $$1, $$2, $$3, $$4);
   }

   public os a(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public void a(om $$0, String $$1) {
      this.a($$0, amd.a(mn.bA, ame.a($$1)));
   }

   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dij $$3 = new dij(Optional.of(this.a), this.b, Optional.of(this.c), new dip(this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.d.a() + "/")));
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
