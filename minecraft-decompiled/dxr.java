import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxr extends dou {
   public static final MapCodec<dxr> c = b(dxr::new);

   @Override
   public MapCodec<dxr> a() {
      return c;
   }

   protected dxr(eea.d $$0) {
      super($$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$0, $$2, ebb.C);
   }

   @Override
   protected void a(dmu $$0, jb $$1, cut $$2) {
      eaz $$3 = $$0.c_($$1);
      if ($$3 instanceof ecq) {
         $$2.a((bxm)$$3);
         $$2.a(azj.au);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         double $$4 = $$2.u() + 0.5;
         double $$5 = $$2.v();
         double $$6 = $$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ayz.zN, aza.e, 1.0F, 1.0F, false);
         }

         $$1.a(me.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
