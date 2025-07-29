import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public interface awb extends AutoCloseable {
   String a = ".mcmeta";
   String b = "pack.mcmeta";

   @Nullable
   axg<InputStream> a(String... var1);

   @Nullable
   axg<InputStream> a(awd var1, ame var2);

   void a(awd var1, String var2, String var3, awb.a var4);

   Set<String> a(awd var1);

   @Nullable
   <T> T a(awo<T> var1) throws IOException;

   awa a();

   default String b() {
      return this.a().a();
   }

   default Optional<awv> c() {
      return this.a().d();
   }

   @Override
   void close();

   @FunctionalInterface
   public interface a extends BiConsumer<ame, axg<InputStream>> {
   }
}
