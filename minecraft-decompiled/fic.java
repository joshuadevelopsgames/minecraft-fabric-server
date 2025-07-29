import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record fic(ame b) implements fid<MinecraftServer> {
   public static final MapCodec<fic> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ame.a.fieldOf("Name").forGetter(fic::b)).apply($$0, fic::new));

   public void a(MinecraftServer $$0, fif<MinecraftServer> $$1, long $$2) {
      amt $$3 = $$0.aE();

      for (ib<ek> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<fic> a() {
      return a;
   }
}
