import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class duq extends dpz implements dxl {
   public static final int a = 7;
   public static final efb b = eer.aF;
   public static final ees c = eer.z;
   public static final ees d = eer.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends duq> a();

   public duq(float $$0, eea.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, 7).b(c, false).b(d, false));
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return fjj.a();
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(eeb $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(eeb $$0) {
      return 1;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static eeb a(eeb $$0, dmv $$1, jb $$2) {
      int $$3 = 7;
      jb.a $$4 = new jb.a();

      for (jh $$5 : jh.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(b, $$3);
   }

   private static int r(eeb $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(eeb $$0) {
      if ($$0.a(azo.D)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      super.a($$0, $$1, $$2, $$3);
      jb $$4 = $$2.e();
      eeb $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dmu $$0, jb $$1, bck $$2, eeb $$3, jb $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jh.b)) {
               bcf.a($$0, $$1, $$2, me.l);
            }
         }
      }
   }

   private void b(dmu $$0, jb $$1, bck $$2, eeb $$3, jb $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jh.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(dmu var1, jb var2, bck var3);

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      eeb $$2 = this.m().b(c, true).b(d, $$1.a() == fam.c);
      return a($$2, $$0.q(), $$0.a());
   }
}
