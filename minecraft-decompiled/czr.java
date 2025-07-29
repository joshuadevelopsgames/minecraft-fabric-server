import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class czr {
   private final List<czr.b> a;
   private final czr.b b;

   czr(List<czr.b> $$0, czr.b $$1) {
      if (!$$0.isEmpty() && !$$1.equals(czr.b.e)) {
         this.a = $$0;
         this.b = $$1;
      } else {
         throw new IllegalArgumentException("Need to define both inputSlots and resultSlot");
      }
   }

   public static czr.a a() {
      return new czr.a();
   }

   public czr.b a(int $$0) {
      return this.a.get($$0);
   }

   public czr.b b() {
      return this.b;
   }

   public List<czr.b> c() {
      return this.a;
   }

   public int d() {
      return this.a.size();
   }

   public int e() {
      return this.d();
   }

   public static class a {
      private final List<czr.b> a = new ArrayList<>();
      private czr.b b = czr.b.e;

      public czr.a a(int $$0, int $$1, int $$2, Predicate<dcv> $$3) {
         this.a.add(new czr.b($$0, $$1, $$2, $$3));
         return this;
      }

      public czr.a a(int $$0, int $$1, int $$2) {
         this.b = new czr.b($$0, $$1, $$2, $$0x -> false);
         return this;
      }

      public czr a() {
         int $$0 = this.a.size();

         for (int $$1 = 0; $$1 < $$0; $$1++) {
            czr.b $$2 = this.a.get($$1);
            if ($$2.a != $$1) {
               throw new IllegalArgumentException("Expected input slots to have continous indexes");
            }
         }

         if (this.b.a != $$0) {
            throw new IllegalArgumentException("Expected result slot index to follow last input slot");
         } else {
            return new czr(this.a, this.b);
         }
      }
   }

   public record b(int a, int b, int c, Predicate<dcv> d) {
      static final czr.b e = new czr.b(0, 0, 0, $$0 -> true);
   }
}
