import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dsc extends dub {
   public static final ees c = eer.A;
   private static final fjm a = dpz.b(16.0, 0.0, 2.0);

   protected dsc(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsc> a();

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$2.a($$0, $$1, jh.b, dyl.c);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.b((dmx)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((dmu)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, false), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, true), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fko.b);
            }
         }
      }
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(f) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$0.a((dmx)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         eaz $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jh $$7 : jh.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dmu $$0, jb $$1, eeb $$2) {
      if (!this.b((dmx)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.V().b($$1, this)) {
            fko $$5 = fko.c;
            if (this.b((dly)$$0, $$1, $$2)) {
               $$5 = fko.a;
            } else if ($$3) {
               $$5 = fko.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dmx $$0, jb $$1, eeb $$2) {
      return false;
   }

   protected boolean a(dmu $$0, jb $$1, eeb $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dmu $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(f);
      jb $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         eeb $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dqb.cH) ? $$6.c(dwj.f) : 0);
      }
   }

   protected int a(dnm $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(f);
      jh $$4 = $$3.h();
      jh $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(f, $$0.g().g());
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dmu $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(f);
      jb $$4 = $$1.a($$3.g());
      fbt $$5 = fbp.a($$0, $$3.g(), jh.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dly $$0, jb $$1, eeb $$2) {
      return 15;
   }

   public static boolean n(eeb $$0) {
      return $$0.b() instanceof dsc;
   }

   public boolean b(dly $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(f).g();
      eeb $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(f) != $$3;
   }

   protected abstract int h(eeb var1);
}
