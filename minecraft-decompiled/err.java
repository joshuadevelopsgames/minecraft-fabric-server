import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class err extends erq {
   public static final MapCodec<err> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, err::new));
   protected final List<eeb> h;

   protected static <P extends err> P4<Mu<P>, Long, ezo.a, Float, List<eeb>> b(Instance<P> $$0) {
      return a($$0).and(bbi.b(eeb.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public err(long $$0, ezo.a $$1, float $$2, List<eeb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ero<?> a() {
      return ero.d;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      return this.a(this.h, $$1, this.e);
   }

   protected eeb a(List<eeb> $$0, jb $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected eeb a(List<eeb> $$0, double $$1) {
      double $$2 = bcb.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * $$0.size()));
   }
}
