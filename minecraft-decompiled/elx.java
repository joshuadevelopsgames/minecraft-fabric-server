import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elx extends elz {
   public static final Codec<elx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            elz.d.forGetter($$0x -> $$0x), bwm.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), elx.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
         )
         .apply($$0, elx::new)
   );
   public final bwm b;
   public final elx.a c;

   public elx(float $$0, etf $$1, bwm $$2, eku $$3, ema $$4, jp<dpz> $$5, bwm $$6, elx.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public elx(elz $$0, bwm $$1, elx.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<elx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bwm.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
               bwm.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
               bbi.o.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
               bwm.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
               Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
               Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elx.a::new)
      );
      public final bwm b;
      public final bwm c;
      public final int d;
      public final bwm e;
      public final float f;
      public final float g;

      public a(bwm $$0, bwm $$1, int $$2, bwm $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
