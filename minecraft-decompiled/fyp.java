import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyp extends fxm {
   private static final float a = 2.125F;
   private static final float b = 0.97F;
   private static final float c = 2.5F;
   private static final float d = -5.0F;
   private static final float e = 30.0F;
   private static final float f = 50.0F;
   private final gop m;
   private final gop n;
   private final Supplier<hst> o;
   private float p = -5.0F;
   private float q = 30.0F;

   public fyp(int $$0, int $$1, gqj $$2, Supplier<hst> $$3) {
      super(0, 0, $$0, $$1, xn.a);
      this.m = new gop($$2.a(gqm.cy), false);
      this.n = new gop($$2.a(gqm.cE), true);
      this.o = $$3;
   }

   @Override
   protected void b(fxb $$0, int $$1, int $$2, float $$3) {
      float $$4 = 0.97F * this.y() / 2.125F;
      float $$5 = -1.0625F;
      hst $$6 = this.o.get();
      gop $$7 = $$6.e() == hst.a.a ? this.n : this.m;
      $$0.a($$7, $$6.a(), $$4, this.p, this.q, -1.0625F, this.E(), this.F(), this.G(), this.H());
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.p = bcb.a(this.p - (float)$$3 * 2.5F, -50.0F, 50.0F);
      this.q += (float)$$2 * 2.5F;
   }

   @Override
   public void a(hwx $$0) {
   }

   @Override
   protected void a(gbt $$0) {
   }

   @Override
   public boolean D() {
      return false;
   }

   @Nullable
   @Override
   public fwy a(gbz $$0) {
      return null;
   }
}
