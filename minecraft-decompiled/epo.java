import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epo implements epm {
   public static final Codec<epo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ern.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
            ern.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
            Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
         )
         .apply($$0, epo::new)
   );
   public final ern b;
   public final ern c;
   public final int d;

   public epo(ern $$0, ern $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
