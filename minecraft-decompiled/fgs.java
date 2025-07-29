import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface fgs extends fdk, Predicate<fdj> {
   Codec<fgs> d = mm.F.q().dispatch("condition", fgs::b, fgt::a);
   Codec<fgs> e = Codec.lazyInitialized(() -> Codec.withAlternative(d, fgf.b));
   Codec<jl<fgs>> f = ama.a(mn.by, e);

   fgt b();

   @FunctionalInterface
   public interface a {
      fgs build();

      default fgs.a invert() {
         return fgp.a(this);
      }

      default fgg.a or(fgs.a $$0) {
         return fgg.a(this, $$0);
      }

      default fgf.a and(fgs.a $$0) {
         return fgf.a(this, $$0);
      }
   }
}
