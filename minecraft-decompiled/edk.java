import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record edk(amd<fdo> d, double e, double f, dcv g, Optional<amd<fdo>> h, edb i, edb.a j) {
   static final String a = "config";
   static edk b = new edk();
   static Codec<edk> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               fdo.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(edk::b),
               Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(edk::c),
               Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(edk::d),
               dcv.a("key_item").forGetter(edk::e),
               fdo.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(edk::f)
            )
            .apply($$0, edk::new)
      )
      .validate(edk::h);

   private edk() {
      this(fdf.R, 4.0, 4.5, new dcv(dcz.Ai), Optional.empty(), edb.b, edb.a.a);
   }

   public edk(amd<fdo> $$0, double $$1, double $$2, dcv $$3, Optional<amd<fdo>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public edb a() {
      return this.i;
   }

   private DataResult<edk> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public amd<fdo> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public dcv e() {
      return this.g;
   }

   public Optional<amd<fdo>> f() {
      return this.h;
   }

   public edb.a g() {
      return this.j;
   }
}
