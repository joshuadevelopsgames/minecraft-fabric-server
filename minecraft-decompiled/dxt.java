import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxt extends dpz {
   public static final MapCodec<dxt> a = b(dxt::new);
   public static final int b = 8;
   public static final efb c = eer.aI;
   private static final fjm[] e = dpz.a(8, $$0 -> dpz.b(16.0, 0.0, $$0 * 2));
   public static final int d = 5;

   @Override
   public MapCodec<dxt> a() {
      return a;
   }

   protected dxt(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 1));
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return $$1 == fba.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.e());
      if ($$3.a(azo.cw)) {
         return false;
      } else {
         return $$3.a(azo.cx) ? true : dpz.a($$3.g($$1, $$2.e()), jh.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.a(dnd.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jh.b : true;
      }
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Math.min(8, $$2 + 1));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }
}
