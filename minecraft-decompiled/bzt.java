import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bzt {
   public static final Predicate<bzm> a = bzm::bO;
   public static final Predicate<bzm> b = $$0 -> $$0.bO() && $$0 instanceof cam;
   public static final Predicate<bzm> c = $$0 -> $$0.bO() && !$$0.cd() && !$$0.cc();
   public static final Predicate<bzm> d = $$0 -> $$0 instanceof bxc && $$0.bO();
   public static final Predicate<bzm> e = $$0 -> !($$0 instanceof cut $$1 && ($$0.am() || $$1.gI()));
   public static final Predicate<bzm> f = $$0 -> !$$0.am();
   public static final Predicate<bzm> g = f.and($$0 -> $$0.j(null));
   public static final Predicate<bzm> h = f.and(bzm::bK);

   private bzt() {
   }

   public static Predicate<bzm> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bzm> a(bzm $$0) {
      fjz $$1 = $$0.cu();
      fjz.a $$2 = $$1 == null ? fjz.a.a : $$1.m();
      return (Predicate<bzm>)($$2 == fjz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bL()) {
            return false;
         } else if (!$$0.ai().C || $$3 instanceof cut $$4 && $$4.gq()) {
            fjz $$5 = $$3.cu();
            fjz.a $$6 = $$5 == null ? fjz.a.a : $$5.m();
            if ($$6 == fjz.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fjz.a.d || $$6 == fjz.a.d) && $$7 ? false : $$2 != fjz.a.c && $$6 != fjz.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bzm> b(bzm $$0) {
      return $$1 -> {
         while ($$1.cc()) {
            $$1 = $$1.dm();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
