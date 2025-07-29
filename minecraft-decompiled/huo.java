import javax.annotation.Nullable;

public interface huo {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default huo.a b() {
      return null;
   }

   @Nullable
   default gzg d() {
      return null;
   }

   default gzk.a e() {
      return gzk.a.a;
   }

   @Nullable
   default hun a() {
      return null;
   }

   @Nullable
   default ame f() {
      return null;
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static huo.a a(String $$0) {
         for (huo.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }
}
