import net.minecraft.server.MinecraftServer;

public class ayo implements ej {
   private static final String b = "Rcon";
   private static final xo c = xo.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public ayo(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public ek g() {
      aub $$0 = this.e.J();
      return new ek(this, fis.a($$0.ab()), fir.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(xo $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.e.m();
   }
}
