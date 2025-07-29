import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bty implements AutoCloseable {
   public static final bty a = new bty(null);
   @Nullable
   private final btt b;

   bty(@Nullable btt $$0) {
      this.b = $$0;
   }

   public bty a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bty a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bty a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bty a(int $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b.c();
      }
   }
}
