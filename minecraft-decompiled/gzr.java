import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gzr implements gzc {
   private final gzr.b a;
   private final eeb b;
   @Nullable
   private List<gzc> c;

   gzr(gzr.b $$0, eeb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public hrs a() {
      return this.a.b;
   }

   @Override
   public void a(bck $$0, List<gzb> $$1) {
      if (this.c == null) {
         this.c = this.a.a(this.b);
      }

      long $$2 = $$0.g();

      for (gzc $$3 : this.c) {
         $$0.b($$2);
         $$3.a($$0, $$1);
      }
   }

   public record a<T>(Predicate<eeb> a, T b) {

      public <S> gzr.a<S> a(S $$0) {
         return new gzr.a<>(this.a, $$0);
      }
   }

   static final class b {
      private final List<gzr.a<gzc>> a;
      final hrs b;
      private final Map<BitSet, List<gzc>> c = new ConcurrentHashMap<>();

      private static gzc a(List<gzr.a<gzc>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Model must have at least one selector");
         } else {
            return $$0.getFirst().b();
         }
      }

      public b(List<gzr.a<gzc>> $$0) {
         this.a = $$0;
         gzc $$1 = a($$0);
         this.b = $$1.a();
      }

      public List<gzc> a(eeb $$0) {
         BitSet $$1 = new BitSet();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.set($$2);
            }
         }

         return this.c.computeIfAbsent($$1, $$0x -> {
            Builder<gzc> $$1x = ImmutableList.builder();

            for (int $$2x = 0; $$2x < this.a.size(); $$2x++) {
               if ($$0x.get($$2x)) {
                  $$1x.add(this.a.get($$2x).b);
               }
            }

            return $$1x.build();
         });
      }
   }

   public static class c implements gzc.c {
      final List<gzr.a<gzc.b>> a;
      private final huc.a<gzr.b> b = new huc.a<gzr.b>() {
         public gzr.b a(huc $$0) {
            Builder<gzr.a<gzc>> $$1 = ImmutableList.builderWithExpectedSize(c.this.a.size());

            for (gzr.a<gzc.b> $$2 : c.this.a) {
               $$1.add($$2.a($$2.b.a($$0)));
            }

            return new gzr.b($$1.build());
         }
      };

      public c(List<gzr.a<gzc.b>> $$0) {
         this.a = $$0;
      }

      @Override
      public Object a(eeb $$0) {
         IntList $$1 = new IntArrayList();

         for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
            if (this.a.get($$2).a.test($$0)) {
               $$1.add($$2);
            }
         }

         record a(gzr.c a, IntList b) {
         }

         return new a(this, $$1);
      }

      @Override
      public void a(huk.a $$0) {
         this.a.forEach($$1 -> $$1.b.a($$0));
      }

      @Override
      public gzc a(eeb $$0, huc $$1) {
         gzr.b $$2 = $$1.a(this.b);
         return new gzr($$2, $$0);
      }
   }
}
