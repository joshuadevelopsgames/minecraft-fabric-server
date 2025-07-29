import javax.annotation.Nullable;

public class hno extends hnn {
   private static final int a = 8;
   private static final float b = -160.0F;
   private static final float c = -256.0F;
   private float d;

   @Override
   public void a(hnl $$0, bzm $$1, jb $$2, grk $$3, float $$4, ftu $$5) {
      dnx $$6 = $$3.v($$2).a();
      float $$7 = $$5.a();
      boolean $$8 = $$6.c();
      float $$9 = bcb.a(($$3.C_().a(dnd.a).b($$2) - 8.0F) / 7.0F, 0.0F, 1.0F);
      float $$10 = $$3.d($$5.a(false)) * $$9 * ($$8 ? 1.0F : 0.5F);
      this.d = this.d + ($$10 - this.d) * $$7 * 0.2F;
      $$0.a = this.d * -160.0F;
      $$0.c = 1024.0F + -256.0F * this.d;
      $$0.e = $$4;
      $$0.f = fue.R().n.k().c() * 16;
   }

   @Override
   public boolean a(@Nullable fan $$0, bzm $$1) {
      return $$0 == fan.e;
   }
}
