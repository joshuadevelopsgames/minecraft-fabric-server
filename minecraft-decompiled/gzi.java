import java.util.List;

public record gzi(List<gyw> b) implements hun {
   @Override
   public huj bake(gzk $$0, huc $$1, hui $$2, hue $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static huj a(List<gyw> $$0, gzk $$1, hum $$2, hui $$3, hue $$4) {
      huj.a $$5 = new huj.a();

      for (gyw $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hrs $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jh.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static gyv a(gyw $$0, gyx $$1, hrs $$2, jh $$3, hui $$4) {
      return gzd.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<gyw> a() {
      return this.b;
   }
}
