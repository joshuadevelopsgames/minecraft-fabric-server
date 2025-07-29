import com.google.common.collect.Lists;
import java.util.List;

public class ewv {
   private static final int a = 8;
   static final ewv.b b = new ewv.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ezb $$0, int $$1, ewv.a $$2, jb $$3, List<evc> $$4, bck $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            dwu $$6 = $$2.e().d();
            ewv.a $$7 = ewv.a($$4, ewv.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 8, -1), "second_roof", $$6, false));
               ewv.a($$0, ewv.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 8, -1), "third_roof", $$6, true));
               ewv.a($$0, ewv.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<bdj<dwu, jb>> c = Lists.newArrayList(
      new bdj[]{new bdj<>(dwu.a, new jb(1, -1, 0)), new bdj<>(dwu.b, new jb(6, -1, 1)), new bdj<>(dwu.d, new jb(0, -1, 5)), new bdj<>(dwu.c, new jb(5, -1, 6))}
   );
   static final ewv.b d = new ewv.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ezb $$0, int $$1, ewv.a $$2, jb $$3, List<evc> $$4, bck $$5) {
         dwu $$6 = $$2.e().d();
         ewv.a $$7 = ewv.a($$4, ewv.a($$0, $$2, new jb(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(0, 7, 0), "tower_piece", $$6, true));
         ewv.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for (int $$10 = 0; $$10 < $$9; $$10++) {
            $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for (bdj<dwu, jb> $$11 : ewv.c) {
               if ($$5.h()) {
                  ewv.a $$12 = ewv.a($$4, ewv.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  ewv.a($$0, ewv.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return ewv.a($$0, ewv.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final ewv.b e = new ewv.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(ezb $$0, int $$1, ewv.a $$2, jb $$3, List<evc> $$4, bck $$5) {
         dwu $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         ewv.a $$8 = ewv.a($$4, ewv.a($$0, $$2, new jb(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for (int $$10 = 0; $$10 < $$7; $$10++) {
            if ($$5.h()) {
               $$8 = ewv.a($$4, ewv.a($$0, $$8, new jb(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = ewv.a($$4, ewv.a($$0, $$8, new jb(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = ewv.a($$4, ewv.a($$0, $$8, new jb(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            ewv.a($$4, ewv.a($$0, $$8, new jb(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!ewv.a($$0, ewv.b, $$1 + 1, $$8, new jb(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = ewv.a($$4, ewv.a($$0, $$8, new jb(4, $$9, 0), "bridge_end", $$6.a(dwu.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<bdj<dwu, jb>> f = Lists.newArrayList(
      new bdj[]{
         new bdj<>(dwu.a, new jb(4, -1, 0)), new bdj<>(dwu.b, new jb(12, -1, 4)), new bdj<>(dwu.d, new jb(0, -1, 8)), new bdj<>(dwu.c, new jb(8, -1, 12))
      }
   );
   static final ewv.b g = new ewv.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(ezb $$0, int $$1, ewv.a $$2, jb $$3, List<evc> $$4, bck $$5) {
         dwu $$6 = $$2.e().d();
         ewv.a $$7 = ewv.a($$4, ewv.a($$0, $$2, new jb(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(0, 4, 0), "fat_tower_middle", $$6, true));

         for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; $$8++) {
            $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(0, 8, 0), "fat_tower_middle", $$6, true));

            for (bdj<dwu, jb> $$9 : ewv.f) {
               if ($$5.h()) {
                  ewv.a $$10 = ewv.a($$4, ewv.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  ewv.a($$0, ewv.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = ewv.a($$4, ewv.a($$0, $$7, new jb(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static ewv.a a(ezb $$0, ewv.a $$1, jb $$2, String $$3, dwu $$4, boolean $$5) {
      ewv.a $$6 = new ewv.a($$0, $$3, $$1.d(), $$4, $$5);
      jb $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), jb.c);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(ezb $$0, jb $$1, dwu $$2, List<evc> $$3, bck $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      ewv.a $$5 = a($$3, new ewv.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new jb(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jb(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new jb(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static ewv.a a(List<evc> $$0, ewv.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(ezb $$0, ewv.b $$1, int $$2, ewv.a $$3, jb $$4, List<evc> $$5, bck $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<evc> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for (evc $$10 : $$7) {
               $$10.a($$9);
               evc $$11 = evc.a($$5, $$10.f());
               if ($$11 != null && $$11.g() != $$3.g()) {
                  $$8 = true;
                  break;
               }
            }

            if (!$$8) {
               $$5.addAll($$7);
               return true;
            }
         }

         return false;
      }
   }

   public static class a extends evi {
      public a(ezb $$0, String $$1, jb $$2, dwu $$3, boolean $$4) {
         super(evp.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(ezb $$0, ui $$1) {
         super(evp.Y, $$1, $$0, $$1x -> a($$1.b("OW", false), $$1.<dwu>a("Rot", dwu.h).orElseThrow()));
      }

      private static eyw a(boolean $$0, dwu $$1) {
         eyb $$2 = $$0 ? eyb.b : eyb.d;
         return new eyw().a(true).a($$2).a($$1);
      }

      @Override
      protected ame b() {
         return a(this.a);
      }

      private static ame a(String $$0) {
         return ame.b("end_city/" + $$0);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dwu.h, this.c.d());
         $$1.a("OW", this.c.i().get(0) == eyb.b);
      }

      @Override
      protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
         if ($$0.startsWith("Chest")) {
            jb $$5 = $$1.e();
            if ($$4.b($$5)) {
               bxq.a($$2, $$3, $$5, fdf.b);
            }
         } else if ($$4.b($$1) && dmu.l($$1)) {
            if ($$0.startsWith("Sentry")) {
               csb $$6 = bzv.be.a($$2.a(), bzu.d);
               if ($$6 != null) {
                  $$6.a_($$1.u() + 0.5, $$1.v(), $$1.w() + 0.5);
                  $$2.b($$6);
               }
            } else if ($$0.startsWith("Elytra")) {
               cqs $$7 = new cqs($$2.a(), $$1, this.c.d().a(jh.d));
               $$7.a(new dcv(dcz.oU), false);
               $$2.b($$7);
            }
         }
      }
   }

   interface b {
      void a();

      boolean a(ezb var1, int var2, ewv.a var3, jb var4, List<evc> var5, bck var6);
   }
}
