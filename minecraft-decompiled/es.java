import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record es(List<es.a> b) {
   public static final es a = new es(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public es(wg $$0) {
      this($$0.a(wg.a(ArrayList::new, 8), es.a::new));
   }

   public void a(wg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static es a(yg<?> $$0, es.b $$1) {
      List<es.a> $$2 = $$0.a().stream().map($$1x -> {
         ya $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new es.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new es($$2);
   }

   public List<es.a> a() {
      return this.b;
   }

   public record a(String a, ya b) {
      public a(wg $$0) {
         this($$0.d(16), ya.a($$0));
      }

      public void a(wg $$0) {
         $$0.a(this.a, 16);
         ya.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      ya sign(String var1);
   }
}
