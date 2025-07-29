import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ddq extends dcr {
   public static final Predicate<dcv> c = $$0 -> $$0.a(azx.be);
   public static final Predicate<dcv> d = c.or($$0 -> $$0.a(dcz.vW));

   public ddq(dcr.a $$0) {
      super($$0);
   }

   public Predicate<dcv> c() {
      return this.a();
   }

   public abstract Predicate<dcv> a();

   public static dcv a(cam $$0, Predicate<dcv> $$1) {
      if ($$1.test($$0.b(bxi.b))) {
         return $$0.b(bxi.b);
      } else {
         return $$1.test($$0.b(bxi.a)) ? $$0.b(bxi.a) : dcv.l;
      }
   }

   public abstract int b();

   protected void a(aub $$0, cam $$1, bxi $$2, dcv $$3, List<dcv> $$4, float $$5, float $$6, boolean $$7, @Nullable cam $$8) {
      float $$9 = djk.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / ($$4.size() - 1);
      float $$11 = ($$4.size() - 1) % 2 * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         dcv $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cvo.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, cam.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(dcv $$0) {
      return 1;
   }

   protected abstract void a(cam var1, cvo var2, int var3, float var4, float var5, float var6, @Nullable cam var7);

   protected cvo a(dmu $$0, cam $$1, dcv $$2, dcv $$3, boolean $$4) {
      daz $$6 = $$3.h() instanceof daz $$5 ? $$5 : (daz)dcz.pB;
      cvb $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<dcv> a(dcv $$0, dcv $$1, cam $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.ai() instanceof aub $$3 ? djk.a($$3, $$0, $$2, 1) : 1;
         List<dcv> $$5 = new ArrayList<>($$4);
         dcv $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            dcv $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static dcv a(dcv $$0, dcv $$1, cam $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.gc() && $$2.ai() instanceof aub $$4 ? djk.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return dcv.l;
      } else if ($$5 == 0) {
         dcv $$6 = $$1.c(1);
         $$6.b(kq.u, bdk.a);
         return $$6;
      } else {
         dcv $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cut $$8) {
            $$8.gs().i($$1);
         }

         return $$7;
      }
   }
}
