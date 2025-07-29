import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class elp implements elh {
   public static final MapCodec<elp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elh.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, elp::new)
   );
   private final elh e;

   public elp(elh $$0) {
      this.e = $$0;
   }

   public boolean a(dnt $$0, jb $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eli<?> a() {
      return eli.k;
   }
}
