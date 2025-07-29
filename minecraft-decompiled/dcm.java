import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class dcm extends dcr implements ddx {
   public static final Supplier<BiMap<dpz, dpz>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
         .put(dqb.rF, dqb.sf)
         .put(dqb.rG, dqb.sh)
         .put(dqb.rH, dqb.sg)
         .put(dqb.rI, dqb.si)
         .put(dqb.rO, dqb.sm)
         .put(dqb.rN, dqb.sl)
         .put(dqb.rM, dqb.sk)
         .put(dqb.rL, dqb.sj)
         .put(dqb.se, dqb.su)
         .put(dqb.sd, dqb.st)
         .put(dqb.sc, dqb.ss)
         .put(dqb.sb, dqb.sr)
         .put(dqb.sa, dqb.sq)
         .put(dqb.rZ, dqb.sp)
         .put(dqb.rY, dqb.so)
         .put(dqb.rX, dqb.sn)
         .put(dqb.rS, dqb.rW)
         .put(dqb.rR, dqb.rV)
         .put(dqb.rQ, dqb.rU)
         .put(dqb.rP, dqb.rT)
         .put(dqb.sv, dqb.sz)
         .put(dqb.sw, dqb.sA)
         .put(dqb.sy, dqb.sC)
         .put(dqb.sx, dqb.sB)
         .put(dqb.sD, dqb.sH)
         .put(dqb.sE, dqb.sI)
         .put(dqb.sG, dqb.sK)
         .put(dqb.sF, dqb.sJ)
         .put(dqb.sL, dqb.sP)
         .put(dqb.sM, dqb.sQ)
         .put(dqb.sN, dqb.sR)
         .put(dqb.sO, dqb.sS)
         .put(dqb.sT, dqb.sX)
         .put(dqb.sU, dqb.sY)
         .put(dqb.sV, dqb.sZ)
         .put(dqb.sW, dqb.ta)
         .build()
   );
   public static final Supplier<BiMap<dpz, dpz>> b = Suppliers.memoize(() -> a.get().inverse());

   public dcm(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      return a($$3).map($$3x -> {
         cut $$4 = $$0.o();
         dcv $$5 = $$0.n();
         if ($$4 instanceof auc $$6) {
            aq.N.a($$6, $$2, $$5);
         }

         $$5.h(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(ejb.c, $$2, ejb.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return bxj.a;
      }).orElse(bxj.e);
   }

   public static Optional<eeb> a(eeb $$0) {
      return Optional.ofNullable((dpz)a.get().get($$0.b())).map($$1 -> ((dpz)$$1).m($$0));
   }

   @Override
   public boolean a(dmu $$0, ecn $$1, boolean $$2, cut $$3) {
      if ($$1.b(true)) {
         $$0.a(null, 3003, $$1.aA_(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(eco $$0, cut $$1) {
      return true;
   }
}
