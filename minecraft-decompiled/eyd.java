import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyd extends eyx {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ka.a(mn.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
            Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
         )
         .apply($$0, eyd::new)
   );
   private final Optional<jp<dpz>> b;
   private final float c;

   public eyd(jp<dpz> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eyd(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eyd(Optional<jp<dpz>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      bck $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected eyz<?> a() {
      return eyz.f;
   }
}
