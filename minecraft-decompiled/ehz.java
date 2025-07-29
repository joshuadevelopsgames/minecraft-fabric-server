import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehz(jl<ehy> e, efz f) {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehy.l.fieldOf("type").forGetter(ehz::a), efz.a.fieldOf("generator").forGetter(ehz::b)).apply($$0, $$0.stable(ehz::new))
   );
   public static final amd<ehz> b = amd.a(mn.bv, ame.b("overworld"));
   public static final amd<ehz> c = amd.a(mn.bv, ame.b("the_nether"));
   public static final amd<ehz> d = amd.a(mn.bv, ame.b("the_end"));

   public jl<ehy> a() {
      return this.e;
   }

   public efz b() {
      return this.f;
   }
}
