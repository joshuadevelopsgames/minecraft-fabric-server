import com.mojang.serialization.MapCodec;

public class dyn extends dzl implements dqc {
   public static final MapCodec<dyn> a = b(dyn::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final efb c = eer.av;
   private static final fjm e = dpz.b(10.0, 0.0, 8.0);
   private static final fjm f = dpz.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dyn> a() {
      return a;
   }

   public dyn(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dcz.ya);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fjj.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         eeb $$5 = $$0.b(c, $$4 + 1);
         $$1.a($$2, $$5, 2);
         $$1.a(ejb.c, $$2, ejb.a.a($$5));
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$3 instanceof cam && $$3.ap() != bzv.ab && $$3.ap() != bzv.m) {
         $$3.a($$0, new fis(0.8F, 0.75, 0.8F));
         if ($$1 instanceof aub $$5 && $$0.c(c) != 0) {
            fis $$7 = $$3.aa_() ? $$3.ae() : $$3.bF().d($$3.dv());
            if ($$7.j() > 0.0) {
               double $$8 = Math.abs($$7.a());
               double $$9 = Math.abs($$7.c());
               if ($$8 >= 0.003F || $$9 >= 0.003F) {
                  $$3.a($$5, $$1.al().u(), 1.0F);
               }
            }
         }
      }
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bxj)(!$$8 && $$0.a(dcz.sX) ? bxj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new dcv(dcz.ya, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, ayz.AV, aza.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         eeb $$8 = $$0.b(c, 1);
         $$1.a($$2, $$8, 2);
         $$1.a(ejb.c, $$2, ejb.a.a($$3, $$8));
         return bxj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, $$4), 2);
   }
}
