import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface egr<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(wg var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(egq.b<T> var1);

   egq<T> d();

   egq<T> e();

   egr.a<T> a(jq<T> var1, egq.d var2);

   public record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends egr<T>> {
      DataResult<C> read(jq<T> var1, egq.d var2, egr.a<T> var3);
   }
}
