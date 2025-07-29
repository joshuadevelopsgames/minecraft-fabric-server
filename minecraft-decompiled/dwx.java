import com.mojang.serialization.MapCodec;

public class dwx extends dpz implements dxl {
   public static final MapCodec<dwx> a = b(dwx::new);
   private static final int f = 1;
   private static final fjm g = fjj.a(dpz.b(16.0, 14.0, 16.0), fjj.c(dpz.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fjj.a(), fjj::a));
   private static final fjm h = dpz.b(16.0, 0.0, 2.0);
   private static final fjm i = fjj.a(g, h, fjj.c(dpz.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fjj.a(), fjj::a));
   private static final fjm D = fjj.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final efb c = eer.aZ;
   public static final ees d = eer.I;
   public static final ees e = eer.d;

   @Override
   public MapCodec<dwx> a() {
      return a;
   }

   protected dwx(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 7).b(d, false).b(e, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fjj.b();
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2) {
      return fjj.b();
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public eeb a(dgo $$0) {
      jb $$1 = $$0.a();
      dmu $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, $$2.b_($$1).a() == fam.c).b(c, $$3).b(e, this.a($$2, $$1, $$3));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = a($$1, $$2);
      eeb $$5 = $$0.b(c, $$4).b(e, this.a($$1, $$2, $$4));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cqy.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      if ($$3.c()) {
         return fjj.a();
      } else if ($$3.a(fjj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : fjj.a();
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   private boolean a(dly $$0, jb $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dly $$0, jb $$1) {
      jb.a $$2 = $$1.k().c(jh.a);
      eeb $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dqb.oz)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jh.b)) {
         return 0;
      }

      for (jh $$5 : jh.c.a) {
         eeb $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dqb.oz)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
