import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hrt(fnf a, @Nullable htq b) implements Closeable {
   public static hrt a(axo $$0, ame $$1) throws IOException {
      axm $$2 = $$0.getResourceOrThrow($$1);

      fnf $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fnf.a($$3);
      }

      htq $$6 = $$2.f().a(htq.d).orElse(null);
      return new hrt($$4, $$6);
   }

   public static hrt a() {
      return new hrt(hrh.a(), null);
   }

   public boolean b() {
      return this.b != null ? this.b.a() : false;
   }

   public boolean c() {
      return this.b != null ? this.b.b() : false;
   }

   @Override
   public void close() {
      this.a.close();
   }

   public fnf d() {
      return this.a;
   }

   @Nullable
   public htq e() {
      return this.b;
   }
}
