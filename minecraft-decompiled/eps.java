import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eps extends epd {
   public static final Codec<eps> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ern.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
            bbi.p.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
            bbi.p.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, eps::new)
   );
   public final int d;
   public final int e;

   public eps(ern $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
