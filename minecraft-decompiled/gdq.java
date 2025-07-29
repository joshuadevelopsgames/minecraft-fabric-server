import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class gdq extends gdr {
   private static final xo u = xo.c("chat.copy");
   private static final xo v = xo.c("chat.link.warning").b(-13108);
   private static final int w = 100;
   private final String x;
   private final boolean y;

   public gdq(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xo.b($$1), $$1, $$2 ? xn.e : xn.g, $$2);
   }

   public gdq(BooleanConsumer $$0, xo $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xn.e : xn.g, $$3);
   }

   public gdq(BooleanConsumer $$0, xo $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public gdq(BooleanConsumer $$0, xo $$1, xo $$2, URI $$3, xo $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public gdq(BooleanConsumer $$0, xo $$1, xo $$2, String $$3, xo $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.b = $$5 ? xn.n : xn.f;
      this.c = $$4;
      this.y = !$$5;
      this.x = $$3;
   }

   protected static yc a(boolean $$0, String $$1) {
      return c($$0).b(xn.w).b(xo.b($$1));
   }

   protected static yc c(boolean $$0) {
      return xo.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void k() {
      if (this.y) {
         this.a.a(new fyx(v, this.q));
      }
   }

   @Override
   protected void a(gbo $$0) {
      this.d = $$0.a(fxo.a(this.b, $$0x -> this.f.accept(true)).a(100).a());
      $$0.a(fxo.a(u, $$0x -> {
         this.l();
         this.f.accept(false);
      }).a(100).a());
      this.e = $$0.a(fxo.a(this.c, $$0x -> this.f.accept(false)).a(100).a());
   }

   public void l() {
      this.n.p.a(this.x);
   }

   public static void a(get $$0, String $$1, boolean $$2) {
      fue $$3 = fue.R();
      $$3.a(new gdq($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(get $$0, URI $$1, boolean $$2) {
      fue $$3 = fue.R();
      $$3.a(new gdq($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(get $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(get $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fxo.c b(get $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fxo.c b(get $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fxo.c b(get $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fxo.c b(get $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
