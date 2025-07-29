import java.util.List;
import java.util.Map;

public class czp extends cyn {
   public static final int o = 0;
   public static final int p = 0;
   private static final int H = 2;
   private static final int I = 2;
   public static final int q = 1;
   public static final int r = 4;
   public static final int s = 5;
   public static final int t = 5;
   public static final int u = 4;
   public static final int v = 9;
   public static final int w = 9;
   public static final int x = 36;
   public static final int y = 36;
   public static final int z = 45;
   public static final int A = 45;
   public static final ame B = ame.b("container/slot/helmet");
   public static final ame C = ame.b("container/slot/chestplate");
   public static final ame D = ame.b("container/slot/leggings");
   public static final ame E = ame.b("container/slot/boots");
   public static final ame F = ame.b("container/slot/shield");
   private static final Map<bzw, ame> J = Map.of(bzw.c, E, bzw.d, D, bzw.e, C, bzw.f, B);
   private static final bzw[] K = new bzw[]{bzw.f, bzw.e, bzw.d, bzw.c};
   public final boolean G;
   private final cut L;

   public czp(cus $$0, boolean $$1, final cut $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bzw $$4 = K[$$3];
         ame $$5 = J.get($$4);
         this.a(new cyq($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new dak($$0, 40, 77, 62) {
         @Override
         public void a(dcv $$0, dcv $$1x) {
            $$2.a(bzw.b, $$1x, $$0);
            super.a($$0, $$1x);
         }

         @Override
         public ame c() {
            return czp.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bxc $$0) {
      if (this.L.ai() instanceof aub $$1) {
         czf.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.ai().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cut $$0) {
      return true;
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         bzw $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return dcv.l;
            }
         } else if ($$5.a() == bzw.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return dcv.l;
            }
         } else if ($$5 == bzw.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.a(dcv.l, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(dcv $$0, dak $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public dak m() {
      return this.k.get(0);
   }

   @Override
   public List<dak> n() {
      return this.k.subList(1, 5);
   }

   public cze r() {
      return this.m;
   }

   @Override
   public dac am_() {
      return dac.a;
   }

   @Override
   protected cut q() {
      return this.L;
   }
}
