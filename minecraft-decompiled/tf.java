import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class tf {
   final sz a;
   private final List<sw> b = Lists.newArrayList();
   private int c;

   tf(sz $$0) {
      this.a = $$0;
      this.c = $$0.p();
   }

   public tf a(Runnable $$0) {
      this.b.add(sw.a($$0));
      return this;
   }

   public tf a(long $$0, Runnable $$1) {
      this.b.add(sw.a($$0, $$1));
      return this;
   }

   public tf a(int $$0) {
      return this.a($$0, () -> {});
   }

   public tf b(Runnable $$0) {
      this.b.add(sw.a(() -> this.c($$0)));
      return this;
   }

   public tf a(int $$0, Runnable $$1) {
      this.b.add(sw.a(() -> {
         if (this.a.p() < this.c + $$0) {
            throw new sq(xo.c("test.error.sequence.not_completed"), this.a.p());
         } else {
            this.c($$1);
         }
      }));
      return this;
   }

   public tf b(int $$0, Runnable $$1) {
      this.b.add(sw.a(() -> {
         if (this.a.p() < this.c + $$0) {
            this.c($$1);
            throw new sq(xo.c("test.error.sequence.not_completed"), this.a.p());
         }
      }));
      return this;
   }

   public void a() {
      this.b.add(sw.a(this.a::m));
   }

   public void a(Supplier<sx> $$0) {
      this.b.add(sw.a(() -> this.a.a($$0.get())));
   }

   public tf.a b() {
      tf.a $$0 = new tf.a();
      this.b.add(sw.a(() -> $$0.a(this.a.p())));
      return $$0;
   }

   public void b(int $$0) {
      try {
         this.d($$0);
      } catch (sq var3) {
      }
   }

   public void c(int $$0) {
      try {
         this.d($$0);
      } catch (sq var3) {
         this.a.a(var3);
      }
   }

   private void c(Runnable $$0) {
      try {
         $$0.run();
      } catch (sq var3) {
         this.a.a(var3);
      }
   }

   private void d(int $$0) {
      Iterator<sw> $$1 = this.b.iterator();

      while ($$1.hasNext()) {
         sw $$2 = $$1.next();
         $$2.b.run();
         $$1.remove();
         int $$3 = $$0 - this.c;
         int $$4 = this.c;
         this.c = $$0;
         if ($$2.a != null && $$2.a != $$3) {
            this.a.a(new sq(xo.a("test.error.sequence.invalid_tick", $$4 + $$2.a), $$0));
            break;
         }
      }
   }

   public class a {
      private static final int b = -1;
      private int c = -1;

      void a(int $$0) {
         if (this.c != -1) {
            throw new IllegalStateException("Condition already triggered at " + this.c);
         } else {
            this.c = $$0;
         }
      }

      public void a() {
         int $$0 = tf.this.a.p();
         if (this.c != $$0) {
            if (this.c == -1) {
               throw new sq(xo.c("test.error.sequence.condition_not_triggered"), $$0);
            } else {
               throw new sq(xo.a("test.error.sequence.condition_already_triggered", this.c), $$0);
            }
         }
      }
   }
}
