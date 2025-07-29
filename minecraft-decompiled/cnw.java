import com.google.common.collect.ImmutableMap;

public class cnw extends ccd<cnu> {
   public cnw() {
      super(ImmutableMap.of(cjo.O, cjp.a, cjo.z, cjp.a), 200);
   }

   protected boolean a(aub $$0, cnu $$1) {
      return $$1.bm();
   }

   protected boolean a(aub $$0, cnu $$1, long $$2) {
      return $$1.bm() && $$1.eh().a(cjo.O);
   }

   protected void b(aub $$0, cnu $$1, long $$2) {
      cbm<cnu> $$3 = $$1.eh();
      $$3.b(cjo.n);
      $$3.b(cjo.o);
      $$1.a(new byq(bys.j, 200, 0));
   }
}
