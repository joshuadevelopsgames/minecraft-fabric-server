import java.util.Arrays;
import javax.annotation.Nullable;

public class ebd extends eas implements bxu {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private static final short l = 0;
   private static final byte m = 0;
   private ju<dcv> q = ju.a(5, dcv.l);
   int r;
   private boolean[] s;
   private dcr t;
   int u;
   protected final cyy f = new cyy() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> ebd.this.r;
            case 1 -> ebd.this.u;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               ebd.this.r = $$1;
               break;
            case 1:
               ebd.this.u = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public ebd(jb $$0, eeb $$1) {
      super(ebb.m, $$0, $$1);
   }

   @Override
   protected xo j() {
      return xo.c("container.brewing");
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   protected ju<dcv> f() {
      return this.q;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.q = $$0;
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebd $$3) {
      dcv $$4 = $$3.q.get(4);
      if ($$3.u <= 0 && $$4.a(azx.aq)) {
         $$3.u = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.M(), $$3.q);
      boolean $$6 = $$3.r > 0;
      dcv $$7 = $$3.q.get(3);
      if ($$6) {
         $$3.r--;
         boolean $$8 = $$3.r == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.q);
         } else if (!$$5 || !$$7.a($$3.t)) {
            $$3.r = 0;
         }

         a($$0, $$1, $$2);
      } else if ($$5 && $$3.u > 0) {
         $$3.u--;
         $$3.r = 400;
         $$3.t = $$7.h();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.k();
      if (!Arrays.equals($$9, $$3.s)) {
         $$3.s = $$9;
         eeb $$10 = $$2;
         if (!($$2.b() instanceof dqe)) {
            return;
         }

         for (int $$11 = 0; $$11 < dqe.b.length; $$11++) {
            $$10 = $$10.b(dqe.b[$$11], $$9[$$11]);
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] k() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.q.get($$1).f()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(deq $$0, ju<dcv> $$1) {
      dcv $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            dcv $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dmu $$0, jb $$1, ju<dcv> $$2) {
      dcv $$3 = $$2.get(3);
      deq $$4 = $$0.M();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      dcv $$6 = $$3.h().i();
      if (!$$6.f()) {
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            bxf.a($$0, $$1.u(), $$1.v(), $$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.q = ju.a(this.b(), dcv.l);
      bxd.a($$0, this.q);
      this.r = $$0.a("BrewTime", (short)0);
      if (this.r > 0) {
         this.t = this.q.get(3).h();
      }

      this.u = $$0.a("Fuel", (byte)0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("BrewTime", (short)this.r);
      bxd.a($$0, this.q);
      $$0.a("Fuel", (byte)this.u);
   }

   @Override
   public boolean b(int $$0, dcv $$1) {
      if ($$0 == 3) {
         deq $$2 = this.n != null ? this.n.M() : deq.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(azx.aq) : ($$1.a(dcz.tK) || $$1.a(dcz.wR) || $$1.a(dcz.wU) || $$1.a(dcz.tJ)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jh $$0) {
      if ($$0 == jh.b) {
         return i;
      } else {
         return $$0 == jh.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, dcv $$1, @Nullable jh $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, dcv $$1, jh $$2) {
      return $$0 == 3 ? $$1.a(dcz.tJ) : true;
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return new cyt($$0, $$1, this, this.f);
   }
}
