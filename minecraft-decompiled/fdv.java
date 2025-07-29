import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdv extends fds {
   public static final MapCodec<fdv> a = a(fdv::new);

   fdv(List<fdz> $$0, List<fgs> $$1) {
      super($$0, $$1);
   }

   @Override
   public fea a() {
      return fdx.i;
   }

   @Override
   protected fdr a(List<? extends fdr> $$0) {
      return switch ($$0.size()) {
         case 0 -> d;
         case 1 -> (fdr)$$0.get(0);
         case 2 -> {
            fdr $$1 = $$0.get(0);
            fdr $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
            for (fdr $$3 : $$0) {
               $$3.expand($$1x, $$2x);
            }

            return true;
         };
      };
   }

   public static fdv.a a(fdz.a<?>... $$0) {
      return new fdv.a($$0);
   }

   public static class a extends fdz.a<fdv.a> {
      private final Builder<fdz> a = ImmutableList.builder();

      public a(fdz.a<?>... $$0) {
         for (fdz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fdv.a a() {
         return this;
      }

      @Override
      public fdv.a b(fdz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fdz b() {
         return new fdv(this.a.build(), this.f());
      }
   }
}
