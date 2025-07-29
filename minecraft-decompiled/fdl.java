import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record fdl<T>(amd<jy<T>> d, Codec<T> e, fdl.a<T> f) {
   public static final fdl<fgs> a = new fdl<>(mn.by, fgs.e, e());
   public static final fdl<fex> b = new fdl<>(mn.bx, fez.c, e());
   public static final fdl<fdo> c = new fdl<>(mn.bw, fdo.d, f());

   public void a(fdp $$0, amd<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<fdl<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends fdk> fdl.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a(new bci.h($$1), $$1));
   }

   private static fdl.a<fdo> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a(new bci.h($$1), $$1));
   }

   public amd<jy<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public fdl.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(fdp var1, amd<T> var2, T var3);
   }
}
