import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.stream.Stream;

public class fwf {
   private final Builder<String, gzq.b> a = ImmutableMap.builder();

   private <T extends Comparable<T>> void a(efe<T> $$0, gzq.b $$1) {
      this.a.put($$0.f(), $$1);
   }

   public final <T extends Comparable<T>> fwf a(efe<T> $$0, T $$1) {
      this.a($$0, new gzq.b(List.of(new gzq.a($$0.b($$1), false))));
      return this;
   }

   @SafeVarargs
   public final <T extends Comparable<T>> fwf a(efe<T> $$0, T $$1, T... $$2) {
      List<gzq.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$0::b).sorted().distinct().map($$0x -> new gzq.a($$0x, false)).toList();
      this.a($$0, new gzq.b($$3));
      return this;
   }

   public final <T extends Comparable<T>> fwf b(efe<T> $$0, T $$1) {
      this.a($$0, new gzq.b(List.of(new gzq.a($$0.b($$1), true))));
      return this;
   }

   public gzp a() {
      return new gzq(this.a.buildOrThrow());
   }
}
