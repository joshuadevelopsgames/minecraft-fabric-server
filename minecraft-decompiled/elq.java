import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class elq extends els {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elq::new));

   public elq(kg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.v();
   }

   @Override
   public eli<?> a() {
      return eli.f;
   }
}
