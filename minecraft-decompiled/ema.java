import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ema {
   public static final ema a = new ema(false, dqb.gZ.m(), dqb.qu.m(), dqb.eA.m(), dqb.aX.m());
   public static final Codec<ema> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ema::a),
            eeb.a.optionalFieldOf("air_state", a.b()).forGetter(ema::b),
            eeb.a.optionalFieldOf("water_state", a.b()).forGetter(ema::c),
            eeb.a.optionalFieldOf("lava_state", a.b()).forGetter(ema::d),
            eeb.a.optionalFieldOf("barrier_state", a.b()).forGetter(ema::e)
         )
         .apply($$0, ema::new)
   );
   private final boolean c;
   private final eeb d;
   private final eeb e;
   private final eeb f;
   private final eeb g;

   public static ema a(boolean $$0, eeb $$1, eeb $$2, eeb $$3, eeb $$4) {
      return new ema($$0, $$1, $$2, $$3, $$4);
   }

   public static ema a(eeb $$0, eeb $$1, eeb $$2, eeb $$3) {
      return new ema(false, $$0, $$1, $$2, $$3);
   }

   public static ema a(boolean $$0, eeb $$1) {
      return new ema($$0, $$1, a.c(), a.d(), a.e());
   }

   private ema(boolean $$0, eeb $$1, eeb $$2, eeb $$3, eeb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public eeb b() {
      return this.d;
   }

   public eeb c() {
      return this.e;
   }

   public eeb d() {
      return this.f;
   }

   public eeb e() {
      return this.g;
   }
}
