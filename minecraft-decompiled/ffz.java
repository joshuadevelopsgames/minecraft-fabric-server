import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ffz extends few {
   public static final MapCodec<ffz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(kp.a, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.b)).apply($$0, ffz::new)
   );
   private final Map<kp<?>, Boolean> b;

   private ffz(List<fgs> $$0, Map<kp<?>, Boolean> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.q, dfz.c, $$0x -> {
         for (Entry<kp<?>, Boolean> $$1x : this.b.entrySet()) {
            boolean $$2 = $$1x.getValue();
            $$0x = $$0x.a($$1x.getKey(), !$$2);
         }

         return $$0x;
      });
      return $$0;
   }

   @Override
   public fey<ffz> b() {
      return fez.P;
   }
}
