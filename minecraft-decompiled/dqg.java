import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqg extends dpz implements dqh {
   public static final MapCodec<dqg> a = b(dqg::new);
   public static final ees b = eer.h;
   private static final int c = 5;

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   public dqg(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      eeb $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected fal b_(eeb $$0) {
      return fam.c.a(false);
   }

   public static void b(dmv $$0, jb $$1, eeb $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dmv $$0, jb $$1, eeb $$2, eeb $$3) {
      if (o($$2)) {
         eeb $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jb.a $$5 = $$1.k().c(jh.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jh.b);
         }
      }
   }

   private static boolean o(eeb $$0) {
      return $$0.a(dqb.nK) || $$0.a(dqb.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static eeb q(eeb $$0) {
      if ($$0.a(dqb.nK)) {
         return $$0;
      } else if ($$0.a(dqb.en)) {
         return dqb.nK.m().b(b, false);
      } else {
         return $$0.a(dqb.lp) ? dqb.nK.m().b(b, true) : dqb.J.m();
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      double $$4 = $$2.u();
      double $$5 = $$2.v();
      double $$6 = $$2.w();
      if ($$0.c(b)) {
         $$1.b(me.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ayz.da, aza.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(me.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(me.at, $$4 + $$3.i(), $$5 + $$3.i(), $$6 + $$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, ayz.cY, aza.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      $$2.a($$3, fam.c, fam.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jh.a || $$4 == jh.b && !$$6.a(dqb.nK) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.e());
      return $$3.a(dqb.nK) || $$3.a(dqb.lp) || $$3.a(dqb.en);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   public dcv a(@Nullable cam $$0, dmv $$1, jb $$2, eeb $$3) {
      $$1.a($$2, dqb.a.m(), 11);
      return new dcv(dcz.rG);
   }

   @Override
   public Optional<ayy> as_() {
      return fam.c.j();
   }
}
