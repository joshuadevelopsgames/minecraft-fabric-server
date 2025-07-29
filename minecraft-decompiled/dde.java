import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class dde extends dcr {
   private static final Logger a = LogUtils.getLogger();

   public dde(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      List<amd<dhm<?>>> $$4 = $$3.a(kq.ag, List.of());
      $$3.a(1, $$1);
      if ($$4.isEmpty()) {
         return bxj.d;
      } else {
         if (!$$0.C) {
            dht $$5 = $$0.q().aI();
            List<dhr<?>> $$6 = new ArrayList<>($$4.size());

            for (amd<dhm<?>> $$7 : $$4) {
               Optional<dhr<?>> $$8 = $$5.b($$7);
               if (!$$8.isPresent()) {
                  a.error("Invalid recipe: {}", $$7);
                  return bxj.d;
               }

               $$6.add($$8.get());
            }

            $$1.a($$6);
            $$1.b(azj.c.b(this));
         }

         return bxj.a;
      }
   }
}
