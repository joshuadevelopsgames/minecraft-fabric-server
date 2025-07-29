import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecv extends ecw {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private static final long g = 0L;
   private static final boolean h = false;
   private long i = 0L;
   private int j;
   @Nullable
   private jb k;
   private boolean l = false;

   public ecv(jb $$0, eeb $$1) {
      super(ebb.w, $$0, $$1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Age", this.i);
      $$0.b("exit_portal", jb.a, this.k);
      if (this.l) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.i = $$0.a("Age", 0L);
      this.k = $$0.<jb>a("exit_portal", jb.a).filter(dmu::l).orElse(null);
      this.l = $$0.a("ExactTeleport", false);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecv $$3) {
      $$3.i++;
      if ($$3.c()) {
         $$3.j--;
      }
   }

   public static void b(dmu $$0, jb $$1, eeb $$2, ecv $$3) {
      boolean $$4 = $$3.a();
      boolean $$5 = $$3.c();
      $$3.i++;
      if ($$5) {
         $$3.j--;
      } else if ($$3.i % 2400L == 0L) {
         c($$0, $$1, $$2, $$3);
      }

      if ($$4 != $$3.a() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public boolean a() {
      return this.i < 200L;
   }

   public boolean c() {
      return this.j > 0;
   }

   public float a(float $$0) {
      return bcb.a(((float)this.i + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - bcb.a((this.j - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public acw d() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public static void c(dmu $$0, jb $$1, eeb $$2, ecv $$3) {
      if (!$$0.C) {
         $$3.j = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.j = 40;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Nullable
   public fis a(aub $$0, jb $$1) {
      if (this.k == null && $$0.aj() == dmu.k) {
         jb $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, epk.a($$1, false));
         this.a($$2, this.l);
      }

      if (this.k != null) {
         jb $$3 = this.l ? this.k : a((dmu)$$0, this.k);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static jb a(dmu $$0, jb $$1) {
      jb $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static jb b(aub $$0, jb $$1) {
      fis $$2 = c($$0, $$1);
      egi $$3 = a((dmu)$$0, $$2);
      jb $$4 = a($$3);
      if ($$4 == null) {
         jb $$5 = jb.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.K_().a(mn.aP).flatMap($$0x -> $$0x.a(rq.f)).ifPresent($$2x -> ((ems)$$2x.a()).a($$0, $$0.n().g(), bck.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static fis c(aub $$0, jb $$1) {
      fis $$2 = new fis($$1.u(), 0.0, $$1.w()).d();
      int $$3 = 1024;
      fis $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aub $$0, fis $$1) {
      return a((dmu)$$0, $$1).a() == -1;
   }

   private static jb a(dly $$0, jb $$1, int $$2, boolean $$3) {
      jb $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.ao(); $$7 > ($$4 == null ? $$0.L_() : $$4.v()); $$7--) {
                  jb $$8 = new jb($$1.u() + $$5, $$7, $$1.w() + $$6);
                  eeb $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dqb.I))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static egi a(dmu $$0, fis $$1) {
      return $$0.d(bcb.a($$1.d / 16.0), bcb.a($$1.f / 16.0));
   }

   @Nullable
   private static jb a(egi $$0) {
      dlz $$1 = $$0.f();
      jb $$2 = new jb($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      jb $$4 = new jb($$1.f(), $$3, $$1.g());
      jb $$5 = null;
      double $$6 = 0.0;

      for (jb $$7 : jb.c($$2, $$4)) {
         eeb $$8 = $$0.a_($$7);
         jb $$9 = $$7.d();
         jb $$10 = $$7.b(2);
         if ($$8.a(dqb.fY) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aub $$0, jb $$1, epk $$2) {
      enh.N.a($$2, $$0, $$0.n().g(), bck.a(), $$1);
   }

   @Override
   public boolean a(jh $$0) {
      return dpz.a(this.m(), this.n.a_(this.aA_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jh $$1 : jh.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(jb $$0, boolean $$1) {
      this.l = $$1;
      this.k = $$0;
      this.e();
   }
}
