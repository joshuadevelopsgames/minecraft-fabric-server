import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dki(djp d, djp e, kg f, Optional<elh> g, ern h, Optional<jl<ejb>> i) implements djz {
   public static final MapCodec<dki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            djp.b.fieldOf("radius").forGetter(dki::b),
            djp.b.fieldOf("height").forGetter(dki::c),
            kg.g.optionalFieldOf("offset", kg.i).forGetter(dki::d),
            elh.b.optionalFieldOf("predicate").forGetter(dki::e),
            ern.a.fieldOf("block_state").forGetter(dki::f),
            ejb.aj.optionalFieldOf("trigger_game_event").forGetter(dki::g)
         )
         .apply($$0, dki::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      jb $$5 = jb.a((jv)$$4).a(this.f);
      bck $$6 = $$3.ec();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jb $$9 : jb.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), $$9.v() + 0.5, $$4.c()) < bcb.i($$7) && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true) && $$0.c($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public djp b() {
      return this.d;
   }

   public djp c() {
      return this.e;
   }

   public kg d() {
      return this.f;
   }

   public Optional<elh> e() {
      return this.g;
   }

   public ern f() {
      return this.h;
   }

   public Optional<jl<ejb>> g() {
      return this.i;
   }
}
