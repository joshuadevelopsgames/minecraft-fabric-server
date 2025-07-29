import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class euh extends euf {
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bwo.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bwo.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
         .apply($$0, euh::new)
   );
   private final bwo c;
   private final bwo d;

   public static euh a(bwo $$0, bwo $$1) {
      return new euh($$0, $$1);
   }

   public static euh a(bwo $$0) {
      return new euh(bwl.a(0), $$0);
   }

   public static euh b(bwo $$0) {
      return new euh($$0, bwl.a(0));
   }

   private euh(bwo $$0, bwo $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jb($$3, $$4, $$5));
   }

   @Override
   public eug<?> b() {
      return eug.n;
   }
}
