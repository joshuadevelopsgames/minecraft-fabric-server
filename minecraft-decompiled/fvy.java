import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fvy implements mt {
   private final mv.a d;

   public fvy(mv $$0) {
      this.d = $$0.a(mv.b.b, "equipment");
   }

   private static void a(BiConsumer<amd<dlc>, htz> $$0) {
      $$0.accept(dld.b, htz.a().a(ame.b("leather"), true).a(ame.b("leather_overlay"), false).a(htz.d.e, htz.c.a(ame.b("leather"), true)).a());
      $$0.accept(dld.c, a("chainmail"));
      $$0.accept(dld.d, b("iron"));
      $$0.accept(dld.e, b("gold"));
      $$0.accept(dld.f, b("diamond"));
      $$0.accept(dld.g, htz.a().b(ame.b("turtle_scute"), false).a());
      $$0.accept(dld.h, a("netherite"));
      $$0.accept(dld.i, htz.a().a(htz.d.d, htz.c.b(ame.b("armadillo_scute"), false)).a(htz.d.d, htz.c.b(ame.b("armadillo_scute_overlay"), true)).a());
      $$0.accept(dld.j, htz.a().a(htz.d.c, new htz.c(ame.b("elytra"), Optional.empty(), true)).a());
      htz.c $$1 = new htz.c(ame.b("saddle"));
      $$0.accept(
         dld.k, htz.a().a(htz.d.g, $$1).a(htz.d.h, $$1).a(htz.d.i, $$1).a(htz.d.j, $$1).a(htz.d.k, $$1).a(htz.d.l, $$1).a(htz.d.n, $$1).a(htz.d.m, $$1).a()
      );

      for (Entry<dbt, amd<dlc>> $$2 : dld.n.entrySet()) {
         dbt $$3 = $$2.getKey();
         amd<dlc> $$4 = $$2.getValue();
         $$0.accept($$4, htz.a().a(htz.d.o, htz.c.b(ame.b($$3.c() + "_harness"), false)).a());
      }

      for (Entry<dbt, amd<dlc>> $$5 : dld.l.entrySet()) {
         dbt $$6 = $$5.getKey();
         amd<dlc> $$7 = $$5.getValue();
         $$0.accept($$7, htz.a().a(htz.d.f, new htz.c(ame.b($$6.c()))).a());
      }

      $$0.accept(dld.m, htz.a().a(htz.d.f, new htz.c(ame.b("trader_llama"))).a());
   }

   private static htz a(String $$0) {
      return htz.a().a(ame.b($$0)).a();
   }

   private static htz b(String $$0) {
      return htz.a().a(ame.b($$0)).a(htz.d.e, htz.c.a(ame.b($$0), false)).a();
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      Map<amd<dlc>, htz> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment asset twice for id: " + $$1x);
         }
      });
      return mt.a($$0, htz.a, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Equipment Asset Definitions";
   }
}
