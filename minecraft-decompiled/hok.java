import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hok implements hoe {
   private static final int a = 16;
   private final hpq b;
   private final float c;
   private final float[] d;
   private final hoe[] e;
   private final hoe f;

   hok(hpq $$0, float $$1, float[] $$2, hoe[] $$3, hoe $$4) {
      this.b = $$0;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.c = $$1;
   }

   private static int a(float[] $$0, float $$1) {
      if ($$0.length < 16) {
         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            if ($$0[$$2] > $$1) {
               return $$2 - 1;
            }
         }

         return $$0.length - 1;
      } else {
         int $$3 = Arrays.binarySearch($$0, $$1);
         if ($$3 < 0) {
            int $$4 = ~$$3;
            return $$4 - 1;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hoe $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public record a(float c, hoe.b d) {
      public static final Codec<hok.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hok.a::a), hog.a.fieldOf("model").forGetter(hok.a::b)).apply($$0, hok.a::new)
      );
      public static final Comparator<hok.a> b = Comparator.comparingDouble(hok.a::a);

      public float a() {
         return (double)this.c;
      }

      public hoe.b b() {
         return this.d;
      }
   }

   public record b(hpq b, float c, List<hok.a> d, Optional<hoe.b> e) implements hoe.b {
      public static final MapCodec<hok.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               hpp.a.forGetter(hok.b::b),
               Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hok.b::c),
               hok.a.a.listOf().fieldOf("entries").forGetter(hok.b::d),
               hog.a.optionalFieldOf("fallback").forGetter(hok.b::e)
            )
            .apply($$0, hok.b::new)
      );

      @Override
      public MapCodec<hok.b> a() {
         return a;
      }

      @Override
      public hoe a(hoe.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hoe[] $$2 = new hoe[this.d.size()];
         List<hok.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hok.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hok.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hoe $$6 = this.e.<hoe>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hok(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(huk.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
