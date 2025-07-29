import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyt implements gbl {
   private static final int a = 4;
   private static final int b = 10;
   final gbl c;
   private final fyt.a d;
   private int e;
   private int f;

   public fyt(fue $$0, gbl $$1, int $$2) {
      this.c = $$1;
      this.d = new fyt.a($$0, 0, $$2);
   }

   public void a(int $$0) {
      this.e = $$0;
      this.d.h(Math.max(this.c.z(), $$0));
   }

   public void b(int $$0) {
      this.f = $$0;
      this.d.i(Math.min(this.c.y(), $$0));
      this.d.h();
   }

   @Override
   public void a() {
      this.c.a();
      int $$0 = this.c.z();
      this.d.h(Math.max($$0 + 20, this.e));
      this.d.i(Math.min(this.c.y(), this.f));
      this.d.h();
   }

   @Override
   public void b(Consumer<gbm> $$0) {
      $$0.accept(this.d);
   }

   @Override
   public void j(int $$0) {
      this.d.j($$0);
   }

   @Override
   public void k(int $$0) {
      this.d.k($$0);
   }

   @Override
   public int E() {
      return this.d.E();
   }

   @Override
   public int F() {
      return this.d.F();
   }

   @Override
   public int z() {
      return this.d.z();
   }

   @Override
   public int y() {
      return this.d.y();
   }

   class a extends fxf {
      private final fue c;
      private final List<fxm> d = new ArrayList<>();

      public a(final fue $$0, final int $$1, final int $$2) {
         super(0, 0, $$1, $$2, xn.a);
         this.c = $$0;
         fyt.this.c.a(this.d::add);
      }

      @Override
      protected int n() {
         return fyt.this.c.y();
      }

      @Override
      protected double o() {
         return 10.0;
      }

      @Override
      protected void b(fxb $$0, int $$1, int $$2, float $$3) {
         $$0.c(this.E(), this.F(), this.E() + this.g, this.F() + this.h);

         for (fxm $$4 : this.d) {
            $$4.a($$0, $$1, $$2, $$3);
         }

         $$0.f();
         this.c($$0);
      }

      @Override
      protected void a(gbt $$0) {
      }

      @Override
      public gcd a_(gcb $$0) {
         return new gcd(this.E(), this.F(), this.g, this.n());
      }

      @Override
      public void a(@Nullable fzn $$0) {
         super.a($$0);
         if ($$0 != null && this.c.aY().b()) {
            gcd $$1 = this.I();
            gcd $$2 = $$0.I();
            int $$3 = $$2.b() - $$1.b();
            int $$4 = $$2.c() - $$1.c();
            if ($$3 < 0) {
               this.a(this.g() + $$3 - 14.0);
            } else if ($$4 > 0) {
               this.a(this.g() + $$4 + 14.0);
            }
         }
      }

      @Override
      public void j(int $$0) {
         super.j($$0);
         fyt.this.c.j($$0 + 10);
      }

      @Override
      public void k(int $$0) {
         super.k($$0);
         fyt.this.c.k($$0 - (int)this.g());
      }

      @Override
      public void a(double $$0) {
         super.a($$0);
         fyt.this.c.k(this.I().b() - (int)this.g());
      }

      @Override
      public List<? extends fzn> aH_() {
         return this.d;
      }

      @Override
      public Collection<? extends gbr> aO_() {
         return this.d;
      }
   }
}
