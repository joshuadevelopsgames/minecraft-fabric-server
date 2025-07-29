import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class gad {
   private static final int a = 5;
   private static final int b = -1;
   final fue c;
   private final List<gad.a<?>> d = new ArrayList<>();
   private final BitSet e = new BitSet(5);
   private final Deque<gac> f = Queues.newArrayDeque();
   private final Set<ayy> g = new HashSet<>();
   @Nullable
   private gad.a<fzz> h;

   public gad(fue $$0, fui $$1) {
      this.c = $$0;
      if ($$1.aA().c()) {
         this.e();
      }
   }

   public void a() {
      MutableBoolean $$0 = new MutableBoolean(false);
      this.d.removeIf($$1 -> {
         gac.a $$2 = $$1.i;
         $$1.d();
         if ($$1.i != $$2 && $$0.isFalse()) {
            $$0.setTrue();
            $$1.i.a(this.c.al());
         }

         if ($$1.c()) {
            this.e.clear($$1.e, $$1.e + $$1.f);
            return true;
         } else {
            return false;
         }
      });
      if (!this.f.isEmpty() && this.i() > 0) {
         this.f.removeIf($$0x -> {
            int $$1 = $$0x.i();
            int $$2 = this.a($$1);
            if ($$2 == -1) {
               return false;
            } else {
               this.d.add(new gad.a<>($$0x, $$2, $$1));
               this.e.set($$2, $$2 + $$1);
               ayy $$3 = $$0x.b();
               if ($$3 != null && this.g.add($$3)) {
                  this.c.al().a(hvm.a($$3, 1.0F, 1.0F));
               }

               return true;
            }
         });
      }

      this.g.clear();
      if (this.h != null) {
         this.h.d();
      }
   }

   public void a(fxb $$0) {
      if (!this.c.n.Y) {
         int $$1 = $$0.a();
         if (!this.d.isEmpty()) {
            $$0.c();
         }

         for (gad.a<?> $$2 : this.d) {
            $$2.a($$0, $$1);
         }

         if (this.c.n.aA().c() && this.h != null && (this.c.z == null || !(this.c.z instanceof geo))) {
            this.h.a($$0, $$1);
         }
      }
   }

   private int a(int $$0) {
      if (this.i() >= $$0) {
         int $$1 = 0;

         for (int $$2 = 0; $$2 < 5; $$2++) {
            if (this.e.get($$2)) {
               $$1 = 0;
            } else if (++$$1 == $$0) {
               return $$2 + 1 - $$1;
            }
         }
      }

      return -1;
   }

   private int i() {
      return 5 - this.e.cardinality();
   }

   @Nullable
   public <T extends gac> T a(Class<? extends T> $$0, Object $$1) {
      for (gad.a<?> $$2 : this.d) {
         if ($$2 != null && $$0.isAssignableFrom($$2.a().getClass()) && $$2.a().h().equals($$1)) {
            return (T)$$2.a();
         }
      }

      for (gac $$3 : this.f) {
         if ($$0.isAssignableFrom($$3.getClass()) && $$3.h().equals($$1)) {
            return (T)$$3;
         }
      }

      return null;
   }

   public void b() {
      this.e.clear();
      this.d.clear();
      this.f.clear();
   }

   public void a(gac $$0) {
      this.f.add($$0);
   }

   public void c() {
      if (this.h != null) {
         this.h.b();
         this.h.a().a(this.c.n);
      }
   }

   public void d() {
      if (this.h != null) {
         this.h.a().a(gac.a.b);
      }
   }

   public void e() {
      this.h = new gad.a<>(new fzz(), 0, 0);
   }

   public void f() {
      this.h = null;
   }

   public fue g() {
      return this.c;
   }

   public double h() {
      return this.c.n.E().c();
   }

   class a<T extends gac> {
      private static final long c = 600L;
      private final T d;
      final int e;
      final int f;
      private long g;
      private long h;
      gac.a i;
      private long j;
      private float k;
      protected boolean a;

      a(final T $$0, final int $$1, final int $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
         this.b();
      }

      public T a() {
         return this.d;
      }

      public void b() {
         this.g = -1L;
         this.h = -1L;
         this.i = gac.a.b;
         this.j = 0L;
         this.k = 0.0F;
         this.a = false;
      }

      public boolean c() {
         return this.a;
      }

      private void a(long $$0) {
         float $$1 = bcb.a((float)($$0 - this.g) / 600.0F, 0.0F, 1.0F);
         $$1 *= $$1;
         if (this.i == gac.a.b) {
            this.k = 1.0F - $$1;
         } else {
            this.k = $$1;
         }
      }

      public void d() {
         long $$0 = ag.c();
         if (this.g == -1L) {
            this.g = $$0;
            this.i = gac.a.a;
         }

         if (this.i == gac.a.a && $$0 - this.g <= 600L) {
            this.h = $$0;
         }

         this.j = $$0 - this.h;
         this.a($$0);
         this.d.a(gad.this, this.j);
         gac.a $$1 = this.d.a();
         if ($$1 != this.i) {
            this.g = $$0 - (int)((1.0F - this.k) * 600.0F);
            this.i = $$1;
         }

         boolean $$2 = this.a;
         this.a = this.i == gac.a.b && $$0 - this.g > 600L;
         if (this.a && !$$2) {
            this.d.d();
         }
      }

      public void a(fxb $$0, int $$1) {
         if (!this.a) {
            $$0.e().pushMatrix();
            $$0.e().translate(this.d.a($$1, this.k), this.d.a(this.e));
            this.d.a($$0, gad.this.c.h, this.j);
            $$0.e().popMatrix();
         }
      }
   }
}
