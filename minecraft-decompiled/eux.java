import java.util.Optional;

public abstract class eux extends euy {
   private final eux.a d;
   private final int e;
   private final int f;

   protected eux(eux.a $$0, int $$1, int $$2, euy.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, eka.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(evq $$0, euy.a $$1) {
      dlz $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      evc construct(ekz var1, int var2, int var3);
   }
}
