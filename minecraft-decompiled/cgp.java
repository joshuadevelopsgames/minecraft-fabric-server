import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgp<T extends cam> extends chi {
   protected final cau a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected faz d;
   protected final cjw e;
   protected final Class<T> f;
   protected final Predicate<cam> g;
   protected final Predicate<cam> h;
   private final clc k;

   public cgp(cau $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bzt.e::test);
   }

   public cgp(cau $$0, Class<T> $$1, Predicate<cam> $$2, float $$3, double $$4, double $$5, Predicate<cam> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.S();
      this.a(EnumSet.of(chi.a.a));
      this.k = clc.a().a($$3).a(($$2x, $$3x) -> $$6.test($$2x) && $$2.test($$2x));
   }

   public cgp(cau $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<cam> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = a(this.a).a(this.a.ai().a(this.f, this.a.cV().c(this.c, 3.0, this.c), $$0x -> true), this.k, this.a, this.a.dC(), this.a.dE(), this.a.dI());
      if (this.b == null) {
         return false;
      } else {
         fis $$0 = clg.a(this.a, 16, 7, this.b.dv());
         if ($$0 == null) {
            return false;
         } else if (this.b.h($$0.d, $$0.e, $$0.f) < this.b.g(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.d, $$0.e, $$0.f, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.e.l();
   }

   @Override
   public void d() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void a() {
      if (this.a.g((bzm)this.b) < 49.0) {
         this.a.S().a(this.j);
      } else {
         this.a.S().a(this.i);
      }
   }
}
