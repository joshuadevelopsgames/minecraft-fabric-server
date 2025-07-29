import com.google.common.collect.Maps;
import java.util.Map;

public class hdn extends hfl<cmj, hkd, gms> {
   private final Map<cmk.a, glt<gms>> a;

   public hdn(hee.a $$0) {
      super($$0, new gms($$0.a(gqm.Z)), 0.3F);
      this.a = a($$0);
   }

   private static Map<cmk.a, glt<gms>> a(hee.a $$0) {
      return Maps.newEnumMap(
         Map.of(cmk.a.a, new glt<>(new gms($$0.a(gqm.Z)), new gms($$0.a(gqm.aa))), cmk.a.b, new glt<>(new gmu($$0.a(gqm.ac)), new gmu($$0.a(gqm.ad))))
      );
   }

   public void a(hkd $$0, fod $$1, gxn $$2, int $$3) {
      if ($$0.c != null) {
         this.h = this.a.get($$0.c.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ame a(hkd $$0) {
      return $$0.c == null ? hrh.c() : $$0.c.b().b().b();
   }

   public hkd a() {
      return new hkd();
   }

   public void a(cmj $$0, hkd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bcb.h($$2, $$0.co, $$0.ck);
      $$1.b = bcb.h($$2, $$0.cm, $$0.cl);
      $$1.c = $$0.n().a();
   }
}
