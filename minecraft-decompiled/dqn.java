import com.mojang.serialization.MapCodec;

public class dqn extends dpz {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final int b = 6;
   public static final efb c = eer.aB;
   public static final int d = b(0);
   private static final fjm[] e = dpz.a(6, $$0 -> dpz.a(1 + $$0 * 2, 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      dcr $$7 = $$0.h();
      if ($$0.a(azx.T) && $$1.c(c) == 0 && dpz.a($$7) instanceof dqq $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, ayz.dv, aza.e, 1.0F, 1.0F);
         $$2.c($$3, dqr.a($$8));
         $$2.a($$4, ejb.c, $$3);
         $$4.b(azj.c.b($$7));
         return bxj.a;
      } else {
         return bxj.f;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bxj.a;
         }

         if ($$3.b(bxi.a).f()) {
            return bxj.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bxj a(dmv $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$3.u(false)) {
         return bxj.e;
      } else {
         $$3.a(azj.V);
         $$3.gD().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ejb.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, $$4 + 1), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ejb.f, $$1);
         }

         return bxj.a;
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
