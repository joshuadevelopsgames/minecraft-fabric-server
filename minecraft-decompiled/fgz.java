import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fgz(Optional<cn> b) implements fgs {
   public static final MapCodec<fgz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cn.a.optionalFieldOf("predicate").forGetter(fgz::c)).apply($$0, fgz::new));

   @Override
   public fgt b() {
      return fgu.j;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.i);
   }

   public boolean a(fdj $$0) {
      dcv $$1 = $$0.c(fgd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static fgs.a a(cn.a $$0) {
      return () -> new fgz(Optional.of($$0.b()));
   }

   public Optional<cn> c() {
      return this.b;
   }
}
