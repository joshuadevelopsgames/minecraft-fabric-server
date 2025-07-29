import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hpr extends hpo implements hpq {
   public static final MapCodec<hpr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hpo::b), hpr.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hpr::new)
   );
   private final hpr.a b;
   private final bck c = bck.a();
   private final hpo.a d;

   public hpr(boolean $$0, hpr.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(dcv $$0, grk $$1, int $$2, bzm $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hpr> a() {
      return a;
   }

   public static enum a implements bda {
      a("random") {
         @Override
         public float a(grk $$0, dcv $$1, bzm $$2, bck $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(grk $$0, dcv $$1, bzm $$2, bck $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(grk $$0, dcv $$1, bzm $$2, bck $$3) {
            return $$0.at() / 8.0F;
         }
      };

      public static final Codec<hpr.a> d = bda.a(hpr.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(grk var1, dcv var2, bzm var3, bck var4);
   }
}
