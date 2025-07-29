import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class cdb {
   private static final int a = 20;
   private static final double b = 3.0;
   private static final double c = 2.0;

   public static cce<cam> a() {
      MutableObject<fax> $$0 = new MutableObject(null);
      MutableInt $$1 = new MutableInt(0);
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2 -> $$2.group($$2.b(cjo.u), $$2.a(cjo.w), $$2.a(cjo.g))
            .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
               faz $$9 = $$2.b($$3);
               Optional<Set<jk>> $$10 = $$2.a($$4);
               if (!$$9.b() && !$$9.c()) {
                  if (Objects.equals($$0.getValue(), $$9.h())) {
                     $$1.setValue(20);
                  } else if ($$1.decrementAndGet() > 0) {
                     return false;
                  }

                  $$0.setValue($$9.h());
                  fax $$11 = $$9.i();
                  fax $$12 = $$9.h();
                  jb $$13 = $$11.a();
                  eeb $$14 = $$6.a_($$13);
                  if ($$14.a(azo.ak, $$0xxxx -> $$0xxxx.b() instanceof dsg)) {
                     dsg $$15 = (dsg)$$14.b();
                     if (!$$15.n($$14)) {
                        $$15.a($$7, $$6, $$14, $$13, true);
                     }

                     $$10 = a($$4, $$10, $$6, $$13);
                  }

                  jb $$16 = $$12.a();
                  eeb $$17 = $$6.a_($$16);
                  if ($$17.a(azo.ak, $$0xxxx -> $$0xxxx.b() instanceof dsg)) {
                     dsg $$18 = (dsg)$$17.b();
                     if (!$$18.n($$17)) {
                        $$18.a($$7, $$6, $$17, $$16, true);
                        $$10 = a($$4, $$10, $$6, $$16);
                     }
                  }

                  $$10.ifPresent($$6x -> a($$6, $$7, $$11, $$12, $$6x, $$2.a($$5)));
                  return true;
               } else {
                  return false;
               }
            }))
      );
   }

   public static void a(aub $$0, cam $$1, @Nullable fax $$2, @Nullable fax $$3, Set<jk> $$4, Optional<List<cam>> $$5) {
      Iterator<jk> $$6 = $$4.iterator();

      while ($$6.hasNext()) {
         jk $$7 = $$6.next();
         jb $$8 = $$7.b();
         if (($$2 == null || !$$2.a().equals($$8)) && ($$3 == null || !$$3.a().equals($$8))) {
            if (a($$0, $$1, $$7)) {
               $$6.remove();
            } else {
               eeb $$9 = $$0.a_($$8);
               if (!$$9.a(azo.ak, $$0x -> $$0x.b() instanceof dsg)) {
                  $$6.remove();
               } else {
                  dsg $$10 = (dsg)$$9.b();
                  if (!$$10.n($$9)) {
                     $$6.remove();
                  } else if (a($$1, $$8, $$5)) {
                     $$6.remove();
                  } else {
                     $$10.a($$1, $$0, $$9, $$8, false);
                     $$6.remove();
                  }
               }
            }
         }
      }
   }

   private static boolean a(cam $$0, jb $$1, Optional<List<cam>> $$2) {
      return $$2.isEmpty()
         ? false
         : $$2.get().stream().filter($$1x -> $$1x.ap() == $$0.ap()).filter($$1x -> $$1.a($$1x.dv(), 2.0)).anyMatch($$1x -> a($$1x.eh(), $$1));
   }

   private static boolean a(cbm<?> $$0, jb $$1) {
      if (!$$0.a(cjo.u)) {
         return false;
      } else {
         faz $$2 = $$0.c(cjo.u).get();
         if ($$2.c()) {
            return false;
         } else {
            fax $$3 = $$2.i();
            if ($$3 == null) {
               return false;
            } else {
               fax $$4 = $$2.h();
               return $$1.equals($$3.a()) || $$1.equals($$4.a());
            }
         }
      }
   }

   private static boolean a(aub $$0, cam $$1, jk $$2) {
      return $$2.a() != $$0.aj() || !$$2.b().a($$1.dv(), 3.0);
   }

   private static Optional<Set<jk>> a(cfr<Mu, Set<jk>> $$0, Optional<Set<jk>> $$1, aub $$2, jb $$3) {
      jk $$4 = jk.a($$2.aj(), $$3);
      return Optional.of($$1.<Set<jk>>map($$1x -> {
         $$1x.add($$4);
         return $$1x;
      }).orElseGet(() -> {
         Set<jk> $$2x = Sets.newHashSet(new jk[]{$$4});
         $$0.a($$2x);
         return $$2x;
      }));
   }
}
