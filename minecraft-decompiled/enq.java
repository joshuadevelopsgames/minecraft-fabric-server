import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enq implements epm {
   public static final Codec<enq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            eeb.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
            eeb.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
            eeb.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
            eeb.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
            elh.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
            Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
         )
         .apply($$0, enq::new)
   );
   public final eeb b;
   public final eeb c;
   public final eeb d;
   public final eeb e;
   public final elh f;
   public final boolean g;

   public enq(eeb $$0, eeb $$1, eeb $$2, eeb $$3, elh $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
