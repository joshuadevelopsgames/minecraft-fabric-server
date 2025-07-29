import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emc extends elz {
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            elz.d.forGetter($$0x -> $$0x),
            bwm.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
            bwm.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
            bwm.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
         )
         .apply($$0, emc::new)
   );
   public final bwm b;
   public final bwm c;
   final bwm j;

   public emc(float $$0, etf $$1, bwm $$2, eku $$3, ema $$4, jp<dpz> $$5, bwm $$6, bwm $$7, bwm $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public emc(float $$0, etf $$1, bwm $$2, eku $$3, jp<dpz> $$4, bwm $$5, bwm $$6, bwm $$7) {
      this($$0, $$1, $$2, $$3, ema.a, $$4, $$5, $$6, $$7);
   }

   public emc(elz $$0, bwm $$1, bwm $$2, bwm $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
