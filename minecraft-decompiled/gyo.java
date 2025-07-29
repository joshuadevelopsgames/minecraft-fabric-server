import javax.annotation.Nullable;

public final class gyo implements AutoCloseable {
   private final fue a;
   private final fng b;

   public gyo(fue $$0) {
      this.a = $$0;
      this.b = new fng(fnd::new);
   }

   public fni a(fmx $$0, @Nullable String $$1, String $$2) {
      return new fni(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
