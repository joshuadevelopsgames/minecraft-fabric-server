import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;

public class hcn implements hbz.a {
   private final fue a;
   private double b = Double.MIN_VALUE;
   private List<bzm> c = Collections.emptyList();

   public hcn(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      double $$5 = ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bzm $$6 = this.a.j.l().i();
         this.c = ImmutableList.copyOf($$6.ai().a_($$6, $$6.cV().g(16.0)));
      }

      cut $$7 = this.a.t;
      if ($$7 != null && $$7.aK.isPresent()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$7, () -> 0.0, 1.0F, 0.0F, 0.0F);
      }

      for (bzm $$8 : this.c) {
         if ($$8 != $$7) {
            this.a($$0, $$1, $$2, $$3, $$4, $$8, () -> this.a($$8), 0.0F, 1.0F, 0.0F);
         }
      }
   }

   private void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4, bzm $$5, DoubleSupplier $$6, float $$7, float $$8, float $$9) {
      $$5.aK.ifPresent($$10 -> {
         double $$11 = $$6.getAsDouble();
         jb $$12 = $$5.aU();
         this.a($$12, $$0, $$2, $$3, $$4, $$1, 0.02 + $$11, $$7, $$8, $$9);
         jb $$13 = $$5.aS();
         if (!$$13.equals($$12)) {
            this.a($$13, $$0, $$2, $$3, $$4, $$1, 0.04 + $$11, 0.0F, 1.0F, 1.0F);
         }
      });
   }

   private double a(bzm $$0) {
      return 0.02 * (String.valueOf($$0.ar() + 0.132453657).hashCode() % 1000) / 1000.0;
   }

   private void a(jb $$0, fod $$1, double $$2, double $$3, double $$4, gxn $$5, double $$6, float $$7, float $$8, float $$9) {
      double $$10 = $$0.u() - $$2 - 2.0 * $$6;
      double $$11 = $$0.v() - $$3 - 2.0 * $$6;
      double $$12 = $$0.w() - $$4 - 2.0 * $$6;
      double $$13 = $$10 + 1.0 + 4.0 * $$6;
      double $$14 = $$11 + 1.0 + 4.0 * $$6;
      double $$15 = $$12 + 1.0 + 4.0 * $$6;
      gyh.a($$1, $$5.getBuffer(gxz.v()), $$10, $$11, $$12, $$13, $$14, $$15, $$7, $$8, $$9, 0.4F);
      hbz.a($$1, $$5.getBuffer(gxz.v()), this.a.s.a_($$0).b(this.a.s, $$0, fix.a()).a($$0), -$$2, -$$3, -$$4, $$7, $$8, $$9, 1.0F, false);
   }
}
