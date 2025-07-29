import java.util.Collection;
import java.util.Locale;

public class hrq extends RuntimeException {
   private final Collection<hrp.a> a;

   public hrq(hrp.a $$0, Collection<hrp.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hrp.a> a() {
      return this.a;
   }
}
