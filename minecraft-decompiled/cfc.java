import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cfc {
   public static cce<cau> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cfq.a(
         (Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$3 -> $$3.group($$3.c(cjo.p), $$3.c(cjo.n), $$3.a(cjo.o))
            .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
               if ($$5x.b_($$6.dx()).a(azu.a)) {
                  return false;
               } else if ($$7 < $$2.getValue()) {
                  $$2.setValue($$7 + 20L + 2L);
                  return true;
               } else {
                  jb $$8 = null;
                  jb $$9 = null;
                  jb $$10 = $$6.dx();

                  for (jb $$12 : jb.a($$10, $$0, $$0, $$0)) {
                     if ($$12.u() != $$10.u() || $$12.w() != $$10.w()) {
                        eeb $$13 = $$6.ai().a_($$12.d());
                        eeb $$14 = $$6.ai().a_($$12);
                        if ($$14.a(dqb.J)) {
                           if ($$13.l()) {
                              $$8 = $$12.j();
                              break;
                           }

                           if ($$9 == null && !$$12.a($$6.dv(), 1.5)) {
                              $$9 = $$12.j();
                           }
                        }
                     }
                  }

                  if ($$8 == null) {
                     $$8 = $$9;
                  }

                  if ($$8 != null) {
                     $$5.a(new ccg($$8));
                     $$4.a(new cjr(new ccg($$8), $$1, 0));
                  }

                  $$2.setValue($$7 + 40L);
                  return true;
               }
            }))
      );
   }
}
