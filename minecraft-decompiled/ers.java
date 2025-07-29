import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ers extends erq {
   public static final MapCodec<ers> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
               eeb.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
               bbi.b(eeb.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
               bbi.b(eeb.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
            )
         )
         .apply($$0, ers::new)
   );
   private final float g;
   private final float h;
   private final eeb i;
   private final List<eeb> j;
   private final List<eeb> k;

   public ers(long $$0, ezo.a $$1, float $$2, float $$3, float $$4, eeb $$5, List<eeb> $$6, List<eeb> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ero<?> a() {
      return ero.c;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      double $$2 = this.a($$1, this.e);
      if ($$2 < this.g) {
         return ag.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ag.a(this.k, $$0) : this.i;
      }
   }
}
