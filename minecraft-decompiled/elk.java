import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elk implements elh {
   private final kg e;
   private final jh f;
   public static final MapCodec<elk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.v(16).optionalFieldOf("offset", kg.i).forGetter($$0x -> $$0x.e), jh.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
         .apply($$0, elk::new)
   );

   public elk(kg $$0, jh $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dnt $$0, jb $$1) {
      jb $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eli<?> a() {
      return eli.d;
   }
}
