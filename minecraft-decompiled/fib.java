import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record fib(ame b) implements fid<MinecraftServer> {
   public static final MapCodec<fib> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ame.a.fieldOf("Name").forGetter(fib::b)).apply($$0, fib::new));

   public void a(MinecraftServer $$0, fif<MinecraftServer> $$1, long $$2) {
      amt $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<fib> a() {
      return a;
   }
}
