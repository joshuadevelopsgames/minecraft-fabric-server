import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cjw {
   private static final int p = 20;
   private static final int q = 100;
   private static final float r = 0.25F;
   protected final cao a;
   protected final dmu b;
   @Nullable
   protected faz c;
   protected double d;
   protected int e;
   protected int f;
   protected fis g = fis.c;
   protected kg h = kg.i;
   protected long i;
   protected long j;
   protected double k;
   protected float l = 0.5F;
   protected boolean m;
   protected long n;
   protected fay o;
   @Nullable
   private jb s;
   private int t;
   private float u = 1.0F;
   private final fbb v;
   private boolean w;
   private float x = 16.0F;

   public cjw(cao $$0, dmu $$1) {
      this.a = $$0;
      this.b = $$1;
      this.v = this.a(bcb.a($$0.j(cbs.n) * 16.0));
   }

   public void f() {
      int $$0 = bcb.d(this.s() * 16.0F);
      this.v.a($$0);
   }

   public void a(float $$0) {
      this.x = $$0;
      this.f();
   }

   private float s() {
      return Math.max((float)this.a.i(cbs.n), this.x);
   }

   public void g() {
      this.u = 1.0F;
   }

   public void b(float $$0) {
      this.u = $$0;
   }

   @Nullable
   public jb h() {
      return this.s;
   }

   protected abstract fbb a(int var1);

   public void a(double $$0) {
      this.d = $$0;
   }

   public void i() {
      if (this.b.ae() - this.n > 20L) {
         if (this.s != null) {
            this.c = null;
            this.c = this.a(this.s, this.t);
            this.n = this.b.ae();
            this.m = false;
         }
      } else {
         this.m = true;
      }
   }

   @Nullable
   public final faz a(double $$0, double $$1, double $$2, int $$3) {
      return this.a(jb.a($$0, $$1, $$2), $$3);
   }

   @Nullable
   public faz a(Stream<jb> $$0, int $$1) {
      return this.a($$0.collect(Collectors.toSet()), 8, false, $$1);
   }

   @Nullable
   public faz a(Set<jb> $$0, int $$1) {
      return this.a($$0, 8, false, $$1);
   }

   @Nullable
   public faz a(jb $$0, int $$1) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1);
   }

   @Nullable
   public faz a(jb $$0, int $$1, int $$2) {
      return this.a(ImmutableSet.of($$0), 8, false, $$1, $$2);
   }

   @Nullable
   public faz a(bzm $$0, int $$1) {
      return this.a(ImmutableSet.of($$0.dx()), 16, true, $$1);
   }

   @Nullable
   protected faz a(Set<jb> $$0, int $$1, boolean $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.s());
   }

   @Nullable
   protected faz a(Set<jb> $$0, int $$1, boolean $$2, int $$3, float $$4) {
      if ($$0.isEmpty()) {
         return null;
      } else if (this.a.dE() < this.b.L_()) {
         return null;
      } else if (!this.a()) {
         return null;
      } else if (this.c != null && !this.c.c() && $$0.contains(this.s)) {
         return this.c;
      } else {
         btt $$5 = bts.a();
         $$5.a("pathfind");
         jb $$6 = $$2 ? this.a.dx().d() : this.a.dx();
         int $$7 = (int)($$4 + $$1);
         dnh $$8 = new dnh(this.b, $$6.b(-$$7, -$$7, -$$7), $$6.b($$7, $$7, $$7));
         faz $$9 = this.v.a($$8, this.a, $$0, $$4, $$3, this.u);
         $$5.c();
         if ($$9 != null && $$9.l() != null) {
            this.s = $$9.l();
            this.t = $$3;
            this.u();
         }

         return $$9;
      }
   }

   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a(this.a($$0, $$1, $$2, 1), $$3);
   }

   public boolean a(double $$0, double $$1, double $$2, int $$3, double $$4) {
      return this.a(this.a($$0, $$1, $$2, $$3), $$4);
   }

   public boolean a(bzm $$0, double $$1) {
      faz $$2 = this.a($$0, 1);
      return $$2 != null && this.a($$2, $$1);
   }

   public boolean a(@Nullable faz $$0, double $$1) {
      if ($$0 == null) {
         this.c = null;
         return false;
      } else {
         if (!$$0.a(this.c)) {
            this.c = $$0;
         }

         if (this.l()) {
            return false;
         } else {
            this.e();
            if (this.c.e() <= 0) {
               return false;
            } else {
               this.d = $$1;
               fis $$2 = this.b();
               this.f = this.e;
               this.g = $$2;
               return true;
            }
         }
      }
   }

   @Nullable
   public faz j() {
      return this.c;
   }

   public void d() {
      this.e++;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            fis $$0 = this.b();
            fis $$1 = this.c.a(this.a);
            if ($$0.e > $$1.e && !this.a.aK() && bcb.a($$0.d) == bcb.a($$1.d) && bcb.a($$0.f) == bcb.a($$1.f)) {
               this.c.a();
            }
         }

         ahj.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            fis $$2 = this.c.a(this.a);
            this.a.Q().a($$2.d, this.a($$2), $$2.f, this.d);
         }
      }
   }

   protected double a(fis $$0) {
      jb $$1 = jb.a((jv)$$0);
      return this.b.a_($$1.e()).l() ? $$0.e : fbh.a(this.b, $$1);
   }

   protected void k() {
      fis $$0 = this.b();
      this.l = this.a.ds() > 0.75F ? this.a.ds() / 2.0F : 0.75F - this.a.ds() / 2.0F;
      kg $$1 = this.c.g();
      double $$2 = Math.abs(this.a.dC() - ($$1.u() + 0.5));
      double $$3 = Math.abs(this.a.dE() - $$1.v());
      double $$4 = Math.abs(this.a.dI() - ($$1.w() + 0.5));
      boolean $$5 = $$2 < this.l && $$4 < this.l && $$3 < 1.0;
      if ($$5 || this.b(this.c.h().l) && this.c($$0)) {
         this.c.a();
      }

      this.b($$0);
   }

   private boolean c(fis $$0) {
      if (this.c.f() + 1 >= this.c.e()) {
         return false;
      } else {
         fis $$1 = fis.c(this.c.g());
         if (!$$0.a((jv)$$1, 2.0)) {
            return false;
         } else if (this.a($$0, this.c.a(this.a))) {
            return true;
         } else {
            fis $$2 = fis.c(this.c.d(this.c.f() + 1));
            fis $$3 = $$1.d($$0);
            fis $$4 = $$2.d($$0);
            double $$5 = $$3.h();
            double $$6 = $$4.h();
            boolean $$7 = $$6 < $$5;
            boolean $$8 = $$5 < 0.5;
            if (!$$7 && !$$8) {
               return false;
            } else {
               fis $$9 = $$3.d();
               fis $$10 = $$4.d();
               return $$10.b($$9) < 0.0;
            }
         }
      }
   }

   protected void b(fis $$0) {
      if (this.e - this.f > 100) {
         float $$1 = this.a.fu() >= 1.0F ? this.a.fu() : this.a.fu() * this.a.fu();
         float $$2 = $$1 * 100.0F * 0.25F;
         if ($$0.g(this.g) < $$2 * $$2) {
            this.w = true;
            this.n();
         } else {
            this.w = false;
         }

         this.f = this.e;
         this.g = $$0;
      }

      if (this.c != null && !this.c.c()) {
         kg $$3 = this.c.g();
         long $$4 = this.b.ae();
         if ($$3.equals(this.h)) {
            this.i = this.i + ($$4 - this.j);
         } else {
            this.h = $$3;
            double $$5 = $$0.f(fis.c(this.h));
            this.k = this.a.fu() > 0.0F ? $$5 / this.a.fu() * 20.0 : 0.0;
         }

         if (this.k > 0.0 && this.i > this.k * 3.0) {
            this.t();
         }

         this.j = $$4;
      }
   }

   private void t() {
      this.u();
      this.n();
   }

   private void u() {
      this.h = kg.i;
      this.i = 0L;
      this.k = 0.0;
      this.w = false;
   }

   public boolean l() {
      return this.c == null || this.c.c();
   }

   public boolean m() {
      return !this.l();
   }

   public void n() {
      this.c = null;
   }

   protected abstract fis b();

   protected abstract boolean a();

   protected void e() {
      if (this.c != null) {
         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            fax $$1 = this.c.a($$0);
            fax $$2 = $$0 + 1 < this.c.e() ? this.c.a($$0 + 1) : null;
            eeb $$3 = this.b.a_(new jb($$1.a, $$1.b, $$1.c));
            if ($$3.a(azo.bp)) {
               this.c.a($$0, $$1.a($$1.a, $$1.b + 1, $$1.c));
               if ($$2 != null && $$1.b >= $$2.b) {
                  this.c.a($$0 + 1, $$1.a($$2.a, $$1.b + 1, $$2.c));
               }
            }
         }
      }
   }

   protected boolean a(fis $$0, fis $$1) {
      return false;
   }

   public boolean b(fbc $$0) {
      return $$0 != fbc.n && $$0 != fbc.p && $$0 != fbc.d;
   }

   protected static boolean a(cao $$0, fis $$1, fis $$2, boolean $$3) {
      fis $$4 = new fis($$2.d, $$2.e + $$0.dt() * 0.5, $$2.f);
      return $$0.ai().a(new dmb($$1, $$4, dmb.a.a, $$3 ? dmb.b.c : dmb.b.a, $$0)).d() == fiq.a.a;
   }

   public boolean a(jb $$0) {
      jb $$1 = $$0.e();
      return this.b.a_($$1).s();
   }

   public fay o() {
      return this.o;
   }

   public void a(boolean $$0) {
      this.o.c($$0);
   }

   public boolean p() {
      return this.o.f();
   }

   public boolean b(jb $$0) {
      if (this.m) {
         return false;
      } else if (this.c != null && !this.c.c() && this.c.e() != 0) {
         fax $$1 = this.c.d();
         fis $$2 = new fis(($$1.a + this.a.dC()) / 2.0, ($$1.b + this.a.dE()) / 2.0, ($$1.c + this.a.dI()) / 2.0);
         return $$0.a($$2, this.c.e() - this.c.f());
      } else {
         return false;
      }
   }

   public float q() {
      return this.l;
   }

   public boolean r() {
      return this.w;
   }

   public abstract boolean c();

   public void d(boolean $$0) {
      this.o.b($$0);
   }
}
