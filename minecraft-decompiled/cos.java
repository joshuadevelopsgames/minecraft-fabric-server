import javax.annotation.Nullable;

public class cos extends coq {
   private static final alh<Integer> ck = all.a(cos.class, alj.b);
   private static final bzp cl = bzv.an.n().a(bzo.a().a(bzn.a, 0.0F, bzv.an.m() + 0.125F, 0.0F)).a(0.5F);
   private static final int cm = 0;

   public cos(bzv<? extends cos> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bck $$0) {
      this.h(cbs.t).a(a($$0::a));
      this.h(cbs.w).a(b($$0::j));
      this.h(cbs.p).a(a($$0::j));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Variant", this.t());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("Variant", 0));
   }

   private void x(int $$0) {
      this.ay.a(ck, $$0);
   }

   private int t() {
      return this.ay.a(ck);
   }

   private void a(coz $$0, cou $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public coz m() {
      return coz.a(this.t() & 0xFF);
   }

   private void a(coz $$0) {
      this.x($$0.a() & 0xFF | this.t() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aL ? c((kp<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aL) {
         this.a(c(kq.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public cou n() {
      return cou.a((this.t() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dxx $$0) {
      super.a($$0);
      if (this.ar.a(10) == 0) {
         this.a(ayz.nH, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected ayy p() {
      return ayz.nD;
   }

   @Override
   protected ayy f_() {
      return ayz.nI;
   }

   @Nullable
   @Override
   protected ayy gJ() {
      return ayz.nJ;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.nL;
   }

   @Override
   protected ayy hg() {
      return ayz.nE;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      boolean $$2 = !this.g_() && this.gY() && $$0.gh();
      if (!this.cd() && !$$2) {
         dcv $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gY()) {
               this.hn();
               return bxj.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cmd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cor) && !($$0 instanceof cos) ? false : this.hp() && ((coq)$$0).hp();
      }
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      if ($$1 instanceof cor) {
         cov $$2 = bzv.aH.a($$0, bzu.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cos $$3 = (cos)$$1;
         cos $$4 = bzv.an.a($$0, bzu.e);
         if ($$4 != null) {
            int $$5 = this.ar.a(9);
            coz $$6;
            if ($$5 < 4) {
               $$6 = this.m();
            } else if ($$5 < 8) {
               $$6 = $$3.m();
            } else {
               $$6 = ag.a(coz.values(), this.ar);
            }

            int $$9 = this.ar.a(5);
            cou $$10;
            if ($$9 < 2) {
               $$10 = this.n();
            } else if ($$9 < 4) {
               $$10 = $$3.n();
            } else {
               $$10 = ag.a(cou.values(), this.ar);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bzw $$0) {
      return true;
   }

   @Override
   protected void c(byb $$0, float $$1) {
      this.a($$0, $$1, new bzw[]{bzw.g});
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      coz $$5;
      if ($$3 instanceof cos.a) {
         $$5 = ((cos.a)$$3).a;
      } else {
         $$5 = ag.a(coz.values(), $$4);
         $$3 = new cos.a($$5);
      }

      this.a($$5, ag.a(cou.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cl : super.e($$0);
   }

   public static class a extends bzc.a {
      public final coz a;

      public a(coz $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
