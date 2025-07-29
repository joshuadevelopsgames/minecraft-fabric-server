import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpy extends dou {
   public static final MapCodec<dpy> c = b(dpy::new);

   @Override
   public MapCodec<dpy> a() {
      return c;
   }

   protected dpy(eea.d $$0) {
      super($$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eay($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$0, $$2, ebb.D);
   }

   @Override
   protected void a(dmu $$0, jb $$1, cut $$2) {
      eaz $$3 = $$0.c_($$1);
      if ($$3 instanceof eay) {
         $$2.a((bxm)$$3);
         $$2.a(azj.at);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         double $$4 = $$2.u() + 0.5;
         double $$5 = $$2.v();
         double $$6 = $$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ayz.cA, aza.e, 1.0F, 1.0F, false);
         }

         jh $$7 = $$0.c(a);
         jh.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jh.a.a ? $$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jh.a.c ? $$7.l() * 0.52 : $$10;
         $$1.a(me.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
