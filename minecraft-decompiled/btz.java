import net.minecraft.server.MinecraftServer;

public enum btz {
   a("client"),
   b("server");

   private final String c;

   private btz(final String $$0) {
      this.c = $$0;
   }

   public static btz a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
