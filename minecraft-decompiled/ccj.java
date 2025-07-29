import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccj extends ccd<cam> {
   private final cjo<Integer> c;

   public ccj(cjo<Integer> $$0) {
      super(ImmutableMap.of($$0, cjp.a));
      this.c = $$0;
   }

   private Optional<Integer> b(cam $$0) {
      return $$0.eh().c(this.c);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected boolean a(aub $$0, cam $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      return $$3.isPresent() && $$3.get() > 0;
   }

   @Override
   protected void c(aub $$0, cam $$1, long $$2) {
      Optional<Integer> $$3 = this.b($$1);
      $$1.eh().a(this.c, $$3.get() - 1);
   }

   @Override
   protected void b(aub $$0, cam $$1, long $$2) {
      $$1.eh().b(this.c);
   }
}
