import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;

public abstract class cvd extends cvv {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<cam> c = $$0 -> $$0.fx() || $$0.cb();

   public cvd(bzv<? extends cvd> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvd(bzv<? extends cvd> $$0, dmu $$1, cam $$2, dcv $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public cvd(bzv<? extends cvd> $$0, dmu $$1, double $$2, double $$3, double $$4, dcv $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bg() {
      return 0.05;
   }

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      if (!this.ai().C) {
         dcv $$1 = this.e();
         jh $$2 = $$0.c();
         jb $$3 = $$0.b();
         jb $$4 = $$3.a($$2);
         der $$5 = $$1.a(kq.R, der.a);
         if ($$5.a(des.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jh $$6 : jh.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         dcv $$3 = this.e();
         der $$4 = $$3.a(kq.R, der.a);
         if ($$4.a(des.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.dx(), $$4.b());
         this.at();
      }
   }

   private void b(aub $$0) {
      fin $$1 = this.cV().c(4.0, 2.0, 4.0);

      for (cam $$3 : this.ai().a(cam.class, $$1, c)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fx()) {
               $$3.a($$0, this.ea().c(this, this.ah_()), 1.0F);
            }

            if ($$3.cb() && $$3.bO()) {
               $$3.aQ();
            }
         }
      }

      for (cnu $$6 : this.ai().a(cnu.class, $$1)) {
         $$6.t();
      }
   }

   protected abstract void a(aub var1, dcv var2, fiq var3);

   private void a(jb $$0) {
      eeb $$1 = this.ai().a_($$0);
      if ($$1.a(azo.aQ)) {
         this.ai().a($$0, false, this);
      } else if (dor.c($$1)) {
         dor.a(null, $$1, this.ai(), $$0);
      } else if (dqp.h($$1)) {
         this.ai().a(null, 1009, $$0, 0);
         dqp.a(this.ah_(), this.ai(), $$0, $$1);
         this.ai().c($$0, $$1.b(dqp.b, false));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(cam $$0, byb $$1) {
      double $$2 = $$0.dv().d - this.dv().d;
      double $$3 = $$0.dv().f - this.dv().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
