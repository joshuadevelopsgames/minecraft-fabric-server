import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class glm {
   public final glm.i a;
   public final fmx b;
   public final glm.a c;
   public final glm.b d;
   public final glm.c e;

   public glm(glm.i $$0, fmx $$1, glm.a $$2, glm.b $$3, glm.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public static class a {
      public final File a;
      public final File b;
      public final File c;
      @Nullable
      public final String d;

      public a(File $$0, File $$1, File $$2, @Nullable String $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public Path a() {
         return this.d == null ? this.c.toPath() : hso.a(this.c.toPath(), this.d);
      }
   }

   public static class b {
      public final boolean a;
      public final String b;
      public final String c;
      public final boolean d;
      public final boolean e;
      public final boolean f;
      public final boolean g;

      public b(boolean $$0, String $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
      }
   }

   public record c(@Nullable String a, glm.h b) {
      public boolean a() {
         return this.b.a();
      }

      @Nullable
      public String b() {
         return this.a;
      }

      public glm.h c() {
         return this.b;
      }
   }

   public record d() implements glm.h {
      @Override
      public boolean a() {
         return false;
      }
   }

   public record e(String b) implements glm.h {
      @Override
      public boolean a() {
         return !bdb.h(this.b);
      }
   }

   public record f(String b) implements glm.h {
      @Override
      public boolean a() {
         return !bdb.h(this.b);
      }
   }

   public record g(@Nullable String b) implements glm.h {
      @Override
      public boolean a() {
         return true;
      }
   }

   public sealed interface h permits glm.g, glm.e, glm.f, glm.d {
      glm.h a = new glm.d();

      boolean a();
   }

   public static class i {
      public final fuq a;
      public final PropertyMap b;
      public final PropertyMap c;
      public final Proxy d;

      public i(fuq $$0, PropertyMap $$1, PropertyMap $$2, Proxy $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }
   }
}
