import java.util.Arrays;
import java.util.Map;

public class gyc implements AutoCloseable {
   public static final int a = Arrays.stream(hba.values()).mapToInt(hba::b).sum();
   private final Map<hba, foa> b = ag.a(hba.class, $$0 -> new foa($$0.b()));

   public foa a(hba $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(foa::b);
   }

   public void b() {
      this.b.values().forEach(foa::c);
   }

   @Override
   public void close() {
      this.b.values().forEach(foa::close);
   }
}
