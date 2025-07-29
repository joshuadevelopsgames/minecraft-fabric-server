import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dco(jl<ayy> e, float f, float g, xo h) {
   public static final Codec<dco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ayy.b.fieldOf("sound_event").forGetter(dco::a),
            bbi.r.fieldOf("use_duration").forGetter(dco::b),
            bbi.r.fieldOf("range").forGetter(dco::c),
            xq.a.fieldOf("description").forGetter(dco::d)
         )
         .apply($$0, dco::new)
   );
   public static final zm<wx, dco> b = zm.a(ayy.d, dco::a, zk.l, dco::b, zk.l, dco::c, xq.b, dco::d, dco::new);
   public static final Codec<jl<dco>> c = ama.a(mn.aZ, a);
   public static final zm<wx, jl<dco>> d = zk.a(mn.aZ, b);

   public jl<ayy> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xo d() {
      return this.h;
   }
}
