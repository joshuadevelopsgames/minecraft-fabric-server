import java.util.Optional;

public class dnn extends dmo {
   private final boolean a;
   private final boolean b;
   private final Optional<Float> c;
   private final Optional<jp<dpz>> d;

   public dnn(boolean $$0, boolean $$1, Optional<Float> $$2, Optional<jp<dpz>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public Optional<Float> a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4) {
      if (this.d.isPresent()) {
         return $$3.a(this.d.get()) ? Optional.of(3600000.0F) : Optional.empty();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
      return this.a;
   }

   @Override
   public boolean a(dmn $$0, bzm $$1) {
      return this.b;
   }

   @Override
   public float a(bzm $$0) {
      boolean $$2 = $$0 instanceof cut $$1 && $$1.gt().b;
      return $$2 ? 0.0F : this.c.orElseGet(() -> super.a($$0));
   }
}
