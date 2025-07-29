import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class azi<T> implements Iterable<azg<T>> {
   private final jy<T> a;
   private final Map<T, azg<T>> b = new IdentityHashMap<>();
   private final xo c;
   private final zm<wx, azg<T>> d;

   public azi(jy<T> $$0, xo $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zk.a($$0.g()).a(this::b, azg::b);
   }

   public zm<wx, azg<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public azg<T> a(T $$0, azh $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new azg<>(this, (T)$$1x, $$1));
   }

   public jy<T> b() {
      return this.a;
   }

   @Override
   public Iterator<azg<T>> iterator() {
      return this.b.values().iterator();
   }

   public azg<T> b(T $$0) {
      return this.a($$0, azh.b);
   }

   public xo c() {
      return this.c;
   }
}
