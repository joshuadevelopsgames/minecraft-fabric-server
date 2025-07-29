import javax.annotation.Nullable;

public record bzg(bzh a, boolean b, boolean c, @Nullable fjs d) {
   public static bzg a(cao $$0, boolean $$1, boolean $$2) {
      return new bzg(bzh.a, $$1, $$2, $$0.cu());
   }

   @FunctionalInterface
   public interface a<T extends cao> {
      void finalizeConversion(T var1);
   }
}
