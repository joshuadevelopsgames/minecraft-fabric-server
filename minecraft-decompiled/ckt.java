import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class ckt extends ckv<cuf> {
   private static final int a = 40;

   public ckt() {
      super(40);
   }

   protected void a(aub $$0, cuf $$1) {
      amd<dmu> $$2 = $$0.aj();
      jb $$3 = $$1.dx();
      List<jk> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               jb $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gR().b().a().e().contains($$0.a_($$9).b())) {
                  $$4.add(jk.a($$2, $$9));
               }
            }
         }
      }

      cbm<?> $$10 = $$1.eh();
      if (!$$4.isEmpty()) {
         $$10.a(cjo.f, $$4);
      } else {
         $$10.b(cjo.f);
      }
   }

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.f);
   }
}
