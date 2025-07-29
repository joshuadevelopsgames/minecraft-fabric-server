import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record coe(jc e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<coe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jc.b.forGetter(coe::b), cxa.b.fieldOf("spawn_conditions").forGetter(coe::c)).apply($$0, coe::new)
   );
   public static final Codec<coe> b = RecordCodecBuilder.create($$0 -> $$0.group(jc.b.forGetter(coe::b)).apply($$0, coe::new));
   public static final Codec<jl<coe>> c = amb.a(mn.aY);
   public static final zm<wx, jl<coe>> d = zk.b(mn.aY);

   private coe(jc $$0) {
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
