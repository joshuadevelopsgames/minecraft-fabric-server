import java.util.OptionalInt;

public record fmx(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fmx a(int $$0, int $$1) {
      return new fmx($$0, $$1, this.c, this.d, this.e);
   }

   public fmx a(boolean $$0) {
      return new fmx(this.a, this.b, this.c, this.d, $$0);
   }
}
