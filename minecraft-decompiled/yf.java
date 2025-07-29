import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record yf(UUID a, cux b) {
   public yk a(Duration $$0) {
      return new yk.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yi.b a(UUID $$0) {
      return new yi($$0, this.a).a(this.b);
   }

   public yf.a a() {
      return new yf.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cux d() {
      return this.b;
   }

   public record a(UUID a, cux.a b) {
      public static yf.a a(wg $$0) {
         return new yf.a($$0.n(), new cux.a($$0));
      }

      public static void a(wg $$0, yf.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public yf a(GameProfile $$0, bcq $$1) throws cux.b {
         return new yf(this.a, cux.a($$1, $$0.getId(), this.b));
      }
   }
}
