public abstract class hit<S extends hkn, M extends gnh<? super S>> {
   private final hgc<S, M> a;

   public hit(hgc<S, M> $$0) {
      this.a = $$0;
   }

   protected static <S extends hlq> void a(gnh<S> $$0, ame $$1, fod $$2, gxn $$3, int $$4, S $$5, int $$6) {
      if (!$$5.A) {
         $$0.a($$5);
         b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   protected static void b(gnh<?> $$0, ame $$1, fod $$2, gxn $$3, int $$4, hlq $$5, int $$6) {
      fog $$7 = $$3.getBuffer(gxz.g($$1));
      $$0.a($$2, $$7, $$4, hfg.a($$5, 0.0F), $$6);
   }

   public M d() {
      return this.a.c();
   }

   public abstract void a(fod var1, gxn var2, int var3, S var4, float var5, float var6);
}
