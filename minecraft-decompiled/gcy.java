import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class gcy {
   private static final int a = 2000962815;
   private final List<gcy.b> b = new ArrayList<>();
   private int c = Integer.MAX_VALUE;
   private gcy.b d;
   private final Set<Object> e = new HashSet<>();
   @Nullable
   private gcd f;

   public gcy() {
      this.a();
   }

   public void a() {
      this.d = new gcy.b(null);
      this.b.add(this.d);
   }

   public void b() {
      if (this.c != Integer.MAX_VALUE) {
         throw new IllegalStateException("Can only blur once per frame");
      } else {
         this.c = this.b.size() - 1;
      }
   }

   public void c() {
      if (this.d.b == null) {
         this.d.b = new gcy.b(this.d);
      }

      this.d = this.d.b;
   }

   public void d() {
      if (this.d.c == null) {
         this.d.c = new gcy.b(this.d);
      }

      this.d = this.d.c;
   }

   public void a(gcx $$0) {
      if (this.a((gda)$$0)) {
         this.e.add($$0.c().i());
         this.d.a($$0);
         this.a($$0.n());
      }
   }

   public void a(gcz $$0) {
      if (this.a((gda)$$0)) {
         this.d.a($$0);
         this.a($$0.n());
      }
   }

   public void a(gdj $$0) {
      if (this.a((gda)$$0)) {
         this.d.a($$0);
         this.a($$0.n());
      }
   }

   public void a(gcw $$0) {
      if (this.a((gda)$$0)) {
         this.d.a($$0);
         this.a($$0.n());
      }
   }

   private void a(@Nullable gcd $$0) {
   }

   private boolean a(gda $$0) {
      gcd $$1 = $$0.n();
      if ($$1 == null) {
         return false;
      } else {
         if (this.f != null && this.f.d($$1)) {
            this.c();
         } else {
            this.b($$1);
         }

         this.f = $$1;
         return true;
      }
   }

   private void b(gcd $$0) {
      gcy.b $$1 = this.b.getLast();

      while ($$1.b != null) {
         $$1 = $$1.b;
      }

      boolean $$2 = false;

      while (!$$2) {
         $$2 = this.a($$0, $$1.d) || this.a($$0, $$1.f) || this.a($$0, $$1.g) || this.a($$0, $$1.h);
         if ($$1.a == null) {
            break;
         }

         if (!$$2) {
            $$1 = $$1.a;
         }
      }

      this.d = $$1;
      if ($$2) {
         this.c();
      }
   }

   private boolean a(gcd $$0, @Nullable List<? extends gda> $$1) {
      if ($$1 != null) {
         for (gda $$2 : $$1) {
            gcd $$3 = $$2.n();
            if ($$3 != null && $$3.c($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(gcs $$0) {
      this.d.a($$0);
   }

   public void b(gcw $$0) {
      this.d.b($$0);
   }

   public Set<Object> e() {
      return this.e;
   }

   public void a(gcy.a $$0, gcy.c $$1) {
      MutableInt $$2 = new MutableInt(0);
      this.a($$2x -> {
         if ($$2x.d != null || $$2x.e != null) {
            int $$3 = $$2.incrementAndGet();
            if ($$2x.d != null) {
               for (gcw $$4 : $$2x.d) {
                  $$0.accept($$4, $$3);
               }
            }

            if ($$2x.e != null) {
               for (gcw $$5 : $$2x.e) {
                  $$0.accept($$5, $$3);
               }
            }
         }
      }, $$1);
   }

   public void a(Consumer<gcx> $$0) {
      gcy.b $$1 = this.d;
      this.a($$1x -> {
         if ($$1x.f != null) {
            this.d = $$1x;

            for (gcx $$2 : $$1x.f) {
               $$0.accept($$2);
            }
         }
      }, gcy.c.a);
      this.d = $$1;
   }

   public void b(Consumer<gcz> $$0) {
      gcy.b $$1 = this.d;
      this.a($$1x -> {
         if ($$1x.g != null) {
            for (gcz $$2 : $$1x.g) {
               this.d = $$1x;
               $$0.accept($$2);
            }
         }
      }, gcy.c.a);
      this.d = $$1;
   }

   public void c(Consumer<gdj> $$0) {
      gcy.b $$1 = this.d;
      this.a($$1x -> {
         if ($$1x.h != null) {
            this.d = $$1x;

            for (gdj $$2 : $$1x.h) {
               $$0.accept($$2);
            }
         }
      }, gcy.c.a);
      this.d = $$1;
   }

   public void a(Comparator<gcw> $$0) {
      this.a($$1 -> {
         if ($$1.d != null) {
            $$1.d.sort($$0);
         }
      }, gcy.c.a);
   }

   private void a(Consumer<gcy.b> $$0, gcy.c $$1) {
      int $$2 = 0;
      int $$3 = this.b.size();
      if ($$1 == gcy.c.b) {
         $$3 = Math.min(this.c, this.b.size());
      } else if ($$1 == gcy.c.c) {
         $$2 = this.c;
      }

      for (int $$4 = $$2; $$4 < $$3; $$4++) {
         gcy.b $$5 = this.b.get($$4);
         this.a($$5, $$0);
      }
   }

   private void a(gcy.b $$0, Consumer<gcy.b> $$1) {
      if ($$0.c != null) {
         this.a($$0.c, $$1);
      }

      $$1.accept($$0);
      if ($$0.b != null) {
         this.a($$0.b, $$1);
      }
   }

   public void f() {
      this.e.clear();
      this.b.clear();
      this.c = Integer.MAX_VALUE;
      this.a();
   }

   public interface a {
      void accept(gcw var1, int var2);
   }

   static class b {
      @Nullable
      public final gcy.b a;
      @Nullable
      public gcy.b b;
      @Nullable
      public gcy.b c;
      @Nullable
      public List<gcw> d;
      @Nullable
      public List<gcw> e;
      @Nullable
      public List<gcx> f;
      @Nullable
      public List<gcz> g;
      @Nullable
      public List<gdj> h;

      b(@Nullable gcy.b $$0) {
         this.a = $$0;
      }

      public void a(gcx $$0) {
         if (this.f == null) {
            this.f = new ArrayList<>();
         }

         this.f.add($$0);
      }

      public void a(gcz $$0) {
         if (this.g == null) {
            this.g = new ArrayList<>();
         }

         this.g.add($$0);
      }

      public void a(gdj $$0) {
         if (this.h == null) {
            this.h = new ArrayList<>();
         }

         this.h.add($$0);
      }

      public void a(gcw $$0) {
         if (this.d == null) {
            this.d = new ArrayList<>();
         }

         this.d.add($$0);
      }

      public void b(gcw $$0) {
         if (this.e == null) {
            this.e = new ArrayList<>();
         }

         this.e.add($$0);
      }
   }

   public static enum c {
      a,
      b,
      c;
   }
}
