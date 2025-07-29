import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxp {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 100;
   private static final int c = -1;
   private static final int d = 4;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 60;
   private static final xo h = xo.c("chat.deleted_marker").a(o.h, o.u);
   private final fue i;
   private final bam<String> j = new bam<>(100);
   private final List<ftx> k = Lists.newArrayList();
   private final List<ftx.a> l = Lists.newArrayList();
   private int m;
   private boolean n;
   private final List<fxp.a> o = new ArrayList<>();

   public fxp(fue $$0) {
      this.i = $$0;
      this.j.addAll($$0.be().a());
   }

   public void a() {
      if (!this.o.isEmpty()) {
         this.m();
      }
   }

   private int a(int $$0, int $$1, boolean $$2, int $$3, fxp.b $$4) {
      int $$5 = this.o();
      int $$6 = 0;

      for (int $$7 = Math.min(this.l.size() - this.m, $$0) - 1; $$7 >= 0; $$7--) {
         int $$8 = $$7 + this.m;
         ftx.a $$9 = this.l.get($$8);
         if ($$9 != null) {
            int $$10 = $$1 - $$9.a();
            float $$11 = $$2 ? 1.0F : (float)b($$10);
            if ($$11 > 1.0E-5F) {
               $$6++;
               int $$12 = $$3 - $$7 * $$5;
               int $$13 = $$12 - $$5;
               $$4.accept(0, $$13, $$12, $$9, $$7, $$11);
            }
         }
      }

      return $$6;
   }

   public void a(fxb $$0, int $$1, int $$2, int $$3, boolean $$4) {
      if (!this.l()) {
         int $$5 = this.j();
         int $$6 = this.l.size();
         if ($$6 > 0) {
            btt $$7 = bts.a();
            $$7.a("chat");
            float $$8 = (float)this.h();
            int $$9 = bcb.f(this.f() / $$8);
            int $$10 = $$0.b();
            $$0.e().pushMatrix();
            $$0.e().scale($$8, $$8);
            $$0.e().translate(4.0F, 0.0F);
            int $$11 = bcb.d(($$10 - 40) / $$8);
            int $$12 = this.d(this.c($$2), this.d($$3));
            float $$13 = this.i.n.p().c().floatValue() * 0.9F + 0.1F;
            float $$14 = this.i.n.t().c().floatValue();
            double $$15 = this.i.n.q().c();
            int $$16 = (int)Math.round(-8.0 * ($$15 + 1.0) + 4.0 * $$15);
            this.a($$5, $$1, $$4, $$11, ($$6x, $$7x, $$8x, $$9x, $$10x, $$11x) -> {
               $$0.a($$6x - 4, $$7x, $$6x + $$9 + 4 + 4, $$8x, baj.a($$11x * $$14, -16777216));
               fty $$12x = $$9x.c();
               if ($$12x != null) {
                  int $$13x = baj.a($$11x * $$13, $$12x.e());
                  $$0.a($$6x - 4, $$7x, $$6x - 2, $$8x, $$13x);
                  if ($$10x == $$12 && $$12x.f() != null) {
                     int $$14x = this.a($$9x);
                     int $$15x = $$8x + $$16 + 9;
                     this.a($$0, $$14x, $$15x, $$12x.f());
                  }
               }
            });
            int $$17 = this.a($$5, $$1, $$4, $$11, ($$3x, $$4x, $$5x, $$6x, $$7x, $$8x) -> {
               int $$9x = $$5x + $$16;
               $$0.b(this.i.h, $$6x.b(), $$3x, $$9x, baj.a($$8x * $$13, -1));
            });
            long $$18 = this.i.ba().c();
            if ($$18 > 0L) {
               int $$19 = (int)(128.0F * $$13);
               int $$20 = (int)(255.0F * $$14);
               $$0.e().pushMatrix();
               $$0.e().translate(0.0F, $$11);
               $$0.a(-2, 0, $$9 + 4, 9, $$20 << 24);
               $$0.b(this.i.h, xo.a("chat.queue", $$18), 0, 1, baj.c($$19, -1));
               $$0.e().popMatrix();
            }

            if ($$4) {
               int $$21 = this.o();
               int $$22 = $$6 * $$21;
               int $$23 = $$17 * $$21;
               int $$24 = this.m * $$23 / $$6 - $$11;
               int $$25 = $$23 * $$23 / $$22;
               if ($$22 != $$23) {
                  int $$26 = $$24 > 0 ? 170 : 96;
                  int $$27 = this.n ? 13382451 : 3355562;
                  int $$28 = $$9 + 4;
                  $$0.a($$28, -$$24, $$28 + 2, -$$24 - $$25, baj.c($$26, $$27));
                  $$0.a($$28 + 2, -$$24, $$28 + 1, -$$24 - $$25, baj.c($$26, 13421772));
               }
            }

            $$0.e().popMatrix();
            $$7.c();
         }
      }
   }

   private void a(fxb $$0, int $$1, int $$2, fty.a $$3) {
      int $$4 = $$2 - $$3.d - 1;
      $$3.a($$0, $$1, $$4);
   }

   private int a(ftx.a $$0) {
      return this.i.h.a($$0.b()) + 4;
   }

   private boolean l() {
      return this.i.n.o().c() == cuq.c;
   }

   private static double b(int $$0) {
      double $$1 = $$0 / 200.0;
      $$1 = 1.0 - $$1;
      $$1 *= 10.0;
      $$1 = bcb.a($$1, 0.0, 1.0);
      return $$1 * $$1;
   }

   public void a(boolean $$0) {
      this.i.ba().d();
      this.o.clear();
      this.l.clear();
      this.k.clear();
      if ($$0) {
         this.j.clear();
         this.j.addAll(this.i.be().a());
      }
   }

   public void a(xo $$0) {
      this.a($$0, null, this.i.X() ? fty.b() : fty.a());
   }

   public void a(xo $$0, @Nullable ya $$1, @Nullable fty $$2) {
      ftx $$3 = new ftx(this.i.m.f(), $$0, $$1, $$2);
      this.a($$3);
      this.b($$3);
      this.c($$3);
   }

   private void a(ftx $$0) {
      String $$1 = $$0.c().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
      String $$2 = y.a($$0.e(), fty::h);
      if ($$2 != null) {
         a.info("[{}] [CHAT] {}", $$2, $$1);
      } else {
         a.info("[CHAT] {}", $$1);
      }
   }

   private void b(ftx $$0) {
      int $$1 = bcb.a(this.f() / this.h());
      fty.a $$2 = $$0.a();
      if ($$2 != null) {
         $$1 -= $$2.c + 4 + 2;
      }

      List<bbm> $$3 = fxt.a($$0.c(), $$1, this.i.h);
      boolean $$4 = this.e();

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         bbm $$6 = $$3.get($$5);
         if ($$4 && this.m > 0) {
            this.n = true;
            this.a(1);
         }

         boolean $$7 = $$5 == $$3.size() - 1;
         this.l.add(0, new ftx.a($$0.b(), $$6, $$0.e(), $$7));
      }

      while (this.l.size() > 100) {
         this.l.remove(this.l.size() - 1);
      }
   }

   private void c(ftx $$0) {
      this.k.add(0, $$0);

      while (this.k.size() > 100) {
         this.k.remove(this.k.size() - 1);
      }
   }

   private void m() {
      int $$0 = this.i.m.f();
      this.o.removeIf($$1 -> $$0 >= $$1.b() ? this.b($$1.a()) == null : false);
   }

   public void a(ya $$0) {
      fxp.a $$1 = this.b($$0);
      if ($$1 != null) {
         this.o.add($$1);
      }
   }

   @Nullable
   private fxp.a b(ya $$0) {
      int $$1 = this.i.m.f();
      ListIterator<ftx> $$2 = this.k.listIterator();

      while ($$2.hasNext()) {
         ftx $$3 = $$2.next();
         if ($$0.equals($$3.d())) {
            int $$4 = $$3.b() + 60;
            if ($$1 >= $$4) {
               $$2.set(this.d($$3));
               this.n();
               return null;
            }

            return new fxp.a($$0, $$4);
         }
      }

      return null;
   }

   private ftx d(ftx $$0) {
      return new ftx($$0.b(), h, null, fty.a());
   }

   public void b() {
      this.d();
      this.n();
   }

   private void n() {
      this.l.clear();

      for (ftx $$0 : Lists.reverse(this.k)) {
         this.b($$0);
      }
   }

   public bam<String> c() {
      return this.j;
   }

   public void a(String $$0) {
      if (!$$0.equals(this.j.peekLast())) {
         if (this.j.size() >= 100) {
            this.j.removeFirst();
         }

         this.j.addLast($$0);
      }

      if ($$0.startsWith("/")) {
         this.i.be().a($$0);
      }
   }

   public void d() {
      this.m = 0;
      this.n = false;
   }

   public void a(int $$0) {
      this.m += $$0;
      int $$1 = this.l.size();
      if (this.m > $$1 - this.j()) {
         this.m = $$1 - this.j();
      }

      if (this.m <= 0) {
         this.m = 0;
         this.n = false;
      }
   }

   public boolean a(double $$0, double $$1) {
      if (this.e() && !this.i.n.Y && !this.l()) {
         gse $$2 = this.i.ba();
         if ($$2.c() == 0L) {
            return false;
         } else {
            double $$3 = $$0 - 2.0;
            double $$4 = this.i.aP().p() - $$1 - 40.0;
            if ($$3 <= bcb.a(this.f() / this.h()) && $$4 < 0.0 && $$4 > bcb.a(-9.0 * this.h())) {
               $$2.b();
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Nullable
   public yl b(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.e($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         ftx.a $$5 = this.l.get($$4);
         return this.i.h.b().a($$5.b(), bcb.a($$2));
      } else {
         return null;
      }
   }

   @Nullable
   public fty c(double $$0, double $$1) {
      double $$2 = this.c($$0);
      double $$3 = this.d($$1);
      int $$4 = this.d($$2, $$3);
      if ($$4 >= 0 && $$4 < this.l.size()) {
         ftx.a $$5 = this.l.get($$4);
         fty $$6 = $$5.c();
         if ($$6 != null && this.a($$2, $$5, $$6)) {
            return $$6;
         }
      }

      return null;
   }

   private boolean a(double $$0, ftx.a $$1, fty $$2) {
      if ($$0 < 0.0) {
         return true;
      } else {
         fty.a $$3 = $$2.f();
         if ($$3 == null) {
            return false;
         } else {
            int $$4 = this.a($$1);
            int $$5 = $$4 + $$3.c;
            return $$0 >= $$4 && $$0 <= $$5;
         }
      }
   }

   private double c(double $$0) {
      return $$0 / this.h() - 4.0;
   }

   private double d(double $$0) {
      double $$1 = this.i.aP().p() - $$0 - 40.0;
      return $$1 / (this.h() * this.o());
   }

   private int d(double $$0, double $$1) {
      int $$2 = this.e($$0, $$1);
      if ($$2 == -1) {
         return -1;
      } else {
         while ($$2 >= 0) {
            if (this.l.get($$2).d()) {
               return $$2;
            }

            $$2--;
         }

         return $$2;
      }
   }

   private int e(double $$0, double $$1) {
      if (this.e() && !this.l()) {
         if (!($$0 < -4.0) && !($$0 > bcb.a(this.f() / this.h()))) {
            int $$2 = Math.min(this.j(), this.l.size());
            if ($$1 >= 0.0 && $$1 < $$2) {
               int $$3 = bcb.a($$1 + this.m);
               if ($$3 >= 0 && $$3 < this.l.size()) {
                  return $$3;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public boolean e() {
      return this.i.z instanceof gdp;
   }

   public int f() {
      return a(this.i.n.A().c());
   }

   public int g() {
      return b(this.e() ? this.i.n.C().c() : this.i.n.B().c());
   }

   public double h() {
      return this.i.n.z().c();
   }

   public static int a(double $$0) {
      int $$1 = 320;
      int $$2 = 40;
      return bcb.a($$0 * 280.0 + 40.0);
   }

   public static int b(double $$0) {
      int $$1 = 180;
      int $$2 = 20;
      return bcb.a($$0 * 160.0 + 20.0);
   }

   public static double i() {
      int $$0 = 180;
      int $$1 = 20;
      return 70.0 / (b(1.0) - 20);
   }

   public int j() {
      return this.g() / this.o();
   }

   private int o() {
      return (int)(9.0 * (this.i.n.q().c() + 1.0));
   }

   public fxp.c k() {
      return new fxp.c(List.copyOf(this.k), List.copyOf(this.j), List.copyOf(this.o));
   }

   public void a(fxp.c $$0) {
      this.j.clear();
      this.j.addAll($$0.b);
      this.o.clear();
      this.o.addAll($$0.c);
      this.k.clear();
      this.k.addAll($$0.a);
      this.n();
   }

   record a(ya a, int b) {
   }

   @FunctionalInterface
   interface b {
      void accept(int var1, int var2, int var3, ftx.a var4, int var5, float var6);
   }

   public static class c {
      final List<ftx> a;
      final List<String> b;
      final List<fxp.a> c;

      public c(List<ftx> $$0, List<String> $$1, List<fxp.a> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
