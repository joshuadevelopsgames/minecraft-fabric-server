import javax.annotation.Nullable;

public interface dmn {
   static byb a(dmu $$0, @Nullable bzm $$1) {
      return $$0.al().d($$1, a($$1));
   }

   @Nullable
   static cam a(@Nullable bzm $$0) {
      return switch ($$0) {
         case cra $$1 -> $$1.e();
         case cam $$2 -> $$2;
         case cvo $$3 when $$3.ah_() instanceof cam $$4 -> $$4;
         case null, default -> null;
      };
   }

   aub a();

   dmn.a b();

   @Nullable
   cam c();

   @Nullable
   bzm d();

   float e();

   fis f();

   boolean g();

   boolean h();

   public static enum a {
      a(false),
      b(true),
      c(true),
      d(false);

      private final boolean e;

      private a(final boolean $$0) {
         this.e = $$0;
      }

      public boolean a() {
         return this.e;
      }
   }
}
