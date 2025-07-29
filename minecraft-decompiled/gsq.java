import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record gsq(String a, @Nullable gsq.a b) {
   public static gsq a() {
      return a(null);
   }

   public static gsq a(String $$0) {
      return a(new gsq.a.b($$0));
   }

   public static gsq a(fpx $$0) {
      return a(new gsq.a.a($$0));
   }

   public static gsq a(@Nullable gsq.a $$0) {
      return new gsq(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof gsq.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof gsq.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.21.8");
      if (fue.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public gsq.a f() {
      return this.b;
   }

   public interface a {
      public record a(long a, int b) implements gsq.a {
         public a(fpx $$0) {
            this($$0.b, $$0.q);
         }
      }

      public record b(String a) implements gsq.a {
      }
   }
}
