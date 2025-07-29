import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaa extends dxn implements dzv {
   public static final MapCodec<eaa> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzv.a.e.fieldOf("weathering_state").forGetter(drc::c), t()).apply($$0, eaa::new)
   );
   private final dzv.a e;

   @Override
   public MapCodec<eaa> a() {
      return d;
   }

   public eaa(dzv.a $$0, eea.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
