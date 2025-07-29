import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erp extends err {
   public static final MapCodec<erp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            bbt.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
            ezo.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
            bbi.r.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
         )
         .and(b($$0))
         .apply($$0, erp::new)
   );
   private final bbt<Integer> i;
   private final ezo.a j;
   private final float k;
   private final ezo l;

   public erp(bbt<Integer> $$0, ezo.a $$1, float $$2, long $$3, ezo.a $$4, float $$5, List<eeb> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = ezo.b(new ekz(new ekb($$3)), $$1);
   }

   @Override
   protected ero<?> a() {
      return ero.e;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)bcb.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<eeb> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, this.e);
   }

   protected double a(jb $$0) {
      return this.l.a($$0.u() * this.k, $$0.v() * this.k, $$0.w() * this.k);
   }
}
