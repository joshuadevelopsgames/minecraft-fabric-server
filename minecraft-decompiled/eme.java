import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eme<WC extends elz>(emg<WC> d, WC e) {
   public static final Codec<eme<?>> a = mm.N.q().dispatch($$0 -> $$0.d, emg::c);
   public static final Codec<jl<eme<?>>> b = ama.a(mn.aO, a);
   public static final Codec<jp<eme<?>>> c = ka.a(mn.aO, a);

   public boolean a(bck $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(emb $$0, efy $$1, Function<jb, jl<dnx>> $$2, bck $$3, ejm $$4, dlz $$5, efx $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public emg<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
