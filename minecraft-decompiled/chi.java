import java.util.EnumSet;

public abstract class chi {
   private final EnumSet<chi.a> a = EnumSet.noneOf(chi.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean W_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean X_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<chi.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<chi.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.X_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return bcb.e($$0, 2);
   }

   protected static aub a(bzm $$0) {
      return (aub)$$0.ai();
   }

   protected static aub a(dmu $$0) {
      return (aub)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
