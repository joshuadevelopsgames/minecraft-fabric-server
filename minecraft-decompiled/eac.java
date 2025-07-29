import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eac extends dzb implements dzv {
   public static final MapCodec<eac> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.a.fieldOf("block_set_type").forGetter(dzb::q), dzv.a.e.fieldOf("weathering_state").forGetter(eac::r), t()).apply($$0, eac::new)
   );
   private final dzv.a h;

   @Override
   public MapCodec<eac> a() {
      return g;
   }

   protected eac(eeq $$0, dzv.a $$1, eea.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eeb $$0) {
      return dzv.c($$0.b()).isPresent();
   }

   public dzv.a r() {
      return this.h;
   }
}
