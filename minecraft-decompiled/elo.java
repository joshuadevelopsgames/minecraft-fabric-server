import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class elo extends els {
   private final jp<fak> e;
   public static final MapCodec<elo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ka.a(mn.H).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, elo::new)
   );

   public elo(kg $$0, jp<fak> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eli<?> a() {
      return eli.c;
   }
}
