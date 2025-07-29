import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class or implements ok {
   private final ol b;
   private final dcr c;
   private final dhi d;
   private final int e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;
   private final die.a<?> h;

   public or(ol $$0, die.a<?> $$1, dhi $$2, dmt $$3, int $$4) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$3.h();
      this.d = $$2;
      this.e = $$4;
   }

   public static or a(dhi $$0, ol $$1, dmt $$2) {
      return new or($$1, dim::new, $$0, $$2, 1);
   }

   public static or a(dhi $$0, ol $$1, dmt $$2, int $$3) {
      return new or($$1, dim::new, $$0, $$2, $$3);
   }

   public or b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public or b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public dcr a() {
      return this.c;
   }

   @Override
   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      die $$3 = this.h.create(Objects.requireNonNullElse(this.g, ""), this.d, new dcv(this.c, this.e));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
