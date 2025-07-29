import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.atomic.AtomicLong;

public class ekb implements ejp {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private final AtomicLong h = new AtomicLong();
   private final ekc i = new ekc(this);

   public ekb(long $$0) {
      this.b($$0);
   }

   @Override
   public bck d() {
      return new ekb(this.g());
   }

   @Override
   public ekn e() {
      return new ekb.a(this.g());
   }

   @Override
   public void b(long $$0) {
      if (!this.h.compareAndSet(this.h.get(), ($$0 ^ 25214903917L) & 281474976710655L)) {
         throw bdd.a("LegacyRandomSource", null);
      } else {
         this.i.a();
      }
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h.get();
      long $$2 = $$1 * 25214903917L + 11L & 281474976710655L;
      if (!this.h.compareAndSet($$1, $$2)) {
         throw bdd.a("LegacyRandomSource", null);
      } else {
         return (int)($$2 >> 48 - $$0);
      }
   }

   @Override
   public double k() {
      return this.i.b();
   }

   public static class a implements ekn {
      private final long a;

      public a(long $$0) {
         this.a = $$0;
      }

      @Override
      public bck a(int $$0, int $$1, int $$2) {
         long $$3 = bcb.b($$0, $$1, $$2);
         long $$4 = $$3 ^ this.a;
         return new ekb($$4);
      }

      @Override
      public bck a(String $$0) {
         int $$1 = $$0.hashCode();
         return new ekb($$1 ^ this.a);
      }

      @Override
      public bck a(long $$0) {
         return new ekb($$0);
      }

      @VisibleForTesting
      @Override
      public void a(StringBuilder $$0) {
         $$0.append("LegacyPositionalRandomFactory{").append(this.a).append("}");
      }
   }
}
