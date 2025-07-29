import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxb extends dpl implements dxl {
   public static final MapCodec<dxb> c = b(dxb::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final eez<efi> f = eer.bs;
   public static final efb g = eer.aW;
   public static final ees h = eer.I;
   private static final fjm a = dpz.b(16.0, 0.0, 8.0);
   private static final float[] b = ag.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dvq.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dxb> a() {
      return c;
   }

   public dxb(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, efi.a).b(g, 0).b(h, false));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jb $$1 = $$0.a();
      fal $$2 = $$0.q().b_($$1);
      return this.m().b(h, $$2.a() == fam.c);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(h) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (o($$0) != efi.b) {
         if (o($$0) == efi.c) {
            $$1.a($$2, $$0.b(f, efi.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, ayz.xv, aza.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      if (!$$0.B_() && q($$2) && $$3.ap() != bzv.bI && $$0.c_($$1) instanceof eck $$5 && $$0 instanceof aub $$6 && $$5.gJ().a($$6, $$1, ejb.P, ejb.a.a($$2))) {
         $$5.f().b($$6, ejb.P, ejb.a.a($$3), $$3.dv());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.V().a($$2, this)) {
            $$1.a($$2, $$0.b(g, 0), 18);
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (o($$0) == efi.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dmu $$0, jb $$1, eeb $$2) {
      dpz $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eck($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return !$$0.C ? a($$2, ebb.J, ($$0x, $$1x, $$2x, $$3) -> ejk.c.a($$0x, $$3.gI(), $$3.gJ())) : null;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 == jh.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static efi o(eeb $$0) {
      return $$0.c(f);
   }

   public static boolean q(eeb $$0) {
      return o($$0) == efi.a;
   }

   public static void a(dmu $$0, jb $$1, eeb $$2) {
      $$0.a($$1, $$2.b(f, efi.c).b(g, 0), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bzm $$0, dmu $$1, jb $$2, eeb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, efi.b).b(g, $$4), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ejb.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, $$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.xu, aza.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bzm $$0, dmu $$1, jb $$2, int $$3) {
      for (jh $$4 : jh.values()) {
         jb $$5 = $$2.a($$4);
         eeb $$6 = $$1.a_($$5);
         if ($$6.a(azo.ca)) {
            $$1.a(ejk.b($$3), $$5, ejb.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, ayz.I, aza.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if (o($$0) == efi.b) {
         jh $$4 = jh.b($$3);
         if ($$4 != jh.b && $$4 != jh.a) {
            double $$5 = $$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : $$4.j() * 0.6);
            double $$6 = $$2.v() + 0.25;
            double $$7 = $$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : $$4.l() * 0.6);
            double $$8 = $$3.i() * 0.04;
            $$1.a(ly.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      if ($$1.c_($$2) instanceof eck $$4) {
         return o($$0) == efi.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bwl.a(5));
      }
   }
}
