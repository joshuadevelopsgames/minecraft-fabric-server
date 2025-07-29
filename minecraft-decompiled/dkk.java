import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkk(dev d, kg e, Optional<jl<ejb>> f) implements djz {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            dev.b.fieldOf("properties").forGetter(dkk::b),
            kg.g.optionalFieldOf("offset", kg.i).forGetter(dkk::c),
            ejb.aj.optionalFieldOf("trigger_game_event").forGetter(dkk::d)
         )
         .apply($$0, dkk::new)
   );

   public dkk(dev $$0) {
      this($$0, kg.i, Optional.of(ejb.c));
   }

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      jb $$5 = jb.a((jv)$$4).a(this.e);
      eeb $$6 = $$3.ai().a_($$5);
      eeb $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.ai().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dev b() {
      return this.d;
   }

   public kg c() {
      return this.e;
   }

   public Optional<jl<ejb>> d() {
      return this.f;
   }
}
