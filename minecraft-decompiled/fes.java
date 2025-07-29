import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fes extends few {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fes> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(amd.a(mn.bx).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fes::new)
   );
   private final amd<fex> c;

   private fes(List<fgs> $$0, amd<fex> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fey<fes> b() {
      return fez.H;
   }

   @Override
   public void a(fdp $$0) {
      if (!$$0.b()) {
         $$0.a(new fdp.d(this.c));
      } else if ($$0.a(this.c)) {
         $$0.a(new fdp.c(this.c));
      } else {
         super.a($$0);
         $$0.a().c(this.c).ifPresentOrElse($$1 -> $$1.a().a($$0.a(new bci.b(this.c), this.c)), () -> $$0.a(new fdp.a(this.c)));
      }
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      fex $$2 = $$1.a().c(this.c).map(jl::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         fdj.c<?> $$3 = fdj.a($$2);
         if ($$1.b($$3)) {
            dcv var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static few.a<?> a(amd<fex> $$0) {
      return a($$1 -> new fes($$1, $$0));
   }
}
