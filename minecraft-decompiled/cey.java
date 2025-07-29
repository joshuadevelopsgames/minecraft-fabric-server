import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cey extends ccd<cuf> {
   private Set<dcr> c = ImmutableSet.of();

   public cey() {
      super(ImmutableMap.of(cjo.r, cjp.a, cjo.h, cjp.a));
   }

   protected boolean a(aub $$0, cuf $$1) {
      return ccf.a($$1.eh(), cjo.r, bzv.bF);
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      cuf $$3 = (cuf)$$1.eh().c(cjo.r).get();
      ccf.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      cuf $$3 = (cuf)$$1.eh().c(cjo.r).get();
      if (!($$1.g($$3) > 5.0)) {
         ccf.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gR().b().a(cui.g);
         if ($$1.gZ() && ($$4 || $$3.ha())) {
            a($$1, cuf.cn.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(dcz.qB) > dcz.qB.g() / 2) {
            a($$1, ImmutableSet.of(dcz.qB), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aub $$0, cuf $$1, long $$2) {
      $$1.eh().b(cjo.r);
   }

   private static Set<dcr> a(cuf $$0, cuf $$1) {
      ImmutableSet<dcr> $$2 = $$1.gR().b().a().d();
      ImmutableSet<dcr> $$3 = $$0.gR().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cuf $$0, Set<dcr> $$1, cam $$2) {
      bxr $$3 = $$0.n();
      dcv $$4 = dcv.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         dcv $$6;
         dcr $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.k() / 2) {
                     $$8 = $$6.M() / 2;
                     break label28;
                  }

                  if ($$6.M() > 24) {
                     $$8 = $$6.M() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new dcv($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         ccf.a($$0, $$4, $$2.dv());
      }
   }
}
