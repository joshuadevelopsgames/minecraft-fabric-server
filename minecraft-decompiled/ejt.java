import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ejt {
   Codec<ejt> b = eju.b;
   Codec<jl<ejt>> c = ama.a(mn.aS, b);
   Codec<ejt> d = c.xmap(eju.j::new, $$0 -> (jl)($$0 instanceof eju.j $$1 ? $$1.j() : new jl.a<>($$0)));

   double a(ejt.b var1);

   void a(double[] var1, ejt.a var2);

   ejt a(ejt.f var1);

   double a();

   double b();

   bbu<? extends ejt> c();

   default ejt a(double $$0, double $$1) {
      return new eju.g(this, $$0, $$1);
   }

   default ejt d() {
      return eju.a(this, eju.k.a.a);
   }

   default ejt e() {
      return eju.a(this, eju.k.a.b);
   }

   default ejt f() {
      return eju.a(this, eju.k.a.c);
   }

   default ejt g() {
      return eju.a(this, eju.k.a.d);
   }

   default ejt h() {
      return eju.a(this, eju.k.a.e);
   }

   default ejt i() {
      return eju.a(this, eju.k.a.f);
   }

   public interface a {
      ejt.b a(int var1);

      void a(double[] var1, ejt var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default elc d() {
         return elc.a();
      }
   }

   public record c(jl<ezo.a> b, @Nullable ezo c) {
      public static final Codec<ejt.c> a = ezo.a.b.xmap($$0 -> new ejt.c($$0, null), ejt.c::b);

      public c(jl<ezo.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ejt {
      @Override
      default void a(double[] $$0, ejt.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ejt a(ejt.f $$0) {
         return $$0.apply(this);
      }
   }

   public record e(int a, int b, int c) implements ejt.b {
   }

   public interface f {
      ejt apply(ejt var1);

      default ejt.c a(ejt.c $$0) {
         return $$0;
      }
   }
}
