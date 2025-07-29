import com.google.common.collect.Maps;
import java.util.Map;

public class hfu extends hfl<cna, hma, gok> {
   private final Map<cnb.a, glt<gok>> a;

   public hfu(hee.a $$0) {
      super($$0, new gok($$0.a(gqm.cj)), 0.7F);
      this.a = a($$0);
      this.a(new hix<>(this, $$0.h(), htz.d.g, $$0x -> $$0x.a, new gok($$0.a(gqm.cw)), new gok($$0.a(gqm.cv))));
   }

   private static Map<cnb.a, glt<gok>> a(hee.a $$0) {
      return Maps.newEnumMap(
         Map.of(cnb.a.a, new glt<>(new gok($$0.a(gqm.cj)), new gok($$0.a(gqm.cu))), cnb.a.b, new glt<>(new gmw($$0.a(gqm.ag)), new gmw($$0.a(gqm.ah))))
      );
   }

   public void a(hma $$0, fod $$1, gxn $$2, int $$3) {
      if ($$0.b != null) {
         this.h = this.a.get($$0.b.b().a()).a($$0.am);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ame a(hma $$0) {
      return $$0.b == null ? hrh.c() : $$0.b.b().b().b();
   }

   public hma b() {
      return new hma();
   }

   public void a(cna $$0, hma $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bzw.h).v();
      $$1.b = $$0.n().a();
   }
}
