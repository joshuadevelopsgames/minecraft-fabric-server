import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fxx extends fxm {
   private static final fzd d = new fzd(ame.b("widget/text_field"), ame.b("widget/text_field_highlighted"));
   public static final int a = -1;
   public static final int b = 1;
   private static final int e = 1;
   private static final int f = -3092272;
   private static final String m = "_";
   public static final int c = -2039584;
   private static final int n = 300;
   private final fwz o;
   private String p = "";
   private int q = 32;
   private boolean r = true;
   private boolean s = true;
   private boolean u = true;
   private boolean v = false;
   private boolean w = true;
   private int x;
   private int y;
   private int z;
   private int A = -2039584;
   private int B = -9408400;
   @Nullable
   private String C;
   @Nullable
   private Consumer<String> D;
   private Predicate<String> E = Objects::nonNull;
   private BiFunction<String, Integer, bbm> F = ($$0x, $$1x) -> bbm.forward($$0x, yl.a);
   @Nullable
   private xo G;
   private long H = ag.c();
   private int I;
   private int J;

   public fxx(fwz $$0, int $$1, int $$2, xo $$3) {
      this($$0, 0, 0, $$1, $$2, $$3);
   }

   public fxx(fwz $$0, int $$1, int $$2, int $$3, int $$4, xo $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public fxx(fwz $$0, int $$1, int $$2, int $$3, int $$4, @Nullable fxx $$5, xo $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.o = $$0;
      if ($$5 != null) {
         this.a($$5.a());
      }

      this.j();
   }

   public void b(Consumer<String> $$0) {
      this.D = $$0;
   }

   public void a(BiFunction<String, Integer, bbm> $$0) {
      this.F = $$0;
   }

   @Override
   protected yc d() {
      xo $$0 = this.A();
      return xo.a("gui.narrate.editBox", $$0, this.p);
   }

   public void a(String $$0) {
      if (this.E.test($$0)) {
         if ($$0.length() > this.q) {
            this.p = $$0.substring(0, this.q);
         } else {
            this.p = $$0;
         }

         this.c(false);
         this.o(this.y);
         this.d($$0);
      }
   }

   public String a() {
      return this.p;
   }

   public String b() {
      int $$0 = Math.min(this.y, this.z);
      int $$1 = Math.max(this.y, this.z);
      return this.p.substring($$0, $$1);
   }

   @Override
   public void j(int $$0) {
      super.j($$0);
      this.j();
   }

   @Override
   public void k(int $$0) {
      super.k($$0);
      this.j();
   }

   public void a(Predicate<String> $$0) {
      this.E = $$0;
   }

   public void b(String $$0) {
      int $$1 = Math.min(this.y, this.z);
      int $$2 = Math.max(this.y, this.z);
      int $$3 = this.q - this.p.length() - ($$1 - $$2);
      if ($$3 > 0) {
         String $$4 = bdb.g($$0);
         int $$5 = $$4.length();
         if ($$3 < $$5) {
            if (Character.isHighSurrogate($$4.charAt($$3 - 1))) {
               $$3--;
            }

            $$4 = $$4.substring(0, $$3);
            $$5 = $$3;
         }

         String $$6 = new StringBuilder(this.p).replace($$1, $$2, $$4).toString();
         if (this.E.test($$6)) {
            this.p = $$6;
            this.e($$1 + $$5);
            this.o(this.y);
            this.d(this.p);
         }
      }
   }

   private void d(String $$0) {
      if (this.D != null) {
         this.D.accept($$0);
      }

      this.j();
   }

   private void q(int $$0) {
      if (get.s()) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.z != this.y) {
            this.b("");
         } else {
            this.c(this.d($$0));
         }
      }
   }

   public void b(int $$0) {
      this.c(this.r($$0));
   }

   public void c(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.z != this.y) {
            this.b("");
         } else {
            int $$1 = Math.min($$0, this.y);
            int $$2 = Math.max($$0, this.y);
            if ($$1 != $$2) {
               String $$3 = new StringBuilder(this.p).delete($$1, $$2).toString();
               if (this.E.test($$3)) {
                  this.p = $$3;
                  this.b($$1, false);
               }
            }
         }
      }
   }

   public int d(int $$0) {
      return this.a($$0, this.e());
   }

   private int a(int $$0, int $$1) {
      return this.a($$0, $$1, true);
   }

   private int a(int $$0, int $$1, boolean $$2) {
      int $$3 = $$1;
      boolean $$4 = $$0 < 0;
      int $$5 = Math.abs($$0);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!$$4) {
            int $$7 = this.p.length();
            $$3 = this.p.indexOf(32, $$3);
            if ($$3 == -1) {
               $$3 = $$7;
            } else {
               while ($$2 && $$3 < $$7 && this.p.charAt($$3) == ' ') {
                  $$3++;
               }
            }
         } else {
            while ($$2 && $$3 > 0 && this.p.charAt($$3 - 1) == ' ') {
               $$3--;
            }

            while ($$3 > 0 && this.p.charAt($$3 - 1) != ' ') {
               $$3--;
            }
         }
      }

      return $$3;
   }

   public void a(int $$0, boolean $$1) {
      this.b(this.r($$0), $$1);
   }

   private int r(int $$0) {
      return ag.a(this.p, this.y, $$0);
   }

   public void b(int $$0, boolean $$1) {
      this.e($$0);
      if (!$$1) {
         this.o(this.y);
      }

      this.d(this.p);
   }

   public void e(int $$0) {
      this.y = bcb.a($$0, 0, this.p.length());
      this.s(this.y);
   }

   public void b(boolean $$0) {
      this.b(0, $$0);
   }

   public void c(boolean $$0) {
      this.b(this.p.length(), $$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.D() && this.aM_()) {
         switch ($$0) {
            case 259:
               if (this.u) {
                  this.q(-1);
               }

               return true;
            case 260:
            case 264:
            case 265:
            case 266:
            case 267:
            default:
               if (get.f($$0)) {
                  this.c(false);
                  this.o(0);
                  return true;
               } else if (get.e($$0)) {
                  fue.R().p.a(this.b());
                  return true;
               } else if (get.d($$0)) {
                  if (this.l()) {
                     this.b(fue.R().p.a());
                  }

                  return true;
               } else {
                  if (get.c($$0)) {
                     fue.R().p.a(this.b());
                     if (this.l()) {
                        this.b("");
                     }

                     return true;
                  }

                  return false;
               }
            case 261:
               if (this.u) {
                  this.q(1);
               }

               return true;
            case 262:
               if (get.s()) {
                  this.b(this.d(1), get.t());
               } else {
                  this.a(1, get.t());
               }

               return true;
            case 263:
               if (get.s()) {
                  this.b(this.d(-1), get.t());
               } else {
                  this.a(-1, get.t());
               }

               return true;
            case 268:
               this.b(get.t());
               return true;
            case 269:
               this.c(get.t());
               return true;
         }
      } else {
         return false;
      }
   }

   public boolean c() {
      return this.D() && this.aM_() && this.l();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.c()) {
         return false;
      } else if (bdb.a($$0)) {
         if (this.u) {
            this.b(Character.toString($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      int $$2 = bcb.a($$0) - this.I;
      String $$3 = this.o.a(this.p.substring(this.x), this.h());
      this.b(this.o.a($$3, $$2).length() + this.x, get.t());
   }

   @Override
   public void a(hwx $$0) {
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.i()) {
         if (this.g()) {
            ame $$4 = d.a(this.D(), this.aM_());
            $$0.a(gxx.ar, $$4, this.E(), this.F(), this.z(), this.y());
         }

         int $$5 = this.u ? this.A : this.B;
         int $$6 = this.y - this.x;
         String $$7 = this.o.a(this.p.substring(this.x), this.h());
         boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
         boolean $$9 = this.aM_() && (ag.c() - this.H) / 300L % 2L == 0L && $$8;
         int $$10 = this.I;
         int $$11 = bcb.a(this.z - this.x, 0, $$7.length());
         if (!$$7.isEmpty()) {
            String $$12 = $$8 ? $$7.substring(0, $$6) : $$7;
            bbm $$13 = this.F.apply($$12, this.x);
            $$0.a(this.o, $$13, $$10, this.J, $$5, this.w);
            $$10 += this.o.a($$13) + 1;
         }

         boolean $$14 = this.y < this.p.length() || this.p.length() >= this.k();
         int $$15 = $$10;
         if (!$$8) {
            $$15 = $$6 > 0 ? this.I + this.g : this.I;
         } else if ($$14) {
            $$15 = $$10 - 1;
            $$10--;
         }

         if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.a(this.o, this.F.apply($$7.substring($$6), this.y), $$10, this.J, $$5, this.w);
         }

         if (this.G != null && $$7.isEmpty() && !this.aM_()) {
            $$0.b(this.o, this.G, $$10, this.J, $$5);
         }

         if (!$$14 && this.C != null) {
            $$0.a(this.o, this.C, $$15 - 1, this.J, -8355712, this.w);
         }

         if ($$11 != $$6) {
            int $$16 = this.I + this.o.b($$7.substring(0, $$11));
            $$0.d(Math.min($$15, this.E() + this.g), this.J - 1, Math.min($$16 - 1, this.E() + this.g), this.J + 1 + 9);
         }

         if ($$9) {
            if ($$14) {
               $$0.a($$15, this.J - 1, $$15 + 1, this.J + 1 + 9, -3092272);
            } else {
               $$0.a(this.o, "_", $$15, this.J, $$5, this.w);
            }
         }
      }
   }

   private void j() {
      if (this.o != null) {
         String $$0 = this.o.a(this.p.substring(this.x), this.h());
         this.I = this.E() + (this.m() ? (this.z() - this.o.b($$0)) / 2 : (this.r ? 4 : 0));
         this.J = this.r ? this.F() + (this.h - 8) / 2 : this.F();
      }
   }

   public void f(int $$0) {
      this.q = $$0;
      if (this.p.length() > $$0) {
         this.p = this.p.substring(0, $$0);
         this.d(this.p);
      }
   }

   private int k() {
      return this.q;
   }

   public int e() {
      return this.y;
   }

   public boolean g() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
      this.j();
   }

   public void m(int $$0) {
      this.A = $$0;
   }

   public void n(int $$0) {
      this.B = $$0;
   }

   @Override
   public void a(boolean $$0) {
      if (this.s || $$0) {
         super.a($$0);
         if ($$0) {
            this.H = ag.c();
         }
      }
   }

   private boolean l() {
      return this.u;
   }

   public void e(boolean $$0) {
      this.u = $$0;
   }

   private boolean m() {
      return this.v;
   }

   public void f(boolean $$0) {
      this.v = $$0;
      this.j();
   }

   public void g(boolean $$0) {
      this.w = $$0;
   }

   public int h() {
      return this.g() ? this.g - 8 : this.g;
   }

   public void o(int $$0) {
      this.z = bcb.a($$0, 0, this.p.length());
      this.s(this.z);
   }

   private void s(int $$0) {
      if (this.o != null) {
         this.x = Math.min(this.x, this.p.length());
         int $$1 = this.h();
         String $$2 = this.o.a(this.p.substring(this.x), $$1);
         int $$3 = $$2.length() + this.x;
         if ($$0 == this.x) {
            this.x = this.x - this.o.a(this.p, $$1, true).length();
         }

         if ($$0 > $$3) {
            this.x += $$0 - $$3;
         } else if ($$0 <= this.x) {
            this.x = this.x - (this.x - $$0);
         }

         this.x = bcb.a(this.x, 0, this.p.length());
      }
   }

   public void h(boolean $$0) {
      this.s = $$0;
   }

   public boolean i() {
      return this.k;
   }

   public void i(boolean $$0) {
      this.k = $$0;
   }

   public void c(@Nullable String $$0) {
      this.C = $$0;
   }

   public int p(int $$0) {
      return $$0 > this.p.length() ? this.E() : this.E() + this.o.b(this.p.substring(0, $$0));
   }

   @Override
   public void a(gbt $$0) {
      $$0.a(gbs.a, this.d());
   }

   public void c(xo $$0) {
      this.G = $$0;
   }
}
