import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cki extends ckv<ctc> {
   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.h, cjo.ax, cjo.ar, cjo.aq, cjo.at, cjo.au, new cjo[0]);
   }

   protected void a(aub $$0, ctc $$1) {
      cbm<?> $$2 = $$1.eh();
      $$2.a(cjo.ax, this.b($$0, $$1));
      Optional<cti> $$3 = Optional.empty();
      int $$4 = 0;
      List<ctc> $$5 = Lists.newArrayList();
      cjq $$6 = $$2.c(cjo.h).orElse(cjq.a());

      for (cam $$7 : $$6.b($$0x -> !$$0x.g_() && ($$0x instanceof cti || $$0x instanceof ctc))) {
         if ($$7 instanceof cti $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof ctc $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cjo.ar, $$3);
      $$2.a(cjo.aq, $$5);
      $$2.a(cjo.at, $$4);
      $$2.a(cjo.au, $$5.size());
   }

   private Optional<jb> b(aub $$0, ctc $$1) {
      return jb.a($$1.dx(), 8, 4, $$1x -> $$0.a_($$1x).a(azo.aX));
   }
}
