import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxf extends dzl implements dqc, dxl {
   public static final MapCodec<dxf> a = b(dxf::new);
   public static final int b = 4;
   public static final efb c = eer.aV;
   public static final ees d = eer.I;
   private static final fjm e = dpz.b(4.0, 0.0, 6.0);
   private static final fjm f = dpz.b(10.0, 0.0, 6.0);
   private static final fjm g = dpz.b(12.0, 0.0, 6.0);
   private static final fjm h = dpz.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<dxf> a() {
      return a;
   }

   protected dxf(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 1).b(d, true));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Math.min(4, $$1.c(c) + 1));
      } else {
         fal $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == fam.c;
         return super.a($$0).b(d, $$3);
      }
   }

   public static boolean o(eeb $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return !$$0.g($$1, $$2).a(jh.b).c() || $$0.c($$1, $$2, jh.b);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(azo.ay);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      int $$4 = 5;
      int $$5 = 1;
      int $$6 = 2;
      int $$7 = 0;
      int $$8 = $$2.u() - 2;
      int $$9 = 0;

      for (int $$10 = 0; $$10 < 5; $$10++) {
         for (int $$11 = 0; $$11 < $$5; $$11++) {
            int $$12 = 2 + $$2.v() - 1;

            for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
               jb $$14 = new jb($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dqb.J)) {
                  eeb $$15 = $$0.a_($$14.e());
                  if ($$15.a(azo.ay)) {
                     $$0.a($$14, dqb.nC.m().b(c, $$1.a(4) + 1), 3);
                  }
               }
            }
         }

         if ($$7 < 2) {
            $$5 += 2;
            $$9++;
         } else {
            $$5 -= 2;
            $$9--;
         }

         $$7++;
      }

      $$0.a($$2, $$3.b(c, 4), 2);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
