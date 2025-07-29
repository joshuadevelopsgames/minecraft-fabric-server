import javax.annotation.Nullable;

public class csg extends crv {
   private static final alh<Byte> a = all.a(csg.class, alj.a);
   private static final float b = 0.1F;

   public csg(bzv<? extends csg> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chc(this));
      this.ch.a(2, new cgp<>(this, cnr.class, 6.0F, 1.0, 1.2, $$0 -> !((cnr)$$0).n()));
      this.ch.a(3, new cho(this, 0.4F));
      this.ch.a(4, new csg.a(this));
      this.ch.a(5, new civ(this, 0.8));
      this.ch.a(6, new chq(this, cut.class, 8.0F));
      this.ch.a(6, new cid(this));
      this.ci.a(1, new cja(this));
      this.ci.a(2, new csg.c<>(this, cut.class));
      this.ci.a(3, new csg.c<>(this, cmv.class));
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjx(this, $$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void g() {
      super.g();
      if (!this.ai().C) {
         this.x(this.ac);
      }
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.t, 16.0).a(cbs.w, 0.3F);
   }

   @Override
   protected ayy p() {
      return ayz.Ao;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Aq;
   }

   @Override
   protected ayy f_() {
      return ayz.Ap;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.Ar, 0.15F, 1.0F);
   }

   @Override
   public boolean eV() {
      return this.n();
   }

   @Override
   public void a(eeb $$0, fis $$1) {
      if (!$$0.a(dqb.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(byq $$0) {
      return $$0.a(bys.s) ? false : super.b($$0);
   }

   public boolean n() {
      return (this.ay.a(a) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ay.a(a);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ay.a(a, $$1);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bck $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         csd $$5 = bzv.bh.a(this.ai(), bzu.g);
         if ($$5 != null) {
            $$5.b(this.dC(), this.dE(), this.dI(), this.dP(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.o(this);
         }
      }

      if ($$3 == null) {
         $$3 = new csg.b();
         if ($$0.an() == bxg.d && $$4.i() < 0.1F * $$1.d()) {
            ((csg.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof csg.b $$6) {
         jl<byo> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new byq($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fis m(bzm $$0) {
      return $$0.ds() <= this.ds() ? new fis(0.0, 0.3125 * this.eq(), 0.0) : super.m($$0);
   }

   static class a extends chs {
      public a(csg $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.cd();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bB();
         if ($$0 >= 0.5F && this.a.ec().a(100) == 0) {
            this.a.g(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements cbe {
      @Nullable
      public jl<byo> a;

      public void a(bck $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bys.a;
         } else if ($$1 <= 2) {
            this.a = bys.e;
         } else if ($$1 <= 3) {
            this.a = bys.j;
         } else if ($$1 <= 4) {
            this.a = bys.n;
         }
      }
   }

   static class c<T extends cam> extends cjb<T> {
      public c(csg $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bB();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
