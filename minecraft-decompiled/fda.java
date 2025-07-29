import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.stream.Stream;

public interface fda {
   <T> Optional<T> a(String var1, Codec<T> var2);

   @Deprecated
   <T> Optional<T> a(MapCodec<T> var1);

   Optional<fda> a(String var1);

   fda b(String var1);

   Optional<fda.b> c(String var1);

   fda.b d(String var1);

   <T> Optional<fda.a<T>> b(String var1, Codec<T> var2);

   <T> fda.a<T> c(String var1, Codec<T> var2);

   boolean a(String var1, boolean var2);

   byte a(String var1, byte var2);

   int a(String var1, short var2);

   Optional<Integer> e(String var1);

   int a(String var1, int var2);

   long a(String var1, long var2);

   Optional<Long> f(String var1);

   float a(String var1, float var2);

   double a(String var1, double var2);

   Optional<String> g(String var1);

   String a(String var1, String var2);

   Optional<int[]> h(String var1);

   @Deprecated
   jn.a a();

   public interface a<T> extends Iterable<T> {
      boolean a();

      Stream<T> b();
   }

   public interface b extends Iterable<fda> {
      boolean a();

      Stream<fda> b();
   }
}
