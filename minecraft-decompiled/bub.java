import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bub {
   bub f = (bub)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bua.a() : new bub.a());

   boolean a(btz var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(we var1, zy<?> var2, SocketAddress var3, int var4);

   void b(we var1, zy<?> var2, SocketAddress var3, int var4);

   void a(ehr var1, dlz var2, ehq var3, int var4);

   void b(ehr var1, dlz var2, ehq var3, int var4);

   @Nullable
   bue e();

   @Nullable
   bue a(dlz var1, amd<dmu> var2, String var3);

   @Nullable
   bue a(dlz var1, amd<dmu> var2, jl<euy> var3);

   public static class a implements bub {
      private static final Logger b = LogUtils.getLogger();
      static final bue a = $$0 -> {};

      @Override
      public boolean a(btz $$0) {
         b.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
         return false;
      }

      @Override
      public Path b() {
         throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public boolean d() {
         return false;
      }

      @Override
      public void a(we $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(we $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ehr $$0, dlz $$1, ehq $$2, int $$3) {
      }

      @Override
      public void b(ehr $$0, dlz $$1, ehq $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bue e() {
         return a;
      }

      @Nullable
      @Override
      public bue a(dlz $$0, amd<dmu> $$1, String $$2) {
         return null;
      }

      @Override
      public bue a(dlz $$0, amd<dmu> $$1, jl<euy> $$2) {
         return a;
      }
   }
}
