import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffu extends few {
   public static final MapCodec<ffu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dep.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ffu::new));
   private final jl<dep> b;

   private ffu(List<fgs> $$0, jl<dep> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<ffu> b() {
      return fez.F;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.R, der.a, this.b, der::b);
      return $$0;
   }

   public static few.a<?> a(jl<dep> $$0) {
      return a($$1 -> new ffu($$1, $$0));
   }
}
