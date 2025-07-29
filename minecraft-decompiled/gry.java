import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gry {
   @Nullable
   private gry.a a;
   @Nullable
   private gry.b b;

   public void a(amd<? extends jy<?>> $$0, List<kc.a> $$1) {
      if (this.a == null) {
         this.a = new gry.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<amd<? extends jy<?>>, bag.a> $$0) {
      if (this.b == null) {
         this.b = new gry.b();
      }

      $$0.forEach(this.b::a);
   }

   private static <T> jy.a<T> a(jz.b $$0, amd<? extends jy<? extends T>> $$1, bag.a $$2) {
      jy<T> $$3 = $$0.f($$1);
      return $$3.a($$2.a($$3));
   }

   private jz a(axr $$0, gry.a $$1, boolean $$2) {
      js<grn> $$3 = grn.a();
      jz.b $$4 = $$3.b(grn.b);
      Map<amd<? extends jy<?>>, alz.c> $$5 = new HashMap<>();
      $$1.a.forEach(($$1x, $$2x) -> $$5.put($$1x, new alz.c($$2x, bag.a.a)));
      List<jy.a<?>> $$6 = new ArrayList<>();
      if (this.b != null) {
         this.b.a(($$4x, $$5x) -> {
            if (!$$5x.a()) {
               if (kc.a($$4x)) {
                  $$5.compute($$4x, ($$1xx, $$2xx) -> {
                     List<kc.a> $$3xx = $$2xx != null ? $$2xx.a() : List.of();
                     return new alz.c($$3xx, $$5x);
                  });
               } else if (!$$2) {
                  $$6.add(a($$4, $$4x, $$5x));
               }
            }
         });
      }

      List<jn.b<?>> $$7 = baf.a($$4, $$6);

      jz.b $$8;
      try {
         $$8 = alz.a($$5, $$0, $$7, alz.c).e();
      } catch (Exception var13) {
         p $$10 = p.a(var13, "Network Registry Load");
         a($$10, $$5, $$6);
         throw new aa($$10);
      }

      jz $$12 = $$3.a(grn.b, $$8).a();
      $$6.forEach(jy.a::d);
      return $$12;
   }

   private static void a(p $$0, Map<amd<? extends jy<?>>, alz.c> $$1, List<jy.a<?>> $$2) {
      q $$3 = $$0.a("Received Elements and Tags");
      $$3.a(
         "Dynamic Registries",
         () -> $$1.entrySet()
            .stream()
            .sorted(Comparator.comparing($$0xx -> ((amd)$$0xx.getKey()).a()))
            .map(
               $$0xx -> String.format(
                  Locale.ROOT,
                  "\n\t\t%s: elements=%d tags=%d",
                  ((amd)$$0xx.getKey()).a(),
                  ((alz.c)$$0xx.getValue()).a().size(),
                  ((alz.c)$$0xx.getValue()).b().b()
               )
            )
            .collect(Collectors.joining())
      );
      $$3.a(
         "Static Registries",
         () -> $$2.stream()
            .sorted(Comparator.comparing($$0xx -> $$0xx.a().a()))
            .map($$0xx -> String.format(Locale.ROOT, "\n\t\t%s: tags=%d", $$0xx.a().a(), $$0xx.b()))
            .collect(Collectors.joining())
      );
   }

   private void a(gry.b $$0, jz.b $$1, boolean $$2) {
      $$0.a(($$2x, $$3) -> {
         if ($$2 || kc.a($$2x)) {
            a($$1, $$2x, $$3).d();
         }
      });
   }

   public jz.b a(axr $$0, jz.b $$1, boolean $$2) {
      jz $$3;
      if (this.a != null) {
         $$3 = this.a($$0, this.a, $$2);
      } else {
         if (this.b != null) {
            this.a(this.b, $$1, !$$2);
         }

         $$3 = $$1;
      }

      return $$3.e();
   }

   static class a {
      final Map<amd<? extends jy<?>>, List<kc.a>> a = new HashMap<>();

      public void a(amd<? extends jy<?>> $$0, List<kc.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }
   }

   static class b {
      private final Map<amd<? extends jy<?>>, bag.a> a = new HashMap<>();

      public void a(amd<? extends jy<?>> $$0, bag.a $$1) {
         this.a.put($$0, $$1);
      }

      public void a(BiConsumer<? super amd<? extends jy<?>>, ? super bag.a> $$0) {
         this.a.forEach($$0);
      }
   }
}
