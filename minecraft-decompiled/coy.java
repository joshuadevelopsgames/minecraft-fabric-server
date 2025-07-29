import java.util.EnumSet;
import javax.annotation.Nullable;

public class coy extends cot {
   private static final int ck = 47999;
   private int cl = 47999;

   public coy(bzv<? extends coy> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean gK() {
      return true;
   }

   @Nullable
   @Override
   protected cot gV() {
      return bzv.bA.a(this.ai(), bzu.e);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("DespawnDelay", this.cl);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cl = $$0.a("DespawnDelay", 47999);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(1, new cib(this, 2.0));
      this.ci.a(1, new coy.a(this));
      this.ci.a(2, new cjb<>(this, cso.class, true, ($$0, $$1) -> $$0.ap() != bzv.bT));
      this.ci.a(2, new cjb<>(this, crc.class, true));
   }

   @Override
   public void x(int $$0) {
      this.cl = $$0;
   }

   @Override
   protected void g(cut $$0) {
      bzm $$1 = this.aj_();
      if (!($$1 instanceof cul)) {
         super.g($$0);
      }
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C) {
         this.hu();
      }
   }

   private void hu() {
      if (this.hv()) {
         this.cl = this.hw() ? ((cul)this.aj_()).gQ() - 1 : this.cl - 1;
         if (this.cl <= 0) {
            this.x();
            this.at();
         }
      }
   }

   private boolean hv() {
      return !this.gY() && !this.hx() && !this.dg();
   }

   private boolean hw() {
      return this.aj_() instanceof cul;
   }

   private boolean hx() {
      return this.R_() && !this.hw();
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$2 == bzu.h) {
         this.c_(0);
      }

      if ($$3 == null) {
         $$3 = new bzc.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   protected static class a extends cji {
      private final cot a;
      private cam b;
      private int c;

      public a(cot $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(chi.a.d));
      }

      @Override
      public boolean b() {
         if (!this.a.R_()) {
            return false;
         } else if (!(this.a.aj_() instanceof cul $$1)) {
            return false;
         } else {
            this.b = $$1.ew();
            int $$2 = $$1.ey();
            return $$2 != this.c && this.a(this.b, clc.a);
         }
      }

      @Override
      public void d() {
         this.e.g(this.b);
         bzm $$0 = this.a.aj_();
         if ($$0 instanceof cul) {
            this.c = ((cul)$$0).ey();
         }

         super.d();
      }
   }
}
