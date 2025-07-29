import com.mojang.serialization.MapCodec;

public class dql extends dpz {
   public static final MapCodec<dql> a = b(dql::new);
   public static final efb b = eer.az;
   public static final int c = 15;
   private static final fjm d = dpz.b(14.0, 0.0, 16.0);
   private static final fjm e = dpz.b(14.0, 0.0, 15.0);
   private static final int f = 3;
   private static final int g = 8;
   private static final double h = 0.1;
   private static final double i = 0.25;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   protected dql(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      jb $$4 = $$2.d();
      if ($$1.w($$4)) {
         int $$5 = 1;
         int $$6 = $$0.c(b);

         while ($$1.a_($$2.c($$5)).a(this)) {
            if (++$$5 == 3 && $$6 == 15) {
               return;
            }
         }

         if ($$6 == 8 && this.a(this.m(), $$1, $$2.d())) {
            double $$7 = $$5 >= 3 ? 0.25 : 0.1;
            if ($$3.j() <= $$7) {
               $$1.c($$4, dqb.eh.m());
            }
         } else if ($$6 == 15 && $$5 < 3) {
            $$1.c($$4, this.m());
            eeb $$8 = $$0.b(b, 0);
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
         }

         if ($$6 < 15) {
            $$1.a($$2, $$0.b(b, $$6 + 1), 260);
         }
      }
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      for (jh $$3 : jh.c.a) {
         eeb $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(azu.b)) {
            return false;
         }
      }

      eeb $$5 = $$1.a_($$2.e());
      return ($$5.a(dqb.eg) || $$5.a(azo.E)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
