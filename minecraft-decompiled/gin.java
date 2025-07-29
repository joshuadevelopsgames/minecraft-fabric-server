import java.util.Arrays;
import java.util.stream.Stream;

public class gin extends giq {
   private static final xo a = xo.c("options.mouse_settings.title");

   private static fuh<?>[] a(fui $$0) {
      return new fuh[]{$$0.d(), $$0.V(), $$0.I(), $$0.W(), $$0.ad()};
   }

   public gin(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      if (fna.a()) {
         this.d.a(Stream.concat(Arrays.stream(a(this.c)), Stream.of(this.c.J())).toArray(fuh[]::new));
      } else {
         this.d.a(a(this.c));
      }
   }
}
