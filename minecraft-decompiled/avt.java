import java.util.Map;

public class avt {
   private static final avt a = new avt(Map.of());
   private final Map<awo<?>, ?> b;

   private avt(Map<awo<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(awo<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static avt a() {
      return a;
   }

   public static <T> avt a(awo<T> $$0, T $$1) {
      return new avt(Map.of($$0, $$1));
   }

   public static <T1, T2> avt a(awo<T1> $$0, T1 $$1, awo<T2> $$2, T2 $$3) {
      return new avt(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
