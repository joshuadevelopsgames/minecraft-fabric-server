import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esb extends esi {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
            ern.a.fieldOf("block_provider").forGetter($$0x -> $$0x.c),
            bbi.b(jh.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.d)
         )
         .apply($$0, esb::new)
   );
   private final float b;
   private final ern c;
   private final List<jh> d;

   public esb(float $$0, ern $$1, List<jh> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(esi.a $$0) {
      bck $$1 = $$0.b();

      for (jb $$2 : ag.a($$0.c(), $$1)) {
         jh $$3 = ag.a(this.d, $$1);
         jb $$4 = $$2.a($$3);
         if ($$1.i() <= this.b && $$0.a($$4)) {
            $$0.a($$4, this.c.a($$1, $$4));
         }
      }
   }

   @Override
   protected esj<?> a() {
      return esj.j;
   }
}
