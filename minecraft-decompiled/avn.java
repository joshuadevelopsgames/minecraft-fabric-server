import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class avn implements aus {
   public static final aus.a a = new aus.a("server_resource_pack");
   private final MinecraftServer.b b;

   public avn(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zw<?>> $$0) {
      $$0.accept(new aam(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aus.a a() {
      return a;
   }
}
