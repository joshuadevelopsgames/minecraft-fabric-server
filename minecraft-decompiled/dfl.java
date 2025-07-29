import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Consumer;

public record dfl(dbw<dco> c) implements dga {
   public static final Codec<dfl> a = dbw.a(mn.aZ, dco.c).xmap(dfl::new, dfl::a);
   public static final zm<wx, dfl> b = dbw.a(mn.aZ, dco.d).a(dfl::new, dfl::a);

   public dfl(jl<dco> $$0) {
      this(new dbw<>($$0));
   }

   @Deprecated
   public dfl(amd<dco> $$0) {
      this(new dbw<>($$0));
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      jn.a $$4 = $$0.a();
      if ($$4 != null) {
         Optional<jl<dco>> $$5 = this.a($$4);
         if ($$5.isPresent()) {
            yc $$6 = $$5.get().a().d().f();
            xr.a($$6, yl.a.a(o.h));
            $$1.accept($$6);
         }
      }
   }

   public Optional<jl<dco>> a(jn.a $$0) {
      return this.c.a($$0);
   }

   public dbw<dco> a() {
      return this.c;
   }
}
