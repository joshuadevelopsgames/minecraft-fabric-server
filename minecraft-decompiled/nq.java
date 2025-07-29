import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.slf4j.Logger;

public class nq implements mt {
   private static final Logger d = LogUtils.getLogger();
   private final mv.a e;
   private final Set<amd<fdo>> f;
   private final List<nq.b> g;
   private final CompletableFuture<jn.a> h;

   public nq(mv $$0, Set<amd<fdo>> $$1, List<nq.b> $$2, CompletableFuture<jn.a> $$3) {
      this.e = $$0.a(mn.bw);
      this.g = $$2;
      this.f = $$1;
      this.h = $$3;
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      return this.h.thenCompose($$1 -> this.a($$0, $$1));
   }

   private CompletableFuture<?> a(mr $$0, jn.a $$1) {
      kh<fdo> $$2 = new jt<>(mn.bw, Lifecycle.experimental());
      Map<ekp.a, ame> $$3 = new Object2ObjectOpenHashMap();
      this.g.forEach($$3x -> $$3x.a().apply($$1).generate(($$3xx, $$4x) -> {
         ame $$5x = a($$3xx);
         ame $$6x = $$3.put(bxo.a($$5x), $$5x);
         if ($$6x != null) {
            ag.b("Loot table random sequence seed collision on " + $$6x + " and " + $$3xx.a());
         }

         $$4x.a($$5x);
         fdo $$7 = $$4x.a($$3x.b).b();
         $$2.a($$3xx, $$7, jx.a);
      }));
      $$2.n();
      bci.a $$4 = new bci.a();
      jm.a $$5 = new jz.c(List.of($$2)).e();
      fdp $$6 = new fdp($$4, fgc.q, $$5);

      for (amd<fdo> $$8 : Sets.difference(this.f, $$2.j())) {
         $$4.a(new nq.a($$8));
      }

      $$2.c().forEach($$1x -> ((fdo)$$1x.a()).a($$6.a(((fdo)$$1x.a()).a()).a(new bci.h($$1x.h()), $$1x.h())));
      if (!$$4.a()) {
         $$4.a(($$0x, $$1x) -> d.warn("Found validation problem in {}: {}", $$0x, $$1x.a()));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf($$2.k().stream().map($$2x -> {
            amd<fdo> $$3x = (amd<fdo>)$$2x.getKey();
            fdo $$4x = (fdo)$$2x.getValue();
            Path $$5x = this.e.a($$3x.a());
            return mt.a($$0, $$1, fdo.d, $$4x, $$5x);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static ame a(amd<fdo> $$0) {
      return $$0.a();
   }

   @Override
   public final String a() {
      return "Loot Tables";
   }

   public record a(amd<fdo> a) implements bci.g {
      @Override
      public String a() {
         return "Missing built-in table: " + this.a.a();
      }

      public amd<fdo> b() {
         return this.a;
      }
   }

   public record b(Function<jn.a, nr> a, bdo b) {
   }
}
