import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kc {
   private static final Set<amd<? extends jy<?>>> a = alz.c.stream().map(alz.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vi> $$0, jz $$1, Set<awv> $$2, BiConsumer<amd<? extends jy<?>>, List<kc.a>> $$3) {
      alz.c.forEach($$4 -> a($$0, (alz.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vi> $$0, alz.d<T> $$1, jz $$2, Set<awv> $$3, BiConsumer<amd<? extends jy<?>>, List<kc.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kc.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(jx::a).filter($$3::contains).isPresent();
                        Optional<vi> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vi $$8 = (vi)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kc.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<jz.d<?>> a(jz $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<jz.d<?>> a(js<amn> $$0) {
      return a($$0.c(amn.b));
   }

   public static Stream<jz.d<?>> b(js<amn> $$0) {
      Stream<jz.d<?>> $$1 = $$0.a(amn.a).a();
      Stream<jz.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(amd<? extends jy<?>> $$0) {
      return a.contains($$0);
   }

   public record a(ame b, Optional<vi> c) {
      public static final zm<ByteBuf, kc.a> a = zm.a(ame.b, kc.a::a, zk.q.a(zk::a), kc.a::b, kc.a::new);

      public ame a() {
         return this.b;
      }

      public Optional<vi> b() {
         return this.c;
      }
   }
}
