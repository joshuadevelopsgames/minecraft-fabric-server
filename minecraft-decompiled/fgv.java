import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fgv(Optional<bz> b, fdj.b c) implements fgs {
   public static final MapCodec<fgv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bz.a.optionalFieldOf("predicate").forGetter(fgv::c), fdj.b.e.fieldOf("entity").forGetter(fgv::d)).apply($$0, fgv::new)
   );

   @Override
   public fgt b() {
      return fgu.f;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.f, this.c.a());
   }

   public boolean a(fdj $$0) {
      bzm $$1 = $$0.c(this.c.a());
      fis $$2 = $$0.c(fgd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fgs.a a(fdj.b $$0) {
      return a($$0, bz.a.a());
   }

   public static fgs.a a(fdj.b $$0, bz.a $$1) {
      return () -> new fgv(Optional.of($$1.b()), $$0);
   }

   public static fgs.a a(fdj.b $$0, bz $$1) {
      return () -> new fgv(Optional.of($$1), $$0);
   }

   public Optional<bz> c() {
      return this.b;
   }

   public fdj.b d() {
      return this.c;
   }
}
