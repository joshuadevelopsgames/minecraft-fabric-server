import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class cdf<E extends cao> extends cdg<E> {
   private final bae<dpz> m;
   private final float n;
   private final List<cdg.a> o = new ArrayList<>();
   private boolean p;

   public cdf(bwu $$0, int $$1, int $$2, float $$3, Function<E, ayy> $$4, bae<dpz> $$5, float $$6, BiPredicate<E, jb> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(aub $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.ec().i() < this.n;
   }

   @Override
   protected Optional<cdg.a> a(aub $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         jb.a $$1 = new jb.a();

         while (!this.h.isEmpty()) {
            Optional<cdg.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               cdg.a $$3 = $$2.get();
               if ($$0.a_($$1.a($$3.a(), jh.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of(this.o.remove(0)) : Optional.empty();
      }
   }
}
