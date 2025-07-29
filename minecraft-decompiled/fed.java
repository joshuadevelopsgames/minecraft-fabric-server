import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fed extends fds {
   public static final MapCodec<fed> a = a(fed::new);

   fed(List<fdz> $$0, List<fgs> $$1) {
      super($$0, $$1);
   }

   @Override
   public fea a() {
      return fdx.h;
   }

   @Override
   protected fdr a(List<? extends fdr> $$0) {
      return switch ($$0.size()) {
         case 0 -> d;
         case 1 -> (fdr)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
            for (fdr $$3 : $$0) {
               if (!$$3.expand($$1, $$2)) {
                  return false;
               }
            }

            return true;
         };
      };
   }

   public static fed.a a(fdz.a<?>... $$0) {
      return new fed.a($$0);
   }

   public static class a extends fdz.a<fed.a> {
      private final Builder<fdz> a = ImmutableList.builder();

      public a(fdz.a<?>... $$0) {
         for (fdz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fed.a a() {
         return this;
      }

      @Override
      public fed.a c(fdz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fdz b() {
         return new fed(this.a.build(), this.f());
      }
   }
}
