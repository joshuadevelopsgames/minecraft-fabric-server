import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class etz extends euf {
   private static final etz c = new etz();
   public static final MapCodec<etz> a = MapCodec.unit(() -> c);

   public static etz a() {
      return c;
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jb($$3, $$2.v(), $$4));
   }

   @Override
   public eug<?> b() {
      return eug.m;
   }
}
