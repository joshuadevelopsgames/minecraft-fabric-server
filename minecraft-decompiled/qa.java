import com.google.common.collect.Maps;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class qa<T> implements mt {
   protected final mv.a e;
   private final CompletableFuture<jn.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qa.b<T>> h;
   protected final amd<? extends jy<T>> f;
   private final Map<ame, bab> i = Maps.newLinkedHashMap();

   protected qa(mv $$0, amd<? extends jy<T>> $$1, CompletableFuture<jn.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qa.b.empty()));
   }

   protected qa(mv $$0, amd<? extends jy<T>> $$1, CompletableFuture<jn.a> $$2, CompletableFuture<qa.b<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jn.a var1);

   @Override
   public CompletableFuture<?> a(mr $$0) {
      record a<T>(jn.a a, qa.b<T> b) {
      }

      return this.c()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qa.b<T>)$$1), ag.h())
         .thenCompose(
            $$1 -> {
               jn.b<T> $$2 = $$1.a.e(this.f);
               Predicate<ame> $$3 = $$1x -> $$2.a(amd.a(this.f, $$1x)).isPresent();
               Predicate<ame> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(bae.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ame $$5 = (ame)$$4x.getKey();
                           bab $$6 = (bab)$$4x.getValue();
                           List<bac> $$7 = $$6.b();
                           List<bac> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
                           if (!$$8.isEmpty()) {
                              throw new IllegalArgumentException(
                                 String.format(
                                    Locale.ROOT,
                                    "Couldn't define tag %s as it is missing following references: %s",
                                    $$5,
                                    $$8.stream().map(Objects::toString).collect(Collectors.joining(","))
                                 )
                              );
                           } else {
                              Path $$9 = this.e.a($$5);
                              return mt.a($$0, $$1.a, bad.a, new bad($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected bab b(bae<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> bab.a());
   }

   public CompletableFuture<qa.b<T>> b() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jn.a> c() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jn.a)$$0;
      });
   }

   @FunctionalInterface
   public interface b<T> extends Function<bae<T>, Optional<bab>> {
      static <T> qa.b<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(bae<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
