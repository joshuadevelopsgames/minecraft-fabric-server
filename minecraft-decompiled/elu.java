import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

record elu(kg e) implements elh {
   public static MapCodec<elu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.g.optionalFieldOf("offset", kg.i).forGetter(elu::g)).apply($$0, elu::new));

   @Override
   public eli<?> a() {
      return eli.m;
   }

   public boolean a(dnt $$0, jb $$1) {
      return $$0.a(null, fjj.b().a($$1));
   }

   public kg g() {
      return this.e;
   }
}
