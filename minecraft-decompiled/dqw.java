import com.mojang.serialization.MapCodec;

public class dqw extends dos {
   public static final MapCodec<dqw> d = b(dqw::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dqw> a() {
      return d;
   }

   public dqw(eea.d $$0) {
      super($$0, ki.c);
   }

   @Override
   public boolean d(eeb $$0) {
      return false;
   }

   protected static boolean a(dmu $$0, dnx.c $$1) {
      if ($$1 == dnx.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dnx.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, dnx.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dnx.c.b) {
            $$1.c($$2, dqb.fT.m());
            $$1.a(null, ejb.c, $$2);
         } else if ($$3 == dnx.c.c) {
            $$1.c($$2, dqb.fV.m());
            $$1.a(null, ejb.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(fak $$0) {
      return true;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, fak $$3) {
      if ($$3 == fam.c) {
         eeb $$4 = dqb.fT.m();
         $$1.c($$2, $$4);
         $$1.a(ejb.c, $$2, ejb.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == fam.e) {
         eeb $$5 = dqb.fU.m();
         $$1.c($$2, $$5);
         $$1.a(ejb.c, $$2, ejb.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
