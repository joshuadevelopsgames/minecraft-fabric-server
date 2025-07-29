import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dlo(jl<dcr> d, int e, kk f, dcv g) {
   public static final Codec<dlo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dcr.e.fieldOf("id").forGetter(dlo::a),
            bbi.p.fieldOf("count").orElse(1).forGetter(dlo::b),
            kk.a.optionalFieldOf("components", kk.c).forGetter(dlo::c)
         )
         .apply($$0, dlo::new)
   );
   public static final zm<wx, dlo> b = zm.a(dcr.f, dlo::a, zk.h, dlo::b, kk.b, dlo::c, dlo::new);
   public static final zm<wx, Optional<dlo>> c = b.a(zk::a);

   public dlo(dmt $$0) {
      this($$0, 1);
   }

   public dlo(dmt $$0, int $$1) {
      this($$0.h().e(), $$1, kk.c);
   }

   public dlo(jl<dcr> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dlo a(UnaryOperator<kk.a> $$0) {
      return new dlo(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static dcv a(jl<dcr> $$0, int $$1, kk $$2) {
      return new dcv($$0, $$1, $$2.d());
   }

   public boolean a(dcv $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jl<dcr> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public dcv d() {
      return this.g;
   }
}
