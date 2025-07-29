public abstract class hdc<T extends cvb, S extends hjt> extends hed<T, S> {
   private final gma a;

   public hdc(hee.a $$0) {
      super($$0);
      this.a = new gma($$0.a(gqm.l));
   }

   public void a(S $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a));
      fog $$4 = $$2.getBuffer(gxz.f(this.a($$0)));
      this.a.a($$0);
      this.a.a($$1, $$4, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected abstract ame a(S var1);

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.b = $$0.l($$2);
      $$1.c = $$0.c - $$2;
   }
}
