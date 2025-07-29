import com.google.common.annotations.VisibleForTesting;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class edi extends eaz {
   private final edl a = new edl();
   private final edm b = new edm();
   private final edj c = new edj();
   private edk d = edk.b;

   public edi(jb $$0, eeb $$1) {
      super(ebb.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zw<acq> ax_() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return ag.a(new ui(), $$1 -> $$1.a("shared_data", edm.b, $$0.a(uw.a), this.b));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("config", edk.c, this.d);
      $$0.a("shared_data", edm.b, this.b);
      $$0.a("server_data", edl.b, this.a);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      $$0.<edl>a("server_data", edl.b).ifPresent(this.a::a);
      this.d = $$0.<edk>a("config", edk.c).orElse(edk.b);
      $$0.<edm>a("shared_data", edm.b).ifPresent(this.b::a);
   }

   @Nullable
   public edl a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public edm c() {
      return this.b;
   }

   public edj d() {
      return this.c;
   }

   public edk f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(edk $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dmu $$0, jb $$1, eeb $$2, edj $$3, edm $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dzk.d) ? me.N : me.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dmu $$0, jb $$1, eeb $$2, edm $$3, mc $$4) {
         a($$0, $$1, $$2, $$3);
         bck $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fis $$7 = b($$1, $$5);
            $$0.a(me.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dmu $$0, jb $$1, mc $$2) {
         bck $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fis $$5 = a($$1, $$3);
            fis $$6 = new fis($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dmu $$0, jb $$1, edm $$2, mc $$3) {
         bck $$4 = $$0.H_();
         if ($$4.i() <= 0.5F) {
            fis $$5 = b($$1, $$4);
            $$0.a(me.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dmu $$0, fis $$1, cut $$2) {
         bck $$3 = $$0.A;
         fis $$4 = $$1.a($$2.dv().b(0.0, $$2.dt() / 2.0F, 0.0));
         int $$5 = bcb.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fis $$7 = $$4.a($$3, 1.0F);
            $$0.a(me.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dmu $$0, jb $$1, eeb $$2, edm $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fis $$5 = a($$1, $$2.c(dzk.c));

            for (UUID $$6 : $$4) {
               cut $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jb $$0, edm $$1, cut $$2) {
         return $$2.dx().j($$0) <= bcb.k($$1.e());
      }

      private static void a(dmu $$0, jb $$1, edm $$2) {
         if (a($$2)) {
            bck $$3 = $$0.H_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, ayz.Ce, aza.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(edm $$0) {
         return $$0.b();
      }

      private static fis a(jb $$0, bck $$1) {
         return fis.a($$0).b(bcb.a($$1, 0.4, 0.6), bcb.a($$1, 0.4, 0.6), bcb.a($$1, 0.4, 0.6));
      }

      private static fis b(jb $$0, bck $$1) {
         return fis.a($$0).b(bcb.a($$1, 0.1, 0.9), bcb.a($$1, 0.25, 0.75), bcb.a($$1, 0.1, 0.9));
      }

      private static fis a(jb $$0, jh $$1) {
         return fis.c($$0).b($$1.j() * 0.5, 1.75, $$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aub $$0, jb $$1, eeb $$2, edk $$3, edl $$4, edm $$5) {
         edn $$6 = $$2.c(dzk.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         eeb $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dzk.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            edi.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aub $$0, jb $$1, eeb $$2, edk $$3, edl $$4, edm $$5, cut $$6, dcv $$7) {
         edn $$8 = $$2.c(dzk.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, ayz.Cn);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, ayz.Cj);
            } else {
               List<dcv> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(azj.c.b($$7.h()));
                  $$7.a($$3.e().M(), (cam)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aub $$0, jb $$1, eeb $$2, eeb $$3, edk $$4, edm $$5) {
         edn $$6 = $$2.c(dzk.b);
         edn $$7 = $$3.c(dzk.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dzk.d));
      }

      static void a(aub $$0, edn $$1, edk $$2, edm $$3, jb $$4) {
         if (!a($$2, $$1)) {
            $$3.a(dcv.l);
         } else {
            dcv $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static dcv a(aub $$0, jb $$1, amd<fdo> $$2) {
         fdo $$3 = $$0.q().bc().a($$2);
         fdm $$4 = new fdm.a($$0).a(fgd.f, fis.b($$1)).a(fgc.l);
         List<dcv> $$5 = $$3.a($$4, $$0.H_());
         return $$5.isEmpty() ? dcv.l : ag.a($$5, $$0.H_());
      }

      private static void a(aub $$0, eeb $$1, jb $$2, edk $$3, edl $$4, edm $$5, List<dcv> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dzk.b, edn.c), $$3, $$5);
      }

      private static List<dcv> a(aub $$0, edk $$1, jb $$2, cut $$3, dcv $$4) {
         fdo $$5 = $$0.q().bc().a($$1.b());
         fdm $$6 = new fdm.a($$0).a(fgd.f, fis.b($$2)).a($$3.em()).a(fgd.a, $$3).a(fgd.i, $$4).a(fgc.l);
         return $$5.a($$6);
      }

      private static boolean a(edk $$0, edn $$1) {
         return !$$0.e().f() && $$1 != edn.a;
      }

      private static boolean a(edk $$0, dcv $$1) {
         return dcv.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, edn $$1) {
         return $$0 % 20L == 0L && $$1 == edn.b;
      }

      private static void a(aub $$0, edl $$1, jb $$2, ayy $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, aza.e);
            $$1.a($$0.ae());
         }
      }
   }
}
