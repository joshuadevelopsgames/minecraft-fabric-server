public abstract class hid<S extends hkn, M extends gnh<S>> extends hit<S, M> {
   public hid(hgc<S, M> $$0) {
      super($$0);
   }

   @Override
   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (this.a($$3)) {
         float $$6 = $$3.v;
         M $$7 = this.c();
         fog $$8 = $$1.getBuffer(gxz.b(this.a(), this.a($$6) % 1.0F, $$6 * 0.01F % 1.0F));
         $$7.a($$3);
         $$7.a($$0, $$8, $$2, hri.d, -8355712);
      }
   }

   protected abstract boolean a(S var1);

   protected abstract float a(float var1);

   protected abstract ame a();

   protected abstract M c();
}
