import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsz extends dpz {
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final efb b = eer.aT;
   private static final fjm d = dpz.b(16.0, 0.0, 15.0);
   public static final int c = 7;

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   protected dsz(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, 0));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dtb || $$3.b() instanceof eds;
   }

   @Override
   public eeb a(dgo $$0) {
      return !this.m().a((dmx)$$0.q(), $$0.a()) ? dqb.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = $$0.c(b);
      if (!a((dmx)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, $$4 - 1), 2);
         } else if (!a((dly)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, 7), 2);
      }
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      if ($$0 instanceof aub $$5
         && $$0.A.i() < $$4 - 0.5
         && $$3 instanceof cam
         && ($$3 instanceof cut || $$5.P().c(dmq.d))
         && $$3.ds() * $$3.ds() * $$3.dt() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bzm $$0, eeb $$1, dmu $$2, jb $$3) {
      eeb $$4 = a($$1, dqb.j.m(), $$2, $$3);
      $$2.c($$3, $$4);
      $$2.a(ejb.c, $$3, ejb.a.a($$0, $$4));
   }

   private static boolean a(dly $$0, jb $$1) {
      return $$0.a_($$1.d()).a(azo.cF);
   }

   private static boolean a(dmx $$0, jb $$1) {
      for (jb $$2 : jb.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(azu.a)) {
            return true;
         }
      }

      return false;
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
