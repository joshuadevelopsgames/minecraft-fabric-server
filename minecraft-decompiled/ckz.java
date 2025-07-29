import com.google.common.collect.ImmutableMap;

public class ckz extends ckp {
   private static final ImmutableMap<bzv<?>, Float> a = ImmutableMap.builder()
      .put(bzv.L, 8.0F)
      .put(bzv.T, 12.0F)
      .put(bzv.ao, 8.0F)
      .put(bzv.ap, 12.0F)
      .put(bzv.aV, 15.0F)
      .put(bzv.bb, 12.0F)
      .put(bzv.bE, 8.0F)
      .put(bzv.bG, 10.0F)
      .put(bzv.bP, 10.0F)
      .put(bzv.bQ, 8.0F)
      .put(bzv.bS, 8.0F)
      .build();

   @Override
   protected boolean a(aub $$0, cam $$1, cam $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(cam $$0, cam $$1) {
      float $$2 = (Float)a.get($$1.ap());
      return $$1.g($$0) <= $$2 * $$2;
   }

   @Override
   protected cjo<cam> b() {
      return cjo.B;
   }

   private boolean b(cam $$0) {
      return a.containsKey($$0.ap());
   }
}
