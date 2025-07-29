import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dzg extends dpz {
   public static final MapCodec<dzg> a = b(dzg::new);
   public static final efb b = eer.aH;
   public static final efb c = eer.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fjm g = dpz.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fjm h = dpz.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dzg> a() {
      return a;
   }

   public dzg(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0).b(c, 1));
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      if (!$$3.ch()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      if (!($$3 instanceof cso)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, int $$4) {
      if ($$1.a(dqb.mL) && $$0 instanceof aub $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      $$0.a(null, $$1, ayz.BL, aza.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, $$3 - 1), 2);
         $$0.a(ejb.f, $$1, ejb.a.a($$2));
         $$0.c(2001, $$1, dpz.j($$2));
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, ayz.BM, aza.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, $$4 + 1), 2);
            $$1.a(ejb.c, $$2, ejb.a.a($$0));
         } else {
            $$1.a(null, $$2, ayz.BN, aza.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ejb.f, $$2, ejb.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dpz.j($$0));
               cnm $$6 = bzv.bD.a($$1, bzu.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b($$2.u() + 0.3 + $$5 * 0.2, $$2.v(), $$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dly $$0, jb $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dly $$0, jb $$1) {
      return $$0.a_($$1).a(azo.E);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dmu $$0) {
      float $$1 = $$0.f(1.0F);
      return $$1 < 0.69 && $$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dmu $$0, cut $$1, jb $$2, eeb $$3, @Nullable eaz $$4, dcv $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Math.min(4, $$1.c(c) + 1)) : super.a($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   private boolean a(aub $$0, bzm $$1) {
      if ($$1 instanceof cnm || $$1 instanceof clw) {
         return false;
      } else {
         return !($$1 instanceof cam) ? false : $$1 instanceof cut || $$0.P().c(dmq.d);
      }
   }
}
