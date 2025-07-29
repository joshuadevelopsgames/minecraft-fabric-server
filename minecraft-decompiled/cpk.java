import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpk(jl<ayy> e, jl<ayy> f, jl<ayy> g, jl<ayy> h, jl<ayy> i, jl<ayy> j) {
   public static final Codec<cpk> a = g();
   public static final Codec<cpk> b = g();
   public static final Codec<jl<cpk>> c = amb.a(mn.bs);
   public static final zm<wx, jl<cpk>> d = zk.b(mn.bs);

   private static Codec<cpk> g() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ayy.b.fieldOf("ambient_sound").forGetter(cpk::a),
               ayy.b.fieldOf("death_sound").forGetter(cpk::b),
               ayy.b.fieldOf("growl_sound").forGetter(cpk::c),
               ayy.b.fieldOf("hurt_sound").forGetter(cpk::d),
               ayy.b.fieldOf("pant_sound").forGetter(cpk::e),
               ayy.b.fieldOf("whine_sound").forGetter(cpk::f)
            )
            .apply($$0, cpk::new)
      );
   }

   public jl<ayy> a() {
      return this.e;
   }

   public jl<ayy> b() {
      return this.f;
   }

   public jl<ayy> c() {
      return this.g;
   }

   public jl<ayy> d() {
      return this.h;
   }

   public jl<ayy> e() {
      return this.i;
   }

   public jl<ayy> f() {
      return this.j;
   }
}
