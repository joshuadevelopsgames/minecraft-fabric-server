import java.util.Objects;
import javax.annotation.Nullable;

public record auu(String b, xs c) {
   public static final auu a = a("");

   public static auu a(String $$0) {
      return new auu($$0, xs.c);
   }

   public static auu b(String $$0) {
      return new auu($$0, xs.b);
   }

   @Nullable
   public String a() {
      return this.c.a(this.b);
   }

   public String b() {
      return Objects.requireNonNullElse(this.a(), "");
   }

   public boolean c() {
      return !this.c.a();
   }

   public String d() {
      return this.b;
   }

   public xs e() {
      return this.c;
   }
}
