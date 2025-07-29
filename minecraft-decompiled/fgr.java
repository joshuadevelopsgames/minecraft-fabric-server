import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fgr(jl<dpz> b, Optional<ds> c) implements fgs {
   public static final MapCodec<fgr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mm.e.r().fieldOf("block").forGetter(fgr::c), ds.a.optionalFieldOf("properties").forGetter(fgr::d)).apply($$0, fgr::new)
      )
      .validate(fgr::a);

   private static DataResult<fgr> a(fgr $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fgt b() {
      return fgu.i;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.g);
   }

   public boolean a(fdj $$0) {
      eeb $$1 = $$0.c(fgd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fgr.a a(dpz $$0) {
      return new fgr.a($$0);
   }

   public jl<dpz> c() {
      return this.b;
   }

   public Optional<ds> d() {
      return this.c;
   }

   public static class a implements fgs.a {
      private final jl<dpz> a;
      private Optional<ds> b = Optional.empty();

      public a(dpz $$0) {
         this.a = $$0.p();
      }

      public fgr.a a(ds.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fgs build() {
         return new fgr(this.a, this.b);
      }
   }
}
