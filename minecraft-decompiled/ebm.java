import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class ebm extends eaz {
   private static final int b = 2;
   private static final int c = 13;
   private static final float d = -0.0375F;
   private static final int e = 16;
   private static final int f = 42;
   private static final int g = 8;
   private static final dpz[] h = new dpz[]{dqb.iB, dqb.iC, dqb.iK, dqb.iD};
   public int a;
   private float i;
   private boolean j;
   private boolean k;
   private final List<jb> l = Lists.newArrayList();
   @Nullable
   private bzs<cam> m;
   private long q;

   public ebm(jb $$0, eeb $$1) {
      super(ebb.A, $$0, $$1);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.m = bzs.a($$0, "Target");
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      bzs.a(this.m, $$0, "Target");
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebm $$3) {
      $$3.a++;
      long $$4 = $$0.ae();
      List<jb> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         $$3.j = a($$0, $$1, $$5);
         a($$3, $$5);
      }

      cam $$6 = bzs.a($$3.m, $$0, cam.class);
      a($$0, $$1, $$5, $$6, $$3.a);
      if ($$3.c()) {
         $$3.i++;
      }
   }

   public static void b(dmu $$0, jb $$1, eeb $$2, ebm $$3) {
      $$3.a++;
      long $$4 = $$0.ae();
      List<jb> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         boolean $$6 = a($$0, $$1, $$5);
         if ($$6 != $$3.j) {
            ayy $$7 = $$6 ? ayz.fA : ayz.fE;
            $$0.a(null, $$1, $$7, aza.e, 1.0F, 1.0F);
         }

         $$3.j = $$6;
         a($$3, $$5);
         if ($$6) {
            b($$0, $$1, $$5);
            a((aub)$$0, $$1, $$2, $$3, $$5.size() >= 42);
         }
      }

      if ($$3.c()) {
         if ($$4 % 80L == 0L) {
            $$0.a(null, $$1, ayz.fB, aza.e, 1.0F, 1.0F);
         }

         if ($$4 > $$3.q) {
            $$3.q = $$4 + 60L + $$0.H_().a(40);
            $$0.a(null, $$1, ayz.fC, aza.e, 1.0F, 1.0F);
         }
      }
   }

   private static void a(ebm $$0, List<jb> $$1) {
      $$0.a($$1.size() >= 42);
   }

   private static boolean a(dmu $$0, jb $$1, List<jb> $$2) {
      $$2.clear();

      for (int $$3 = -1; $$3 <= 1; $$3++) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               jb $$6 = $$1.b($$3, $$4, $$5);
               if (!$$0.B($$6)) {
                  return false;
               }
            }
         }
      }

      for (int $$7 = -2; $$7 <= 2; $$7++) {
         for (int $$8 = -2; $$8 <= 2; $$8++) {
            for (int $$9 = -2; $$9 <= 2; $$9++) {
               int $$10 = Math.abs($$7);
               int $$11 = Math.abs($$8);
               int $$12 = Math.abs($$9);
               if (($$10 > 1 || $$11 > 1 || $$12 > 1)
                  && ($$7 == 0 && ($$11 == 2 || $$12 == 2) || $$8 == 0 && ($$10 == 2 || $$12 == 2) || $$9 == 0 && ($$10 == 2 || $$11 == 2))) {
                  jb $$13 = $$1.b($$7, $$8, $$9);
                  eeb $$14 = $$0.a_($$13);

                  for (dpz $$15 : h) {
                     if ($$14.a($$15)) {
                        $$2.add($$13);
                     }
                  }
               }
            }
         }
      }

      return $$2.size() >= 16;
   }

   private static void b(dmu $$0, jb $$1, List<jb> $$2) {
      int $$3 = $$2.size();
      int $$4 = $$3 / 7 * 16;
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      fin $$8 = new fin($$5, $$6, $$7, $$5 + 1, $$6 + 1, $$7 + 1).g($$4).b(0.0, $$0.M_(), 0.0);
      List<cut> $$9 = $$0.a(cut.class, $$8);
      if (!$$9.isEmpty()) {
         for (cut $$10 : $$9) {
            if ($$1.a($$10.dx(), $$4) && $$10.bo()) {
               $$10.a(new byq(bys.C, 260, 0, true, true));
            }
         }
      }
   }

   private static void a(aub $$0, jb $$1, eeb $$2, ebm $$3, boolean $$4) {
      bzs<cam> $$5 = a($$3.m, $$0, $$1, $$4);
      cam $$6 = bzs.a($$5, $$0, cam.class);
      if ($$6 != null) {
         $$0.a(null, $$6.dC(), $$6.dE(), $$6.dI(), ayz.fD, aza.e, 1.0F, 1.0F);
         $$6.a($$0, $$0.al().q(), 4.0F);
      }

      if (!Objects.equals($$5, $$3.m)) {
         $$3.m = $$5;
         $$0.a($$1, $$2, $$2, 2);
      }
   }

   @Nullable
   private static bzs<cam> a(@Nullable bzs<cam> $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         return null;
      } else if ($$0 == null) {
         return a($$1, $$2);
      } else {
         cam $$4 = bzs.a($$0, $$1, cam.class);
         return $$4 != null && $$4.bO() && $$2.a($$4.dx(), 8.0) ? $$0 : null;
      }
   }

   @Nullable
   private static bzs<cam> a(aub $$0, jb $$1) {
      List<cam> $$2 = $$0.a(cam.class, a($$1), $$0x -> $$0x instanceof crn && $$0x.bo());
      return $$2.isEmpty() ? null : new bzs<>(ag.a($$2, $$0.A));
   }

   private static fin a(jb $$0) {
      return new fin($$0).g(8.0);
   }

   private static void a(dmu $$0, jb $$1, List<jb> $$2, @Nullable bzm $$3, int $$4) {
      bck $$5 = $$0.A;
      double $$6 = bcb.a(($$4 + 35) * 0.1F) / 2.0F + 0.5F;
      $$6 = ($$6 * $$6 + $$6) * 0.3F;
      fis $$7 = new fis($$1.u() + 0.5, $$1.v() + 1.5 + $$6, $$1.w() + 0.5);

      for (jb $$8 : $$2) {
         if ($$5.a(50) == 0) {
            jb $$9 = $$8.b($$1);
            float $$10 = -0.5F + $$5.i() + $$9.u();
            float $$11 = -2.0F + $$5.i() + $$9.v();
            float $$12 = -0.5F + $$5.i() + $$9.w();
            $$0.a(me.au, $$7.d, $$7.e, $$7.f, $$10, $$11, $$12);
         }
      }

      if ($$3 != null) {
         fis $$13 = new fis($$3.dC(), $$3.dG(), $$3.dI());
         float $$14 = (-0.5F + $$5.i()) * (3.0F + $$3.ds());
         float $$15 = -1.0F + $$5.i() * $$3.dt();
         float $$16 = (-0.5F + $$5.i()) * (3.0F + $$3.ds());
         fis $$17 = new fis($$14, $$15, $$16);
         $$0.a(me.au, $$13.d, $$13.e, $$13.f, $$17.d, $$17.e, $$17.f);
      }
   }

   public boolean c() {
      return this.j;
   }

   public boolean d() {
      return this.k;
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   public float a(float $$0) {
      return (this.i + $$0) * -0.0375F;
   }
}
