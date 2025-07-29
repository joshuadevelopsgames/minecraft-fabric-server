import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdv {
   private static final int a = 10;
   private static final int b = 7;
   private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

   public static cdo<cau> a(float $$0) {
      return a($$0, true);
   }

   public static cdo<cau> a(float $$0, boolean $$1) {
      return a($$0, $$0x -> clj.a($$0x, 10, 7), $$1 ? $$0x -> true : $$0x -> !$$0x.bm());
   }

   public static cce<cau> a(float $$0, int $$1, int $$2) {
      return a($$0, $$2x -> clj.a($$2x, $$1, $$2), $$0x -> true);
   }

   public static cce<cau> b(float $$0) {
      return a($$0, $$0x -> a($$0x, 10, 7), $$0x -> true);
   }

   public static cce<cau> c(float $$0) {
      return a($$0, cdv::a, bzm::bm);
   }

   private static cdo<cau> a(float $$0, Function<cau, fis> $$1, Predicate<cau> $$2) {
      return cfq.a((Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$3 -> $$3.group($$3.c(cjo.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
         if (!$$2.test($$5)) {
            return false;
         } else {
            Optional<fis> $$7 = Optional.ofNullable($$1.apply($$5));
            $$3x.a($$7.map($$1xxxx -> new cjr($$1xxxx, $$0, 0)));
            return true;
         }
      })));
   }

   @Nullable
   private static fis a(cau $$0) {
      fis $$1 = null;
      fis $$2 = null;

      for (int[] $$3 : c) {
         if ($$1 == null) {
            $$2 = ccf.a($$0, $$3[0], $$3[1]);
         } else {
            $$2 = $$0.dv().e($$0.dv().a($$1).d().d($$3[0], $$3[1], $$3[0]));
         }

         if ($$2 == null || $$0.ai().b_(jb.a((jv)$$2)).c()) {
            return $$1;
         }

         $$1 = $$2;
      }

      return $$2;
   }

   @Nullable
   private static fis a(cau $$0, int $$1, int $$2) {
      fis $$3 = $$0.h(0.0F);
      return cle.a($$0, $$1, $$2, -2, $$3.d, $$3.f, (float) (Math.PI / 2));
   }
}
