import com.mojang.serialization.MapCodec;

public class drw extends dzl implements dqc {
   public static final MapCodec<drw> d = b(drw::new);
   public static final int e = 7;
   public static final efb f = eer.ay;
   private static final fjm[] a = dpz.a(7, $$0 -> dpz.b(16.0, 0.0, 2 + $$0 * 2));

   @Override
   public MapCodec<? extends drw> a() {
      return d;
   }

   protected drw(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.cN);
   }

   protected efb b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(eeb $$0) {
      return $$0.c(this.b());
   }

   public eeb b(int $$0) {
      return this.m().b(this.b(), $$0);
   }

   public final boolean i(eeb $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(eeb $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.h($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void b(dmu $$0, jb $$1, eeb $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dmu $$0) {
      return bcb.a($$0.A, 2, 5);
   }

   protected static float a(dpz $$0, dly $$1, jb $$2) {
      float $$3 = 1.0F;
      jb $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            eeb $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dqb.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dsz.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jb $$9 = $$2.f();
      jb $$10 = $$2.g();
      jb $$11 = $$2.h();
      jb $$12 = $$2.i();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.f()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$12.g()).a($$0) || $$1.a_($$11.g()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dmx $$0, jb $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$1 instanceof aub $$5 && $$3 instanceof csa && $$5.P().c(dmq.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected dmt d() {
      return dcz.qA;
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(this.d());
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f);
   }
}
