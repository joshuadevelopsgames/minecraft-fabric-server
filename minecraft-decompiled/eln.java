import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eln extends els {
   private final jp<dpz> e;
   public static final MapCodec<eln> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ka.a(mn.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eln::new)
   );

   public eln(kg $$0, jp<dpz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eli<?> a() {
      return eli.a;
   }
}
