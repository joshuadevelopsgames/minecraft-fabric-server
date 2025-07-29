import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cmh(jc e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<cmh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jc.b.forGetter(cmh::b), cxa.b.fieldOf("spawn_conditions").forGetter(cmh::c)).apply($$0, cmh::new)
   );
   public static final Codec<cmh> b = RecordCodecBuilder.create($$0 -> $$0.group(jc.b.forGetter(cmh::b)).apply($$0, cmh::new));
   public static final Codec<jl<cmh>> c = amb.a(mn.aL);
   public static final zm<wx, jl<cmh>> d = zk.b(mn.aL);

   private cmh(jc $$0) {
      this($$0, cxa.a);
   }

   @Override
   public List<cww.a<cwz, cwx>> a() {
      return this.f.a();
   }

   public jc b() {
      return this.e;
   }

   public cxa c() {
      return this.f;
   }
}
