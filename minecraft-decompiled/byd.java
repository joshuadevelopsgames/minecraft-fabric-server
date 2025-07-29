import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record byd(String d, bya e, float f, bxz g, byf h) {
   public static final Codec<byd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.STRING.fieldOf("message_id").forGetter(byd::a),
            bya.d.fieldOf("scaling").forGetter(byd::b),
            Codec.FLOAT.fieldOf("exhaustion").forGetter(byd::c),
            bxz.g.optionalFieldOf("effects", bxz.a).forGetter(byd::d),
            byf.d.optionalFieldOf("death_message_type", byf.a).forGetter(byd::e)
         )
         .apply($$0, byd::new)
   );
   public static final Codec<jl<byd>> b = amb.a(mn.aR);
   public static final zm<wx, jl<byd>> c = zk.b(mn.aR);

   public byd(String $$0, bya $$1, float $$2) {
      this($$0, $$1, $$2, bxz.a, byf.a);
   }

   public byd(String $$0, bya $$1, float $$2, bxz $$3) {
      this($$0, $$1, $$2, $$3, byf.a);
   }

   public byd(String $$0, float $$1, bxz $$2) {
      this($$0, bya.b, $$1, $$2);
   }

   public byd(String $$0, float $$1) {
      this($$0, bya.b, $$1);
   }

   public String a() {
      return this.d;
   }

   public bya b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public bxz d() {
      return this.g;
   }

   public byf e() {
      return this.h;
   }
}
