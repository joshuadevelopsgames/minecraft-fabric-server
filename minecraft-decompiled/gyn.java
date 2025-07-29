import javax.annotation.Nullable;

public class gyn {
   protected final gxh a;
   protected final dmu b;
   protected int c;
   protected int d;
   protected int e;
   private int g;
   private ke h;
   public hbl.a[] f;

   public gyn(hbl $$0, dmu $$1, int $$2, gxh $$3) {
      this.a = $$3;
      this.b = $$1;
      this.a($$2);
      this.a($$0);
      this.h = ke.a(this.g + 1, 0, this.g + 1);
   }

   protected void a(hbl $$0) {
      if (!fue.R().bx()) {
         throw new IllegalStateException("createSections called from wrong thread: " + Thread.currentThread().getName());
      } else {
         int $$1 = this.d * this.c * this.e;
         this.f = new hbl.a[$$1];

         for (int $$2 = 0; $$2 < this.d; $$2++) {
            for (int $$3 = 0; $$3 < this.c; $$3++) {
               for (int $$4 = 0; $$4 < this.e; $$4++) {
                  int $$5 = this.a($$2, $$3, $$4);
                  this.f[$$5] = $$0.new a($$5, ke.b($$2, $$3 + this.b.aq(), $$4));
               }
            }
         }
      }
   }

   public void a() {
      for (hbl.a $$0 : this.f) {
         $$0.d();
      }
   }

   private int a(int $$0, int $$1, int $$2) {
      return ($$2 * this.c + $$1) * this.d + $$0;
   }

   protected void a(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.d = $$1;
      this.c = this.b.ap();
      this.e = $$1;
      this.g = $$0;
   }

   public int b() {
      return this.g;
   }

   public dmw c() {
      return this.b;
   }

   public void a(ke $$0) {
      for (int $$1 = 0; $$1 < this.d; $$1++) {
         int $$2 = $$0.a() - this.g;
         int $$3 = $$2 + Math.floorMod($$1 - $$2, this.d);

         for (int $$4 = 0; $$4 < this.e; $$4++) {
            int $$5 = $$0.c() - this.g;
            int $$6 = $$5 + Math.floorMod($$4 - $$5, this.e);

            for (int $$7 = 0; $$7 < this.c; $$7++) {
               int $$8 = this.b.aq() + $$7;
               hbl.a $$9 = this.f[this.a($$1, $$7, $$4)];
               long $$10 = $$9.f();
               if ($$10 != ke.b($$3, $$8, $$6)) {
                  $$9.a(ke.b($$3, $$8, $$6));
               }
            }
         }
      }

      this.h = $$0;
      this.a.x().a();
   }

   public ke d() {
      return this.h;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      hbl.a $$4 = this.b($$0, $$1, $$2);
      if ($$4 != null) {
         $$4.a($$3);
      }
   }

   @Nullable
   protected hbl.a a(jb $$0) {
      return this.a(ke.c($$0));
   }

   @Nullable
   protected hbl.a a(long $$0) {
      int $$1 = ke.b($$0);
      int $$2 = ke.c($$0);
      int $$3 = ke.d($$0);
      return this.b($$1, $$2, $$3);
   }

   @Nullable
   private hbl.a b(int $$0, int $$1, int $$2) {
      if (!this.c($$0, $$1, $$2)) {
         return null;
      } else {
         int $$3 = $$1 - this.b.aq();
         int $$4 = Math.floorMod($$0, this.d);
         int $$5 = Math.floorMod($$2, this.e);
         return this.f[this.a($$4, $$3, $$5)];
      }
   }

   private boolean c(int $$0, int $$1, int $$2) {
      if ($$1 >= this.b.aq() && $$1 <= this.b.ar()) {
         return $$0 < this.h.a() - this.g || $$0 > this.h.a() + this.g ? false : $$2 >= this.h.c() - this.g && $$2 <= this.h.c() + this.g;
      } else {
         return false;
      }
   }
}
