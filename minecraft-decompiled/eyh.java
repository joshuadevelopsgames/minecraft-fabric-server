import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyh extends eyx {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eyh> a = MapCodec.unit(() -> eyh.b);
   public static final eyh b = new eyh();

   private eyh() {
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      eeb $$6 = $$4.b();
      if ($$6.a(dqb.pI)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().b("final_state", "minecraft:air");

            eeb $$9;
            try {
               gi.a $$8 = gi.a($$0.a(mn.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dqb.lt) ? null : new eza.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eyz<?> a() {
      return eyz.h;
   }
}
