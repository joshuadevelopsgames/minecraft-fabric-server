import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hoc implements hoe {
   private final hpe a;
   private final hoe b;
   private final hoe c;

   public hoc(hpe $$0, hoe $$1, hoe $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public record a(hot b, hoe.b c, hoe.b d) implements hoe.b {
      public static final MapCodec<hoc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hos.a.forGetter(hoc.a::b), hog.a.fieldOf("on_true").forGetter(hoc.a::c), hog.a.fieldOf("on_false").forGetter(hoc.a::d))
            .apply($$0, hoc.a::new)
      );

      @Override
      public MapCodec<hoc.a> a() {
         return a;
      }

      @Override
      public hoe a(hoe.a $$0) {
         return new hoc(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hpe a(hot $$0, @Nullable bcl $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            grd<grk, hpe> $$2 = new grd<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hpe $$7 = (hpe)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hot> T a(T $$0, bcl $$1, grk $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.K_()).result().orElse($$0);
      }

      @Override
      public void a(huk.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
