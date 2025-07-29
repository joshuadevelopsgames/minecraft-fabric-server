import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class exh extends euy {
   public static final MapCodec<exh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), etf.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, exh::new)
   );
   public final etf e;

   public exh(euy.c $$0, etf $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      ekz $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      ekx $$5 = new ekx($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dng $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jb.a $$8 = new jb.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         eeb $$9 = $$7.a($$6);
         eeb $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dqb.en) || $$10.c(dmk.a, $$8.q($$6), jh.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jb $$11 = new jb($$2, $$6, $$3);
         return Optional.of(new euy.b($$11, (Consumer<evq>)($$3x -> exg.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public evh<?> e() {
      return evh.i;
   }
}
