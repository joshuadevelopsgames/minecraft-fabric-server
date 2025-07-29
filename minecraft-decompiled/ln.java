import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface ln {
   Logger a = LogUtils.getLogger();
   ln b = ($$0, $$1) -> $$1;

   dcv dispense(lk var1, dcv var2);

   static void a() {
      dsf.a(dcz.pB);
      dsf.a(dcz.wT);
      dsf.a(dcz.wS);
      dsf.a(dcz.rY);
      dsf.a(dcz.rZ);
      dsf.a(dcz.sa);
      dsf.a(dcz.rJ);
      dsf.a(dcz.vx);
      dsf.a(dcz.wR);
      dsf.a(dcz.wU);
      dsf.a(dcz.vW);
      dsf.a(dcz.vy);
      dsf.a(dcz.vz);
      lm $$0 = new lm() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            jh $$2 = $$0.d().c(dsf.b);
            bzv<?> $$3 = ((dec)$$1.h()).a($$0.b().K_(), $$1);

            try {
               $$3.a($$0.b(), $$1, null, $$0.c().a($$2), bzu.o, $$2 != jh.b, false);
            } catch (Exception var6) {
               a.error("Error while dispensing spawn egg from dispenser at {}", $$0.c(), var6);
               return dcv.l;
            }

            $$1.h(1);
            $$0.b().a(null, ejb.t, $$0.c());
            return $$1;
         }
      };

      for (dec $$1 : dec.a()) {
         dsf.a($$1, $$0);
      }

      dsf.a(dcz.wi, new lm() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            jh $$2 = $$0.d().c(dsf.b);
            jb $$3 = $$0.c().a($$2);
            aub $$4 = $$0.b();
            Consumer<cqo> $$5 = bzv.a($$1x -> $$1x.v($$2.p()), $$4, $$1, null);
            cqo $$6 = bzv.g.a($$4, $$5, $$3, bzu.o, false, false);
            if ($$6 != null) {
               $$1.h(1);
            }

            return $$1;
         }
      });
      dsf.a(dcz.fh, new lq() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            jb $$2 = $$0.c().a($$0.d().c(dsf.b));

            for (cop $$4 : $$0.b().a(cop.class, new fin($$2), $$0x -> $$0x.bO() && !$$0x.n())) {
               if ($$4.gY() && $$4.a_(499).a($$1)) {
                  $$1.h(1);
                  this.a(true);
                  return $$1;
               }
            }

            return super.a($$0, $$1);
         }
      });
      dsf.a(dcz.oV, new ll(bzv.aI));
      dsf.a(dcz.oX, new ll(bzv.br));
      dsf.a(dcz.oZ, new ll(bzv.n));
      dsf.a(dcz.pb, new ll(bzv.av));
      dsf.a(dcz.ph, new ll(bzv.G));
      dsf.a(dcz.pd, new ll(bzv.b));
      dsf.a(dcz.pf, new ll(bzv.x));
      dsf.a(dcz.pl, new ll(bzv.aC));
      dsf.a(dcz.pj, new ll(bzv.aN));
      dsf.a(dcz.pn, new ll(bzv.k));
      dsf.a(dcz.oW, new ll(bzv.aJ));
      dsf.a(dcz.oY, new ll(bzv.bs));
      dsf.a(dcz.pa, new ll(bzv.o));
      dsf.a(dcz.pc, new ll(bzv.aw));
      dsf.a(dcz.pi, new ll(bzv.H));
      dsf.a(dcz.pe, new ll(bzv.c));
      dsf.a(dcz.pg, new ll(bzv.y));
      dsf.a(dcz.pm, new ll(bzv.aD));
      dsf.a(dcz.pk, new ll(bzv.aO));
      dsf.a(dcz.po, new ll(bzv.j));
      ln $$2 = new lm() {
         private final lm c = new lm();

         @Override
         public dcv a(lk $$0, dcv $$1) {
            dbr $$2 = (dbr)$$1.h();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            dmu $$4 = $$0.b();
            if ($$2.a(null, $$4, $$3, null)) {
               $$2.a(null, $$4, $$1, $$3);
               return this.a($$0, $$1, new dcv(dcz.rF));
            } else {
               return this.c.dispense($$0, $$1);
            }
         }
      };
      dsf.a(dcz.rH, $$2);
      dsf.a(dcz.rG, $$2);
      dsf.a(dcz.rI, $$2);
      dsf.a(dcz.rN, $$2);
      dsf.a(dcz.rO, $$2);
      dsf.a(dcz.rM, $$2);
      dsf.a(dcz.rP, $$2);
      dsf.a(dcz.rQ, $$2);
      dsf.a(dcz.rR, $$2);
      dsf.a(dcz.rF, new lm() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            dmv $$2 = $$0.b();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            eeb $$4 = $$2.a_($$3);
            if ($$4.b() instanceof dqh $$6) {
               dcv $$7 = $$6.a(null, $$2, $$3, $$4);
               if ($$7.f()) {
                  return super.a($$0, $$1);
               } else {
                  $$2.a(null, ejb.y, $$3);
                  dcr $$8 = $$7.h();
                  return this.a($$0, $$1, new dcv($$8));
               }
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dsf.a(dcz.px, new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            aub $$2 = $$0.b();
            this.a(true);
            jh $$3 = $$0.d().c(dsf.b);
            jb $$4 = $$0.c().a($$3);
            eeb $$5 = $$2.a_($$4);
            if (dpm.a($$2, $$4, $$3)) {
               $$2.c($$4, dpm.a($$2, $$4));
               $$2.a(null, ejb.i, $$4);
            } else if (dqp.i($$5) || dqq.h($$5) || dqr.h($$5)) {
               $$2.c($$4, $$5.b(eer.u, true));
               $$2.a(null, ejb.c, $$4);
            } else if ($$5.b() instanceof dyx) {
               if (dyx.a($$2, $$4)) {
                  $$2.a($$4, false);
               } else {
                  this.a(false);
               }
            } else {
               this.a(false);
            }

            if (this.b()) {
               $$1.a(1, $$2, null, $$0x -> {});
            }

            return $$1;
         }
      });
      dsf.a(dcz.sX, new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            this.a(true);
            dmu $$2 = $$0.b();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            if (!dbf.a($$1, $$2, $$3) && !dbf.a($$1, $$2, $$3, null)) {
               this.a(false);
            } else if (!$$2.C) {
               $$2.c(1505, $$3, 15);
            }

            return $$1;
         }
      });
      dsf.a(dqb.cu, new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            aub $$2 = $$0.b();
            if (!$$2.P().c(dmq.ad)) {
               this.a(false);
               return $$1;
            } else {
               jb $$3 = $$0.c().a($$0.d().c(dsf.b));
               cra $$4 = new cra($$2, $$3.u() + 0.5, $$3.v(), $$3.w() + 0.5, null);
               $$2.b($$4);
               $$2.a(null, $$4.dC(), $$4.dE(), $$4.dI(), ayz.Bb, aza.e, 1.0F, 1.0F);
               $$2.a(null, ejb.t, $$3);
               $$1.h(1);
               this.a(true);
               return $$1;
            }
         }
      });
      dsf.a(dcz.vO, new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            dmu $$2 = $$0.b();
            jh $$3 = $$0.d().c(dsf.b);
            jb $$4 = $$0.c().a($$3);
            if ($$2.w($$4) && eaj.b($$2, $$4, $$1)) {
               $$2.a($$4, dqb.hh.m().b(dxm.e, efh.a($$3)), 3);
               $$2.a(null, ejb.i, $$4);
               eaz $$5 = $$2.c_($$4);
               if ($$5 instanceof ecp) {
                  eaj.a($$2, $$4, (ecp)$$5);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lo.b($$0, $$1));
            }

            return $$1;
         }
      });
      dsf.a(dqb.ev, new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            dmu $$2 = $$0.b();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            dqv $$4 = (dqv)dqb.ev;
            if ($$2.w($$3) && $$4.a($$2, $$3)) {
               if (!$$2.C) {
                  $$2.a($$3, $$4.m(), 3);
                  $$2.a(null, ejb.i, $$3);
               }

               $$1.h(1);
               this.a(true);
            } else {
               this.a(lo.b($$0, $$1));
            }

            return $$1;
         }
      });
      dsf.a(dqb.lv.h(), new lt());

      for (dbt $$3 : dbt.values()) {
         dsf.a(dxj.a($$3).h(), new lt());
      }

      dsf.a(dcz.tJ.h(), new lq() {
         private dcv b(lk $$0, dcv $$1, dcv $$2x) {
            $$0.b().a(null, ejb.y, $$0.c());
            return this.a($$0, $$1, $$2x);
         }

         @Override
         public dcv a(lk $$0, dcv $$1) {
            this.a(false);
            aub $$2 = $$0.b();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            eeb $$4 = $$2.a_($$3);
            if ($$4.a(azo.aM, $$0x -> $$0x.b(dpt.c) && $$0x.b() instanceof dpt) && $$4.c(dpt.c) >= 5) {
               ((dpt)$$4.b()).a($$2, $$4, $$3, null, eaw.b.b);
               this.a(true);
               return this.b($$0, $$1, new dcv(dcz.yi));
            } else if ($$2.b_($$3).a(azu.a)) {
               this.a(true);
               return this.b($$0, $$1, der.a(dcz.tK, des.a));
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dsf.a(dcz.fQ, new lq() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            jh $$2 = $$0.d().c(dsf.b);
            jb $$3 = $$0.c().a($$2);
            dmu $$4 = $$0.b();
            eeb $$5 = $$4.a_($$3);
            this.a(true);
            if ($$5.a(dqb.pU)) {
               if ($$5.c(dwp.d) != 4) {
                  dwp.a(null, $$4, $$3, $$5);
                  $$1.h(1);
               } else {
                  this.a(false);
               }

               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dsf.a(dcz.tu.h(), new ls());
      dsf.a(dcz.za.h(), new lq() {
         @Override
         protected dcv a(lk $$0, dcv $$1) {
            aub $$2 = $$0.b();
            jb $$3 = $$0.c().a($$0.d().c(dsf.b));
            List<cnr> $$4 = $$2.a(cnr.class, new fin($$3), bzt.f);
            if ($$4.isEmpty()) {
               this.a(false);
               return $$1;
            } else {
               for (cnr $$5 : $$4) {
                  if ($$5.gL()) {
                     $$1.a(16, $$2, null, $$0x -> {});
                     return $$1;
                  }
               }

               this.a(false);
               return $$1;
            }
         }
      });
      dsf.a(dcz.yf, new lq() {
         @Override
         public dcv a(lk $$0, dcv $$1) {
            jb $$2 = $$0.c().a($$0.d().c(dsf.b));
            dmu $$3 = $$0.b();
            eeb $$4 = $$3.a_($$2);
            Optional<eeb> $$5 = dcm.a($$4);
            if ($$5.isPresent()) {
               $$3.c($$2, $$5.get());
               $$3.c(3003, $$2, 0);
               $$1.h(1);
               this.a(true);
               return $$1;
            } else {
               return super.a($$0, $$1);
            }
         }
      });
      dsf.a(dcz.tK, new lm() {
         private final lm c = new lm();

         @Override
         public dcv a(lk $$0, dcv $$1) {
            der $$2 = $$1.a(kq.R, der.a);
            if (!$$2.a(des.a)) {
               return this.c.dispense($$0, $$1);
            } else {
               aub $$3 = $$0.b();
               jb $$4 = $$0.c();
               jb $$5 = $$0.c().a($$0.d().c(dsf.b));
               if (!$$3.a_($$5).a(azo.cp)) {
                  return this.c.dispense($$0, $$1);
               } else {
                  if (!$$3.C) {
                     for (int $$6 = 0; $$6 < 5; $$6++) {
                        $$3.a(me.ap, $$4.u() + $$3.A.j(), $$4.v() + 1, $$4.w() + $$3.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
                     }
                  }

                  $$3.a(null, $$4, ayz.cB, aza.e, 1.0F, 1.0F);
                  $$3.a(null, ejb.z, $$4);
                  $$3.c($$5, dqb.tt.m());
                  return this.a($$0, $$1, new dcv(dcz.tJ));
               }
            }
         }
      });
      dsf.a(dcz.oM, new lp(bzv.aF));
      dsf.a(dcz.oN, new lp(bzv.z));
      dsf.a(dcz.oO, new lp(bzv.ad));
      dsf.a(dcz.oP, new lp(bzv.bz));
      dsf.a(dcz.oQ, new lp(bzv.am));
      dsf.a(dcz.wp, new lp(bzv.C));
   }
}
