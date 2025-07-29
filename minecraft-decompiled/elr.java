import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class elr extends els {
   public static final MapCodec<elr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, elr::new));

   public elr(kg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.e();
   }

   @Override
   public eli<?> a() {
      return eli.e;
   }
}
