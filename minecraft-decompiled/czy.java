public class czy extends dak {
   private final czw a;
   private final cut b;
   private int g;
   private final dlp h;

   public czy(cut $$0, dlp $$1, czw $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(dcv $$0) {
      return false;
   }

   @Override
   public dcv a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(dcv $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(dcv $$0) {
      $$0.a(this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cut $$0, dcv $$1) {
      this.c_($$1);
      dlq $$2 = this.a.g();
      if ($$2 != null) {
         dcv $$3 = this.a.a(0);
         dcv $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(azj.U);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
