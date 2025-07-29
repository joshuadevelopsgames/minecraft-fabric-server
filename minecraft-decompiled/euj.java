import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class euj extends euf {
   protected abstract int a(bck var1, jb var2);

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
