import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dba extends dcr {
   protected static final Map<dpz, dpz> a = new Builder()
      .put(dqb.at, dqb.aB)
      .put(dqb.X, dqb.aq)
      .put(dqb.az, dqb.aH)
      .put(dqb.ad, dqb.ao)
      .put(dqb.u, dqb.aI)
      .put(dqb.ae, dqb.ap)
      .put(dqb.ax, dqb.aF)
      .put(dqb.ab, dqb.am)
      .put(dqb.ay, dqb.aG)
      .put(dqb.ac, dqb.an)
      .put(dqb.av, dqb.aD)
      .put(dqb.Z, dqb.ak)
      .put(dqb.aw, dqb.aE)
      .put(dqb.aa, dqb.al)
      .put(dqb.au, dqb.aC)
      .put(dqb.Y, dqb.aj)
      .put(dqb.oQ, dqb.oR)
      .put(dqb.oS, dqb.oT)
      .put(dqb.oZ, dqb.pa)
      .put(dqb.pb, dqb.pc)
      .put(dqb.aA, dqb.aJ)
      .put(dqb.af, dqb.ar)
      .put(dqb.ai, dqb.as)
      .build();

   public dba(dej $$0, float $$1, float $$2, dcr.a $$3) {
      super($$3.b($$0, $$1, $$2));
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      cut $$3 = $$0.o();
      if (b($$0)) {
         return bxj.e;
      } else {
         Optional<eeb> $$4 = this.a($$1, $$2, $$3, $$1.a_($$2));
         if ($$4.isEmpty()) {
            return bxj.e;
         } else {
            dcv $$5 = $$0.n();
            if ($$3 instanceof auc) {
               aq.N.a((auc)$$3, $$2, $$5);
            }

            $$1.a($$2, $$4.get(), 11);
            $$1.a(ejb.c, $$2, ejb.a.a($$3, $$4.get()));
            if ($$3 != null) {
               $$5.a(1, $$3, cam.d($$0.p()));
            }

            return bxj.a;
         }
      }
   }

   private static boolean b(dgq $$0) {
      cut $$1 = $$0.o();
      return $$0.p().equals(bxi.a) && $$1.fi().c(kq.I) && !$$1.gh();
   }

   private Optional<eeb> a(dmu $$0, jb $$1, @Nullable cut $$2, eeb $$3) {
      Optional<eeb> $$4 = this.a($$3);
      if ($$4.isPresent()) {
         $$0.a($$2, $$1, ayz.aH, aza.e, 1.0F, 1.0F);
         return $$4;
      } else {
         Optional<eeb> $$5 = dzv.b($$3);
         if ($$5.isPresent()) {
            $$0.a($$2, $$1, ayz.aI, aza.e, 1.0F, 1.0F);
            $$0.a($$2, 3005, $$1, 0);
            return $$5;
         } else {
            Optional<eeb> $$6 = Optional.ofNullable((dpz)dcm.b.get().get($$3.b())).map($$1x -> $$1x.m($$3));
            if ($$6.isPresent()) {
               $$0.a($$2, $$1, ayz.aJ, aza.e, 1.0F, 1.0F);
               $$0.a($$2, 3004, $$1, 0);
               return $$6;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Optional<eeb> a(eeb $$0) {
      return Optional.ofNullable(a.get($$0.b())).map($$1 -> $$1.m().b(dwt.d, $$0.c(dwt.d)));
   }
}
