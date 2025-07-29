import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ckr extends ckv<cam> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.h, cjo.g, cjo.N, cjo.an, cjo.av, cjo.al, new cjo[]{cjo.am, cjo.ap, cjo.ao, cjo.at, cjo.au, cjo.ax});
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      cbm<?> $$2 = $$1.eh();
      $$2.a(cjo.ax, c($$0, $$1));
      Optional<cao> $$3 = Optional.empty();
      Optional<ctc> $$4 = Optional.empty();
      Optional<ctc> $$5 = Optional.empty();
      Optional<cti> $$6 = Optional.empty();
      Optional<cam> $$7 = Optional.empty();
      Optional<cut> $$8 = Optional.empty();
      Optional<cut> $$9 = Optional.empty();
      int $$10 = 0;
      List<cth> $$11 = Lists.newArrayList();
      List<cth> $$12 = Lists.newArrayList();
      cjq $$13 = $$2.c(cjo.h).orElse(cjq.a());

      for (cam $$14 : $$13.b($$0x -> true)) {
         if ($$14 instanceof ctc $$15) {
            if ($$15.g_() && $$5.isEmpty()) {
               $$5 = Optional.of($$15);
            } else if ($$15.n()) {
               $$10++;
               if ($$4.isEmpty() && $$15.gI()) {
                  $$4 = Optional.of($$15);
               }
            }
         } else if ($$14 instanceof ctl $$16) {
            $$11.add($$16);
         } else if ($$14 instanceof cti $$17) {
            if ($$17.g_() && $$6.isEmpty()) {
               $$6 = Optional.of($$17);
            } else if ($$17.gH()) {
               $$11.add($$17);
            }
         } else if ($$14 instanceof cut $$18) {
            if ($$8.isEmpty() && !ctj.a($$18) && $$1.c($$14)) {
               $$8 = Optional.of($$18);
            }

            if ($$9.isEmpty() && !$$18.am() && ctj.b($$18)) {
               $$9 = Optional.of($$18);
            }
         } else if (!$$3.isEmpty() || !($$14 instanceof csm) && !($$14 instanceof cqm)) {
            if ($$7.isEmpty() && ctj.a($$14.ap())) {
               $$7 = Optional.of($$14);
            }
         } else {
            $$3 = Optional.of((cao)$$14);
         }
      }

      for (cam $$20 : $$2.c(cjo.g).orElse(ImmutableList.of())) {
         if ($$20 instanceof cth $$21 && $$21.gH()) {
            $$12.add($$21);
         }
      }

      $$2.a(cjo.N, $$3);
      $$2.a(cjo.al, $$4);
      $$2.a(cjo.am, $$5);
      $$2.a(cjo.as, $$7);
      $$2.a(cjo.an, $$8);
      $$2.a(cjo.av, $$9);
      $$2.a(cjo.ao, $$12);
      $$2.a(cjo.ap, $$11);
      $$2.a(cjo.at, $$11.size());
      $$2.a(cjo.au, $$10);
   }

   private static Optional<jb> c(aub $$0, cam $$1) {
      return jb.a($$1.dx(), 8, 4, $$1x -> a($$0, $$1x));
   }

   private static boolean a(aub $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      boolean $$3 = $$2.a(azo.ap);
      return $$3 && $$2.a(dqb.oO) ? dqp.h($$2) : $$3;
   }
}
