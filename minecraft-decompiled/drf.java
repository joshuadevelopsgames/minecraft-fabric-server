import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class drf extends dpz {
   public static final MapCodec<drf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("plant").forGetter($$0x -> $$0x.e), t()).apply($$0, drf::new)
   );
   public static final int b = 5;
   public static final efb c = eer.ax;
   private static final fjm d = dpz.b(14.0, 0.0, 15.0);
   private final dpz e;

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(dpz $$0, eea.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(c) < 5;
   }

   @Override
   public fjm b_(eeb $$0, dly $$1, jb $$2) {
      return d;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      jb $$4 = $$2.d();
      if ($$1.w($$4) && $$4.v() <= $$1.ao()) {
         int $$5 = $$0.c(c);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            eeb $$8 = $$1.a_($$2.e());
            if ($$8.a(dqb.fY)) {
               $$6 = true;
            } else if ($$8.a(this.e)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  eeb $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.e)) {
                     if ($$11.a(dqb.fY)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.l()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.w($$2.b(2))) {
               $$1.a($$2, drg.a($$1, $$2, this.e.m()), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  jh $$15 = jh.c.a.a($$3);
                  jb $$16 = $$2.a($$15);
                  if ($$1.w($$16) && $$1.w($$16.e()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, drg.a($$1, $$2, this.e.m()), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(dmu $$0, jb $$1, int $$2) {
      $$0.a($$1, this.m().b(c, $$2), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(dmu $$0, jb $$1) {
      $$0.a($$1, this.m().b(c, 5), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(dmx $$0, jb $$1, @Nullable jh $$2) {
      for (jh $$3 : jh.c.a) {
         if ($$3 != $$2 && !$$0.w($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 != jh.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.e());
      if (!$$3.a(this.e) && !$$3.a(dqb.fY)) {
         if (!$$3.l()) {
            return false;
         } else {
            boolean $$4 = false;

            for (jh $$5 : jh.c.a) {
               eeb $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.e)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.l()) {
                  return false;
               }
            }

            return $$4;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   public static void a(dmv $$0, jb $$1, bck $$2, int $$3) {
      $$0.a($$1, drg.a($$0, $$1, dqb.la.m()), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(dmv $$0, jb $$1, bck $$2, jb $$3, int $$4, int $$5) {
      dpz $$6 = dqb.la;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jb $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, drg.a($$0, $$9, $$6.m()), 2);
         $$0.a($$9.e(), drg.a($$0, $$9.e(), $$6.m()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            jh $$13 = jh.c.a.a($$2);
            jb $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.w($$14) && $$0.w($$14.e()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, drg.a($$0, $$14, $$6.m()), 2);
               $$0.a($$14.a($$13.g()), drg.a($$0, $$14.a($$13.g()), $$6.m()), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), dqb.lb.m().b(c, 5), 2);
      }
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      jb $$4 = $$2.b();
      if ($$0 instanceof aub $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, true, $$3);
      }
   }
}
