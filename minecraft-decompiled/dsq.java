import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dsq extends dpl implements dvz {
   public static final MapCodec<dsq> a = b(dsq::new);
   private static final fjm b = dpz.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   protected dsq(eea.d $$0) {
      super($$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecw($$0, $$1);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.aj() == dmu.k && $$3 instanceof auc $$5 && !$$5.i) {
            $$5.n();
         } else {
            $$3.a(this, $$2);
         }
      }
   }

   @Nullable
   @Override
   public fbl a(aub $$0, bzm $$1, jb $$2) {
      amd<dmu> $$3 = $$0.aj() == dmu.k ? dmu.i : dmu.k;
      aub $$4 = $$0.q().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dmu.k;
         jb $$6 = $$5 ? aub.a : $$4.ab();
         fis $$7 = $$6.c();
         float $$8;
         Set<cba> $$9;
         if ($$5) {
            ene.a($$4, jb.a((jv)$$7).e(), true);
            $$8 = jh.e.p();
            $$9 = cba.a(cba.l, Set.of(cba.e));
            if ($$1 instanceof auc) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = $$4.ac();
            $$9 = cba.a(cba.l, cba.k);
            if ($$1 instanceof auc $$12) {
               return $$12.a(false, fbl.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new fbl($$4, $$7, fis.c, $$8, 0.0F, $$9, fbl.b.then(fbl.c));
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      double $$4 = $$2.u() + $$3.j();
      double $$5 = $$2.v() + 0.8;
      double $$6 = $$2.w() + $$3.j();
      $$1.a(me.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
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
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }
}
