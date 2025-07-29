import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class etr extends eue {
   public static final MapCodec<etr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elh.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, etr::new)
   );
   private final elh c;

   private etr(elh $$0) {
      this.c = $$0;
   }

   public static etr a(elh $$0) {
      return new etr($$0);
   }

   @Override
   protected boolean a(eud $$0, bck $$1, jb $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eug<?> b() {
      return eug.a;
   }
}
