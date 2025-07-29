import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ety extends euf {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eka.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ety::new)
   );
   private final eka.a c;

   private ety(eka.a $$0) {
      this.c = $$0;
   }

   public static ety a(eka.a $$0) {
      return new ety($$0);
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jb($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eug<?> b() {
      return eug.k;
   }
}
