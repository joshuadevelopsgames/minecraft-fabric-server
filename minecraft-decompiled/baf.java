import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.SequencedSet;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class baf<T> {
   private static final Logger a = LogUtils.getLogger();
   final baf.a<T> b;
   private final String c;

   public baf(baf.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ame, List<baf.b>> a(axo $$0) {
      Map<ame, List<baf.b>> $$1 = new HashMap<>();
      alx $$2 = alx.a(this.c);

      for (Entry<ame, List<axm>> $$3 : $$2.b($$0).entrySet()) {
         ame $$4 = $$3.getKey();
         ame $$5 = $$2.b($$4);

         for (axm $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = bcy.a($$7);
               List<baf.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               bad $$10 = (bad)bad.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new baf.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<baf.b>, List<T>> a(bac.a<T> $$0, List<baf.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<baf.b> $$3 = new ArrayList<>();

      for (baf.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<ame, List<T>> a(Map<ame, List<baf.b>> $$0) {
      final Map<ame, List<T>> $$1 = new HashMap<>();
      bac.a<T> $$2 = new bac.a<T>() {
         @Nullable
         @Override
         public T a(ame $$0, boolean $$1x) {
            return (T)baf.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(ame $$0) {
            return $$1.get($$0);
         }
      };
      bbe<ame, baf.d> $$3 = new bbe<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new baf.d($$2x)));
      $$3.a(
         ($$2x, $$3x) -> this.a($$2, $$3x.a)
            .ifLeft(
               $$1xx -> a.error(
                  "Couldn't load tag {} as it is missing following references: {}",
                  $$2x,
                  $$1xx.stream().map(Objects::toString).collect(Collectors.joining(", "))
               )
            )
            .ifRight($$2xx -> $$1.put($$2x, $$2xx))
      );
      return $$1;
   }

   public static <T> void a(bag.a $$0, kh<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<jy.a<?>> a(axo $$0, jz $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(axo $$0, kh<T> $$1) {
      amd<? extends jy<T>> $$2 = $$1.g();
      baf<jl<T>> $$3 = new baf<>(baf.a.a($$1), mn.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(bae.a($$2, $$2x), $$3x));
   }

   private static <T> Map<bae<T>, List<jl<T>>> a(amd<? extends jy<T>> $$0, Map<ame, List<jl<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> bae.a($$0, (ame)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<jy.a<T>> a(axo $$0, jy<T> $$1) {
      amd<? extends jy<T>> $$2 = $$1.g();
      baf<jl<T>> $$3 = new baf<>((baf.a<jl<T>>)baf.a.a($$1), mn.d($$2));
      baf.c<T> $$4 = new baf.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jn.b<?>> a(jz.b $$0, List<jy.a<?>> $$1) {
      List<jn.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         jy.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jn.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static jy.a<?> a(List<jy.a<?>> $$0, amd<? extends jy<?>> $$1) {
      for (jy.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(ame var1, boolean var2);

      static <T> baf.a<? extends jl<T>> a(jy<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> baf.a<jl<T>> a(kh<T> $$0) {
         jm<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jm<T>)($$3 ? $$1 : $$0)).a(amd.a($$0.g(), $$2));
      }
   }

   public record b(bac a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public record c<T>(amd<? extends jy<T>> a, Map<bae<T>, List<jl<T>>> b) {
   }

   record d(List<baf.b> a) implements bbe.a<ame> {

      @Override
      public void a(Consumer<ame> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<ame> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
