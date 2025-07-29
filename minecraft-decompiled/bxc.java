import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;

public interface bxc extends bxa, Iterable<dcv> {
   float y_ = 4.0F;

   int b();

   boolean c();

   dcv a(int var1);

   dcv a(int var1, int var2);

   dcv b(int var1);

   void a(int var1, dcv var2);

   default int an_() {
      return 99;
   }

   default int f_(dcv $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cut var1);

   default void e_(cut $$0) {
   }

   default void c(cut $$0) {
   }

   default boolean b(int $$0, dcv $$1) {
      return true;
   }

   default boolean a(bxc $$0, int $$1, dcv $$2) {
      return true;
   }

   default int a_(dcr $$0) {
      int $$1 = 0;

      for (dcv $$2 : this) {
         if ($$2.h().equals($$0)) {
            $$1 += $$2.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<dcr> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<dcv> $$0) {
      for (dcv $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(eaz $$0, cut $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(eaz $$0, cut $$1, float $$2) {
      dmu $$3 = $$0.i();
      jb $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }

   @Override
   default Iterator<dcv> iterator() {
      return new bxc.a(this);
   }

   public static class a implements Iterator<dcv> {
      private final bxc a;
      private int b;
      private final int c;

      public a(bxc $$0) {
         this.a = $$0;
         this.c = $$0.b();
      }

      @Override
      public boolean hasNext() {
         return this.b < this.c;
      }

      public dcv a() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            return this.a.a(this.b++);
         }
      }
   }
}
