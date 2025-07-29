import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class hoh {
   dct a;
   private int b;
   private boolean c;
   private boolean d;
   @Nullable
   private fin e;
   private hoh.b[] f;

   public hoh() {
      this.a = dct.a;
      this.f = new hoh.b[]{new hoh.b()};
   }

   public void a(int $$0) {
      int $$1 = this.f.length;
      int $$2 = this.b + $$0;
      if ($$2 > $$1) {
         this.f = Arrays.copyOf(this.f, $$2);

         for (int $$3 = $$1; $$3 < $$2; $$3++) {
            this.f[$$3] = new hoh.b();
         }
      }
   }

   public hoh.b a() {
      this.a(1);
      return this.f[this.b++];
   }

   public void b() {
      this.a = dct.a;

      for (int $$0 = 0; $$0 < this.b; $$0++) {
         this.f[$$0].a();
      }

      this.b = 0;
      this.c = false;
      this.d = false;
      this.e = null;
   }

   public void c() {
      this.c = true;
   }

   public boolean d() {
      return this.c;
   }

   public void a(Object $$0) {
   }

   private hoh.b i() {
      return this.f[0];
   }

   public boolean e() {
      return this.b == 0;
   }

   public boolean f() {
      return this.i().e;
   }

   @Nullable
   public hrs a(bck $$0) {
      return this.b == 0 ? null : this.f[$$0.a(this.b)].f;
   }

   public void a(Consumer<Vector3fc> $$0) {
      Vector3f $$1 = new Vector3f();
      fod.a $$2 = new fod.a();

      for (int $$3 = 0; $$3 < this.b; $$3++) {
         hoh.b $$4 = this.f[$$3];
         $$4.g.a(this.a.d(), $$2);
         Matrix4f $$5 = $$2.a();
         Vector3f[] $$6 = $$4.m.get();

         for (Vector3f $$7 : $$6) {
            $$0.accept($$1.set($$7).mulPosition($$5));
         }

         $$2.c();
      }
   }

   public void a(fod $$0, gxn $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < this.b; $$4++) {
         this.f[$$4].a($$0, $$1, $$2, $$3);
      }
   }

   public fin g() {
      if (this.e != null) {
         return this.e;
      } else {
         fin.a $$0 = new fin.a();
         this.a($$0::a);
         fin $$1 = $$0.a();
         this.e = $$1;
         return $$1;
      }
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public boolean h() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c;
   }

   public class b {
      private static final Vector3f[] c = new Vector3f[0];
      public static final Supplier<Vector3f[]> a = () -> c;
      private final List<gyv> d = new ArrayList<>();
      boolean e;
      @Nullable
      hrs f;
      gzf g = gzf.a;
      @Nullable
      private gxz h;
      private hoh.a i = hoh.a.a;
      private int[] j = new int[0];
      @Nullable
      private hqv<Object> k;
      @Nullable
      private Object l;
      Supplier<Vector3f[]> m = a;

      public void a() {
         this.d.clear();
         this.h = null;
         this.i = hoh.a.a;
         this.k = null;
         this.l = null;
         Arrays.fill(this.j, -1);
         this.e = false;
         this.f = null;
         this.g = gzf.a;
         this.m = a;
      }

      public List<gyv> b() {
         return this.d;
      }

      public void a(gxz $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.e = $$0;
      }

      public void a(Supplier<Vector3f[]> $$0) {
         this.m = $$0;
      }

      public void a(hrs $$0) {
         this.f = $$0;
      }

      public void a(gzf $$0) {
         this.g = $$0;
      }

      public <T> void a(hqv<T> $$0, @Nullable T $$1) {
         this.k = a($$0);
         this.l = $$1;
      }

      private static hqv<Object> a(hqv<?> $$0) {
         return (hqv<Object>)$$0;
      }

      public void a(hoh.a $$0) {
         this.i = $$0;
      }

      public int[] a(int $$0) {
         if ($$0 > this.j.length) {
            this.j = new int[$$0];
            Arrays.fill(this.j, -1);
         }

         return this.j;
      }

      void a(fod $$0, gxn $$1, int $$2, int $$3) {
         $$0.a();
         this.g.a(hoh.this.a.d(), $$0.c());
         if (this.k != null) {
            this.k.a(this.l, hoh.this.a, $$0, $$1, $$2, $$3, this.i != hoh.a.a);
         } else if (this.h != null) {
            hfd.a(hoh.this.a, $$0, $$1, $$2, $$3, this.j, this.d, this.h, this.i);
         }

         $$0.b();
      }
   }
}
