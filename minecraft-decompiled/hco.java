import com.google.common.collect.Sets;
import java.util.Set;

public class hco implements hbz.a {
   private static final int a = 60;
   private final Set<ke> b = Sets.newHashSet();

   hco() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(ke $$0) {
      this.b.add($$0);
   }

   public void b(ke $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      jb $$5 = jb.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fod $$0, gxn $$1, ke $$2) {
      hbz.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
