import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class ebo extends eci implements cze {
   public static final int d = 3;
   public static final int e = 3;
   public static final int f = 9;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 9;
   public static final int j = 10;
   private static final int q = 0;
   private static final int r = 0;
   private ju<dcv> s = ju.a(9, dcv.l);
   private int t = 0;
   protected final cyy k = new cyy() {
      private final int[] a = new int[9];
      private int b = 0;

      @Override
      public int a(int $$0) {
         return $$0 == 9 ? this.b : this.a[$$0];
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 9) {
            this.b = $$1;
         } else {
            this.a[$$0] = $$1;
         }
      }

      @Override
      public int a() {
         return 10;
      }
   };

   public ebo(jb $$0, eeb $$1) {
      super(ebb.Q, $$0, $$1);
   }

   @Override
   protected xo j() {
      return xo.c("container.crafter");
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return new czc($$0, $$1, this, this.k);
   }

   public void a(int $$0, boolean $$1) {
      if (this.e($$0)) {
         this.k.a($$0, $$1 ? 0 : 1);
         this.e();
      }
   }

   public boolean c(int $$0) {
      return $$0 >= 0 && $$0 < 9 ? this.k.a($$0) == 1 : false;
   }

   @Override
   public boolean b(int $$0, dcv $$1) {
      if (this.k.a($$0) == 1) {
         return false;
      } else {
         dcv $$2 = this.s.get($$0);
         int $$3 = $$2.M();
         if ($$3 >= $$2.k()) {
            return false;
         } else {
            return $$2.f() ? true : !this.a($$3, $$2, $$0);
         }
      }
   }

   private boolean a(int $$0, dcv $$1, int $$2) {
      for (int $$3 = $$2 + 1; $$3 < 9; $$3++) {
         if (!this.c($$3)) {
            dcv $$4 = this.a($$3);
            if ($$4.f() || $$4.M() < $$0 && dcv.c($$4, $$1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.t = $$0.a("crafting_ticks_remaining", 0);
      this.s = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.s);
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         this.k.a($$1, 0);
      }

      $$0.h("disabled_slots").ifPresent($$0x -> {
         for (int $$1x : $$0x) {
            if (this.e($$1x)) {
               this.k.a($$1x, 1);
            }
         }
      });
      this.k.a(9, $$0.a("triggered", 0));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("crafting_ticks_remaining", this.t);
      if (!this.d_($$0)) {
         bxd.a($$0, this.s);
      }

      this.g($$0);
      this.h($$0);
   }

   @Override
   public int b() {
      return 9;
   }

   @Override
   public boolean c() {
      for (dcv $$0 : this.s) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dcv a(int $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      if (this.c($$0)) {
         this.a($$0, true);
      }

      super.a($$0, $$1);
   }

   @Override
   public boolean a(cut $$0) {
      return bxc.a(this, $$0);
   }

   @Override
   public ju<dcv> f() {
      return this.s;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.s = $$0;
   }

   @Override
   public int ay_() {
      return 3;
   }

   @Override
   public int g() {
      return 3;
   }

   @Override
   public void fillStackedContents(cuz $$0) {
      for (dcv $$1 : this.s) {
         $$0.a($$1);
      }
   }

   private void g(fdc $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < 9; $$2++) {
         if (this.c($$2)) {
            $$1.add($$2);
         }
      }

      $$0.a("disabled_slots", $$1.toIntArray());
   }

   private void h(fdc $$0) {
      $$0.a("triggered", this.k.a(9));
   }

   public void a(boolean $$0) {
      this.k.a(9, $$0 ? 1 : 0);
   }

   @VisibleForTesting
   public boolean k() {
      return this.k.a(9) == 1;
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebo $$3) {
      int $$4 = $$3.t - 1;
      if ($$4 >= 0) {
         $$3.t = $$4;
         if ($$4 == 0) {
            $$0.a($$1, $$2.b(drt.b, false), 3);
         }
      }
   }

   public void d(int $$0) {
      this.t = $$0;
   }

   public int u() {
      int $$0 = 0;

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         dcv $$2 = this.a($$1);
         if (!$$2.f() || this.c($$1)) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 && this.s.get($$0).f();
   }
}
