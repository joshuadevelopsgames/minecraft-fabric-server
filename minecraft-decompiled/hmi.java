import javax.annotation.Nullable;

public record hmi(boolean a, double b, double c, double d, double e, double f, double g, float h, @Nullable hld i) {
   public hmi(boolean $$0) {
      this($$0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0F, null);
   }
}
