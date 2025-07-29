import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class erq extends ern {
   protected final long c;
   protected final ezo.a d;
   protected final float e;
   protected final ezo f;

   protected static <P extends erq> P3<Mu<P>, Long, ezo.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         ezo.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         bbi.r.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected erq(long $$0, ezo.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = ezo.b(new ekz(new ekb($$0)), $$1);
   }

   protected double a(jb $$0, double $$1) {
      return this.f.a($$0.u() * $$1, $$0.v() * $$1, $$0.w() * $$1);
   }
}
