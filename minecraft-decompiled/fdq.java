import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class fdq extends fds {
   public static final MapCodec<fdq> a = a(fdq::new);
   public static final bci.g b = new bci.g() {
      @Override
      public String a() {
         return "Unreachable entry!";
      }
   };

   fdq(List<fdz> $$0, List<fgs> $$1) {
      super($$0, $$1);
   }

   @Override
   public fea a() {
      return fdx.g;
   }

   @Override
   protected fdr a(List<? extends fdr> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fdr)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
            for (fdr $$3 : $$0) {
               if ($$3.expand($$1, $$2)) {
                  return true;
               }
            }

            return false;
         };
      };
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.f.size() - 1; $$1++) {
         if (this.f.get($$1).g.isEmpty()) {
            $$0.a(b);
         }
      }
   }

   public static fdq.a a(fdz.a<?>... $$0) {
      return new fdq.a($$0);
   }

   public static <E> fdq.a a(Collection<E> $$0, Function<E, fdz.a<?>> $$1) {
      return new fdq.a($$0.stream().map($$1::apply).toArray(fdz.a[]::new));
   }

   public static class a extends fdz.a<fdq.a> {
      private final Builder<fdz> a = ImmutableList.builder();

      public a(fdz.a<?>... $$0) {
         for (fdz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fdq.a a() {
         return this;
      }

      @Override
      public fdq.a a(fdz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fdz b() {
         return new fdq(this.a.build(), this.f());
      }
   }
}
