import java.util.UUID;
import javax.annotation.Nullable;

public class cvy extends cvv {
   private long a = 0L;

   public cvy(bzv<? extends cvy> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvy(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.R, $$1, $$0, $$2);
   }

   @Override
   protected dcr f() {
      return dcz.tE;
   }

   @Override
   protected void a(@Nullable bzs<bzm> $$0) {
      this.i();
      super.a($$0);
      this.l();
   }

   private void i() {
      if (this.ah_() instanceof auc $$0) {
         $$0.b(this);
      }
   }

   private void l() {
      if (this.ah_() instanceof auc $$0) {
         $$0.a(this);
      }
   }

   @Nullable
   @Override
   public bzm ah_() {
      return this.e != null && this.ai() instanceof aub $$0 ? this.e.a($$1x -> a($$0, $$1x), bzm.class) : super.ah_();
   }

   @Nullable
   private static bzm a(aub $$0, UUID $$1) {
      bzm $$2 = $$0.b($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         for (aub $$3 : $$0.q().L()) {
            if ($$3 != $$0) {
               $$2 = $$3.b($$1);
               if ($$2 != null) {
                  return $$2;
               }
            }
         }

         return null;
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      $$0.a().a(this.ea().b(this, this.ah_()), 0.0F);
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.ai().a(me.af, this.dC(), this.dE() + this.ar.j() * 2.0, this.dI(), this.ar.k(), 0.0, this.ar.k());
      }

      if (this.ai() instanceof aub $$2 && !this.dU()) {
         bzm $$4 = this.ah_();
         if ($$4 != null && a($$4, $$2)) {
            fis $$5 = this.bF();
            if ($$4 instanceof auc $$6) {
               if ($$6.g.c()) {
                  if (this.ar.i() < 0.05F && $$2.P().c(dmq.f)) {
                     crm $$7 = bzv.P.a($$2, bzu.k);
                     if ($$7 != null) {
                        $$7.b($$4.dC(), $$4.dE(), $$4.dI(), $$4.dP(), $$4.dR());
                        $$2.b($$7);
                     }
                  }

                  if (this.aD()) {
                     $$4.aB();
                  }

                  auc $$8 = $$6.a(new fbl($$2, $$5, fis.c, 0.0F, 0.0F, cba.a(cba.k, cba.l), fbl.a));
                  if ($$8 != null) {
                     $$8.j();
                     $$8.gZ();
                     $$8.a($$6.y(), this.ea().m(), 5.0F);
                  }

                  this.a($$2, $$5);
               }
            } else {
               bzm $$9 = $$4.b(new fbl($$2, $$5, $$4.dA(), $$4.dP(), $$4.dR(), fbl.a));
               if ($$9 != null) {
                  $$9.j();
               }

               this.a($$2, $$5);
            }

            this.at();
         } else {
            this.at();
         }
      }
   }

   private static boolean a(bzm $$0, dmu $$1) {
      if ($$0.ai().aj() == $$1.aj()) {
         return !($$0 instanceof cam $$2) ? $$0.bO() : $$2.bO() && !$$2.fY();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void g() {
      int $$0 = ke.b(this.dv().a());
      int $$1 = ke.b(this.dv().c());
      bzm $$2 = this.ah_();
      if ($$2 instanceof auc $$3 && !$$2.bO() && $$3.y().P().c(dmq.aa)) {
         this.at();
      } else {
         super.g();
      }

      if (this.bO()) {
         jb $$4 = jb.a((jv)this.dv());
         if ((--this.a <= 0L || $$0 != ke.a($$4.u()) || $$1 != ke.a($$4.w())) && $$2 instanceof auc $$5) {
            this.a = $$5.c(this);
         }
      }
   }

   private void a(dmu $$0, fis $$1) {
      $$0.a(null, $$1.d, $$1.e, $$1.f, ayz.vJ, aza.h);
   }

   @Nullable
   @Override
   public bzm b(fbl $$0) {
      bzm $$1 = super.b($$0);
      if ($$1 != null) {
         $$1.f(jb.a((jv)$$1.dv()));
      }

      return $$1;
   }

   @Override
   public boolean a(dmu $$0, dmu $$1) {
      return $$0.aj() == dmu.k && $$1.aj() == dmu.i && this.ah_() instanceof auc $$2 ? super.a($$0, $$1) && $$2.i : super.a($$0, $$1);
   }

   @Override
   protected void a(eeb $$0) {
      super.a($$0);
      if ($$0.a(dqb.ll) && this.ah_() instanceof auc $$1) {
         $$1.a($$0);
      }
   }

   @Override
   public void b(bzm.e $$0) {
      if ($$0 != bzm.e.d) {
         this.i();
      }

      super.b($$0);
   }

   @Override
   public void a(boolean $$0, jb $$1) {
      bzm.a(this, $$0, $$1);
   }

   @Override
   public void m(boolean $$0) {
      bzm.b(this, $$0);
   }
}
