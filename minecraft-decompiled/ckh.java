import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ckh extends ckv<cam> {
   private static final int a = 200;
   private static final int b = 599;

   public ckh() {
      this(200);
   }

   public ckh(int $$0) {
      super($$0);
   }

   @Override
   protected void a(aub $$0, cam $$1) {
      a($$1);
   }

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.g);
   }

   public static void a(cam $$0) {
      Optional<List<cam>> $$1 = $$0.eh().c(cjo.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$0x -> $$0x.ap().equals(bzv.ar));
         if ($$2) {
            b($$0);
         }
      }
   }

   public static void b(cam $$0) {
      $$0.eh().a(cjo.G, true, 599L);
   }
}
