import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface dmm {
   List<bzm> a(@Nullable bzm var1, fin var2, Predicate<? super bzm> var3);

   <T extends bzm> List<T> a(ein<bzm, T> var1, fin var2, Predicate<? super T> var3);

   default <T extends bzm> List<T> a(Class<T> $$0, fin $$1, Predicate<? super T> $$2) {
      return this.a(ein.a($$0), $$1, $$2);
   }

   List<? extends cut> A();

   default List<bzm> a_(@Nullable bzm $$0, fin $$1) {
      return this.a($$0, $$1, bzt.f);
   }

   default boolean a(@Nullable bzm $$0, fjm $$1) {
      if ($$1.c()) {
         return true;
      } else {
         for (bzm $$2 : this.a_($$0, $$1.a())) {
            if (!$$2.dU() && $$2.V && ($$0 == null || !$$2.A($$0)) && fjj.c($$1, fjj.a($$2.cV()), fiw.i)) {
               return false;
            }
         }

         return true;
      }
   }

   default <T extends bzm> List<T> a(Class<T> $$0, fin $$1) {
      return this.a($$0, $$1, bzt.f);
   }

   default List<fjm> c(@Nullable bzm $$0, fin $$1) {
      if ($$1.a() < 1.0E-7) {
         return List.of();
      } else {
         Predicate<bzm> $$2 = $$0 == null ? bzt.g : bzt.f.and($$0::i);
         List<bzm> $$3 = this.a($$0, $$1.g(1.0E-7), $$2);
         if ($$3.isEmpty()) {
            return List.of();
         } else {
            Builder<fjm> $$4 = ImmutableList.builderWithExpectedSize($$3.size());

            for (bzm $$5 : $$3) {
               $$4.add(fjj.a($$5.cV()));
            }

            return $$4.build();
         }
      }
   }

   @Nullable
   default cut a(double $$0, double $$1, double $$2, double $$3, @Nullable Predicate<bzm> $$4) {
      double $$5 = -1.0;
      cut $$6 = null;

      for (cut $$7 : this.A()) {
         if ($$4 == null || $$4.test($$7)) {
            double $$8 = $$7.h($$0, $$1, $$2);
            if (($$3 < 0.0 || $$8 < $$3 * $$3) && ($$5 == -1.0 || $$8 < $$5)) {
               $$5 = $$8;
               $$6 = $$7;
            }
         }
      }

      return $$6;
   }

   @Nullable
   default cut a(bzm $$0, double $$1) {
      return this.a($$0.dC(), $$0.dE(), $$0.dI(), $$1, false);
   }

   @Nullable
   default cut a(double $$0, double $$1, double $$2, double $$3, boolean $$4) {
      Predicate<bzm> $$5 = $$4 ? bzt.e : bzt.f;
      return this.a($$0, $$1, $$2, $$3, $$5);
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      for (cut $$4 : this.A()) {
         if (bzt.f.test($$4) && bzt.b.test($$4)) {
            double $$5 = $$4.h($$0, $$1, $$2);
            if ($$3 < 0.0 || $$5 < $$3 * $$3) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   default cut a(UUID $$0) {
      for (int $$1 = 0; $$1 < this.A().size(); $$1++) {
         cut $$2 = this.A().get($$1);
         if ($$0.equals($$2.cK())) {
            return $$2;
         }
      }

      return null;
   }
}
