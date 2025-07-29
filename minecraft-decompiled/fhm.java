import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fhm(djp b) implements fho {
   public static final MapCodec<fhm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("amount").forGetter(fhm::c)).apply($$0, fhm::new));

   @Override
   public float b(fdj $$0) {
      int $$1 = $$0.b(fgd.k);
      return this.b.a($$1);
   }

   @Override
   public fhn b() {
      return fhp.g;
   }

   public static fhm a(djp $$0) {
      return new fhm($$0);
   }

   public djp c() {
      return this.b;
   }
}
