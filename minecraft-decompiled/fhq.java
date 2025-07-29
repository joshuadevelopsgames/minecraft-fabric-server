import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhq(fhx b, String c, float d) implements fho {
   public static final MapCodec<fhq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            fhy.a.fieldOf("target").forGetter(fhq::c),
            Codec.STRING.fieldOf("score").forGetter(fhq::d),
            Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fhq::e)
         )
         .apply($$0, fhq::new)
   );

   @Override
   public fhn b() {
      return fhp.e;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.b();
   }

   public static fhq a(fdj.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fhq a(fdj.b $$0, String $$1, float $$2) {
      return new fhq(fhu.a($$0), $$1, $$2);
   }

   @Override
   public float b(fdj $$0) {
      fjw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fjx $$2 = $$0.d().g();
         fjp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fjt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : $$4.a() * this.d;
         }
      }
   }

   public fhx c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
