public class hgs<T extends bzm & cvl> extends hed<T, hmt> {
   private final hof a;
   private final float h;
   private final boolean i;

   public hgs(hee.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.h = $$1;
      this.i = $$2;
   }

   public hgs(hee.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jb $$1) {
      return this.i ? 15 : super.a($$0, $$1);
   }

   public void a(hmt $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.b(this.h, this.h, this.h);
      $$1.a(this.e.b());
      $$0.a.a($$1, $$2, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hmt a() {
      return new hmt();
   }

   public void a(T $$0, hmt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.e(), dct.h, $$0);
   }
}
