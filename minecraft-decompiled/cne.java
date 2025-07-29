import java.util.List;

public class cne extends clz {
   private static final alh<Integer> e = all.a(cne.class, alj.b);
   int f;
   int ck;
   private static final clc.a cl = ($$0, $$1) -> $$0 instanceof cut $$2 && $$2.gI() ? false : !$$0.ap().a(azs.A);
   static final clc cm = clc.b().e().d().a(cl);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private static final int cn = 0;

   public cne(bzv<? extends cne> $$0, dmu $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gI() {
      return this.ay.a(e);
   }

   public void b(int $$0) {
      this.ay.a(e, $$0);
   }

   @Override
   public void a(alh<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("PuffState", this.gI());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b(Math.min($$0.a("PuffState", 0), 2));
   }

   @Override
   public dcv a() {
      return new dcv(dcz.rM);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(1, new cne.a(this));
   }

   @Override
   public void g() {
      if (!this.ai().C && this.bO() && this.dl()) {
         if (this.f > 0) {
            if (this.gI() == 0) {
               this.b(ayz.we);
               this.b(1);
            } else if (this.f > 40 && this.gI() == 1) {
               this.b(ayz.we);
               this.b(2);
            }

            this.f++;
         } else if (this.gI() != 0) {
            if (this.ck > 60 && this.gI() == 2) {
               this.b(ayz.wd);
               this.b(1);
            } else if (this.ck > 100 && this.gI() == 1) {
               this.b(ayz.wd);
               this.b(0);
            }

            this.ck++;
         }
      }

      super.g();
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ai() instanceof aub $$0 && this.bO() && this.gI() > 0) {
         for (cao $$2 : this.ai().a(cao.class, this.cV().g(0.3), $$1 -> cm.a($$0, this, $$1))) {
            if ($$2.bO()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(aub $$0, cao $$1) {
      int $$2 = this.gI();
      if ($$1.a($$0, this.ea().b((cam)this), 1 + $$2)) {
         $$1.b(new byq(bys.s, 60 * $$2, 0), this);
         this.a(ayz.wi, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cut $$0) {
      int $$1 = this.gI();
      if ($$0 instanceof auc $$2 && $$1 > 0 && $$0.a($$2.y(), this.ea().b((cam)this), 1 + $$1)) {
         if (!this.be()) {
            $$2.g.b(new adx(adx.k, 0.0F));
         }

         $$0.b(new byq(bys.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected ayy f_() {
      return ayz.wf;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.wh;
   }

   @Override
   protected ayy gH() {
      return ayz.wg;
   }

   @Override
   public bzp e(cay $$0) {
      return super.e($$0).a(c(this.gI()));
   }

   private static float c(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends chi {
      private final cne a;

      public a(cne $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<cam> $$0 = this.a.ai().a(cam.class, this.a.cV().g(2.0), $$0x -> cne.cm.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.f = 1;
         this.a.ck = 0;
      }

      @Override
      public void e() {
         this.a.f = 0;
      }
   }
}
