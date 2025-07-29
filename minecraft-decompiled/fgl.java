import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fgl(Optional<bn> b) implements fgs {
   public static final MapCodec<fgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bn.a.optionalFieldOf("predicate").forGetter(fgl::c)).apply($$0, fgl::new));

   @Override
   public fgt b() {
      return fgu.m;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.f, fgd.c);
   }

   public boolean a(fdj $$0) {
      byb $$1 = $$0.c(fgd.c);
      fis $$2 = $$0.c(fgd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static fgs.a a(bn.a $$0) {
      return () -> new fgl(Optional.of($$0.b()));
   }

   public Optional<bn> c() {
      return this.b;
   }
}
