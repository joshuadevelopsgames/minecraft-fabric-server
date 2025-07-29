import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface eip<T extends eig> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(ein<T, U> var1, bak<U> var2);

   void a(fin var1, Consumer<T> var2);

   <U extends T> void a(ein<T, U> var1, fin var2, bak<U> var3);
}
