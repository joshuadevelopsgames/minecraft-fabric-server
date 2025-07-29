import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class op implements ok {
   private final jm<dcr> b;
   private final ol c;
   private final dcv d;
   private final List<dhi> e = new ArrayList<>();
   private final Map<String, ar<?>> f = new LinkedHashMap<>();
   @Nullable
   private String g;

   private op(jm<dcr> $$0, ol $$1, dcv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static op a(jm<dcr> $$0, ol $$1, dcv $$2) {
      return new op($$0, $$1, $$2);
   }

   public static op a(jm<dcr> $$0, ol $$1, dmt $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static op a(jm<dcr> $$0, ol $$1, dmt $$2, int $$3) {
      return new op($$0, $$1, $$2.h().m().c($$3));
   }

   public op a(bae<dcr> $$0) {
      return this.a(dhi.a(this.b.b($$0)));
   }

   public op b(dmt $$0) {
      return this.a($$0, 1);
   }

   public op a(dmt $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.a(dhi.a($$0));
      }

      return this;
   }

   public op a(dhi $$0) {
      return this.a($$0, 1);
   }

   public op a(dhi $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.e.add($$0);
      }

      return this;
   }

   public op b(String $$0, ar<?> $$1) {
      this.f.put($$0, $$1);
      return this;
   }

   public op b(@Nullable String $$0) {
      this.g = $$0;
      return this;
   }

   @Override
   public dcr a() {
      return this.d.h();
   }

   @Override
   public void a(om $$0, amd<dhm<?>> $$1) {
      this.a($$1);
      ai.a $$2 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.f.forEach($$2::a);
      dic $$3 = new dic(Objects.requireNonNullElse(this.g, ""), ok.a(this.c), this.d, this.e);
      $$0.a($$1, $$3, $$2.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private void a(amd<dhm<?>> $$0) {
      if (this.f.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      }
   }
}
