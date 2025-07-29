import java.util.List;
import java.util.stream.Stream;

public class eie<T> {
   private final dlz a;
   private final List<T> b;

   public eie(dlz $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public dlz a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
