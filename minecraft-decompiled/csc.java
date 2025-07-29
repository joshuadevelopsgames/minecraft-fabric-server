import java.util.EnumSet;
import javax.annotation.Nullable;

public class csc extends crv {
   @Nullable
   private csc.b a;

   public csc(bzv<? extends csc> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.a = new csc.b(this);
      this.ch.a(1, new chc(this));
      this.ch.a(1, new cgx(this, this.ai()));
      this.ch.a(3, this.a);
      this.ch.a(4, new chs(this, 1.0, false));
      this.ch.a(5, new csc.a(this));
      this.ci.a(1, new cja(this).a());
      this.ci.a(2, new cjb<>(this, cut.class, true));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 8.0).a(cbs.w, 0.25).a(cbs.c, 1.0);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.c;
   }

   @Override
   protected ayy p() {
      return ayz.ym;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.yo;
   }

   @Override
   protected ayy f_() {
      return ayz.yn;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.yp, 0.15F, 1.0F);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(azp.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void g() {
      this.br = this.dP();
      super.g();
   }

   @Override
   public void s(float $$0) {
      this.v($$0);
      super.s($$0);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return due.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bzv<csc> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bzu.a($$2)) {
         return true;
      } else {
         cut $$5 = $$1.a($$3.u() + 0.5, $$3.v() + 0.5, $$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cif {
      @Nullable
      private jh i;
      private boolean j;

      public a(csc $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.e() != null) {
            return false;
         } else if (!this.b.S().l()) {
            return false;
         } else {
            bck $$0 = this.b.ec();
            if (a(this.b).P().c(dmq.d) && $$0.a(b(10)) == 0) {
               this.i = jh.b($$0);
               jb $$1 = jb.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
               eeb $$2 = this.b.ai().a_($$1);
               if (due.o($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.b();
         }
      }

      @Override
      public boolean c() {
         return this.j ? false : super.c();
      }

      @Override
      public void d() {
         if (!this.j) {
            super.d();
         } else {
            dmv $$0 = this.b.ai();
            jb $$1 = jb.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
            eeb $$2 = $$0.a_($$1);
            if (due.o($$2)) {
               $$0.a($$1, due.p($$2), 3);
               this.b.Y();
               this.b.at();
            }
         }
      }
   }

   static class b extends chi {
      private final csc a;
      private int b;

      public b(csc $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean b() {
         return this.b > 0;
      }

      @Override
      public void a() {
         this.b--;
         if (this.b <= 0) {
            dmu $$0 = this.a.ai();
            bck $$1 = this.a.ec();
            jb $$2 = this.a.dx();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jb $$6 = $$2.b($$4, $$3, $$5);
                     eeb $$7 = $$0.a_($$6);
                     dpz $$8 = $$7.b();
                     if ($$8 instanceof due) {
                        if (a($$0).P().c(dmq.d)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((due)$$8).q($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
