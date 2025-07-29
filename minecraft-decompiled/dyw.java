import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyw extends duq {
   public static final MapCodec<dyw> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dyw::new)
   );

   public dyw(float $$0, eea.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(dmu $$0, jb $$1, bck $$2) {
      lx $$3 = lx.a(me.J, $$0.t($$1));
      bcf.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<? extends dyw> a() {
      return g;
   }
}
