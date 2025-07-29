import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dva extends dyw implements dqc {
   public static final MapCodec<dva> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dva::new)
   );

   @Override
   public MapCodec<dva> a() {
      return f;
   }

   public dva(float $$0, eea.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.a($$2.e(), dvb.c(), 2);
   }

   @Override
   public jb a(jb $$0) {
      return $$0.e();
   }
}
