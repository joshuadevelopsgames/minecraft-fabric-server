import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hsg(ame c, List<hsg.a> d, double e, double f) implements hrx {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hsg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ame.a.fieldOf("resource").forGetter(hsg::b),
            bbi.b(hsg.a.a.listOf()).fieldOf("regions").forGetter(hsg::c),
            Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hsg::d),
            Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hsg::e)
         )
         .apply($$0, hsg::new)
   );

   @Override
   public void a(axo $$0, hrx.a $$1) {
      ame $$2 = a.a(this.c);
      Optional<axm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hsc $$4 = new hsc($$2, $$3.get(), this.d.size());

         for (hsg.a $$5 : this.d) {
            $$1.a($$5.b, new hsg.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hsg> a() {
      return b;
   }

   public ame b() {
      return this.c;
   }

   public List<hsg.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public record a(ame b, double c, double d, double e, double f) {
      public static final Codec<hsg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ame.a.fieldOf("sprite").forGetter(hsg.a::a),
               Codec.DOUBLE.fieldOf("x").forGetter(hsg.a::b),
               Codec.DOUBLE.fieldOf("y").forGetter(hsg.a::c),
               Codec.DOUBLE.fieldOf("width").forGetter(hsg.a::d),
               Codec.DOUBLE.fieldOf("height").forGetter(hsg.a::e)
            )
            .apply($$0, hsg.a::new)
      );

      public ame a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }

      public double c() {
         return this.d;
      }

      public double d() {
         return this.e;
      }

      public double e() {
         return this.f;
      }
   }

   static class b implements hrx.b {
      private final hsc a;
      private final hsg.a b;
      private final double c;
      private final double d;

      b(hsc $$0, hsg.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hrm a(hrw $$0) {
         try {
            fnf $$1 = this.a.a();
            double $$2 = $$1.a() / this.c;
            double $$3 = $$1.b() / this.d;
            int $$4 = bcb.a(this.b.c * $$2);
            int $$5 = bcb.a(this.b.d * $$3);
            int $$6 = bcb.a(this.b.e * $$2);
            int $$7 = bcb.a(this.b.f * $$3);
            fnf $$8 = new fnf(fnf.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hrm(this.b.b, new hth($$6, $$7), $$8, axq.a);
         } catch (Exception var16) {
            hsg.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hrh.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
