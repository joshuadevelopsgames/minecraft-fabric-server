import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class fyk {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = Integer.MAX_VALUE;
   private static final int c = 2;
   private final fwz d;
   private final List<fyk.a> e = Lists.newArrayList();
   private String f;
   private int g;
   private int h;
   private boolean i;
   private int j = Integer.MAX_VALUE;
   private int k = Integer.MAX_VALUE;
   private final int l;
   private Consumer<String> m = $$0x -> {};
   private Runnable n = () -> {};

   public fyk(fwz $$0, int $$1) {
      this.d = $$0;
      this.l = $$1;
      this.a("");
   }

   public int a() {
      return this.j;
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Character limit cannot be negative");
      } else {
         this.j = $$0;
      }
   }

   public void b(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Character limit cannot be negative");
      } else {
         this.k = $$0;
      }
   }

   public boolean b() {
      return this.j != Integer.MAX_VALUE;
   }

   public boolean c() {
      return this.k != Integer.MAX_VALUE;
   }

   public void a(Consumer<String> $$0) {
      this.m = $$0;
   }

   public void a(Runnable $$0) {
      this.n = $$0;
   }

   public void a(String $$0) {
      this.a($$0, false);
   }

   public void a(String $$0, boolean $$1) {
      String $$2 = this.c($$0);
      if ($$1 || !this.e($$2)) {
         this.f = $$2;
         this.g = this.f.length();
         this.h = this.g;
         this.o();
      }
   }

   public String d() {
      return this.f;
   }

   public void b(String $$0) {
      if (!$$0.isEmpty() || this.j()) {
         String $$1 = this.d(bdb.a($$0, true));
         fyk.a $$2 = this.f();
         String $$3 = new StringBuilder(this.f).replace($$2.a, $$2.b, $$1).toString();
         if (!this.e($$3)) {
            this.f = $$3;
            this.g = $$2.a + $$1.length();
            this.h = this.g;
            this.o();
         }
      }
   }

   public void c(int $$0) {
      if (!this.j()) {
         this.h = bcb.a(this.g + $$0, 0, this.f.length());
      }

      this.b("");
   }

   public int e() {
      return this.g;
   }

   public void a(boolean $$0) {
      this.i = $$0;
   }

   public fyk.a f() {
      return new fyk.a(Math.min(this.h, this.g), Math.max(this.h, this.g));
   }

   public int g() {
      return this.e.size();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.e.size(); $$0++) {
         fyk.a $$1 = this.e.get($$0);
         if (this.g >= $$1.a && this.g <= $$1.b) {
            return $$0;
         }
      }

      return -1;
   }

   public fyk.a d(int $$0) {
      return this.e.get(bcb.a($$0, 0, this.e.size() - 1));
   }

   public void a(fzc $$0, int $$1) {
      switch ($$0) {
         case a:
            this.g = $$1;
            break;
         case b:
            this.g += $$1;
            break;
         case c:
            this.g = this.f.length() + $$1;
      }

      this.g = bcb.a(this.g, 0, this.f.length());
      this.n.run();
      if (!this.i) {
         this.h = this.g;
      }
   }

   public void e(int $$0) {
      if ($$0 != 0) {
         int $$1 = this.d.b(this.f.substring(this.n().a, this.g)) + 2;
         fyk.a $$2 = this.g($$0);
         int $$3 = this.d.a(this.f.substring($$2.a, $$2.b), $$1).length();
         this.a(fzc.a, $$2.a + $$3);
      }
   }

   public void a(double $$0, double $$1) {
      int $$2 = bcb.a($$0);
      int $$3 = bcb.a($$1 / 9.0);
      fyk.a $$4 = this.e.get(bcb.a($$3, 0, this.e.size() - 1));
      int $$5 = this.d.a(this.f.substring($$4.a, $$4.b), $$2).length();
      this.a(fzc.a, $$4.a + $$5);
   }

   public boolean f(int $$0) {
      this.i = get.t();
      if (get.f($$0)) {
         this.g = this.f.length();
         this.h = 0;
         return true;
      } else if (get.e($$0)) {
         fue.R().p.a(this.k());
         return true;
      } else if (get.d($$0)) {
         this.b(fue.R().p.a());
         return true;
      } else if (get.c($$0)) {
         fue.R().p.a(this.k());
         this.b("");
         return true;
      } else {
         switch ($$0) {
            case 257:
            case 335:
               this.b("\n");
               return true;
            case 259:
               if (get.s()) {
                  fyk.a $$3 = this.l();
                  this.c($$3.a - this.g);
               } else {
                  this.c(-1);
               }

               return true;
            case 261:
               if (get.s()) {
                  fyk.a $$4 = this.m();
                  this.c($$4.a - this.g);
               } else {
                  this.c(1);
               }

               return true;
            case 262:
               if (get.s()) {
                  fyk.a $$2 = this.m();
                  this.a(fzc.a, $$2.a);
               } else {
                  this.a(fzc.b, 1);
               }

               return true;
            case 263:
               if (get.s()) {
                  fyk.a $$1 = this.l();
                  this.a(fzc.a, $$1.a);
               } else {
                  this.a(fzc.b, -1);
               }

               return true;
            case 264:
               if (!get.s()) {
                  this.e(1);
               }

               return true;
            case 265:
               if (!get.s()) {
                  this.e(-1);
               }

               return true;
            case 266:
               this.a(fzc.a, 0);
               return true;
            case 267:
               this.a(fzc.c, 0);
               return true;
            case 268:
               if (get.s()) {
                  this.a(fzc.a, 0);
               } else {
                  this.a(fzc.a, this.n().a);
               }

               return true;
            case 269:
               if (get.s()) {
                  this.a(fzc.c, 0);
               } else {
                  this.a(fzc.a, this.n().b);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public Iterable<fyk.a> i() {
      return this.e;
   }

   public boolean j() {
      return this.h != this.g;
   }

   @VisibleForTesting
   public String k() {
      fyk.a $$0 = this.f();
      return this.f.substring($$0.a, $$0.b);
   }

   private fyk.a n() {
      return this.g(0);
   }

   private fyk.a g(int $$0) {
      int $$1 = this.h();
      if ($$1 < 0) {
         b.error("Cursor is not within text (cursor = {}, length = {})", this.g, this.f.length());
         return this.e.getLast();
      } else {
         return this.e.get(bcb.a($$1 + $$0, 0, this.e.size() - 1));
      }
   }

   @VisibleForTesting
   public fyk.a l() {
      if (this.f.isEmpty()) {
         return fyk.a.c;
      } else {
         int $$0 = bcb.a(this.g, 0, this.f.length() - 1);

         while ($$0 > 0 && Character.isWhitespace(this.f.charAt($$0 - 1))) {
            $$0--;
         }

         while ($$0 > 0 && !Character.isWhitespace(this.f.charAt($$0 - 1))) {
            $$0--;
         }

         return new fyk.a($$0, this.h($$0));
      }
   }

   @VisibleForTesting
   public fyk.a m() {
      if (this.f.isEmpty()) {
         return fyk.a.c;
      } else {
         int $$0 = bcb.a(this.g, 0, this.f.length() - 1);

         while ($$0 < this.f.length() && !Character.isWhitespace(this.f.charAt($$0))) {
            $$0++;
         }

         while ($$0 < this.f.length() && Character.isWhitespace(this.f.charAt($$0))) {
            $$0++;
         }

         return new fyk.a($$0, this.h($$0));
      }
   }

   private int h(int $$0) {
      int $$1 = $$0;

      while ($$1 < this.f.length() && !Character.isWhitespace(this.f.charAt($$1))) {
         $$1++;
      }

      return $$1;
   }

   private void o() {
      this.p();
      this.m.accept(this.f);
      this.n.run();
   }

   private void p() {
      this.e.clear();
      if (this.f.isEmpty()) {
         this.e.add(fyk.a.c);
      } else {
         this.d.b().a(this.f, this.l, yl.a, false, ($$0, $$1, $$2) -> this.e.add(new fyk.a($$1, $$2)));
         if (this.f.charAt(this.f.length() - 1) == '\n') {
            this.e.add(new fyk.a(this.f.length(), this.f.length()));
         }
      }
   }

   private String c(String $$0) {
      return this.b() ? bdb.a($$0, this.j, false) : $$0;
   }

   private String d(String $$0) {
      String $$1 = $$0;
      if (this.b()) {
         int $$2 = this.j - this.f.length();
         $$1 = bdb.a($$0, $$2, false);
      }

      return $$1;
   }

   private boolean e(String $$0) {
      return this.c() && this.d.b().g($$0, this.l, yl.a).size() + (bdb.d($$0) ? 1 : 0) > this.k;
   }

   protected record a(int a, int b) {
      static final fyk.a c = new fyk.a(0, 0);
   }
}
