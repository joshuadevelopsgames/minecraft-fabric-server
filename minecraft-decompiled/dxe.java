import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dxe extends dvh implements dwy {
   public static final MapCodec<dxe> e = b(dxe::new);
   private final dvi f = new dvi(new dxe.a(dvi.a));
   private final dvi g = new dvi(new dxe.a(dvi.e.a));

   @Override
   public MapCodec<dxe> a() {
      return e;
   }

   public dxe(eea.d $$0) {
      super($$0);
   }

   @Override
   public dvi c() {
      return this.f;
   }

   public dvi q() {
      return this.g;
   }

   public static boolean a(dmv $$0, jb $$1, eeb $$2, Collection<jh> $$3) {
      boolean $$4 = false;
      eeb $$5 = dqb.rC.m();

      for (jh $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), true);
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(dvg.c, true);
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dmv $$0, eeb $$1, jb $$2, bck $$3) {
      if ($$1.a(this)) {
         for (jh $$4 : d) {
            ees $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dqb.rB)) {
               $$1 = $$1.b($$5, false);
            }
         }

         if (!q($$1)) {
            fal $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dqb.a : dqb.J).m();
         }

         $$0.a($$2, $$1, 3);
         dwy.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dxd.a $$0, dmv $$1, jb $$2, bck $$3, dxd $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? bcb.d($$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dxd $$0, dmv $$1, jb $$2, bck $$3) {
      eeb $$4 = $$1.a_($$2);
      bae<dpz> $$5 = $$0.c();

      for (jh $$6 : jh.a($$3)) {
         if (a($$4, $$6)) {
            jb $$7 = $$2.a($$6);
            eeb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               eeb $$9 = dqb.rB.m();
               $$1.a($$7, $$9, 3);
               dpz.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, ayz.xh, aza.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jh $$10 = $$6.g();

               for (jh $$11 : d) {
                  if ($$11 != $$10) {
                     jb $$12 = $$7.a($$11);
                     eeb $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(dmv $$0, eeb $$1, jb $$2) {
      if (!$$1.a(dqb.rC)) {
         return false;
      } else {
         for (jh $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(azo.bX)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dvi.a {
      private final dvi.e[] b;

      public a(final dvi.e... $$0) {
         super(dxe.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dly $$0, jb $$1, jb $$2, jh $$3, eeb $$4) {
         eeb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dqb.rB) && !$$5.a(dqb.rD) && !$$5.a(dqb.ca)) {
            if ($$1.k($$2) == 2) {
               jb $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            fal $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(fam.c)) {
               return false;
            } else {
               return $$4.a(azo.aQ) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dvi.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(eeb $$0) {
         return !$$0.a(dqb.rC);
      }
   }
}
