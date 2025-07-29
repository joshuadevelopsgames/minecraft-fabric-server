import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkd(djp d) implements djz {
   public static final MapCodec<dkd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dkd::new));

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      $$3.e(this.d.a($$1));
   }

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public djp b() {
      return this.d;
   }
}
