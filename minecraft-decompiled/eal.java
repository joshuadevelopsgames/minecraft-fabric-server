import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eal extends dqs {
   public static final MapCodec<eal> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(eal::b), t()).apply($$0, eal::new));
   private final dbt c;

   @Override
   public MapCodec<eal> a() {
      return b;
   }

   protected eal(dbt $$0, eea.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public dbt b() {
      return this.c;
   }
}
