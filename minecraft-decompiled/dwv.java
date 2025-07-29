import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwv extends dri {
   public static final MapCodec<dwv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bat.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dwv::new)
   );

   @Override
   public MapCodec<dwv> a() {
      return c;
   }

   public dwv(bat $$0, eea.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      edz.a($$1, $$2, $$3);
   }
}
