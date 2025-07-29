import java.util.Optional;

public class dmo {
   public Optional<Float> a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4) {
      return $$3.l() && $$4.c() ? Optional.empty() : Optional.of(Math.max($$3.b().e(), $$4.i()));
   }

   public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
      return true;
   }

   public boolean a(dmn $$0, bzm $$1) {
      return true;
   }

   public float a(bzm $$0) {
      return 1.0F;
   }

   public float a(dmn $$0, bzm $$1, float $$2) {
      float $$3 = $$0.e() * 2.0F;
      fis $$4 = $$0.f();
      double $$5 = Math.sqrt($$1.g($$4)) / $$3;
      double $$6 = (1.0 - $$5) * $$2;
      return (float)(($$6 * $$6 + $$6) / 2.0 * 7.0 * $$3 + 1.0);
   }
}
