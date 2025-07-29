import javax.annotation.Nullable;

public class hdb extends hfg<cqo, hjs, gly> {
   public static final ame a = ame.b("textures/entity/armorstand/wood.png");
   private final gly k = this.c();
   private final gly l;

   public hdb(hee.a $$0) {
      super($$0, new glz($$0.a(gqm.f)), 0.0F);
      this.l = new glz($$0.a(gqm.i));
      this.a(new hii<>(this, new gly($$0.a(gqm.g)), new gly($$0.a(gqm.h)), new gly($$0.a(gqm.j)), new gly($$0.a(gqm.k)), $$0.h()));
      this.a(new hil<>(this));
      this.a(new hjg<>(this, $$0.f(), $$0.h()));
      this.a(new hhy<>(this, $$0.f()));
   }

   public ame a(hjs $$0) {
      return a;
   }

   public hjs a() {
      return new hjs();
   }

   public void a(cqo $$0, hjs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hew.a($$0, $$1, $$2, this.i);
      $$1.a = bcb.i($$2, $$0.aa, $$0.dP());
      $$1.c = $$0.t();
      $$1.d = $$0.m();
      $$1.j = $$0.n();
      $$1.k = $$0.p();
      $$1.m = $$0.v();
      $$1.l = $$0.u();
      $$1.n = $$0.x();
      $$1.o = $$0.y();
      $$1.p = $$0.z();
      $$1.q = $$0.A();
      $$1.b = (float)($$0.ai().ae() - $$0.bZ) + $$2;
   }

   public void a(hjs $$0, fod $$1, gxn $$2, int $$3) {
      this.h = $$0.d ? this.l : this.k;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(hjs $$0, fod $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(bcb.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(cqo $$0, double $$1) {
      return $$0.cP();
   }

   @Nullable
   protected gxz a(hjs $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ame $$4 = this.a($$0);
         if ($$2) {
            return gxz.c($$4, false);
         } else {
            return $$1 ? gxz.a($$4, false) : null;
         }
      }
   }
}
