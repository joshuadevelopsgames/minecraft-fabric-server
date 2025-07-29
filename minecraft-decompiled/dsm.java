import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.slf4j.Logger;

public class dsm extends dsf {
   private static final Logger f = LogUtils.getLogger();
   public static final MapCodec<dsm> e = b(dsm::new);
   private static final ln g = new lm();

   @Override
   public MapCodec<dsm> a() {
      return e;
   }

   public dsm(eea.d $$0) {
      super($$0);
   }

   @Override
   protected ln a(dmu $$0, dcv $$1) {
      return g;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebv($$0, $$1);
   }

   @Override
   protected void a(aub $$0, eeb $$1, jb $$2) {
      ebu $$3 = $$0.a($$2, ebb.g).orElse(null);
      if ($$3 == null) {
         f.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", $$2);
      } else {
         lk $$4 = new lk($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
         } else {
            dcv $$6 = $$3.a($$5);
            if (!$$6.f()) {
               jh $$7 = $$0.a_($$2).c(b);
               bxc $$8 = ecc.a($$0, $$2.a($$7));
               dcv $$9;
               if ($$8 == null) {
                  $$9 = g.dispense($$4, $$6);
               } else {
                  $$9 = ecc.a($$3, $$8, $$6.c(1), $$7.g());
                  if ($$9.f()) {
                     $$9 = $$6.v();
                     $$9.h(1);
                  } else {
                     $$9 = $$6.v();
                  }
               }

               $$3.a($$5, $$9);
            }
         }
      }
   }
}
