import javax.annotation.Nullable;

public class ddk extends dbj {
   private final bzv<? extends cao> a;
   private final ayy b;

   public ddk(bzv<? extends cao> $$0, fak $$1, ayy $$2, dcr.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cam $$0, dmu $$1, dcv $$2, jb $$3) {
      if ($$1 instanceof aub) {
         this.a((aub)$$1, $$2, $$3);
         $$1.a($$0, ejb.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cam $$0, dmv $$1, jb $$2) {
      $$1.a($$0, $$2, this.b, aza.g, 1.0F, 1.0F);
   }

   private void a(aub $$0, dcv $$1, jb $$2) {
      cao $$3 = this.a.b($$0, bzv.a($$0, $$1, null), $$2, bzu.l, true, false);
      if ($$3 instanceof cmf $$4) {
         dfd $$5 = $$1.a(kq.Z, dfd.a);
         $$4.a($$5.d());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.X();
      }
   }
}
