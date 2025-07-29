import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epb {
   public static final Codec<epb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(euc.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
         .apply($$0, epb::new)
   );
   public final jl<euc> b;
   public final float c;

   public epb(jl<euc> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dnt $$0, efz $$1, bck $$2, jb $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
