import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class etv extends euf {
   private final jh c;
   private final elh d;
   private final elh e;
   private final int f;
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            jh.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
            elh.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
            elh.b.optionalFieldOf("allowed_search_condition", elh.e()).forGetter($$0x -> $$0x.e),
            Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
         )
         .apply($$0, etv::new)
   );

   private etv(jh $$0, elh $$1, elh $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static etv a(jh $$0, elh $$1, elh $$2, int $$3) {
      return new etv($$0, $$1, $$2, $$3);
   }

   public static etv a(jh $$0, elh $$1, int $$2) {
      return a($$0, $$1, elh.e(), $$2);
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      jb.a $$3 = $$2.k();
      dnt $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.e($$3.v())) {
               return Stream.of();
            }

            if (!this.e.test($$4, $$3)) {
               break;
            }
         }

         return this.d.test($$4, $$3) ? Stream.of($$3) : Stream.of();
      }
   }

   @Override
   public eug<?> b() {
      return eug.j;
   }
}
