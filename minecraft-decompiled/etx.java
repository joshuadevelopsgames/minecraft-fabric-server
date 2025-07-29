import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class etx extends euf {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etf.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, etx::new));
   private final etf c;

   private etx(etf $$0) {
      this.c = $$0;
   }

   public static etx a(etf $$0) {
      return new etx($$0);
   }

   public static etx a(eku $$0, eku $$1) {
      return a(eti.a($$0, $$1));
   }

   public static etx b(eku $$0, eku $$1) {
      return a(eth.a($$0, $$1));
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eug<?> b() {
      return eug.l;
   }
}
