import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public class oo implements ok {
   private final jm<dcr> b;
   private final ol c;
   private final dcr d;
   private final int e;
   private final List<String> f = Lists.newArrayList();
   private final Map<Character, dhi> g = Maps.newLinkedHashMap();
   private final Map<String, ar<?>> h = new LinkedHashMap<>();
   @Nullable
   private String i;
   private boolean j = true;

   private oo(jm<dcr> $$0, ol $$1, dmt $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.h();
      this.e = $$3;
   }

   public static oo a(jm<dcr> $$0, ol $$1, dmt $$2) {
      return a($$0, $$1, $$2, 1);
   }

   public static oo a(jm<dcr> $$0, ol $$1, dmt $$2, int $$3) {
      return new oo($$0, $$1, $$2, $$3);
   }

   public oo a(Character $$0, bae<dcr> $$1) {
      return this.a($$0, dhi.a(this.b.b($$1)));
   }

   public oo a(Character $$0, dmt $$1) {
      return this.a($$0, dhi.a($$1));
   }

   public oo a(Character $$0, dhi $$1) {
      if (this.g.containsKey($$0)) {
         throw new IllegalArgumentException("Symbol '" + $$0 + "' is already defined!");
      } else if ($$0 == ' ') {
         throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
      } else {
         this.g.put($$0, $$1);
         return this;
      }
   }

   public oo b(String $$0) {
      if (!this.f.isEmpty() && $$0.length() != this.f.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.f.add($$0);
         return this;
      }
   }

   public oo b(String $$0, ar<?> $$1) {
      this.h.put($$0, $$1);
      return this;
   }

   public oo c(@Nullable String $$0) {
      this.i = $$0;
      return this;
   }

   public oo a(boolean $$0) {
      this.j = $$0;
      return this;
   }

   @Override
   public dcr a() {
      return this.d;
   }

   @Override
   public void a(om $$0, amd<dhm<?>> $$1) {
      dib $$2 = this.a($$1);
      ai.a $$3 = $$0.a().a("has_the_recipe", di.a($$1)).a(an.a.c($$1)).a(am.a.b);
      this.h.forEach($$3::a);
      dia $$4 = new dia(Objects.requireNonNullElse(this.i, ""), ok.a(this.c), $$2, new dcv(this.d, this.e), this.j);
      $$0.a($$1, $$4, $$3.b($$1.a().f("recipes/" + this.c.a() + "/")));
   }

   private dib a(amd<dhm<?>> $$0) {
      if (this.h.isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + $$0.a());
      } else {
         return dib.a(this.g, this.f);
      }
   }
}
