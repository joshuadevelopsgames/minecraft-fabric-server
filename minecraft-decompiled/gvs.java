import javax.annotation.Nullable;

public class gvs extends gvt {
   private final jb a;
   private final float b;
   private final float F;

   public gvs(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, eeb $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, jb.a($$1, $$2, $$3));
   }

   public gvs(grk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, eeb $$7, jb $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$8;
      this.a(fue.R().aq().a().a($$7));
      this.u = 1.0F;
      this.v = 0.6F;
      this.w = 0.6F;
      this.x = 0.6F;
      if (!$$7.a(dqb.i)) {
         int $$9 = fue.R().az().a($$7, $$0, $$8, 0);
         this.v *= ($$9 >> 16 & 0xFF) / 255.0F;
         this.w *= ($$9 >> 8 & 0xFF) / 255.0F;
         this.x *= ($$9 & 0xFF) / 255.0F;
      }

      this.D /= 2.0F;
      this.b = this.r.i() * 3.0F;
      this.F = this.r.i() * 3.0F;
   }

   @Override
   public gux b() {
      return gux.a;
   }

   @Override
   protected float c() {
      return this.E.a((this.b + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.b / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.F / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.F + 1.0F) / 4.0F);
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      return $$1 == 0 && this.c.D(this.a) ? gxh.a(this.c, this.a) : $$1;
   }

   @Nullable
   static gvs a(lw $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      eeb $$8 = $$0.b();
      return !$$8.l() && !$$8.a(dqb.ca) && $$8.D() ? new gvs($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) : null;
   }

   public static class a implements guw<lw> {
      @Nullable
      public gut a(lw $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gut $$8 = gvs.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b(0.0, 0.0, 0.0);
            $$8.a($$1.A.a(10) + 1);
         }

         return $$8;
      }
   }

   public static class b implements guw<lw> {
      @Nullable
      public gut a(lw $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gut $$8 = gvs.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         if ($$8 != null) {
            $$8.b($$1.A.k() / 30.0, $$6 + $$1.A.k() / 2.0, $$1.A.k() / 30.0);
            $$8.a($$1.A.a(20) + 20);
         }

         return $$8;
      }
   }

   public static class c implements guw<lw> {
      @Nullable
      public gut a(lw $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return gvs.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
