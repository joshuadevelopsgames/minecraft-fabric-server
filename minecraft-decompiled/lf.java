import com.mojang.serialization.Codec;
import java.util.Optional;

public record lf(jp<dep> e) implements dm<der> {
   public static final Codec<lf> a = ka.a(mn.ah).xmap(lf::new, lf::b);

   @Override
   public kp<der> a() {
      return kq.R;
   }

   public boolean a(der $$0) {
      Optional<jl<dep>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.e.a($$1.get());
   }

   public static kz a(jp<dep> $$0) {
      return new lf($$0);
   }

   public jp<dep> b() {
      return this.e;
   }
}
