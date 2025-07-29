import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class fvg {
   public static final dbt[] a = new dbt[]{dbt.a, dbt.i, dbt.d, dbt.l, dbt.j, dbt.n, dbt.f, dbt.e, dbt.b, dbt.g, dbt.o, dbt.c};

   public static int a(fvg.a $$0, float $$1) {
      int $$2 = bcb.d($$1);
      int $$3 = $$2 / $$0.c;
      int $$4 = $$0.e.length;
      int $$5 = $$3 % $$4;
      int $$6 = ($$3 + 1) % $$4;
      float $$7 = ($$2 % $$0.c + bcb.i($$1)) / $$0.c;
      int $$8 = $$0.a($$0.e[$$5]);
      int $$9 = $$0.a($$0.e[$$6]);
      return baj.a($$7, $$8, $$9);
   }

   static int a(dbt $$0, float $$1) {
      if ($$0 == dbt.a) {
         return -1644826;
      } else {
         int $$2 = $$0.d();
         return baj.a(255, bcb.d(baj.b($$2) * $$1), bcb.d(baj.c($$2) * $$1), bcb.d(baj.d($$2) * $$1));
      }
   }

   public static enum a {
      a(25, dbt.values(), 0.75F),
      b(30, fvg.a, 1.25F);

      final int c;
      private final Map<dbt, Integer> d;
      final dbt[] e;

      private a(final int $$0, final dbt[] $$1, final float $$2) {
         this.c = $$0;
         this.d = Maps.newHashMap(Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$1x -> fvg.a($$1x, $$2))));
         this.e = $$1;
      }

      public final int a(dbt $$0) {
         return this.d.get($$0);
      }
   }
}
