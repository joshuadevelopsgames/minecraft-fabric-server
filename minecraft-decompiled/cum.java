import java.util.Optional;
import javax.annotation.Nullable;

public class cum implements dmg {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final bck h = bck.a();
   private final fcx i;
   private int j;
   private int k;
   private int l;

   public cum(fcx $$0) {
      this.i = $$0;
      this.j = 1200;
      this.k = $$0.t();
      this.l = $$0.u();
      if (this.k == 0 && this.l == 0) {
         this.k = 24000;
         $$0.d(this.k);
         this.l = 25;
         $$0.e(this.l);
      }
   }

   @Override
   public void a(aub $$0, boolean $$1, boolean $$2) {
      if ($$0.P().c(dmq.N)) {
         if (--this.j <= 0) {
            this.j = 1200;
            this.k -= 1200;
            this.i.d(this.k);
            if (this.k <= 0) {
               this.k = 24000;
               if ($$0.P().c(dmq.f)) {
                  int $$3 = this.l;
                  this.l = bcb.a(this.l + 25, 25, 75);
                  this.i.e(this.l);
                  if (this.h.a(100) <= $$3) {
                     if (this.a($$0)) {
                        this.l = 25;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(aub $$0) {
      cut $$1 = $$0.l();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         jb $$2 = $$1.dx();
         int $$3 = 48;
         clp $$4 = $$0.B();
         Optional<jb> $$5 = $$4.d($$0x -> $$0x.a(clt.o), $$0x -> true, $$2, 48, clp.b.c);
         jb $$6 = $$5.orElse($$2);
         jb $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.v($$7).a(azn.ah)) {
               return false;
            }

            cul $$8 = bzv.bH.a($$0, $$7, bzu.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cK());
               $$8.t(48000);
               $$8.h($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(aub $$0, cul $$1, int $$2) {
      jb $$3 = this.a($$0, $$1.dx(), $$2);
      if ($$3 != null) {
         coy $$4 = bzv.bA.a($$0, $$3, bzu.h);
         if ($$4 != null) {
            $$4.a_($$1, true);
         }
      }
   }

   @Nullable
   private jb a(dmx $$0, jb $$1, int $$2) {
      jb $$3 = null;
      cbf $$4 = cbh.a(bzv.bH);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(eka.a.b, $$6, $$7);
         jb $$9 = new jb($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bzv.bH)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dly $$0, jb $$1) {
      for (jb $$2 : jb.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
