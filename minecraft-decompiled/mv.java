import java.nio.file.Path;

public class mv {
   private final Path a;

   public mv(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mv.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mv.a a(mv.b $$0, String $$1) {
      return new mv.a(this, $$0, $$1);
   }

   public mv.a a(amd<? extends jy<?>> $$0) {
      return this.a(mv.b.a, mn.c($$0));
   }

   public mv.a b(amd<? extends jy<?>> $$0) {
      return this.a(mv.b.a, mn.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mv $$0, mv.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ame $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ame $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(amd<?> $$0) {
         return this.a.resolve($$0.a().b()).resolve(this.b).resolve($$0.a().a() + ".json");
      }
   }

   public static enum b {
      a("data"),
      b("assets"),
      c("reports");

      final String d;

      private b(final String $$0) {
         this.d = $$0;
      }
   }
}
