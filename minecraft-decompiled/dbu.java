import com.google.common.collect.Maps;
import java.util.Map;

public class dbu extends dcr implements ddx {
   private static final Map<dbt, dbu> a = Maps.newEnumMap(dbt.class);
   private final dbt b;

   public dbu(dbt $$0, dcr.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bxj a(dcv $$0, cut $$1, cam $$2, bxi $$3) {
      if ($$2 instanceof cpd $$4 && $$4.bO() && !$$4.t() && $$4.n() != this.b) {
         $$4.ai().a($$1, $$4, ayz.it, aza.h, 1.0F, 1.0F);
         if (!$$1.ai().C) {
            $$4.a(this.b);
            $$0.h(1);
         }

         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   public dbt a() {
      return this.b;
   }

   public static dbu a(dbt $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dmu $$0, ecn $$1, boolean $$2, cut $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aA_(), ayz.it, aza.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
