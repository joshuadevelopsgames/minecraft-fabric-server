import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwt(jp<dnx> c) implements cwx {
   public static final MapCodec<cwt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.a(mn.aK).fieldOf("biomes").forGetter(cwt::b)).apply($$0, cwt::new));

   public boolean a(cwz $$0) {
      return this.c.a($$0.c());
   }

   @Override
   public MapCodec<cwt> a() {
      return a;
   }

   public jp<dnx> b() {
      return this.c;
   }
}
