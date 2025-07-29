import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzj extends duq {
   public static final MapCodec<dzj> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            bbi.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), me.bk.fieldOf("leaf_particle").forGetter($$0x -> $$0x.g), t()
         )
         .apply($$0, dzj::new)
   );
   protected final mc g;

   public dzj(float $$0, mc $$1, eea.d $$2) {
      super($$0, $$2);
      this.g = $$1;
   }

   @Override
   protected void a(dmu $$0, jb $$1, bck $$2) {
      bcf.a($$0, $$1, $$2, this.g);
   }

   @Override
   public MapCodec<dzj> a() {
      return f;
   }
}
