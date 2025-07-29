import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gsg implements bda {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gsg> d = bda.a(gsg::values);
   private final String e;

   private gsg(final String $$0) {
      this.e = $$0;
   }

   public static gsg a(ye $$0, xo $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(ye $$0, xo $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xo $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xo $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yl.a).orElse(false);
   }

   private static boolean a(yl $$0) {
      return !$$0.l().equals(yl.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fty a(ye $$0) {
      return switch (this) {
         case b -> fty.a($$0.c());
         case c -> fty.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
