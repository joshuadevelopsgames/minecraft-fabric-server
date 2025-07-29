import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffq extends few {
   public static final MapCodec<ffq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dcr.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ffq::new));
   private final jl<dcr> b;

   private ffq(List<fgs> $$0, jl<dcr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<ffq> b() {
      return fez.f;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      return $$0.a(this.b.a());
   }
}
