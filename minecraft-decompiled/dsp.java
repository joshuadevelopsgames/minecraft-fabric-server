import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dsp extends dpl implements dvz {
   public static final MapCodec<dsp> a = b(dsp::new);

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   protected dsp(eea.d $$0) {
      super($$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.w, $$0.C ? ecv::a : ecv::b);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      eaz $$4 = $$1.c_($$2);
      if ($$4 instanceof ecv) {
         int $$5 = ((ecv)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = $$2.u() + $$3.j();
            double $$8 = $$2.v() + $$3.j();
            double $$9 = $$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = $$2.w() + 0.5 + 0.25 * $$13;
               $$12 = $$3.i() * 2.0F * $$13;
            } else {
               $$7 = $$2.u() + 0.5 + 0.25 * $$13;
               $$10 = $$3.i() * 2.0F * $$13;
            }

            $$1.a(me.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return dcv.l;
   }

   @Override
   protected boolean a(eeb $$0, fak $$1) {
      return false;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof ecv $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         ecv.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public fbl a(aub $$0, bzm $$1, jb $$2) {
      if ($$0.c_($$2) instanceof ecv $$4) {
         fis $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cvy
               ? new fbl($$0, $$6, fis.c, 0.0F, 0.0F, Set.of(), fbl.c)
               : new fbl($$0, $$6, fis.c, 0.0F, 0.0F, cba.a(cba.l, cba.k), fbl.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }
}
