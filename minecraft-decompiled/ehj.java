import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ehj implements eij<bzm> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final aub d;
   private final ehu e;
   private final LongSet f = new LongOpenHashSet();
   private final bvy g;

   public ehj(ehu $$0, aub $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = new bvy($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<eie<bzm>> a(dlz $$0) {
      if (this.f.contains($$0.a())) {
         return CompletableFuture.completedFuture(b($$0));
      } else {
         CompletableFuture<Optional<ui>> $$1 = this.e.a($$0);
         this.b($$1, $$0);
         return $$1.thenApplyAsync($$1x -> {
            if ($$1x.isEmpty()) {
               this.f.add($$0.a());
               return b($$0);
            } else {
               try {
                  dlz $$2 = ((ui)$$1x.get()).<dlz>a("Position", dlz.a).orElseThrow();
                  if (!Objects.equals($$0, $$2)) {
                     a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                     this.d.q().a($$2, $$0, this.e.a());
                  }
               } catch (Exception var11) {
                  a.warn("Failed to parse chunk {} position info", $$0, var11);
                  this.d.q().a(var11, this.e.a(), $$0);
               }

               ui $$4 = this.e.a((ui)$$1x.get(), -1);

               eie var8;
               try (bci.j $$5 = new bci.j(efy.a($$0), a)) {
                  fda $$6 = fcy.a($$5, this.d.K_(), $$4);
                  fda.b $$7 = $$6.d("Entities");
                  List<bzm> $$8 = bzv.a($$7, this.d, bzu.r).toList();
                  var8 = new eie<>($$0, $$8);
               }

               return var8;
            }
         }, this.g::a_);
      }
   }

   private static eie<bzm> b(dlz $$0) {
      return new eie<>($$0, List.of());
   }

   @Override
   public void a(eie<bzm> $$0) {
      dlz $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.a(this.e.a($$1, null), $$1);
         }
      } else {
         try (bci.j $$2 = new bci.j(efy.a($$1), a)) {
            uo $$3 = new uo();
            $$0.b().forEach($$2x -> {
               fcz $$3x = fcz.a($$2.a($$2x.ef()), $$2x.eb());
               if ($$2x.c($$3x)) {
                  ui $$4x = $$3x.b();
                  $$3.add($$4x);
               }
            });
            ui $$4 = ux.e(new ui());
            $$4.a("Entities", $$3);
            $$4.a("Position", dlz.a, $$1);
            this.a(this.e.a($$1, $$4), $$1);
            this.f.remove($$1.a());
         }
      }
   }

   private void a(CompletableFuture<?> $$0, dlz $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to store entity chunk {}", $$1, $$1x);
         this.d.q().b($$1x, this.e.a(), $$1);
         return null;
      });
   }

   private void b(CompletableFuture<?> $$0, dlz $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to load entity chunk {}", $$1, $$1x);
         this.d.q().a($$1x, this.e.a(), $$1);
         return null;
      });
   }

   @Override
   public void a(boolean $$0) {
      this.e.a($$0).join();
      this.g.a();
   }

   @Override
   public void close() throws IOException {
      this.e.close();
   }
}
