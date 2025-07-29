import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyc extends dza implements dpq {
   public static final MapCodec<dyc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(dyc::b), t()).apply($$0, dyc::new));
   private final dbt c;

   @Override
   public MapCodec<dyc> a() {
      return a;
   }

   public dyc(dbt $$0, eea.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public dbt b() {
      return this.c;
   }
}
