import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dst extends dot<ebx> implements dxl {
   public static final MapCodec<dst> b = b(dst::new);
   public static final eez<jh> c = dub.f;
   public static final ees d = eer.I;
   private static final fjm e = dpz.b(14.0, 0.0, 14.0);
   private static final xo f = xo.c("container.enderchest");

   @Override
   public MapCodec<dst> a() {
      return b;
   }

   protected dst(eea.d $$0) {
      super($$0, () -> ebb.d);
      this.l(this.C.b().b(c, jh.c).b(d, false));
   }

   @Override
   public dsh.c<? extends ebh> a(eeb $$0, dmu $$1, jb $$2, boolean $$3) {
      return dsh.b::b;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e;
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, $$1.a() == fam.c);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      daa $$5 = $$3.gG();
      if ($$5 != null && $$1.c_($$2) instanceof ebx $$7) {
         jb $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bxj.a;
         } else {
            if ($$1 instanceof aub $$10) {
               $$5.a($$7);
               $$3.a(new bxs(($$1x, $$2x, $$3x) -> cyv.a($$1x, $$2x, $$5), f));
               $$3.a(azj.ak);
               ctj.a($$10, $$3, true);
            }

            return bxj.a;
         }
      } else {
         return bxj.a;
      }
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? a($$2, ebb.d, ebx::a) : null;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = $$2.u() + 0.5 + 0.25 * $$5;
         double $$8 = $$2.v() + $$3.i();
         double $$9 = $$2.w() + 0.5 + 0.25 * $$6;
         double $$10 = $$3.i() * $$5;
         double $$11 = ($$3.i() - 0.5) * 0.125;
         double $$12 = $$3.i() * $$6;
         $$1.a(me.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      eaz $$4 = $$1.c_($$2);
      if ($$4 instanceof ebx) {
         ((ebx)$$4).a();
      }
   }
}
