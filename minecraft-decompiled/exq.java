import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class exq {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final exq.f[] g = new exq.f[]{
      new exq.f(exq.n.class, 40, 0),
      new exq.f(exq.h.class, 5, 5),
      new exq.f(exq.d.class, 20, 0),
      new exq.f(exq.i.class, 20, 0),
      new exq.f(exq.j.class, 10, 6),
      new exq.f(exq.o.class, 5, 5),
      new exq.f(exq.l.class, 5, 5),
      new exq.f(exq.c.class, 5, 4),
      new exq.f(exq.a.class, 5, 4),
      new exq.f(exq.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new exq.f(exq.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<exq.f> h;
   static Class<? extends exq.p> i;
   private static int j;
   static final exq.k k = new exq.k();

   public static void a() {
      h = Lists.newArrayList();

      for (exq.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (exq.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static exq.p a(Class<? extends exq.p> $$0, evd $$1, bck $$2, int $$3, int $$4, int $$5, @Nullable jh $$6, int $$7) {
      exq.p $$8 = null;
      if ($$0 == exq.n.class) {
         $$8 = exq.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.h.class) {
         $$8 = exq.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.d.class) {
         $$8 = exq.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.i.class) {
         $$8 = exq.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.j.class) {
         $$8 = exq.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.o.class) {
         $$8 = exq.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.l.class) {
         $$8 = exq.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.c.class) {
         $$8 = exq.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.a.class) {
         $$8 = exq.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.e.class) {
         $$8 = exq.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == exq.g.class) {
         $$8 = exq.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static exq.p a(exq.m $$0, evd $$1, bck $$2, int $$3, int $$4, int $$5, jh $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            exq.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (exq.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  exq.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                  if ($$12 != null) {
                     $$11.c++;
                     $$0.a = $$11;
                     if (!$$11.a()) {
                        h.remove($$11);
                     }

                     return $$12;
                  }
               }
            }
         }

         euq $$13 = exq.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new exq.b($$7, $$13, $$6) : null;
      }
   }

   static evc b(exq.m $$0, evd $$1, bck $$2, int $$3, int $$4, int $$5, @Nullable jh $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         evc $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends exq.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(ui $$0) {
         super(evp.t, $$0);
         this.d = $$0.b("Chest", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         this.a((exq.m)$$0, $$1, $$2, 1, 1);
      }

      public static exq.a a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, exq.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dqb.eZ.m(), dqb.eZ.m(), false);
         this.a($$0, dqb.kn.m(), 3, 1, 1, $$4);
         this.a($$0, dqb.kn.m(), 3, 1, 5, $$4);
         this.a($$0, dqb.kn.m(), 3, 2, 2, $$4);
         this.a($$0, dqb.kn.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dqb.kn.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, fdf.x);
         }
      }
   }

   public static class b extends exq.p {
      private final int a;

      public b(int $$0, euq $$1, jh $$2) {
         super(evp.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jh.c && $$2 != jh.d ? $$1.d() : $$1.f();
      }

      public b(ui $$0) {
         super(evp.u, $$0);
         this.a = $$0.b("Steps", 0);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static euq a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5) {
         int $$6 = 3;
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         evc $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dqb.eZ.m(), 0, 0, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 1, 0, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 2, 0, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 3, 0, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dqb.eZ.m(), 0, $$8, $$7, $$4);
               this.a($$0, dqb.nJ.m(), 1, $$8, $$7, $$4);
               this.a($$0, dqb.nJ.m(), 2, $$8, $$7, $$4);
               this.a($$0, dqb.nJ.m(), 3, $$8, $$7, $$4);
               this.a($$0, dqb.eZ.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dqb.eZ.m(), 0, 4, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 1, 4, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 2, 4, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 3, 4, $$7, $$4);
            this.a($$0, dqb.eZ.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends exq.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(ui $$0) {
         super(evp.v, $$0);
         this.d = $$0.b("leftLow", false);
         this.i = $$0.b("leftHigh", false);
         this.j = $$0.b("rightLow", false);
         this.k = $$0.b("rightHigh", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jh $$5 = this.i();
         if ($$5 == jh.e || $$5 == jh.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((exq.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((exq.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((exq.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((exq.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((exq.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static exq.c a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 4, 3, 0);
         if (this.d) {
            this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
         }

         if (this.j) {
            this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
         }

         if (this.k) {
            this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
         }

         this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, exq.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, exq.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, exq.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, exq.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, exq.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, exq.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dqb.kh.m(), dqb.kh.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dqb.kh.m().b(dxn.b, efj.c), dqb.kh.m().b(dxn.b, efj.c), false);
         this.a($$0, dqb.cA.m().b(dzs.e, jh.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends exq.q {
      public d(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(ui $$0) {
         super(evp.w, $$0);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         jh $$3 = this.i();
         if ($$3 != jh.c && $$3 != jh.f) {
            this.c((exq.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((exq.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static exq.d a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jh $$7 = this.i();
         if ($$7 != jh.c && $$7 != jh.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends exq.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(ui $$0) {
         super(evp.x, $$0);
         this.i = $$0.b("Tall", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static exq.e a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = euq.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new exq.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dqb.bz.m(), dqb.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dqb.n.m(), dqb.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dqb.n.m(), dqb.n.m(), false);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.f), 2, 3, $$10, $$4);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dqb.n.m(), dqb.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dqb.n.m(), dqb.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dqb.cv.m(), dqb.cv.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dqb.cv.m(), dqb.cv.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dqb.cv.m(), dqb.cv.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dqb.cv.m(), dqb.cv.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dqb.cv.m(), dqb.cv.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dqb.cv.m(), dqb.cv.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dqb.cv.m(), dqb.cv.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dqb.n.m(), dqb.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dqb.n.m(), dqb.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dqb.n.m(), dqb.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dqb.n.m(), dqb.n.m(), false);
            this.a($$0, dqb.n.m(), 9, 5, 11, $$4);
            this.a($$0, dqb.n.m(), 8, 5, 11, $$4);
            this.a($$0, dqb.n.m(), 9, 5, 10, $$4);
            eeb $$12 = dqb.el.m().b(dta.d, true).b(dta.b, true);
            eeb $$13 = dqb.el.m().b(dta.a, true).b(dta.c, true);
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dqb.el.m().b(dta.a, true).b(dta.b, true), 3, 6, 2, $$4);
            this.a($$0, dqb.el.m().b(dta.c, true).b(dta.b, true), 3, 6, 12, $$4);
            this.a($$0, dqb.el.m().b(dta.a, true).b(dta.d, true), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dqb.el.m().b(dta.c, true).b(dta.d, true), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dqb.el.m().b(dta.a, true).b(dta.b, true), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            eeb $$15 = dqb.da.m().b(dul.b, jh.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            eeb $$18 = dqb.el.m().b(dta.b, true);
            this.a($$0, $$18, 6, 9, 7, $$4);
            eeb $$19 = dqb.el.m().b(dta.d, true);
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            eeb $$20 = $$13.b(dta.d, true).b(dta.b, true);
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dta.a, true), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dta.c, true), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dta.a, true), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dta.c, true), 7, 7, 8, $$4);
            eeb $$21 = dqb.cz.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, fdf.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, fdf.v);
         }
      }
   }

   static class f {
      public final Class<? extends exq.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends exq.p> $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class g extends exq.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, euq $$1, jh $$2) {
         super(evp.y, $$0, $$1);
         this.a($$2);
      }

      public g(ui $$0) {
         super(evp.y, $$0);
         this.d = $$0.b("Mob", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         if ($$0 != null) {
            ((exq.m)$$0).b = this;
         }
      }

      public static exq.g a(evd $$0, int $$1, int $$2, int $$3, jh $$4, int $$5) {
         euq $$6 = euq.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new exq.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, exq.k);
         this.a($$0, $$3, $$4, exq.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, exq.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, exq.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, exq.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, exq.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, exq.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, exq.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dqb.K.m(), dqb.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dqb.K.m(), dqb.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, exq.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dqb.K.m(), dqb.K.m(), false);
         eeb $$8 = dqb.fo.m().b(dug.a, true).b(dug.c, true);
         eeb $$9 = dqb.fo.m().b(dug.d, true).b(dug.b, true);

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         eeb $$12 = dqb.fC.m().b(dye.b, jh.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, exq.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, exq.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, exq.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         eeb $$14 = dqb.fX.m().b(dsr.b, jh.c);
         eeb $$15 = dqb.fX.m().b(dsr.b, jh.d);
         eeb $$16 = dqb.fX.m().b(dsr.b, jh.f);
         eeb $$17 = dqb.fX.m().b(dsr.b, jh.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dsr.c, $$19[0]), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dsr.c, $$19[1]), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dsr.c, $$19[2]), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dsr.c, $$19[3]), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dsr.c, $$19[4]), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dsr.c, $$19[5]), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dsr.c, $$19[6]), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dsr.c, $$19[7]), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dsr.c, $$19[8]), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dsr.c, $$19[9]), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dsr.c, $$19[10]), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dsr.c, $$19[11]), 7, 3, 11, $$4);
         if ($$18) {
            eeb $$21 = dqb.fW.m();
            this.a($$0, $$21, 4, 3, 9, $$4);
            this.a($$0, $$21, 5, 3, 9, $$4);
            this.a($$0, $$21, 6, 3, 9, $$4);
            this.a($$0, $$21, 4, 3, 10, $$4);
            this.a($$0, $$21, 5, 3, 10, $$4);
            this.a($$0, $$21, 6, 3, 10, $$4);
            this.a($$0, $$21, 4, 3, 11, $$4);
            this.a($$0, $$21, 5, 3, 11, $$4);
            this.a($$0, $$21, 6, 3, 11, $$4);
         }

         if (!this.d) {
            jb $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dqb.cD.m(), 2);
               if ($$0.c_($$22) instanceof ecr $$24) {
                  $$24.a(bzv.bg, $$3);
               }
            }
         }
      }
   }

   public static class h extends exq.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(ui $$0) {
         super(evp.z, $$0);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         this.a((exq.m)$$0, $$1, $$2, 1, 1);
      }

      public static exq.h a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, exq.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, exq.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, exq.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, exq.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dqb.fo.m().b(dug.a, true).b(dug.c, true), 4, $$7, 4, $$4);
            this.a($$0, dqb.fo.m().b(dug.a, true).b(dug.c, true).b(dug.b, true), 4, $$7, 5, $$4);
            this.a($$0, dqb.fo.m().b(dug.a, true).b(dug.c, true), 4, $$7, 6, $$4);
            this.a($$0, dqb.fo.m().b(dug.d, true).b(dug.b, true), 5, $$7, 5, $$4);
            this.a($$0, dqb.fo.m().b(dug.d, true).b(dug.b, true), 6, $$7, 5, $$4);
            this.a($$0, dqb.fo.m().b(dug.d, true).b(dug.b, true), 7, $$7, 5, $$4);
         }

         this.a($$0, dqb.fo.m().b(dug.a, true).b(dug.c, true), 4, 3, 2, $$4);
         this.a($$0, dqb.fo.m().b(dug.a, true).b(dug.c, true), 4, 3, 8, $$4);
         eeb $$8 = dqb.dN.m().b(dsg.b, jh.e);
         eeb $$9 = dqb.dN.m().b(dsg.b, jh.e).b(dsg.c, eex.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends exq.q {
      public i(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(ui $$0) {
         super(evp.A, $$0);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         jh $$3 = this.i();
         if ($$3 != jh.c && $$3 != jh.f) {
            this.b((exq.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((exq.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static exq.i a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jh $$7 = this.i();
         if ($$7 != jh.c && $$7 != jh.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends exq.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(ui $$0) {
         super(evp.B, $$0);
         this.d = $$0.b("Type", 0);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         this.a((exq.m)$$0, $$1, $$2, 4, 1);
         this.b((exq.m)$$0, $$1, $$2, 1, 4);
         this.c((exq.m)$$0, $$1, $$2, 1, 4);
      }

      public static exq.j a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dqb.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dqb.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dqb.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.e), 4, 3, 5, $$4);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.f), 6, 3, 5, $$4);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.d), 5, 3, 4, $$4);
               this.a($$0, dqb.cA.m().b(dzs.e, jh.c), 5, 3, 6, $$4);
               this.a($$0, dqb.kh.m(), 4, 1, 4, $$4);
               this.a($$0, dqb.kh.m(), 4, 1, 5, $$4);
               this.a($$0, dqb.kh.m(), 4, 1, 6, $$4);
               this.a($$0, dqb.kh.m(), 6, 1, 4, $$4);
               this.a($$0, dqb.kh.m(), 6, 1, 5, $$4);
               this.a($$0, dqb.kh.m(), 6, 1, 6, $$4);
               this.a($$0, dqb.kh.m(), 5, 1, 4, $$4);
               this.a($$0, dqb.kh.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dqb.eZ.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dqb.eZ.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dqb.eZ.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dqb.eZ.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dqb.eZ.m(), 5, 1, 5, $$4);
               this.a($$0, dqb.eZ.m(), 5, 2, 5, $$4);
               this.a($$0, dqb.eZ.m(), 5, 3, 5, $$4);
               this.a($$0, dqb.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dqb.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dqb.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dqb.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dqb.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dqb.m.m(), 5, 1, 4, $$4);
               this.a($$0, dqb.m.m(), 5, 1, 6, $$4);
               this.a($$0, dqb.m.m(), 5, 3, 4, $$4);
               this.a($$0, dqb.m.m(), 5, 3, 6, $$4);
               this.a($$0, dqb.m.m(), 4, 1, 5, $$4);
               this.a($$0, dqb.m.m(), 6, 1, 5, $$4);
               this.a($$0, dqb.m.m(), 4, 3, 5, $$4);
               this.a($$0, dqb.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dqb.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dqb.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dqb.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dqb.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dqb.cA.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dqb.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dqb.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dqb.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dqb.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dqb.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dqb.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dqb.n.m(), 8, 3, $$11, $$4);
               }

               eeb $$12 = dqb.da.m().b(dul.b, jh.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, fdf.w);
         }
      }
   }

   static class k extends evc.a {
      @Override
      public void a(bck $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dqb.fb.m();
            } else if ($$5 < 0.5F) {
               this.a = dqb.fa.m();
            } else if ($$5 < 0.55F) {
               this.a = dqb.fh.m();
            } else {
               this.a = dqb.eZ.m();
            }
         } else {
            this.a = dqb.nJ.m();
         }
      }
   }

   public static class l extends exq.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(evp $$0, int $$1, int $$2, int $$3, jh $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = exq.p.a.a;
      }

      public l(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(evp $$0, ui $$1) {
         super($$0, $$1);
         this.d = $$1.b("Source", false);
      }

      public l(ui $$0) {
         this(evp.C, $$0);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         if (this.d) {
            exq.i = exq.c.class;
         }

         this.a((exq.m)$$0, $$1, $$2, 1, 1);
      }

      public static exq.l a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, exq.p.a.a, 1, 1, 4);
         this.a($$0, dqb.eZ.m(), 2, 6, 1, $$4);
         this.a($$0, dqb.eZ.m(), 1, 5, 1, $$4);
         this.a($$0, dqb.kh.m(), 1, 6, 1, $$4);
         this.a($$0, dqb.eZ.m(), 1, 5, 2, $$4);
         this.a($$0, dqb.eZ.m(), 1, 4, 3, $$4);
         this.a($$0, dqb.kh.m(), 1, 5, 3, $$4);
         this.a($$0, dqb.eZ.m(), 2, 4, 3, $$4);
         this.a($$0, dqb.eZ.m(), 3, 3, 3, $$4);
         this.a($$0, dqb.kh.m(), 3, 4, 3, $$4);
         this.a($$0, dqb.eZ.m(), 3, 3, 2, $$4);
         this.a($$0, dqb.eZ.m(), 3, 2, 1, $$4);
         this.a($$0, dqb.kh.m(), 3, 3, 1, $$4);
         this.a($$0, dqb.eZ.m(), 2, 2, 1, $$4);
         this.a($$0, dqb.eZ.m(), 1, 1, 1, $$4);
         this.a($$0, dqb.kh.m(), 1, 2, 1, $$4);
         this.a($$0, dqb.eZ.m(), 1, 1, 2, $$4);
         this.a($$0, dqb.kh.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends exq.l {
      public exq.f a;
      @Nullable
      public exq.g b;
      public final List<evc> c = Lists.newArrayList();

      public m(bck $$0, int $$1, int $$2) {
         super(evp.D, 0, $$1, $$2, a($$0));
      }

      public m(ui $$0) {
         super(evp.D, $$0);
      }

      @Override
      public jb h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends exq.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(ui $$0) {
         super(evp.E, $$0);
         this.d = $$0.b("Left", false);
         this.i = $$0.b("Right", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         this.a((exq.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((exq.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((exq.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static exq.n a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, exq.p.a.a, 1, 1, 6);
         eeb $$7 = dqb.cA.m().b(dzs.e, jh.f);
         eeb $$8 = dqb.cA.m().b(dzs.e, jh.e);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 1, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 1, $$8);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 5, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 5, $$8);
         if (this.d) {
            this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
         }
      }
   }

   public static class o extends exq.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, bck $$1, euq $$2, jh $$3) {
         super(evp.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(ui $$0) {
         super(evp.F, $$0);
      }

      @Override
      public void a(evc $$0, evd $$1, bck $$2) {
         this.a((exq.m)$$0, $$1, $$2, 1, 1);
      }

      public static exq.o a(evd $$0, bck $$1, int $$2, int $$3, int $$4, jh $$5, int $$6) {
         euq $$7 = euq.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new exq.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, exq.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, exq.p.a.a, 1, 1, 7);
         eeb $$7 = dqb.dc.m().b(dye.b, jh.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dqb.eZ.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dqb.eZ.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dqb.eZ.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends evc {
      protected exq.p.a h = exq.p.a.a;

      protected p(evp $$0, int $$1, euq $$2) {
         super($$0, $$1, $$2);
      }

      public p(evp $$0, ui $$1) {
         super($$0, $$1);
         this.h = $$1.<exq.p.a>a("EntryDoor", exq.p.a.e).orElseThrow();
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         $$1.a("EntryDoor", exq.p.a.e, this.h);
      }

      protected void a(dnt $$0, bck $$1, euq $$2, exq.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dqb.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dqb.cZ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dqb.cZ.m().b(dsg.c, eex.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dqb.nJ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dqb.nJ.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.d, true), $$4, $$5, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.d, true), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.b, true).b(dug.d, true), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.b, true).b(dug.d, true), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.b, true).b(dug.d, true), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.b, true), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.fo.m().b(dug.b, true), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dqb.eZ.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.eZ.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dqb.dN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dqb.dN.m().b(dsg.c, eex.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dqb.ec.m().b(dqk.f, jh.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dqb.ec.m().b(dqk.f, jh.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected exq.p.a b(bck $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return exq.p.a.a;
            case 2:
               return exq.p.a.b;
            case 3:
               return exq.p.a.c;
            case 4:
               return exq.p.a.d;
         }
      }

      @Nullable
      protected evc a(exq.m $$0, evd $$1, bck $$2, int $$3, int $$4) {
         jh $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return exq.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return exq.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected evc b(exq.m $$0, evd $$1, bck $$2, int $$3, int $$4) {
         jh $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return exq.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jh.e, this.g());
               case d:
                  return exq.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jh.e, this.g());
               case e:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jh.c, this.g());
               case f:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jh.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected evc c(exq.m $$0, evd $$1, bck $$2, int $$3, int $$4) {
         jh $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return exq.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jh.f, this.g());
               case d:
                  return exq.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jh.f, this.g());
               case e:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jh.d, this.g());
               case f:
                  return exq.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jh.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(euq $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;

         @Deprecated
         public static final Codec<exq.p.a> e = bbi.c(exq.p.a::valueOf);
      }
   }

   public abstract static class q extends exq.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(evp $$0, int $$1, euq $$2) {
         super($$0, $$1, $$2);
      }

      public q(evp $$0, ui $$1) {
         super($$0, $$1);
      }
   }
}
