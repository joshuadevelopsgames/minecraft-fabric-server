import com.mojang.serialization.MapCodec;

public class dyk extends dpz {
   public static final MapCodec<dyk> a = b(dyk::new);
   public static final efb b = eer.az;
   private static final fjm c = dpz.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dyk> a() {
      return a;
   }

   protected dyk(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.w($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.c($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, 0), 260);
            } else {
               $$1.a($$2, $$0.b(b, $$5 + 1), 260);
            }
         }
      }
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
      eeb $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(azo.ad) || $$3.a(azo.E)) {
            jb $$4 = $$2.e();

            for (jh $$5 : jh.c.a) {
               eeb $$6 = $$1.a_($$4.a($$5));
               fal $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(azu.a) || $$6.a(dqb.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
