import java.util.Optional;

public interface drc<T extends Enum<T>> {
   int E_ = 4;

   Optional<eeb> k_(eeb var1);

   float au_();

   default void a_(eeb $$0, aub $$1, jb $$2, bck $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3).ifPresent($$2x -> $$1.c($$2, $$2x));
      }
   }

   T c();

   default Optional<eeb> c(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = this.c().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (jb $$7 : jb.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2) && $$1.a_($$7).b() instanceof drc<?> $$9) {
            Enum<?> $$10 = $$9.c();
            if (this.c().getClass() == $$10.getClass()) {
               int $$11 = $$10.ordinal();
               if ($$11 < $$4) {
                  return Optional.empty();
               }

               if ($$11 > $$4) {
                  $$6++;
               } else {
                  $$5++;
               }
            }
         }
      }

      float $$12 = (float)($$6 + 1) / ($$6 + $$5 + 1);
      float $$13 = $$12 * $$12 * this.au_();
      return $$3.i() < $$13 ? this.k_($$0) : Optional.empty();
   }
}
