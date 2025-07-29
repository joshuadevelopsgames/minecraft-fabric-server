import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dri extends dsy {
   public static final MapCodec<dri> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bat.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dri::new)
   );
   protected final bat b;

   @Override
   public MapCodec<? extends dri> a() {
      return a;
   }

   public dri(bat $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(eeb $$0, dly $$1, jb $$2) {
      return this.b.a();
   }
}
