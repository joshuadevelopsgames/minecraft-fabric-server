import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eab extends dye implements dzv {
   public static final MapCodec<eab> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzv.a.e.fieldOf("weathering_state").forGetter(drc::c), eeb.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, eab::new)
   );
   private final dzv.a h;

   @Override
   public MapCodec<eab> a() {
      return g;
   }

   public eab(dzv.a $$0, eeb $$1, eea.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eeb $$0) {
      return dzv.c($$0.b()).isPresent();
   }

   public dzv.a q() {
      return this.h;
   }
}
