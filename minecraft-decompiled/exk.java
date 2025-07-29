import com.google.common.collect.Lists;
import java.util.List;

public class exk {
   static final eyx a = a(dqb.L, dqb.M, fdf.bb);
   static final eyx b = a(dqb.O, dqb.P, fdf.bc);
   private static final ame[] c = new ame[]{
      ame.b("underwater_ruin/warm_1"),
      ame.b("underwater_ruin/warm_2"),
      ame.b("underwater_ruin/warm_3"),
      ame.b("underwater_ruin/warm_4"),
      ame.b("underwater_ruin/warm_5"),
      ame.b("underwater_ruin/warm_6"),
      ame.b("underwater_ruin/warm_7"),
      ame.b("underwater_ruin/warm_8")
   };
   private static final ame[] d = new ame[]{
      ame.b("underwater_ruin/brick_1"),
      ame.b("underwater_ruin/brick_2"),
      ame.b("underwater_ruin/brick_3"),
      ame.b("underwater_ruin/brick_4"),
      ame.b("underwater_ruin/brick_5"),
      ame.b("underwater_ruin/brick_6"),
      ame.b("underwater_ruin/brick_7"),
      ame.b("underwater_ruin/brick_8")
   };
   private static final ame[] e = new ame[]{
      ame.b("underwater_ruin/cracked_1"),
      ame.b("underwater_ruin/cracked_2"),
      ame.b("underwater_ruin/cracked_3"),
      ame.b("underwater_ruin/cracked_4"),
      ame.b("underwater_ruin/cracked_5"),
      ame.b("underwater_ruin/cracked_6"),
      ame.b("underwater_ruin/cracked_7"),
      ame.b("underwater_ruin/cracked_8")
   };
   private static final ame[] f = new ame[]{
      ame.b("underwater_ruin/mossy_1"),
      ame.b("underwater_ruin/mossy_2"),
      ame.b("underwater_ruin/mossy_3"),
      ame.b("underwater_ruin/mossy_4"),
      ame.b("underwater_ruin/mossy_5"),
      ame.b("underwater_ruin/mossy_6"),
      ame.b("underwater_ruin/mossy_7"),
      ame.b("underwater_ruin/mossy_8")
   };
   private static final ame[] g = new ame[]{
      ame.b("underwater_ruin/big_brick_1"), ame.b("underwater_ruin/big_brick_2"), ame.b("underwater_ruin/big_brick_3"), ame.b("underwater_ruin/big_brick_8")
   };
   private static final ame[] h = new ame[]{
      ame.b("underwater_ruin/big_mossy_1"), ame.b("underwater_ruin/big_mossy_2"), ame.b("underwater_ruin/big_mossy_3"), ame.b("underwater_ruin/big_mossy_8")
   };
   private static final ame[] i = new ame[]{
      ame.b("underwater_ruin/big_cracked_1"),
      ame.b("underwater_ruin/big_cracked_2"),
      ame.b("underwater_ruin/big_cracked_3"),
      ame.b("underwater_ruin/big_cracked_8")
   };
   private static final ame[] j = new ame[]{
      ame.b("underwater_ruin/big_warm_4"), ame.b("underwater_ruin/big_warm_5"), ame.b("underwater_ruin/big_warm_6"), ame.b("underwater_ruin/big_warm_7")
   };

   private static eyx a(dpz $$0, dpz $$1, amd<fdo> $$2) {
      return new eyf(new eyt(List.of(new eyp(new eyc($$0), exx.b, eym.b, $$1.m(), new eze($$2)))), bwl.a(5));
   }

   private static ame a(bck $$0) {
      return ag.a(c, $$0);
   }

   private static ame b(bck $$0) {
      return ag.a(j, $$0);
   }

   public static void a(ezb $$0, jb $$1, dwu $$2, evd $$3, bck $$4, exl $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ezb $$0, bck $$1, dwu $$2, jb $$3, exl $$4, evd $$5) {
      jb $$6 = new jb($$3.u(), 90, $$3.w());
      jb $$7 = eza.a(new jb(15, 0, 15), dvd.a, $$2, jb.c).a((kg)$$6);
      euq $$8 = euq.a($$6, $$7);
      jb $$9 = new jb(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<jb> $$10 = a($$1, $$9);
      int $$11 = bcb.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            jb $$14 = $$10.remove($$13);
            dwu $$15 = dwu.a($$1);
            jb $$16 = eza.a(new jb(5, 0, 6), dvd.a, $$15, jb.c).a((kg)$$14);
            euq $$17 = euq.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<jb> a(bck $$0, jb $$1) {
      List<jb> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + bcb.a($$0, 1, 8), 0, 16 + bcb.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + bcb.a($$0, 1, 8), 0, bcb.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + bcb.a($$0, 1, 8), 0, -16 + bcb.a($$0, 4, 8)));
      $$2.add($$1.b(bcb.a($$0, 1, 7), 0, 16 + bcb.a($$0, 1, 7)));
      $$2.add($$1.b(bcb.a($$0, 1, 7), 0, -16 + bcb.a($$0, 4, 6)));
      $$2.add($$1.b(16 + bcb.a($$0, 1, 7), 0, 16 + bcb.a($$0, 3, 8)));
      $$2.add($$1.b(16 + bcb.a($$0, 1, 7), 0, bcb.a($$0, 1, 7)));
      $$2.add($$1.b(16 + bcb.a($$0, 1, 7), 0, -16 + bcb.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ezb $$0, jb $$1, dwu $$2, evd $$3, bck $$4, exl $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ame $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new exk.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ame[] $$9 = $$6 ? g : d;
            ame[] $$10 = $$6 ? i : e;
            ame[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new exk.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new exk.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new exk.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends evi {
      private final exl.a h;
      private final float i;
      private final boolean j;

      public a(ezb $$0, ame $$1, jb $$2, dwu $$3, float $$4, exl.a $$5, boolean $$6) {
         super(evp.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ezb $$0, ui $$1, dwu $$2, float $$3, exl.a $$4, boolean $$5) {
         super(evp.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eyw a(dwu $$0, float $$1, exl.a $$2) {
         eyx $$3 = $$2 == exl.a.b ? exk.b : exk.a;
         return new eyw().a($$0).a(dvd.a).a(new eyd($$1)).a(eyb.d).a($$3);
      }

      public static exk.a a(ezb $$0, ui $$1) {
         dwu $$2 = $$1.<dwu>a("Rot", dwu.h).orElseThrow();
         float $$3 = $$1.b("Integrity", 0.0F);
         exl.a $$4 = $$1.<exl.a>a("BiomeType", exl.a.d).orElseThrow();
         boolean $$5 = $$1.b("IsLarge", false);
         return new exk.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dwu.h, this.c.d());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", exl.a.d, this.h);
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dqb.cG.m().b(drd.e, $$2.b_($$1).a(azu.a)), 2);
            eaz $$5 = $$2.c_($$1);
            if ($$5 instanceof ebh) {
               ((ebh)$$5).a(this.j ? fdf.E : fdf.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            crj $$6 = bzv.L.a($$2.a(), bzu.d);
            if ($$6 != null) {
               $$6.gp();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bzu.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.Q()) {
                  $$2.a($$1, dqb.a.m(), 2);
               } else {
                  $$2.a($$1, dqb.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         int $$7 = $$0.a(eka.a.c, this.d.u(), this.d.w());
         this.d = new jb(this.d.u(), $$7, this.d.w());
         jb $$8 = eza.a(new jb(this.b.a().u() - 1, 0, this.b.a().w() - 1), dvd.a, this.c.d(), jb.c).a((kg)this.d);
         this.d = new jb(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(jb $$0, dly $$1, jb $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (jb $$7 : jb.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            jb.a $$11 = new jb.a($$8, $$10, $$9);
            eeb $$12 = $$1.a_($$11);

            for (fal $$13 = $$1.b_($$11); ($$12.l() || $$13.a(azu.a) || $$12.a(azo.au)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
               $$11.d($$8, --$$10, $$9);
               $$12 = $$1.a_($$11);
            }

            $$4 = Math.min($$4, $$10);
            if ($$10 < $$5 - 2) {
               $$6++;
            }
         }

         int $$14 = Math.abs($$0.u() - $$2.u());
         if ($$5 - $$4 > 2 && $$6 > $$14 - 2) {
            $$3 = $$4 + 1;
         }

         return $$3;
      }
   }
}
