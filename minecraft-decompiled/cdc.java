import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdc extends ccd<cao> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private jb h;
   private int i;
   private int j;
   private int k;

   public cdc(float $$0) {
      super(ImmutableMap.of(cjo.x, cjp.a, cjo.n, cjp.b));
      this.g = $$0;
   }

   protected boolean a(aub $$0, cao $$1) {
      return $$1.g_() && this.b($$0, $$1);
   }

   protected void a(aub $$0, cao $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aub $$0, cao $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aub $$0, cao $$1, long $$2) {
      return $$1.g_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aub $$0, cao $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.R().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(cao $$0, jb $$1) {
      $$0.eh().a(cjo.n, new cjr($$1, this.g, 0));
   }

   private boolean b(aub $$0, cao $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aub $$0, cao $$1) {
      jb $$2 = $$1.dx();
      jb $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aub $$0, cao $$1) {
      return this.a($$0, $$1.dx());
   }

   private boolean a(aub $$0, jb $$1) {
      return $$0.a_($$1).a(azo.Q);
   }

   private Optional<jb> a(cao $$0) {
      return $$0.eh().c(cjo.x);
   }

   private boolean e(aub $$0, cao $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aub $$0, cao $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
