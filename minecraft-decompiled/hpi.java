import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hpi extends hpo {
   public static final MapCodec<hpi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hpo::b), hpi.a.e.fieldOf("target").forGetter(hpi::a)).apply($$0, hpi::new)
   );
   private final hpo.a b;
   private final hpo.a c;
   private final hpi.a d;
   private final bck e = bck.a();

   public hpi(boolean $$0, hpi.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(dcv $$0, grk $$1, int $$2, bzm $$3) {
      jk $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + a($$0) / 2.1474836E9F;
      return bcb.b($$2, 1.0F);
   }

   private float a(bzm $$0, long $$1, jb $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      float $$6;
      if ($$0 instanceof cut $$5 && $$5.gq() && $$5.ai().v().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         $$6 = $$3 + this.b.a();
      } else {
         $$6 = 0.5F - ($$4 - 0.25F - $$3);
      }

      return bcb.b($$6, 1.0F);
   }

   private static boolean a(bzm $$0, @Nullable jk $$1) {
      return $$1 != null && $$1.a() == $$0.ai().aj() && !($$1.b().b($$0.dv()) < 1.0E-5F);
   }

   private static double a(bzm $$0, jb $$1) {
      fis $$2 = fis.b($$1);
      return Math.atan2($$2.c() - $$0.dI(), $$2.a() - $$0.dC()) / (float) (Math.PI * 2);
   }

   private static float a(bzm $$0) {
      return bcb.b($$0.dQ() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hpi.a a() {
      return this.d;
   }

   public static enum a implements bda {
      a("none") {
         @Nullable
         @Override
         public jk a(grk $$0, dcv $$1, bzm $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jk a(grk $$0, dcv $$1, bzm $$2) {
            dfp $$3 = $$1.a(kq.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jk a(grk $$0, dcv $$1, bzm $$2) {
            return jk.a($$0.aj(), $$0.ab());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jk a(grk $$0, dcv $$1, bzm $$2) {
            return $$2 instanceof cut $$3 ? $$3.gS().orElse(null) : null;
         }
      };

      public static final Codec<hpi.a> e = bda.a(hpi.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jk a(grk var1, dcv var2, bzm var3);
   }
}
