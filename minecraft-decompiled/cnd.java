import java.util.UUID;
import javax.annotation.Nullable;

public class cnd extends cmd implements car {
   private static final alh<Boolean> ck = all.a(cnd.class, alj.k);
   private static final float cl = 6.0F;
   private float cm;
   private float co;
   private int cp;
   private static final bwu cq = bdg.a(20, 39);
   private int cr;
   @Nullable
   private UUID cs;

   public cnd(bzv<? extends cnd> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.aW.a($$0, bzu.e);
   }

   @Override
   public boolean i(dcv $$0) {
      return false;
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cnd.c());
      this.ch.a(1, new cib(this, 2.0, $$0 -> $$0.g_() ? azp.F : azp.G));
      this.ch.a(4, new chh(this, 1.25));
      this.ch.a(5, new cif(this, 1.0));
      this.ch.a(6, new chq(this, cut.class, 6.0F));
      this.ch.a(7, new cid(this));
      this.ci.a(1, new cnd.b());
      this.ci.a(2, new cnd.a());
      this.ci.a(3, new cjb<>(this, cut.class, 10, true, false, this::a));
      this.ci.a(4, new cjb<>(this, cms.class, 10, true, true, null));
      this.ci.a(5, new cjh<>(this, false));
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 30.0).a(cbs.n, 20.0).a(cbs.w, 0.25).a(cbs.c, 6.0);
   }

   public static boolean c(bzv<cnd> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      jl<dnx> $$5 = $$1.v($$3);
      return !$$5.a(azn.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(azo.ch);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a(this.ai(), $$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(cq.a(this.ar));
   }

   @Override
   public void a(int $$0) {
      this.cr = $$0;
   }

   @Override
   public int a() {
      return this.cr;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   protected ayy p() {
      return this.g_() ? ayz.vL : ayz.vK;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.vN;
   }

   @Override
   protected ayy f_() {
      return ayz.vM;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.vO, 0.15F, 1.0F);
   }

   protected void n() {
      if (this.cp <= 0) {
         this.b(ayz.vP);
         this.cp = 40;
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, false);
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C) {
         if (this.co != this.cm) {
            this.j_();
         }

         this.cm = this.co;
         if (this.t()) {
            this.co = bcb.a(this.co + 1.0F, 0.0F, 6.0F);
         } else {
            this.co = bcb.a(this.co - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cp > 0) {
         this.cp--;
      }

      if (!this.ai().C) {
         this.a((aub)this.ai(), true);
      }
   }

   @Override
   public bzp e(cay $$0) {
      if (this.co > 0.0F) {
         float $$1 = this.co / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean t() {
      return this.ay.a(ck);
   }

   public void x(boolean $$0) {
      this.ay.a(ck, $$0);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cm, this.co) / 6.0F;
   }

   @Override
   protected float fq() {
      return 0.98F;
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 == null) {
         $$3 = new bzc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cjb<cut> {
      public a() {
         super(cnd.this, cut.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cnd.this.g_()) {
            return false;
         } else {
            if (super.b()) {
               for (cnd $$1 : cnd.this.ai().a(cnd.class, cnd.this.cV().c(8.0, 4.0, 8.0))) {
                  if ($$1.g_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends cja {
      public b() {
         super(cnd.this);
      }

      @Override
      public void d() {
         super.d();
         if (cnd.this.g_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(cao $$0, cam $$1) {
         if ($$0 instanceof cnd && !$$0.g_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends chs {
      public c() {
         super(cnd.this, 1.25, true);
      }

      @Override
      protected void a(cam $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cnd.this.x(false);
         } else if (this.a.g((bzm)$$0) < ($$0.ds() + 3.0F) * ($$0.ds() + 3.0F)) {
            if (this.i()) {
               cnd.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cnd.this.x(true);
               cnd.this.n();
            }
         } else {
            this.h();
            cnd.this.x(false);
         }
      }

      @Override
      public void e() {
         cnd.this.x(false);
         super.e();
      }
   }
}
