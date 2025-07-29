import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fxv<T> extends fxe {
   public static final BooleanSupplier a = get::u;
   private static final List<Boolean> b = ImmutableList.of(Boolean.TRUE, Boolean.FALSE);
   private final xo c;
   private int d;
   private T f;
   private final fxv.c<T> m;
   private final Function<T, xo> n;
   private final Function<fxv<T>, yc> o;
   private final fxv.b<T> p;
   private final boolean q;
   private final fuh.l<T> r;

   fxv(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      xo $$4,
      xo $$5,
      int $$6,
      T $$7,
      fxv.c<T> $$8,
      Function<T, xo> $$9,
      Function<fxv<T>, yc> $$10,
      fxv.b<T> $$11,
      fuh.l<T> $$12,
      boolean $$13
   ) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.f = $$7;
      this.m = $$8;
      this.n = $$9;
      this.o = $$10;
      this.p = $$11;
      this.q = $$13;
      this.r = $$12;
      this.g();
   }

   private void g() {
      this.a(this.r.apply(this.f));
   }

   @Override
   public void b() {
      if (get.t()) {
         this.a(-1);
      } else {
         this.a(1);
      }
   }

   private void a(int $$0) {
      List<T> $$1 = this.m.a();
      this.d = bcb.b(this.d + $$0, $$1.size());
      T $$2 = $$1.get(this.d);
      this.b($$2);
      this.p.onValueChange(this, $$2);
   }

   private T b(int $$0) {
      List<T> $$1 = this.m.a();
      return $$1.get(bcb.b(this.d + $$0, $$1.size()));
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if ($$3 > 0.0) {
         this.a(-1);
      } else if ($$3 < 0.0) {
         this.a(1);
      }

      return true;
   }

   public void a(T $$0) {
      List<T> $$1 = this.m.a();
      int $$2 = $$1.indexOf($$0);
      if ($$2 != -1) {
         this.d = $$2;
      }

      this.b($$0);
   }

   private void b(T $$0) {
      xo $$1 = this.c($$0);
      this.b($$1);
      this.f = $$0;
      this.g();
   }

   private xo c(T $$0) {
      return (xo)(this.q ? this.n.apply($$0) : this.d($$0));
   }

   private yc d(T $$0) {
      return xn.a(this.c, this.n.apply($$0));
   }

   public T a() {
      return this.f;
   }

   @Override
   protected yc d() {
      return this.o.apply(this);
   }

   @Override
   public void a(gbt $$0) {
      $$0.a(gbs.a, this.d());
      if (this.j) {
         T $$1 = this.b(1);
         xo $$2 = this.c($$1);
         if (this.aM_()) {
            $$0.a(gbs.d, xo.a("narration.cycle_button.usage.focused", $$2));
         } else {
            $$0.a(gbs.d, xo.a("narration.cycle_button.usage.hovered", $$2));
         }
      }
   }

   public yc c() {
      return a_((xo)(this.q ? this.d(this.f) : this.A()));
   }

   public static <T> fxv.a<T> a(Function<T, xo> $$0) {
      return new fxv.a<>($$0);
   }

   public static fxv.a<Boolean> a(xo $$0, xo $$1) {
      return new fxv.a<Boolean>($$2 -> $$2 ? $$0 : $$1).a(b);
   }

   public static fxv.a<Boolean> e() {
      return new fxv.a<Boolean>($$0 -> $$0 ? xn.b : xn.c).a(b);
   }

   public static fxv.a<Boolean> b(boolean $$0) {
      return e().a(Boolean.valueOf($$0));
   }

   public static class a<T> {
      private int a;
      @Nullable
      private T b;
      private final Function<T, xo> c;
      private fuh.l<T> d = $$0x -> null;
      private Function<fxv<T>, yc> e = fxv::c;
      private fxv.c<T> f = fxv.c.a(ImmutableList.of());
      private boolean g;

      public a(Function<T, xo> $$0) {
         this.c = $$0;
      }

      public fxv.a<T> a(Collection<T> $$0) {
         return this.a(fxv.c.a($$0));
      }

      @SafeVarargs
      public final fxv.a<T> a(T... $$0) {
         return this.a(ImmutableList.copyOf($$0));
      }

      public fxv.a<T> a(List<T> $$0, List<T> $$1) {
         return this.a(fxv.c.a(fxv.a, $$0, $$1));
      }

      public fxv.a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         return this.a(fxv.c.a($$0, $$1, $$2));
      }

      public fxv.a<T> a(fxv.c<T> $$0) {
         this.f = $$0;
         return this;
      }

      public fxv.a<T> a(fuh.l<T> $$0) {
         this.d = $$0;
         return this;
      }

      public fxv.a<T> a(T $$0) {
         this.b = $$0;
         int $$1 = this.f.b().indexOf($$0);
         if ($$1 != -1) {
            this.a = $$1;
         }

         return this;
      }

      public fxv.a<T> a(Function<fxv<T>, yc> $$0) {
         this.e = $$0;
         return this;
      }

      public fxv.a<T> a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public fxv.a<T> a() {
         return this.a(true);
      }

      public fxv<T> a(xo $$0, fxv.b<T> $$1) {
         return this.a(0, 0, 150, 20, $$0, $$1);
      }

      public fxv<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4) {
         return this.a($$0, $$1, $$2, $$3, $$4, ($$0x, $$1x) -> {});
      }

      public fxv<T> a(int $$0, int $$1, int $$2, int $$3, xo $$4, fxv.b<T> $$5) {
         List<T> $$6 = this.f.b();
         if ($$6.isEmpty()) {
            throw new IllegalStateException("No values for cycle button");
         } else {
            T $$7 = this.b != null ? this.b : $$6.get(this.a);
            xo $$8 = this.c.apply($$7);
            xo $$9 = (xo)(this.g ? $$8 : xn.a($$4, $$8));
            return new fxv<>($$0, $$1, $$2, $$3, $$9, $$4, this.a, $$7, this.f, this.c, this.e, $$5, this.d, this.g);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void onValueChange(fxv<T> var1, T var2);
   }

   public interface c<T> {
      List<T> a();

      List<T> b();

      static <T> fxv.c<T> a(Collection<T> $$0) {
         final List<T> $$1 = ImmutableList.copyOf($$0);
         return new fxv.c<T>() {
            @Override
            public List<T> a() {
               return $$1;
            }

            @Override
            public List<T> b() {
               return $$1;
            }
         };
      }

      static <T> fxv.c<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
         final List<T> $$3 = ImmutableList.copyOf($$1);
         final List<T> $$4 = ImmutableList.copyOf($$2);
         return new fxv.c<T>() {
            @Override
            public List<T> a() {
               return $$0.getAsBoolean() ? $$4 : $$3;
            }

            @Override
            public List<T> b() {
               return $$3;
            }
         };
      }
   }
}
