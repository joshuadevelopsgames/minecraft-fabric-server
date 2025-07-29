import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cwf extends cvc implements cvl {
   public static final dmo d = new dnn(true, false, Optional.empty(), mm.e.a(azo.cG).map(Function.identity()));
   public static final double f = 0.25;

   public cwf(bzv<? extends cwf> $$0, dmu $$1) {
      super($$0, $$1);
      this.c = 0.0;
   }

   public cwf(bzv<? extends cwf> $$0, dmu $$1, bzm $$2, double $$3, double $$4, double $$5) {
      super($$0, $$3, $$4, $$5, $$1);
      this.c($$2);
      this.c = 0.0;
   }

   cwf(bzv<? extends cwf> $$0, double $$1, double $$2, double $$3, fis $$4, dmu $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.c = 0.0;
   }

   @Override
   protected fin c(fis $$0) {
      float $$1 = this.ap().n().a() / 2.0F;
      float $$2 = this.ap().n().b();
      float $$3 = 0.15F;
      return new fin($$0.d - $$1, $$0.e - 0.15F, $$0.f - $$1, $$0.d + $$1, $$0.e - 0.15F + $$2, $$0.f + $$1);
   }

   @Override
   public boolean i(bzm $$0) {
      return $$0 instanceof cwf ? false : super.i($$0);
   }

   @Override
   protected boolean b(bzm $$0) {
      if ($$0 instanceof cwf) {
         return false;
      } else {
         return $$0.ap() == bzv.S ? false : super.b($$0);
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         cam $$4 = this.ah_() instanceof cam $$3 ? $$3 : null;
         bzm $$5 = $$0.a();
         if ($$4 != null) {
            $$4.C($$5);
         }

         byb $$6 = this.ea().c(this, $$4);
         if ($$5.a($$1, $$6, 1.0F) && $$5 instanceof cam $$7) {
            djk.a($$1, (bzm)$$7, $$6);
         }

         this.a(this.dv());
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
   }

   protected abstract void a(fis var1);

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      if (!this.ai().C) {
         kg $$1 = $$0.c().q();
         fis $$2 = fis.a($$1).d(0.25, 0.25, 0.25);
         fis $$3 = $$0.g().e($$2);
         this.a($$3);
         this.at();
      }
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.at();
      }
   }

   @Override
   protected boolean f() {
      return false;
   }

   @Override
   public dcv e() {
      return dcv.l;
   }

   @Override
   protected float l() {
      return 1.0F;
   }

   @Override
   protected float m() {
      return this.l();
   }

   @Nullable
   @Override
   protected mc i() {
      return null;
   }

   @Override
   public void g() {
      if (!this.ai().C && this.dD() > this.ai().ao() + 30) {
         this.a(this.dv());
         this.at();
      } else {
         super.g();
      }
   }
}
