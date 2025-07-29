import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class bag {
   public static Map<amd<? extends jy<?>>, bag.a> a(js<amn> $$0) {
      return kc.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((bag.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> bag.a a(jy<T> $$0) {
      Map<ame, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jl<T> $$4 : $$2) {
            if ($$4.f() != jl.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new bag.a($$1);
   }

   static <T> baf.c<T> a(jy<T> $$0, bag.a $$1) {
      amd<? extends jy<T>> $$2 = $$0.g();
      Map<bae<T>, List<jl<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         bae<T> $$5 = bae.a($$2, $$3x);
         List<jl<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new baf.c<>($$2, $$3);
   }

   public static final class a {
      public static final bag.a a = new bag.a(Map.of());
      final Map<ame, IntList> b;

      a(Map<ame, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wg $$0) {
         $$0.a(this.b, wg::a, wg::a);
      }

      public static bag.a b(wg $$0) {
         return new bag.a($$0.a(wg::q, wg::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> baf.c<T> a(jy<T> $$0) {
         return bag.a($$0, this);
      }
   }
}
