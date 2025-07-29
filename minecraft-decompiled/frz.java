import java.util.Locale;

public class frz extends hyg {
   private static final xo a = xo.c("mco.backup.info.title");
   private static final xo b = xo.c("mco.backup.unknown");
   private final get c;
   final fph G;
   final gbk H = new gbk(this);
   private frz.a I;

   public frz(get $$0, fph $$1) {
      super(a);
      this.c = $$0;
      this.G = $$1;
   }

   @Override
   public void aV_() {
      this.H.a(a, this.q);
      this.I = this.H.c(new frz.a(this.n));
      this.H.b(fxo.a(xn.k, $$0 -> this.aP_()).a());
      this.c();
      this.H.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.I.b(this.o, this.H.d());
      this.H.a();
   }

   @Override
   public void aP_() {
      this.n.a(this.c);
   }

   xo a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xo)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xo.b($$1));
      }
   }

   private xo a(String $$0) {
      try {
         return fsh.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xo b(String $$0) {
      try {
         return fsh.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fyl<frz.b> {
      public a(final fue $$0) {
         super($$0, frz.this.o, frz.this.H.d(), frz.this.H.c(), 36);
         if (frz.this.G.e != null) {
            frz.this.G.e.forEach(($$0x, $$1) -> this.b(frz.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fyl.a<frz.b> {
      private static final xo b = xo.c("mco.backup.entry.templateName");
      private static final xo c = xo.c("mco.backup.entry.gameDifficulty");
      private static final xo d = xo.c("mco.backup.entry.name");
      private static final xo e = xo.c("mco.backup.entry.gameServerVersion");
      private static final xo f = xo.c("mco.backup.entry.uploaded");
      private static final xo g = xo.c("mco.backup.entry.enabledPack");
      private static final xo h = xo.c("mco.backup.entry.description");
      private static final xo i = xo.c("mco.backup.entry.gameMode");
      private static final xo j = xo.c("mco.backup.entry.seed");
      private static final xo k = xo.c("mco.backup.entry.worldType");
      private static final xo l = xo.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(frz.this.q, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(frz.this.q, frz.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xo a(String $$0) {
         return switch ($$0) {
            case "template_name" -> b;
            case "game_difficulty" -> c;
            case "name" -> d;
            case "game_server_version" -> e;
            case "uploaded" -> f;
            case "enabled_packs" -> g;
            case "description" -> h;
            case "game_mode" -> i;
            case "seed" -> j;
            case "world_type" -> k;
            default -> l;
         };
      }

      @Override
      public xo a() {
         return xo.a("narrator.select", this.m + " " + this.n);
      }
   }
}
