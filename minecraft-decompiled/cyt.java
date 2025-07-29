import java.util.Optional;

public class cyt extends cym {
   static final ame m = ame.b("container/slot/brewing_fuel");
   static final ame n = ame.b("container/slot/potion");
   private static final int o = 0;
   private static final int p = 2;
   private static final int q = 3;
   private static final int r = 4;
   private static final int s = 5;
   private static final int t = 2;
   private static final int u = 5;
   private static final int v = 32;
   private static final int w = 32;
   private static final int x = 41;
   private final bxc y;
   private final cyy z;
   private final dak A;

   public cyt(int $$0, cus $$1) {
      this($$0, $$1, new bxr(5), new daj(2));
   }

   public cyt(int $$0, cus $$1, bxc $$2, cyy $$3) {
      super(czv.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      deq $$4 = $$1.j.ai().M();
      this.a(new cyt.c($$2, 0, 56, 51));
      this.a(new cyt.c($$2, 1, 79, 58));
      this.a(new cyt.c($$2, 2, 102, 51));
      this.A = this.a(new cyt.b($$4, $$2, 3, 79, 17));
      this.a(new cyt.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cut $$0) {
      return this.y.a($$0);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cyt.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return dcv.l;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return dcv.l;
               }
            } else if (cyt.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return dcv.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return dcv.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.z.a(1);
   }

   public int m() {
      return this.z.a(0);
   }

   static class a extends dak {
      public a(bxc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dcv $$0) {
         return b($$0);
      }

      public static boolean b(dcv $$0) {
         return $$0.a(azx.aq);
      }

      @Override
      public ame c() {
         return cyt.m;
      }
   }

   static class b extends dak {
      private final deq a;

      public b(deq $$0, bxc $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(dcv $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends dak {
      public c(bxc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dcv $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cut $$0, dcv $$1) {
         Optional<jl<dep>> $$2 = $$1.a(kq.R, der.a).e();
         if ($$2.isPresent() && $$0 instanceof auc $$3) {
            aq.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(dcv $$0) {
         return $$0.a(dcz.tK) || $$0.a(dcz.wR) || $$0.a(dcz.wU) || $$0.a(dcz.tJ);
      }

      @Override
      public ame c() {
         return cyt.n;
      }
   }
}
