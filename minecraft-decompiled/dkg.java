import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkg(djp c) implements dkb {
   public static final MapCodec<dkg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("chance").forGetter(dkg::b)).apply($$0, dkg::new));

   @Override
   public float a(int $$0, bck $$1, float $$2) {
      float $$3 = this.c.a($$0);
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         if ($$1.i() < $$3) {
            $$4++;
         }
      }

      return $$2 - $$4;
   }

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public djp b() {
      return this.c;
   }
}
