import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class exp extends euy {
   public static final MapCodec<exp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, exp::new)
   );
   public final boolean e;

   public exp(euy.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      eka.a $$1 = this.e ? eka.a.a : eka.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(evq $$0, euy.a $$1) {
      dwu $$2 = dwu.a($$1.f());
      jb $$3 = new jb($$1.h().d(), 90, $$1.h().e());
      exo.a $$4 = exo.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         euq $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = euy.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = euy.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public evh<?> e() {
      return evh.m;
   }
}
