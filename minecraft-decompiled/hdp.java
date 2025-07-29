import com.google.common.collect.Maps;
import java.util.Map;

public class hdp extends hfl<cmn, hke, gmx> {
   private final Map<cmo.a, glt<gmx>> a;

   public hdp(hee.a $$0) {
      super($$0, new gmx($$0.a(gqm.an)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cmo.a, glt<gmx>> a(hee.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cmo.a.a,
            new glt<>(new gmx($$0.a(gqm.an)), new gmx($$0.a(gqm.ao))),
            cmo.a.c,
            new glt<>(new gmx($$0.a(gqm.dW)), new gmx($$0.a(gqm.dX))),
            cmo.a.b,
            new glt<>(new gmx($$0.a(gqm.ae)), new gmx($$0.a(gqm.af)))
         )
      );
   }

   public ame a(hke $$0) {
      return $$0.a == null ? hrh.c() : $$0.a.b().b().b();
   }

   public hke a() {
      return new hke();
   }

   public void a(cmn $$0, hke $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n().a();
   }

   public void a(hke $$0, fod $$1, gxn $$2, int $$3) {
      if ($$0.a != null) {
         this.h = this.a.get($$0.a.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
