import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhs(fho b, fho c) implements fho {
   public static final MapCodec<fhs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fhp.a.fieldOf("min").forGetter(fhs::c), fhp.a.fieldOf("max").forGetter(fhs::d)).apply($$0, fhs::new)
   );

   @Override
   public fhn b() {
      return fhp.c;
   }

   public static fhs a(float $$0, float $$1) {
      return new fhs(fhl.a($$0), fhl.a($$1));
   }

   @Override
   public int a(fdj $$0) {
      return bcb.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(fdj $$0) {
      return bcb.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bdn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fho c() {
      return this.b;
   }

   public fho d() {
      return this.c;
   }
}
