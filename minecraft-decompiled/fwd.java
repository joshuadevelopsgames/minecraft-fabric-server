import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class fwd implements mt {
   private final mv.a d;

   public fwd(mv $$0) {
      this.d = $$0.a(mv.b.b, "waypoint_style");
   }

   private static void a(BiConsumer<amd<fkv>, hsx> $$0) {
      $$0.accept(fkw.b, new hsx(128, 332, List.of(ame.b("default_0"), ame.b("default_1"), ame.b("default_2"), ame.b("default_3"))));
      $$0.accept(fkw.c, new hsx(64, 332, List.of(ame.b("bowtie"), ame.b("default_0"), ame.b("default_1"), ame.b("default_2"), ame.b("default_3"))));
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      Map<amd<fkv>, hsx> $$1 = new HashMap<>();
      a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register waypoint style twice for id: " + $$1x);
         }
      });
      return mt.a($$0, hsx.c, this.d::a, $$1);
   }

   @Override
   public String a() {
      return "Waypoint Style Definitions";
   }
}
