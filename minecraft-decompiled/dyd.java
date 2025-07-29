import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyd extends dug implements dpq {
   public static final MapCodec<dyd> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(dyd::b), t()).apply($$0, dyd::new));
   private final dbt i;

   @Override
   public MapCodec<dyd> a() {
      return h;
   }

   public dyd(dbt $$0, eea.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.C.b().b(a, false).b(b, false).b(c, false).b(d, false).b(e, false));
   }

   @Override
   public dbt b() {
      return this.i;
   }
}
