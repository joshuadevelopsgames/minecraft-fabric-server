import net.minecraft.server.MinecraftServer;

public record evo(axo a, jz b, ezb c) {
   public static evo a(aub $$0) {
      MinecraftServer $$1 = $$0.q();
      return new evo($$1.be(), $$1.ba(), $$1.aY());
   }
}
