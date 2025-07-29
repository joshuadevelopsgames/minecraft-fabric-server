import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkh(kg d, Optional<elh> e, ern f, Optional<jl<ejb>> g) implements djz {
   public static final MapCodec<dkh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            kg.g.optionalFieldOf("offset", kg.i).forGetter(dkh::b),
            elh.b.optionalFieldOf("predicate").forGetter(dkh::c),
            ern.a.fieldOf("block_state").forGetter(dkh::d),
            ejb.aj.optionalFieldOf("trigger_game_event").forGetter(dkh::e)
         )
         .apply($$0, dkh::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      jb $$5 = jb.a((jv)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.c($$5, this.f.a($$3.ec(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public kg b() {
      return this.d;
   }

   public Optional<elh> c() {
      return this.e;
   }

   public ern d() {
      return this.f;
   }

   public Optional<jl<ejb>> e() {
      return this.g;
   }
}
