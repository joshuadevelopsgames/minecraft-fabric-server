import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dju(jp<byo> d, djp e, djp f, djp g, djp h) implements djz {
   public static final MapCodec<dju> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ka.a(mn.Z).fieldOf("to_apply").forGetter(dju::b),
            djp.b.fieldOf("min_duration").forGetter(dju::c),
            djp.b.fieldOf("max_duration").forGetter(dju::d),
            djp.b.fieldOf("min_amplifier").forGetter(dju::e),
            djp.b.fieldOf("max_amplifier").forGetter(dju::f)
         )
         .apply($$0, dju::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      if ($$3 instanceof cam $$5) {
         bck $$6 = $$5.ec();
         Optional<jl<byo>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(bcb.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(bcb.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new byq($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public jp<byo> b() {
      return this.d;
   }

   public djp c() {
      return this.e;
   }

   public djp d() {
      return this.f;
   }

   public djp e() {
      return this.g;
   }

   public djp f() {
      return this.h;
   }
}
