import java.time.Duration;
import javax.annotation.Nullable;

public class fze {
   @Nullable
   private fzb a;
   private Duration b = Duration.ZERO;
   private long c;
   private boolean d;

   public void a(Duration $$0) {
      this.b = $$0;
   }

   public void a(@Nullable fzb $$0) {
      this.a = $$0;
   }

   @Nullable
   public fzb a() {
      return this.a;
   }

   public void a(fxb $$0, int $$1, int $$2, boolean $$3, boolean $$4, gcd $$5) {
      if (this.a == null) {
         this.d = false;
      } else {
         fue $$6 = fue.R();
         boolean $$7 = $$3 || $$4 && $$6.aY().b();
         if ($$7 != this.d) {
            if ($$7) {
               this.c = ag.c();
            }

            this.d = $$7;
         }

         if ($$7 && ag.c() - this.c > this.b.toMillis()) {
            $$0.a($$6.h, this.a.a($$6), this.a($$5, $$3, $$4), $$1, $$2, $$4);
         }
      }
   }

   private ghy a(gcd $$0, boolean $$1, boolean $$2) {
      return (ghy)(!$$1 && $$2 && fue.R().aY().b() ? new ght($$0) : new gia($$0));
   }

   public void a(gbt $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }
   }
}
