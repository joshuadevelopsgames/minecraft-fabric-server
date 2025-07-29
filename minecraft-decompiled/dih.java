import java.util.Optional;

public interface dih extends dhm<dii> {
   @Override
   default dhx<dih> b() {
      return dhx.g;
   }

   @Override
   dhw<? extends dih> a();

   default boolean a(dii $$0, dmu $$1) {
      return dhi.a(this.c(), $$0.c()) && this.f().a($$0.d()) && dhi.a(this.k(), $$0.e());
   }

   Optional<dhi> c();

   dhi f();

   Optional<dhi> k();

   @Override
   default dhp h() {
      return dho.l;
   }
}
