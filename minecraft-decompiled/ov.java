import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class ov implements ok {
   private final ol b;
   private final jl<dcr> c;
   private final dhi d;
   private final dhi e;
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private ov(ol $$0, jl<dcr> $$1, dhi $$2, dhi $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static ov a(ol $$0, dhi $$1, dhi $$2, dcr $$3) {
      return new ov($$0, $$3.e(), $$1, $$2);
   }

   public ov b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public ov b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public dcr a() {
      return this.c.a();
   }

   @Override
   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dio $$3 = new dio(Objects.requireNonNullElse(this.g, ""), ok.a(this.b), this.d, this.e, new dip(this.c.a()));
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.b.a() + "/")));
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
