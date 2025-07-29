import javax.annotation.Nullable;

public record fty(int a, @Nullable fty.a b, @Nullable xo c, @Nullable String d) {
   private static final xo e = xo.c("chat.tag.system");
   private static final xo f = xo.c("chat.tag.system_single_player");
   private static final xo g = xo.c("chat.tag.not_secure");
   private static final xo h = xo.c("chat.tag.modified");
   private static final xo i = xo.c("chat.tag.error");
   private static final int j = 13684944;
   private static final int k = 6316128;
   private static final fty l = new fty(13684944, null, e, "System");
   private static final fty m = new fty(13684944, null, f, "System");
   private static final fty n = new fty(13684944, null, g, "Not Secure");
   private static final fty o = new fty(16733525, null, i, "Chat Error");

   public static fty a() {
      return l;
   }

   public static fty b() {
      return m;
   }

   public static fty c() {
      return n;
   }

   public static fty a(String $$0) {
      xo $$1 = xo.b($$0).a(o.h);
      xo $$2 = xo.i().b(h).b(xn.t).b($$1);
      return new fty(6316128, fty.a.a, $$2, "Modified");
   }

   public static fty d() {
      return o;
   }

   public int e() {
      return this.a;
   }

   @Nullable
   public fty.a f() {
      return this.b;
   }

   @Nullable
   public xo g() {
      return this.c;
   }

   @Nullable
   public String h() {
      return this.d;
   }

   public static enum a {
      a(ame.b("icon/chat_modified"), 9, 9);

      public final ame b;
      public final int c;
      public final int d;

      private a(final ame $$0, final int $$1, final int $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public void a(fxb $$0, int $$1, int $$2) {
         $$0.a(gxx.ar, this.b, $$1, $$2, this.c, this.d);
      }
   }
}
