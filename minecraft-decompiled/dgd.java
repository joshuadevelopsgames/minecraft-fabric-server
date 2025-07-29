import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgd(int d, float e) {
   public static final float a = 5.0F;
   public static final Codec<dgd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.o.optionalFieldOf("item_damage_per_attack", 1).forGetter(dgd::a), bbi.q.optionalFieldOf("disable_blocking_for_seconds", 0.0F).forGetter(dgd::b)
         )
         .apply($$0, dgd::new)
   );
   public static final zm<wx, dgd> c = zm.a(zk.h, dgd::a, zk.l, dgd::b, dgd::new);

   public dgd(int $$0) {
      this($$0, 0.0F);
   }

   public int a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }
}
