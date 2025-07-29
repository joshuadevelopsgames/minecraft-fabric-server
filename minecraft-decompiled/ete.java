import com.mojang.serialization.MapCodec;

public class ete extends etf {
   public static final ete a = new ete(eku.a(0));
   public static final MapCodec<ete> b = eku.a.fieldOf("value").xmap(ete::new, ete::b);
   private final eku d;

   public static ete a(eku $$0) {
      return new ete($$0);
   }

   private ete(eku $$0) {
      this.d = $$0;
   }

   public eku b() {
      return this.d;
   }

   @Override
   public int a(bck $$0, ekx $$1) {
      return this.d.a($$1);
   }

   @Override
   public etg<?> a() {
      return etg.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
