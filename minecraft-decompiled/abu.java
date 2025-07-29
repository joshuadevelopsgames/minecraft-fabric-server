import java.util.HashSet;
import java.util.Set;

public record abu(Set<ke> c, Set<ke> d) implements abe {
   public static final zm<wg, abu> a = abe.a(abu::a, abu::new);
   public static final abe.b<abu> b = abe.a("debug/village_sections");

   private abu(wg $$0) {
      this($$0.a(HashSet::new, wg::g), $$0.a(HashSet::new, wg::g));
   }

   private void a(wg $$0) {
      $$0.a(this.c, wg::a);
      $$0.a(this.d, wg::a);
   }

   @Override
   public abe.b<abu> a() {
      return b;
   }

   public Set<ke> b() {
      return this.c;
   }

   public Set<ke> c() {
      return this.d;
   }
}
