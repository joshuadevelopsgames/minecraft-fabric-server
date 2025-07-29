public class fyc extends fxm {
   private final fue a;
   private final int b;
   private final int c;
   private final dcv d;
   private final boolean e;
   private final boolean f;

   public fyc(fue $$0, int $$1, int $$2, int $$3, int $$4, xo $$5, dcv $$6, boolean $$7, boolean $$8) {
      super(0, 0, $$3, $$4, $$5);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   @Override
   protected void b(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.a(this.d, this.E() + this.b, this.F() + this.c, 0);
      if (this.e) {
         $$0.a(this.a.h, this.d, this.E() + this.b, this.F() + this.c, null);
      }

      if (this.aM_()) {
         $$0.b(this.E(), this.F(), this.z(), this.y(), -1);
      }

      if (this.f && this.C()) {
         $$0.b(this.a.h, this.d, $$1, $$2);
      }
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, xo.a("narration.item", this.d.y()));
   }
}
