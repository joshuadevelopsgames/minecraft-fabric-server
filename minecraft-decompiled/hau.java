public class hau implements hac<ecu> {
   private final gzy<ecu> a;
   private final haf<ecu> b;

   public hau(had.a $$0) {
      this.a = new gzy<>($$0);
      this.b = new haf<>($$0);
   }

   public void a(ecu $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public boolean aY_() {
      return this.a.aY_() || this.b.aY_();
   }

   @Override
   public int aZ_() {
      return Math.max(this.a.aZ_(), this.b.aZ_());
   }

   public boolean a(ecu $$0, fis $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
