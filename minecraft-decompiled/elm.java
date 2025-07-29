import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elm extends els {
   final bae<dpz> a;
   public static final MapCodec<elm> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(bae.a(mn.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, elm::new)
   );

   protected elm(kg $$0, bae<dpz> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eli<?> a() {
      return eli.b;
   }
}
