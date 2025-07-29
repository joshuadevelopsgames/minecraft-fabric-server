import java.util.Optional;

public class dml extends dmo {
   private final bzm a;

   public dml(bzm $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
