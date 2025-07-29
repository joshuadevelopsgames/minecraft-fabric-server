import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ffn extends few {
   public static final MapCodec<ffn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(bae.b(mn.aZ).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ffn::new)
   );
   private final bae<dco> b;

   private ffn(List<fgs> $$0, bae<dco> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<ffn> b() {
      return fez.G;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      jy<dco> $$2 = $$1.d().K_().f(mn.aZ);
      Optional<jl<dco>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kq.ab, new dfl($$3.get()));
      }

      return $$0;
   }

   public static few.a<?> a(bae<dco> $$0) {
      return a($$1 -> new ffn($$1, $$0));
   }
}
