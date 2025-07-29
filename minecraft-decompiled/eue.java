import java.util.stream.Stream;

public abstract class eue extends euf {
   @Override
   public final Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      return this.a($$0, $$1, $$2) ? Stream.of($$2) : Stream.of();
   }

   protected abstract boolean a(eud var1, bck var2, jb var3);
}
