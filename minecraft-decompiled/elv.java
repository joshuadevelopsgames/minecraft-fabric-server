import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elv implements elh {
   public static final MapCodec<elv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.v(16).optionalFieldOf("offset", kg.i).forGetter($$0x -> $$0x.e), eeb.a.fieldOf("state").forGetter($$0x -> $$0x.f))
         .apply($$0, elv::new)
   );
   private final kg e;
   private final eeb f;

   protected elv(kg $$0, eeb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dnt $$0, jb $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eli<?> a() {
      return eli.g;
   }
}
