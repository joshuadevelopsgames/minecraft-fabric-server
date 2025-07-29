import java.util.Objects;
import javax.annotation.Nullable;

public abstract class fbx {
   private boolean a;

   public void e() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean f() {
      return this.a;
   }

   public record a(@Nullable aub a, long b) {
      public a(aub $$0) {
         this($$0, $$0.F());
      }

      public aub a() {
         return Objects.requireNonNull(this.a);
      }

      @Nullable
      public aub b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }
   }
}
