import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class fie<C> {
   public static final fie<MinecraftServer> a = new fie<MinecraftServer>().a(ame.b("function"), fib.a).a(ame.b("function_tag"), fic.a);
   private final bbi.b<ame, MapCodec<? extends fid<C>>> b = new bbi.b<>();
   private final Codec<fid<C>> c = this.b.a(ame.a).dispatch("Type", fid::a, Function.identity());

   public fie<C> a(ame $$0, MapCodec<? extends fid<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<fid<C>> a() {
      return this.c;
   }
}
