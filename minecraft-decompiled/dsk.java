import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsk extends dub implements dxl {
   public static final MapCodec<dsk> a = b(dsk::new);
   public static final int b = 3;
   public static final efb c = eer.bd;
   public static final ees d = eer.I;
   public static final int e = 5000;
   private static final fjm g = dpz.a(10.0, 10.0, 0.0, 10.0);

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(c, 0).b(d, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, c, d);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return g;
   }

   public int n(eeb $$0) {
      return $$0.c(c);
   }

   private boolean o(eeb $$0) {
      return this.n($$0) == 3;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(d)) {
         this.c($$0, $$1, $$2, $$3);
      } else {
         int $$4 = this.n($$0);
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(c, $$4 - 1), 2);
            $$1.a(ejb.c, $$2, ejb.a.a($$0));
         }
      }
   }

   private void c(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.o($$0)) {
         $$1.a(null, $$2, ayz.hR, aza.e, 1.0F, 1.0F);
         $$1.a($$2, $$0.b(c, this.n($$0) + 1), 2);
         $$1.a(ejb.c, $$2, ejb.a.a($$0));
      } else {
         this.a($$1, $$2, $$0);
      }
   }

   private void a(aub $$0, jb $$1, eeb $$2) {
      $$0.a($$1, false);
      cmt $$3 = bzv.af.a($$0, bzu.e);
      if ($$3 != null) {
         fis $$4 = $$1.c();
         $$3.a(true);
         float $$5 = jh.a($$2.c(f));
         $$3.r($$5);
         $$3.b($$4.a(), $$4.b(), $$4.c(), $$5, 0.0F);
         $$0.b($$3);
         $$0.a(null, $$3, ayz.lg, aza.e, 1.0F, 1.0F);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      double $$4 = $$2.u() + 0.5;
      double $$5 = $$2.v() + 0.5;
      double $$6 = $$2.w() + 0.5;
      if (!$$0.c(d)) {
         if ($$3.a(40) == 0 && $$1.a_($$2.e()).a(azo.cK)) {
            $$1.a($$4, $$5, $$6, ayz.hN, aza.e, 1.0F, 1.0F, false);
         }

         if ($$3.a(6) == 0) {
            $$1.a(me.ai, $$4, $$5, $$6, 0.0, 0.02, 0.0);
         }
      } else {
         if ($$3.a(40) == 0) {
            $$1.a($$4, $$5, $$6, ayz.hO, aza.e, 1.0F, 1.0F, false);
         }

         if ($$3.a(6) == 0) {
            $$1.a(me.Q, $$4 + ($$3.i() * 2.0F - 1.0F) / 3.0F, $$5 + 0.4, $$6 + ($$3.i() * 2.0F - 1.0F) / 3.0F, 0.0, $$3.i(), 0.0);
         }
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (($$0.c(d) || $$0.c(c) > 0) && !$$1.o().a($$2, this)) {
         $$1.a($$2, this, 5000);
      }
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      return super.a($$0).b(d, $$2).b(f, $$0.g().g());
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      if (!$$2.c(eer.I) && $$3.a() == fam.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(eer.I, true), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
            $$0.a(null, $$1, ayz.hQ, aza.e, 1.0F, 1.0F);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$0.a(null, $$1, $$2.c(d) ? ayz.hQ : ayz.hP, aza.e, 1.0F, 1.0F);
   }

   @Override
   public boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
