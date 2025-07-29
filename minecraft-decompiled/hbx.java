import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class hbx implements hbz.a {
   final fue a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private hbx.a d;

   public hbx(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      double $$5 = ag.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         hwf $$6 = this.a.W();
         if ($$6 != null) {
            this.d = new hbx.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dlz, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.l().d().e * 0.85;

         for (Entry<dlz, String> $$9 : this.d.a.entrySet()) {
            dlz $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               hbz.a($$0, $$1, $$14, ke.a($$10.h, 8), $$8 + $$13, ke.a($$10.i, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dlz, String> a;
      final CompletableFuture<Map<dlz, String>> b;

      a(final hwf $$0, final double $$1, final double $$2) {
         grk $$3 = hbx.this.a.s;
         amd<dmu> $$4 = $$3.aj();
         int $$5 = ke.a($$1);
         int $$6 = ke.a($$2);
         Builder<dlz, String> $$7 = ImmutableMap.builder();
         grg $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dlz $$11 = new dlz($$9, $$10);
               String $$12 = "";
               egi $$13 = $$8.a($$9, $$10, false);
               $$12 = $$12 + "Client: ";
               if ($$13 == null) {
                  $$12 = $$12 + "0n/a\n";
               } else {
                  $$12 = $$12 + ($$13.F() ? " E" : "");
                  $$12 = $$12 + "\n";
               }

               $$7.put($$11, $$12);
            }
         }

         this.a = $$7.build();
         this.b = $$0.a(() -> {
            aub $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dlz, String> $$5x = ImmutableMap.builder();
               aty $$6x = $$4x.n();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dlz $$9x = new dlz($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
