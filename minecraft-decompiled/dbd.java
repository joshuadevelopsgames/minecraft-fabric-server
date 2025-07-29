import java.util.Map;
import javax.annotation.Nullable;

public class dbd extends dcr {
   @Deprecated
   private final dpz a;

   public dbd(dpz $$0, dcr.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bxj a(dgq $$0) {
      bxj $$1 = this.a(new dgo($$0));
      return !$$1.a() && $$0.n().c(kq.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bxj a(dgo $$0) {
      if (!this.c().a($$0.q().L())) {
         return bxj.d;
      } else if (!$$0.b()) {
         return bxj.d;
      } else {
         dgo $$1 = this.b($$0);
         if ($$1 == null) {
            return bxj.d;
         } else {
            eeb $$2 = this.c($$1);
            if ($$2 == null) {
               return bxj.d;
            } else if (!this.a($$1, $$2)) {
               return bxj.d;
            } else {
               jb $$3 = $$1.a();
               dmu $$4 = $$1.q();
               cut $$5 = $$1.o();
               dcv $$6 = $$1.n();
               eeb $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof auc) {
                     aq.z.a((auc)$$5, $$3, $$6);
                  }
               }

               dxx $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), aza.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ejb.i, $$3, ejb.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bxj.a;
            }
         }
      }
   }

   protected ayy a(eeb $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dgo b(dgo $$0) {
      return $$0;
   }

   private static void a(dmu $$0, jb $$1, dcv $$2) {
      eaz $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jb $$0, dmu $$1, @Nullable cut $$2, dcv $$3, eeb $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected eeb c(dgo $$0) {
      eeb $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private eeb a(jb $$0, dmu $$1, dcv $$2, eeb $$3) {
      dev $$4 = $$2.a(kq.aq, dev.a);
      if ($$4.a()) {
         return $$3;
      } else {
         eeb $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dgo $$0, eeb $$1) {
      cut $$2 = $$0.o();
      return (!this.b() || $$1.a((dmx)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), fix.a($$2));
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(dgo $$0, eeb $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dmu $$0, @Nullable cut $$1, jb $$2, dcv $$3) {
      if ($$0.C) {
         return false;
      } else {
         dfd $$4 = $$3.a(kq.aa, dfd.a);
         if (!$$4.c()) {
            ebb<?> $$5 = $$4.a($$0.K_(), mn.e);
            if ($$5 == null) {
               return false;
            }

            eaz $$6 = $$0.c_($$2);
            if ($$6 != null) {
               ebb<?> $$7 = $$6.q();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gQ()) {
                  return $$4.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dcv $$0, @Nullable cut $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dfd $$2 = $$0.a(kq.aa);
         if ($$2 != null) {
            ebb<?> $$3 = $$2.a($$1.ai().K_(), mn.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dpz c() {
      return this.a;
   }

   public void a(Map<dpz, dcr> $$0, dcr $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dxj);
   }

   @Override
   public void a(cqz $$0) {
      dfn $$1 = $$0.e().b(kq.ap, dfn.a);
      if ($$1 != null) {
         dcy.a($$0, $$1.e());
      }
   }

   public static void a(dcv $$0, ebb<?> $$1, fcz $$2) {
      $$2.c("id");
      if ($$2.a()) {
         $$0.e(kq.aa);
      } else {
         eaz.a($$2, $$1);
         $$0.b(kq.aa, dfd.a($$2.b()));
      }
   }

   @Override
   public cyd k() {
      return this.c().k();
   }
}
