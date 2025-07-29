import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvl extends dpz implements dvz {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dvl> a = b(dvl::new);
   public static final eez<jh.a> b = eer.J;
   private static final Map<jh.a, fjm> d = fjj.a(dpz.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dvl> a() {
      return a;
   }

   public dvl(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.a.a));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.G_().j() && $$1.P().c(dmq.f) && $$3.a(2000) < $$1.an().a() && $$1.g($$2)) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bzv.bT)) {
            bzm $$4 = bzv.bT.a($$1, $$2.d(), bzu.d);
            if ($$4 != null) {
               $$4.aB();
               bzm $$5 = $$4.dm();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      jh.a $$8 = $$4.o();
      jh.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !fbk.a($$1, $$3, $$9).b() ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(aub $$0, bzm $$1) {
      return $$1 instanceof cut $$2 ? Math.max(0, $$0.P().d($$2.gt().a ? dmq.H : dmq.G)) : 0;
   }

   @Nullable
   @Override
   public fbl a(aub $$0, bzm $$1, jb $$2) {
      amd<dmu> $$3 = $$0.aj() == dmu.j ? dmu.i : dmu.j;
      aub $$4 = $$0.q().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == dmu.j;
         eft $$6 = $$4.F_();
         double $$7 = ehy.a($$0.G_(), $$4.G_());
         jb $$8 = $$6.b($$1.dC() * $$7, $$1.dE(), $$1.dI() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private fbl a(aub $$0, bzm $$1, jb $$2, jb $$3, boolean $$4, eft $$5) {
      Optional<jb> $$6 = $$0.r().a($$3, $$4, $$5);
      m.a $$9;
      fbl.a $$10;
      if ($$6.isPresent()) {
         jb $$7 = $$6.get();
         eeb $$8 = $$0.a_($$7);
         $$9 = m.a($$7, $$8.c(eer.J), 21, jh.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = fbl.b.then($$1x -> $$1x.f($$7));
      } else {
         jh.a $$11 = $$1.ai().a_($$2).d(b).orElse(jh.a.a);
         Optional<m.a> $$12 = $$0.r().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = fbl.b.then(fbl.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static fbl a(bzm $$0, jb $$1, m.a $$2, aub $$3, fbl.a $$4) {
      eeb $$5 = $$0.ai().a_($$1);
      jh.a $$6;
      fis $$8;
      if ($$5.b(eer.J)) {
         $$6 = $$5.c(eer.J);
         m.a $$7 = m.a($$1, $$6, 21, jh.a.b, 21, $$2x -> $$0.ai().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jh.a.a;
         $$8 = new fis(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static fbl a(aub $$0, m.a $$1, jh.a $$2, fis $$3, bzm $$4, fbl.a $$5) {
      jb $$6 = $$1.a;
      eeb $$7 = $$0.a_($$6);
      jh.a $$8 = $$7.d(eer.J).orElse(jh.a.a);
      double $$9 = $$1.b;
      double $$10 = $$1.c;
      bzp $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = $$11.a() / 2.0 + ($$9 - $$11.a()) * $$3.a();
      double $$14 = ($$10 - $$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jh.a.a;
      fis $$17 = new fis($$6.u() + ($$16 ? $$13 : $$15), $$6.v() + $$14, $$6.w() + ($$16 ? $$15 : $$13));
      fis $$18 = fbk.a($$17, $$0, $$4, $$11);
      return new fbl($$0, $$18, fis.c, $$12, 0.0F, cba.a(cba.l, cba.k), $$5);
   }

   @Override
   public dvz.a b() {
      return dvz.a.a;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(100) == 0) {
         $$1.a($$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.vV, aza.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = $$2.u() + $$3.j();
         double $$6 = $$2.v() + $$3.j();
         double $$7 = $$2.w() + $$3.j();
         double $$8 = ($$3.i() - 0.5) * 0.5;
         double $$9 = ($$3.i() - 0.5) * 0.5;
         double $$10 = ($$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.h()).a(this) && !$$1.a_($$2.i()).a(this)) {
            $$5 = $$2.u() + 0.5 + 0.25 * $$11;
            $$8 = $$3.i() * 2.0F * $$11;
         } else {
            $$7 = $$2.w() + 0.5 + 0.25 * $$11;
            $$10 = $$3.i() * 2.0F * $$11;
         }

         $$1.a(me.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return dcv.l;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jh.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jh.a.c);
               case c:
                  return $$0.b(b, jh.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
