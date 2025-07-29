import java.util.Optional;
import javax.annotation.Nullable;

public abstract class far extends faj {
   @Override
   public fak d() {
      return fam.b;
   }

   @Override
   public fak e() {
      return fam.c;
   }

   @Override
   public dcr a() {
      return dcz.rG;
   }

   @Override
   public void a(dmu $$0, jb $$1, fal $$2, bck $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a($$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, ayz.DF, aza.i, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(me.ao, $$1.u() + $$3.j(), $$1.v() + $$3.j(), $$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public mc h() {
      return me.l;
   }

   @Override
   protected boolean a(aub $$0) {
      return $$0.P().c(dmq.W);
   }

   @Override
   protected void a(dmv $$0, jb $$1, eeb $$2) {
      eaz $$3 = $$2.x() ? $$0.c_($$1) : null;
      dpz.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(dmu $$0, jb $$1, bzm $$2, cae $$3) {
      $$3.a(caf.d);
   }

   @Override
   public int b(dmx $$0) {
      return 4;
   }

   @Override
   public eeb b(fal $$0) {
      return dqb.J.m().b(duw.b, e($$0));
   }

   @Override
   public boolean a(fak $$0) {
      return $$0 == fam.c || $$0 == fam.b;
   }

   @Override
   public int c(dmx $$0) {
      return 1;
   }

   @Override
   public int a(dmx $$0) {
      return 5;
   }

   @Override
   public boolean a(fal $$0, dly $$1, jb $$2, fak $$3, jh $$4) {
      return $$4 == jh.a && !$$3.a(azu.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ayy> j() {
      return Optional.of(ayz.dj);
   }

   public static class a extends far {
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

   public static class b extends far {
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
