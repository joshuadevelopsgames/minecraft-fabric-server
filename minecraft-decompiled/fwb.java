import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class fwb implements mt {
   private final mv.a d;
   private final mv.a e;
   private final mv.a f;

   public fwb(mv $$0) {
      this.d = $$0.a(mv.b.b, "blockstates");
      this.e = $$0.a(mv.b.b, "items");
      this.f = $$0.a(mv.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      fwb.b $$1 = new fwb.b();
      fwb.a $$2 = new fwb.a();
      fwb.c $$3 = new fwb.c();
      new fvx($$2, $$1, $$3).a();
      new fvz($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<fwe> {
      private final Map<dpz, fwe> a = new HashMap<>();

      public void a(fwe $$0) {
         dpz $$1 = $$0.a();
         fwe $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jl.c<dpz>> $$0 = mm.e.c().filter($$0x -> true);
         List<ame> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mr $$0, mv.a $$1) {
         Map<dpz, gza> $$2 = Maps.transformValues(this.a, fwe::b);
         Function<dpz, Path> $$3 = $$1x -> $$1.a($$1x.p().h().a());
         return mt.a($$0, gza.a, $$3, $$2);
      }
   }

   static class b implements fwa {
      private final Map<dcr, hoa> a = new HashMap<>();
      private final Map<dcr, dcr> b = new HashMap<>();

      @Override
      public void a(dcr $$0, hoe.b $$1) {
         this.a($$0, new hoa($$1, hoa.a.a));
      }

      private void a(dcr $$0, hoa $$1) {
         hoa $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(dcr $$0, dcr $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mm.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof dbd $$1 && !this.a.containsKey($$1)) {
                  ame $$2 = fwo.a($$1.c());
                  this.a($$1, fwm.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hoa $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<ame> $$0 = mm.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mr $$0, mv.a $$1) {
         return mt.a($$0, hoa.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<ame, fwn> {
      private final Map<ame, fwn> a = new HashMap<>();

      public void a(ame $$0, fwn $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mr $$0, mv.a $$1) {
         return mt.a($$0, Supplier::get, $$1::a, this.a);
      }
   }
}
