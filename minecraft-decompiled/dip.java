import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dip(jl<dcr> c, int d, ko e) {
   private static final Codec<dip> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dcr.e.fieldOf("id").forGetter(dip::b),
            bbi.a(1, 99).optionalFieldOf("count", 1).forGetter(dip::c),
            ko.b.optionalFieldOf("components", ko.a).forGetter(dip::d)
         )
         .apply($$0, dip::new)
   );
   public static final Codec<dip> a = Codec.withAlternative(f, dcr.e, $$0 -> new dip((dcr)$$0.a())).validate(dip::a);
   public static final zm<wx, dip> b = zm.a(dcr.f, dip::b, zk.h, dip::c, ko.c, dip::d, dip::new);

   public dip(dcr $$0) {
      this($$0.e(), 1, ko.a);
   }

   private static DataResult<dip> a(dip $$0) {
      return dcv.a(new dcv($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public dcv a(dcv $$0) {
      dcv $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(dcv $$0) {
      dcv $$1 = this.a($$0);
      return $$1.M() == 1 && dcv.c($$0, $$1);
   }

   public diy a() {
      return new diy.f(new dcv(this.c, this.d, this.e));
   }

   public jl<dcr> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ko d() {
      return this.e;
   }
}
