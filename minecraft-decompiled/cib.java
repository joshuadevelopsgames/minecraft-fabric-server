import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cib extends chi {
   public static final int b = 1;
   protected final cau c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<cau, bae<byd>> a;

   public cib(cau $$0, double $$1) {
      this($$0, $$1, azp.F);
   }

   public cib(cau $$0, double $$1, bae<byd> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cib(cau $$0, double $$1, Function<cau, bae<byd>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.cb()) {
            jb $$0 = this.a(this.c.ai(), this.c, 5);
            if ($$0 != null) {
               this.e = $$0.u();
               this.f = $$0.v();
               this.g = $$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.c.eN() != null && this.c.eN().a(this.a.apply(this.c));
   }

   protected boolean i() {
      fis $$0 = clg.a(this.c, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.e = $$0.d;
         this.f = $$0.e;
         this.g = $$0.f;
         return true;
      }
   }

   public boolean k() {
      return this.h;
   }

   @Override
   public void d() {
      this.c.S().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.S().l();
   }

   @Nullable
   protected jb a(dly $$0, bzm $$1, int $$2) {
      jb $$3 = $$1.dx();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : jb.a($$1.dx(), $$2, 1, $$1x -> $$0.b_($$1x).a(azu.a)).orElse(null);
   }
}
