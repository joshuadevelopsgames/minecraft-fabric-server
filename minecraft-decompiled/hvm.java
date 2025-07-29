public class hvm extends huy {
   public hvm(ayy $$0, aza $$1, float $$2, float $$3, bck $$4, jb $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5.u() + 0.5, $$5.v() + 0.5, $$5.w() + 0.5);
   }

   public static hvm a(ayy $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hvm a(jl<ayy> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hvm a(ayy $$0, float $$1, float $$2) {
      return new hvm($$0.a(), aza.k, $$2, $$1, hvr.t(), false, 0, hvr.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hvm b(ayy $$0, float $$1) {
      return new hvm($$0.a(), aza.b, $$1, 1.0F, hvr.t(), false, 0, hvr.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hvm a(ayy $$0, fis $$1) {
      return new hvm($$0, aza.c, 4.0F, 1.0F, hvr.t(), false, 0, hvr.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hvm b(ayy $$0, float $$1, float $$2) {
      return new hvm($$0.a(), aza.i, $$2, $$1, hvr.t(), false, 0, hvr.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hvm a(ayy $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hvm a(ayy $$0, bck $$1, double $$2, double $$3, double $$4) {
      return new hvm($$0, aza.i, 1.0F, 1.0F, $$1, false, 0, hvr.a.b, $$2, $$3, $$4);
   }

   public hvm(ayy $$0, aza $$1, float $$2, float $$3, bck $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hvr.a.b, $$5, $$6, $$7);
   }

   private hvm(ayy $$0, aza $$1, float $$2, float $$3, bck $$4, boolean $$5, int $$6, hvr.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hvm(ame $$0, aza $$1, float $$2, float $$3, bck $$4, boolean $$5, int $$6, hvr.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
      super($$0, $$1, $$4);
      this.d = $$2;
      this.e = $$3;
      this.f = $$8;
      this.g = $$9;
      this.h = $$10;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$11;
   }
}
