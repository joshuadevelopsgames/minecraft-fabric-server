import java.util.Objects;
import javax.annotation.Nullable;

public class azg<T> extends fka {
   public static final zm<wx, azg<?>> a = zk.a(mn.au).b(azg::a, azi::a);
   private final azh p;
   private final T q;
   private final azi<T> r;

   protected azg(azi<T> $$0, T $$1, azh $$2) {
      super(a($$0, $$1));
      this.r = $$0;
      this.p = $$2;
      this.q = $$1;
   }

   public static <T> String a(azi<T> $$0, T $$1) {
      return a(mm.v.b($$0)) + ":" + a($$0.b().b($$1));
   }

   private static <T> String a(@Nullable ame $$0) {
      return $$0.toString().replace(':', '.');
   }

   public azi<T> a() {
      return this.r;
   }

   public T b() {
      return this.q;
   }

   public String a(int $$0) {
      return this.p.format($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 || $$0 instanceof azg && Objects.equals(this.d(), ((azg)$$0).d());
   }

   @Override
   public int hashCode() {
      return this.d().hashCode();
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.d() + ", formatter=" + this.p + "}";
   }
}
