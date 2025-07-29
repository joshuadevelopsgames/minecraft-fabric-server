import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class feu extends few {
   public static final MapCodec<feu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fdi.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, feu::new));
   private final fdi b;

   private feu(List<fgs> $$0, fdi $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<feu> b() {
      return fez.w;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static few.a<?> a(fdi $$0) {
      return a($$1 -> new feu($$1, $$0));
   }
}
