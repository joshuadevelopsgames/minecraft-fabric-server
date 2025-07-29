import java.util.List;

public class cub implements dmg {
   private static final int a = 1200;
   private int b;

   @Override
   public void a(aub $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.P().c(dmq.f)) {
         this.b--;
         if (this.b <= 0) {
            this.b = 1200;
            cut $$3 = $$0.l();
            if ($$3 != null) {
               bck $$4 = $$0.A;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               jb $$7 = $$3.dx().b($$5, 0, $$6);
               int $$8 = 10;
               if ($$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  if (cbh.a(bzv.v, $$0, $$7)) {
                     if ($$0.a($$7, 2)) {
                        this.a($$0, $$7);
                     } else if ($$0.b().a($$7, baa.n).b()) {
                        this.b($$0, $$7);
                     }
                  }
               }
            }
         }
      }
   }

   private void a(aub $$0, jb $$1) {
      int $$2 = 48;
      if ($$0.B().a($$0x -> $$0x.a(clt.n), $$1, 48, clp.b.b) > 4L) {
         List<cmg> $$3 = $$0.a(cmg.class, new fin($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            this.a($$1, $$0, false);
         }
      }
   }

   private void b(aub $$0, jb $$1) {
      int $$2 = 16;
      List<cmg> $$3 = $$0.a(cmg.class, new fin($$1).c(16.0, 8.0, 16.0));
      if ($$3.isEmpty()) {
         this.a($$1, $$0, true);
      }
   }

   private void a(jb $$0, aub $$1, boolean $$2) {
      cmg $$3 = bzv.v.a($$1, bzu.a);
      if ($$3 != null) {
         $$3.a($$1, $$1.d_($$0), bzu.a, null);
         if ($$2) {
            $$3.gp();
         }

         $$3.a($$0, 0.0F, 0.0F);
         $$1.a_($$3);
      }
   }
}
