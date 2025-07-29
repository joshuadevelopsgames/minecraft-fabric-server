import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzx extends dsg implements dzv {
   public static final MapCodec<dzx> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.a.fieldOf("block_set_type").forGetter(dsg::b), dzv.a.e.fieldOf("weathering_state").forGetter(dzx::q), t()).apply($$0, dzx::new)
   );
   private final dzv.a h;

   @Override
   public MapCodec<dzx> a() {
      return g;
   }

   protected dzx(eeq $$0, dzv.a $$1, eea.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(dsg.c) == eex.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(eeb $$0) {
      return dzv.c($$0.b()).isPresent();
   }

   public dzv.a q() {
      return this.h;
   }
}
