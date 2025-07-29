public abstract class hcx<T extends cso, S extends hnh, M extends gqd<S>> extends hew<T, S, M> {
   private static final ame a = ame.b("textures/entity/zombie/zombie.png");

   protected hcx(hee.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new hii<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public ame a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gN();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
