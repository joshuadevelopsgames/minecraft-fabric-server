import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fjc implements fix {
   protected static final fix a = new fjc(false, false, -Double.MAX_VALUE, dcv.l, $$0 -> false, null) {
      @Override
      public boolean a(fjm $$0, jb $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final boolean d;
   private final dcv e;
   private final Predicate<fal> f;
   @Nullable
   private final bzm g;

   protected fjc(boolean $$0, boolean $$1, double $$2, dcv $$3, Predicate<fal> $$4, @Nullable bzm $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Deprecated
   protected fjc(bzm $$0, boolean $$1, boolean $$2) {
      this(
         $$0.ck(),
         $$2,
         $$0.dE(),
         $$0 instanceof cam $$3 ? $$3.fh() : dcv.l,
         $$1 ? $$0x -> true : ($$0 instanceof cam $$4 ? $$1x -> $$4.a($$1x) : $$0x -> false),
         $$0
      );
   }

   @Override
   public boolean a(dcr $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean a(fal $$0, fal $$1) {
      return this.f.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public fjm a(eeb $$0, dmc $$1, jb $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(fjm $$0, jb $$1, boolean $$2) {
      return this.c > $$1.v() + $$0.c(jh.a.b) - 1.0E-5F;
   }

   @Nullable
   public bzm d() {
      return this.g;
   }

   @Override
   public boolean c() {
      return this.d;
   }
}
