import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fao extends faj {
   public static final float e = 0.44444445F;

   @Override
   public fak d() {
      return fam.d;
   }

   @Override
   public fak e() {
      return fam.e;
   }

   @Override
   public dcr a() {
      return dcz.rH;
   }

   @Override
   public void a(dmu $$0, jb $$1, fal $$2, bck $$3) {
      jb $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = $$1.u() + $$3.j();
            double $$6 = $$1.v() + 1.0;
            double $$7 = $$1.w() + $$3.j();
            $$0.a(me.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, ayz.oU, aza.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a($$1.u(), $$1.v(), $$1.w(), ayz.oS, aza.i, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(aub $$0, jb $$1, fal $$2, bck $$3) {
      if ($$0.P().c(dmq.b)) {
         if ($$0.P().c(dmq.c) || $$0.g($$1)) {
            int $$4 = $$3.a(3);
            if ($$4 > 0) {
               jb $$5 = $$1;

               for (int $$6 = 0; $$6 < $$4; $$6++) {
                  $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
                  if (!$$0.p($$5)) {
                     return;
                  }

                  eeb $$7 = $$0.a_($$5);
                  if ($$7.l()) {
                     if (this.a((dmx)$$0, $$5)) {
                        $$0.c($$5, dpm.a($$0, $$5));
                        return;
                     }
                  } else if ($$7.d()) {
                     return;
                  }
               }
            } else {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  jb $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
                  if (!$$0.p($$9)) {
                     return;
                  }

                  if ($$0.w($$9.d()) && this.b($$0, $$9)) {
                     $$0.c($$9.d(), dpm.a($$0, $$9));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(dmu $$0, jb $$1, bzm $$2, cae $$3) {
      $$3.a(caf.c);
      $$3.b(caf.c, bzm::aF);
   }

   private boolean a(dmx $$0, jb $$1) {
      for (jh $$2 : jh.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dmx $$0, jb $$1) {
      return $$0.d($$1.v()) && !$$0.D($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public mc h() {
      return me.i;
   }

   @Override
   protected void a(dmv $$0, jb $$1, eeb $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dmx $$0) {
      return $$0.G_().i() ? 4 : 2;
   }

   @Override
   public eeb b(fal $$0) {
      return dqb.K.m().b(duw.b, e($$0));
   }

   @Override
   public boolean a(fak $$0) {
      return $$0 == fam.e || $$0 == fam.d;
   }

   @Override
   public int c(dmx $$0) {
      return $$0.G_().i() ? 1 : 2;
   }

   @Override
   public boolean a(fal $$0, dly $$1, jb $$2, fak $$3, jh $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(azu.a);
   }

   @Override
   public int a(dmx $$0) {
      return $$0.G_().i() ? 10 : 30;
   }

   @Override
   public int a(dmu $$0, jb $$1, fal $$2, fal $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.H_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dmv $$0, jb $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(aub $$0) {
      return $$0.P().c(dmq.X);
   }

   @Override
   protected void a(dmv $$0, jb $$1, eeb $$2, jh $$3, fal $$4) {
      if ($$3 == jh.a) {
         fal $$5 = $$0.b_($$1);
         if (this.a(azu.b) && $$5.a(azu.a)) {
            if ($$2.b() instanceof duw) {
               $$0.a($$1, dqb.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ayy> j() {
      return Optional.of(ayz.dm);
   }

   public static class a extends fao {
      @Override
      protected void a(eec.a<fak, fal> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(fal $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(fal $$0) {
         return false;
      }
   }

   public static class b extends fao {
      @Override
      public int d(fal $$0) {
         return 8;
      }

      @Override
      public boolean c(fal $$0) {
         return true;
      }
   }
}
