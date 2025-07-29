import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dpz implements dqc {
   public static final MapCodec<dpd> a = b(dpd::new);
   private static final fjm D = dpz.b(6.0, 0.0, 16.0);
   private static final fjm R = dpz.b(10.0, 0.0, 16.0);
   private static final fjm S = dpz.b(3.0, 0.0, 16.0);
   public static final efb b = eer.at;
   public static final eez<een> c = eer.bo;
   public static final efb d = eer.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0).b(c, een.a).b(d, 0));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      fjm $$4 = $$0.c(c) == een.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(eeb $$0, dly $$1, jb $$2) {
      return false;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         eeb $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(azo.aC)) {
            if ($$2.a(dqb.nF)) {
               return this.m().b(b, 0);
            } else if ($$2.a(dqb.nG)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, $$3);
            } else {
               eeb $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dqb.nG) ? this.m().b(b, $$4.c(b)) : dqb.nF.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.w($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).a(azo.aC);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jh.b && $$6.a(dqb.nG) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jb $$9 = $$2.b($$4);
         eeb $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.w($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, bck $$3, int $$4) {
      eeb $$5 = $$1.a_($$2.e());
      jb $$6 = $$2.c(2);
      eeb $$7 = $$1.a_($$6);
      een $$8 = een.a;
      if ($$4 >= 1) {
         if (!$$5.a(dqb.nG) || $$5.c(c) == een.a) {
            $$8 = een.b;
         } else if ($$5.a(dqb.nG) && $$5.c(c) != een.a) {
            $$8 = een.c;
            if ($$7.a(dqb.nG)) {
               $$1.a($$2.e(), $$5.b(c, een.b), 3);
               $$1.a($$6, $$7.b(c, een.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dqb.nG) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, $$9).b(c, $$8).b(d, $$10), 3);
   }

   protected int a(dly $$0, jb $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dqb.nG)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dly $$0, jb $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dqb.nG)) {
         $$2++;
      }

      return $$2;
   }
}
