import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mw implements mt {
   private final mv.a d;
   private final List<mx> e;
   private final CompletableFuture<jn.a> f;

   public mw(mv $$0, CompletableFuture<jn.a> $$1, List<mx> $$2) {
      this.d = $$0.a(mn.bz);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      return this.f.thenCompose($$1 -> {
         Set<ame> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<aj> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(mt.a($$0, $$1, ai.a, $$4x.b(), $$5x));
            }
         };

         for (mx $$5 : this.e) {
            $$5.a($$1, $$4);
         }

         return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
      });
   }

   @Override
   public final String a() {
      return "Advancements";
   }
}
