import com.mojang.serialization.Codec;
import java.util.Optional;

public record dfu(dbw<dli> c) {
   public static final Codec<dfu> a = dbw.a(mn.bp, dli.c).xmap(dfu::new, dfu::a);
   public static final zm<wx, dfu> b = dbw.a(mn.bp, dli.d).a(dfu::new, dfu::a);

   public dfu(jl<dli> $$0) {
      this(new dbw<>($$0));
   }

   @Deprecated
   public dfu(amd<dli> $$0) {
      this(new dbw<>($$0));
   }

   public Optional<jl<dli>> a(jn.a $$0) {
      return this.c.a($$0);
   }

   public dbw<dli> a() {
      return this.c;
   }
}
