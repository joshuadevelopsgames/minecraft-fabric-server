import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbp {
   private final Map<jl<cbn>, cbo> a = new Object2ObjectOpenHashMap();
   private final Set<cbo> b = new ObjectOpenHashSet();
   private final Set<cbo> c = new ObjectOpenHashSet();
   private final cbr d;

   public cbp(cbr $$0) {
      this.d = $$0;
   }

   private void a(cbo $$0) {
      this.c.add($$0);
      if ($$0.a().a().b()) {
         this.b.add($$0);
      }
   }

   public Set<cbo> a() {
      return this.b;
   }

   public Set<cbo> b() {
      return this.c;
   }

   public Collection<cbo> c() {
      return this.a.values().stream().filter($$0 -> $$0.a().a().b()).collect(Collectors.toList());
   }

   @Nullable
   public cbo a(jl<cbn> $$0) {
      return this.a.computeIfAbsent($$0, $$0x -> this.d.a(this::a, $$0x));
   }

   public boolean b(jl<cbn> $$0) {
      return this.a.get($$0) != null || this.d.c($$0);
   }

   public boolean a(jl<cbn> $$0, ame $$1) {
      cbo $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1) != null : this.d.b($$0, $$1);
   }

   public double c(jl<cbn> $$0) {
      cbo $$1 = this.a.get($$0);
      return $$1 != null ? $$1.g() : this.d.a($$0);
   }

   public double d(jl<cbn> $$0) {
      cbo $$1 = this.a.get($$0);
      return $$1 != null ? $$1.b() : this.d.b($$0);
   }

   public double b(jl<cbn> $$0, ame $$1) {
      cbo $$2 = this.a.get($$0);
      return $$2 != null ? $$2.a($$1).b() : this.d.a($$0, $$1);
   }

   public void a(Multimap<jl<cbn>, cbq> $$0) {
      $$0.forEach(($$0x, $$1) -> {
         cbo $$2 = this.a($$0x);
         if ($$2 != null) {
            $$2.c($$1.a());
            $$2.b($$1);
         }
      });
   }

   public void b(Multimap<jl<cbn>, cbq> $$0) {
      $$0.asMap().forEach(($$0x, $$1) -> {
         cbo $$2 = this.a.get($$0x);
         if ($$2 != null) {
            $$1.forEach($$1x -> $$2.c($$1x.a()));
         }
      });
   }

   public void a(cbp $$0) {
      $$0.a.values().forEach($$0x -> {
         cbo $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x);
         }
      });
   }

   public void b(cbp $$0) {
      $$0.a.values().forEach($$0x -> {
         cbo $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.b());
         }
      });
   }

   public void c(cbp $$0) {
      $$0.a.values().forEach($$0x -> {
         cbo $$1 = this.a($$0x.a());
         if ($$1 != null) {
            $$1.a($$0x.d());
         }
      });
   }

   public boolean e(jl<cbn> $$0) {
      if (!this.d.c($$0)) {
         return false;
      } else {
         cbo $$1 = this.a.get($$0);
         if ($$1 != null) {
            $$1.a(this.d.b($$0));
         }

         return true;
      }
   }

   public List<cbo.a> d() {
      List<cbo.a> $$0 = new ArrayList<>(this.a.values().size());

      for (cbo $$1 : this.a.values()) {
         $$0.add($$1.h());
      }

      return $$0;
   }

   public void a(List<cbo.a> $$0) {
      for (cbo.a $$1 : $$0) {
         cbo $$2 = this.a($$1.a());
         if ($$2 != null) {
            $$2.a($$1);
         }
      }
   }
}
