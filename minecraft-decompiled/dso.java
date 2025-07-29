import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dso extends dpl {
   public static final MapCodec<dso> a = b(dso::new);
   public static final List<jb> b = jb.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jb::j).toList();
   private static final fjm c = dpz.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   protected dso(eea.d $$0) {
      super($$0);
   }

   public static boolean a(dmu $$0, jb $$1, jb $$2) {
      return $$0.a_($$1.a((kg)$$2)).a(azo.cD) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(azo.cE);
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jb $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(me.s, $$2.u() + 0.5, $$2.v() + 2.0, $$2.w() + 0.5, $$4.u() + $$3.i() - 0.5, $$4.v() - $$3.i() - 1.0F, $$4.w() + $$3.i() - 0.5);
         }
      }
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? a($$2, ebb.n, ebw::a) : null;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return bxj.a;
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      eaz $$3 = $$1.c_($$2);
      if ($$3 instanceof ebw) {
         xo $$4 = ((bxn)$$3).Q_();
         return new bxs(($$2x, $$3x, $$4x) -> new czi($$2x, $$3x, cyz.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
