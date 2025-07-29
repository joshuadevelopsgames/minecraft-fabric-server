import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cah {
   public static final int a = 3;
   private final bzm b;
   private int c;
   private final cah.a d = new cah.a(0, fis.c, 0.0F, 0.0F);
   @Nullable
   private fis e;
   @Nullable
   private fir f;
   @Nullable
   private final Consumer<cah> g;

   public cah(bzm $$0) {
      this($$0, 3, null);
   }

   public cah(bzm $$0, int $$1) {
      this($$0, $$1, null);
   }

   public cah(bzm $$0, @Nullable Consumer<cah> $$1) {
      this($$0, 3, $$1);
   }

   public cah(bzm $$0, int $$1, @Nullable Consumer<cah> $$2) {
      this.c = $$1;
      this.b = $$0;
      this.g = $$2;
   }

   public fis a() {
      return this.d.a > 0 ? this.d.b : this.b.dv();
   }

   public float b() {
      return this.d.a > 0 ? this.d.c : this.b.dP();
   }

   public float c() {
      return this.d.a > 0 ? this.d.d : this.b.dR();
   }

   public void a(fis $$0, float $$1, float $$2) {
      if (this.c == 0) {
         this.b.b($$0, $$1, $$2);
         this.f();
      } else {
         this.d.a = this.c;
         this.d.b = $$0;
         this.d.c = $$1;
         this.d.d = $$2;
         this.e = this.b.dv();
         this.f = new fir(this.b.dR(), this.b.dP());
         if (this.g != null) {
            this.g.accept(this);
         }
      }
   }

   public boolean d() {
      return this.d.a > 0;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   public void e() {
      if (!this.d()) {
         this.f();
      } else {
         double $$0 = 1.0 / this.d.a;
         if (this.e != null) {
            fis $$1 = this.b.dv().d(this.e);
            if (this.b.ai().a(this.b, this.b.c(this.d.b.e($$1)))) {
               this.d.a($$1);
            }
         }

         if (this.f != null) {
            float $$2 = this.b.dP() - this.f.k;
            float $$3 = this.b.dR() - this.f.j;
            this.d.a($$2, $$3);
         }

         double $$4 = bcb.d($$0, this.b.dC(), this.d.b.d);
         double $$5 = bcb.d($$0, this.b.dE(), this.d.b.e);
         double $$6 = bcb.d($$0, this.b.dI(), this.d.b.f);
         fis $$7 = new fis($$4, $$5, $$6);
         float $$8 = (float)bcb.e($$0, (double)this.b.dP(), (double)this.d.c);
         float $$9 = (float)bcb.d($$0, (double)this.b.dR(), (double)this.d.d);
         this.b.b($$7);
         this.b.b($$8, $$9);
         this.d.a();
         this.e = $$7;
         this.f = new fir(this.b.dR(), this.b.dP());
      }
   }

   public void f() {
      this.d.a = 0;
      this.e = null;
      this.f = null;
   }

   static class a {
      protected int a;
      fis b;
      float c;
      float d;

      a(int $$0, fis $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a() {
         this.a--;
      }

      public void a(fis $$0) {
         this.b = this.b.e($$0);
      }

      public void a(float $$0, float $$1) {
         this.c += $$0;
         this.d += $$1;
      }
   }
}
