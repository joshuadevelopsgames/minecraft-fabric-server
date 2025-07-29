import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dli(dlh e, xo f) {
   public static final Codec<dli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlh.b.forGetter(dli::a), xq.a.fieldOf("description").forGetter(dli::b)).apply($$0, dli::new)
   );
   public static final zm<wx, dli> b = zm.a(dlh.c, dli::a, xq.b, dli::b, dli::new);
   public static final Codec<jl<dli>> c = ama.a(mn.bp, a);
   public static final zm<wx, jl<dli>> d = zk.a(mn.bp, b);

   public dlh a() {
      return this.e;
   }

   public xo b() {
      return this.f;
   }
}
