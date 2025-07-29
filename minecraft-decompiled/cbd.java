import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface cbd {
   cbd a = new cbd() {
      @Override
      public dcv a() {
         return dcv.l;
      }

      @Override
      public boolean a(dcv $$0) {
         return false;
      }
   };

   static cbd a(final Supplier<dcv> $$0, final Consumer<dcv> $$1) {
      return new cbd() {
         @Override
         public dcv a() {
            return $$0.get();
         }

         @Override
         public boolean a(dcv $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static cbd a(final bxc $$0, final int $$1, final Predicate<dcv> $$2) {
      return new cbd() {
         @Override
         public dcv a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(dcv $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static cbd a(bxc $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static cbd a(final cam $$0, final bzw $$1, final Predicate<dcv> $$2) {
      return new cbd() {
         @Override
         public dcv a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(dcv $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static cbd a(cam $$0, bzw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   dcv a();

   boolean a(dcv var1);
}
