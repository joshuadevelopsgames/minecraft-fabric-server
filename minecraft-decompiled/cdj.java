import com.google.common.collect.ImmutableMap;

public class cdj extends ccd<cao> {
   public cdj(int $$0, int $$1) {
      super(ImmutableMap.of(cjo.o, cjp.a), $$0, $$1);
   }

   protected boolean a(aub $$0, cao $$1, long $$2) {
      return $$1.eh().c(cjo.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aub $$0, cao $$1, long $$2) {
      $$1.eh().b(cjo.o);
   }

   protected void c(aub $$0, cao $$1, long $$2) {
      $$1.eh().c(cjo.o).ifPresent($$1x -> $$1.P().a($$1x.a()));
   }
}
