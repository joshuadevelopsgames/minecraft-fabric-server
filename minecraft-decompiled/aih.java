import java.util.List;
import java.util.Optional;

public record aih(int b, List<String> c, Optional<String> d) implements zw<ahm> {
   public static final zm<wg, aih> a = zm.a(zk.h, aih::b, zk.b(1024).a(zk.c(100)), aih::e, zk.b(32).a(zk::a), aih::f, aih::new);

   public aih(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zy<aih> a() {
      return ahk.bF;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
