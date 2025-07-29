import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cwh extends cwf {
   private static final dmo g = new dnn(true, false, Optional.of(1.22F), mm.e.a(azo.cG).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = bcb.l(3.5F);
   private int j = 5;

   public cwh(bzv<? extends cwf> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cwh(cut $$0, dmu $$1, double $$2, double $$3, double $$4) {
      super(bzv.bJ, $$1, $$0, $$2, $$3, $$4);
   }

   public cwh(dmu $$0, double $$1, double $$2, double $$3, fis $$4) {
      super(bzv.bJ, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cvp $$0, @Nullable bzm $$1, @Nullable bzm $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fis $$0) {
      this.ai().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dmu.a.e, me.A, me.z, ayz.DT);
   }

   @Override
   public boolean a(double $$0) {
      return this.as < 2 && $$0 < i ? false : super.a($$0);
   }
}
