import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ell implements elh {
   public static final MapCodec<ell> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.v(16).optionalFieldOf("offset", jb.c).forGetter($$0x -> $$0x.e)).apply($$0, ell::new)
   );
   private final kg e;

   public ell(kg $$0) {
      this.e = $$0;
   }

   public boolean a(dnt $$0, jb $$1) {
      return !$$0.u($$1.a(this.e));
   }

   @Override
   public eli<?> a() {
      return eli.h;
   }
}
