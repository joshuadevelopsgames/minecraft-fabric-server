import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciq extends chi {
   private static final clc d = clc.b().d();
   private static final double e = 2.5;
   private final clc f;
   protected final cao a;
   protected final double b;
   private double g;
   private double h;
   private double i;
   private double j;
   private double k;
   @Nullable
   protected cut c;
   private int l;
   private boolean m;
   private final Predicate<dcv> n;
   private final boolean o;
   private final double p;

   public ciq(cau $$0, double $$1, Predicate<dcv> $$2, boolean $$3) {
      this((cao)$$0, $$1, $$2, $$3, 2.5);
   }

   public ciq(cau $$0, double $$1, Predicate<dcv> $$2, boolean $$3, double $$4) {
      this((cao)$$0, $$1, $$2, $$3, $$4);
   }

   ciq(cao $$0, double $$1, Predicate<dcv> $$2, boolean $$3, double $$4) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
      this.o = $$3;
      this.p = $$4;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
      this.f = d.c().a(($$0x, $$1x) -> this.a($$0x));
   }

   @Override
   public boolean b() {
      if (this.l > 0) {
         this.l--;
         return false;
      } else {
         this.c = a(this.a).a(this.f.a(this.a.i(cbs.F)), this.a);
         return this.c != null;
      }
   }

   private boolean a(cam $$0) {
      return this.n.test($$0.fh()) || this.n.test($$0.fi());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.c) < 36.0) {
            if (this.c.h(this.g, this.h, this.i) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs(this.c.dR() - this.j) > 5.0 || Math.abs(this.c.dP() - this.k) > 5.0) {
               return false;
            }
         } else {
            this.g = this.c.dC();
            this.h = this.c.dE();
            this.i = this.c.dI();
         }

         this.j = this.c.dR();
         this.k = this.c.dP();
      }

      return this.b();
   }

   protected boolean h() {
      return this.o;
   }

   @Override
   public void d() {
      this.g = this.c.dC();
      this.h = this.c.dE();
      this.i = this.c.dI();
      this.m = true;
   }

   @Override
   public void e() {
      this.c = null;
      this.i();
      this.l = b(100);
      this.m = false;
   }

   @Override
   public void a() {
      this.a.P().a(this.c, this.a.gh() + 20, this.a.gg());
      if (this.a.g(this.c) < this.p * this.p) {
         this.i();
      } else {
         this.a(this.c);
      }
   }

   protected void i() {
      this.a.S().n();
   }

   protected void a(cut $$0) {
      this.a.S().a($$0, this.b);
   }

   public boolean k() {
      return this.m;
   }

   public static class a extends ciq {
      public a(cao $$0, double $$1, Predicate<dcv> $$2, boolean $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected void i() {
         this.a.Q().g();
      }

      @Override
      protected void a(cut $$0) {
         fis $$1 = $$0.bI().d(this.a.dv()).c(this.a.ec().j()).e(this.a.dv());
         this.a.Q().a($$1.d, $$1.e, $$1.f, this.b);
      }
   }
}
