import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

public interface edb {
   edb a = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.gI() && !$$2x.am())
      .stream()
      .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bI()))
      .map(bzm::cK)
      .toList();
   edb b = ($$0, $$1, $$2, $$3, $$4) -> $$1.a($$0, $$2x -> $$2x.dx().a($$2, $$3) && !$$2x.am())
      .stream()
      .filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bI()))
      .map(bzm::cK)
      .toList();
   edb c = ($$0, $$1, $$2, $$3, $$4) -> {
      fin $$5 = new fin($$2).g($$3);
      return $$1.a($$0, bzv.bd, $$5, cam::bO).stream().filter($$3x -> !$$4 || a($$0, $$2.b(), $$3x.bI())).map(bzm::cK).toList();
   };

   List<UUID> detect(aub var1, edb.a var2, jb var3, double var4, boolean var6);

   private static boolean a(dmu $$0, fis $$1, fis $$2) {
      fio $$3 = $$0.a(new dmb($$2, $$1, dmb.a.c, dmb.b.a, fix.a()));
      return $$3.b().equals(jb.a((jv)$$1)) || $$3.d() == fiq.a.a;
   }

   public interface a {
      edb.a a = new edb.a() {
         @Override
         public List<auc> a(aub $$0, Predicate<? super cut> $$1) {
            return $$0.a($$1);
         }

         @Override
         public <T extends bzm> List<T> a(aub $$0, ein<bzm, T> $$1, fin $$2, Predicate<? super T> $$3) {
            return $$0.a($$1, $$2, $$3);
         }
      };

      List<? extends cut> a(aub var1, Predicate<? super cut> var2);

      <T extends bzm> List<T> a(aub var1, ein<bzm, T> var2, fin var3, Predicate<? super T> var4);

      static edb.a a(cut $$0) {
         return a(List.of($$0));
      }

      static edb.a a(final List<cut> $$0) {
         return new edb.a() {
            @Override
            public List<cut> a(aub $$0x, Predicate<? super cut> $$1) {
               return $$0.stream().filter($$1).toList();
            }

            @Override
            public <T extends bzm> List<T> a(aub $$0x, ein<bzm, T> $$1, fin $$2, Predicate<? super T> $$3) {
               return $$0.stream().map($$1::a).filter(Objects::nonNull).filter($$3).toList();
            }
         };
      }
   }
}
