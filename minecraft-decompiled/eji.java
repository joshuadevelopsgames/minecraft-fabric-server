import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eji(jl<ejb> b, float c, fis d, @Nullable UUID e, @Nullable UUID f, @Nullable bzm g) {
   public static final Codec<eji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ejb.aj.fieldOf("game_event").forGetter(eji::a),
            Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eji::b),
            fis.a.fieldOf("pos").forGetter(eji::c),
            kf.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
            kf.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
         )
         .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eji($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eji(jl<ejb> $$0, float $$1, fis $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eji(jl<ejb> $$0, float $$1, fis $$2, @Nullable bzm $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cK(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bzm $$0) {
      return $$0 instanceof cvo $$1 && $$1.ah_() != null ? $$1.ah_().cK() : null;
   }

   public Optional<bzm> a(aub $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bzm> b(aub $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cvo).map($$0x -> (cvo)$$0x).map(cvo::ah_).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jl<ejb> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fis c() {
      return this.d;
   }

   @Nullable
   public UUID d() {
      return this.e;
   }

   @Nullable
   public UUID e() {
      return this.f;
   }

   @Nullable
   public bzm f() {
      return this.g;
   }
}
