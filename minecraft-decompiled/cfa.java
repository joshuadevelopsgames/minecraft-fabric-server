import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cfa {
   private static final int a = 60;

   public static cce<cau> a(int $$0, float $$1) {
      MutableLong $$2 = new MutableLong(0L);
      return cfq.a(
         (Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$3 -> $$3.group($$3.c(cjo.p), $$3.c(cjo.n), $$3.a(cjo.o))
            .apply($$3, ($$3x, $$4, $$5) -> ($$5x, $$6, $$7) -> {
               if (!$$5x.b_($$6.dx()).a(azu.a)) {
                  return false;
               } else if ($$7 < $$2.getValue()) {
                  $$2.setValue($$7 + 60L);
                  return true;
               } else {
                  jb $$8 = $$6.dx();
                  jb.a $$9 = new jb.a();
                  fix $$10 = fix.a($$6);

                  for (jb $$11 : jb.a($$8, $$0, $$0, $$0)) {
                     if ($$11.u() != $$8.u() || $$11.w() != $$8.w()) {
                        eeb $$12 = $$5x.a_($$11);
                        eeb $$13 = $$5x.a_($$9.a($$11, jh.a));
                        if (!$$12.a(dqb.J) && $$5x.b_($$11).c() && $$12.b($$5x, $$11, $$10).c() && $$13.c($$5x, $$9, jh.b)) {
                           jb $$14 = $$11.j();
                           $$5.a(new ccg($$14));
                           $$4.a(new cjr(new ccg($$14), $$1, 1));
                           break;
                        }
                     }
                  }

                  $$2.setValue($$7 + 60L);
                  return true;
               }
            }))
      );
   }
}
