import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class ebp extends eaz {
   private static final int b = 32;
   public static final int a = 32;
   private static final int c = 34;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 5;
   private static final int g = 20;
   private static final int h = 5;
   private static final int i = 100;
   private static final int j = 10;
   private static final int k = 10;
   private static final int l = 50;
   private static final int m = 2;
   private static final int q = 64;
   private static final int r = 30;
   private static final Optional<csz> s = Optional.empty();
   @Nullable
   private Either<csz, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fis x;
   private int y;

   public ebp(jb $$0, eeb $$1) {
      super(ebb.k, $$0, $$1);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebp $$3) {
      $$3.u++;
      if ($$0 instanceof aub $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dqb.cE);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.u().ifPresent($$1x -> $$3.x = $$1x.cV().f());
               fis $$7 = fis.b($$1);
               float $$8 = 0.2F + 0.8F * (100 - $$3.w) / 100.0F;
               fis $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               jb $$10 = jb.a((jv)$$9);
               float $$11 = $$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, ayz.gA, aza.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            eeb $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(drv.c) == eev.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(drv.c) == eev.c) {
                  if ($$0.an() != bxg.a) {
                     if ($$4.P().c(dmq.f)) {
                        cut $$15 = $$0.a($$1.u(), $$1.v(), $$1.w(), 32.0, false);
                        if ($$15 != null) {
                           csz $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(ayz.gu);
                              $$0.a(null, $$3.aA_(), ayz.gE, aza.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<csz> $$13 = $$3.u();
               if ($$13.isPresent()) {
                  csz $$14 = $$13.get();
                  if (!drv.a($$0) && !$$14.gq() || $$3.j() > 34.0 || $$14.gH()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static eeb a(dmu $$0, eeb $$1, jb $$2, ebp $$3) {
      if (!drv.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(drv.c, eev.a);
      } else {
         boolean $$4 = drv.a($$0);
         return $$1.b(drv.c, $$4 ? eev.c : eev.b);
      }
   }

   private double j() {
      return this.u().map($$0 -> Math.sqrt($$0.g(fis.c(this.aA_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(csz $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<csz> u() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            csz $$0 = (csz)this.t.left().get();
            if (!$$0.dU()) {
               return Optional.of($$0);
            }

            this.a($$0.cK());
         }

         if (this.n instanceof aub $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof csz $$4) {
               this.a($$4);
               return Optional.of($$4);
            } else {
               if (this.u >= 30L) {
                  this.k();
               }

               return s;
            }
         } else {
            return s;
         }
      }
   }

   @Nullable
   private static csz a(aub $$0, ebp $$1) {
      jb $$2 = $$1.aA_();
      Optional<csz> $$3 = bcw.a(bzv.E, bzu.c, $$0, $$2, 5, 16, 8, bcw.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         csz $$4 = $$3.get();
         $$0.a($$4, ejb.t, $$4.dv());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public void c() {
      if (this.u().orElse(null) instanceof csz $$0) {
         if (this.n instanceof aub $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(drv.c) == eev.c) {
                  int $$4 = this.n.H_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.v().ifPresent($$0x -> {
                        this.n.a(null, $$0x, ayz.zn, aza.e, 1.0F, 1.0F);
                        this.n.a(ejb.i, $$0x, ejb.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cV().f();
            }
         }
      }
   }

   private Optional<jb> v() {
      Mutable<jb> $$0 = new MutableObject(null);
      jb.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jh $$2 : ag.b(jh.values(), this.n.A)) {
            jb $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(azo.s)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(azo.s)) {
            return jb.b.a;
         } else {
            for (jh $$2 : ag.b(jh.values(), this.n.A)) {
               jb $$3 = $$1.a($$2);
               eeb $$4 = this.n.a_($$3);
               jh $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dqb.fz.m();
               } else if ($$4.a(dqb.J) && $$4.y().b()) {
                  $$4 = dqb.fz.m().b(dvg.c, true);
               }

               if ($$4.a(dqb.fz) && !dvg.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dvg.b($$5), true), 3);
                  $$0.setValue($$3);
                  return jb.b.c;
               }
            }

            return jb.b.a;
         }
      });
      return Optional.ofNullable((jb)$$0.getValue());
   }

   private void a(aub $$0, int $$1, boolean $$2) {
      if (this.u().orElse(null) instanceof csz $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         bck $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < $$1; $$7++) {
            fin $$8 = $$3.cV();
            fis $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fis $$10 = fis.a(this.aA_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fis $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            mj $$12 = new mj($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      this.a(null);
   }

   public void a(@Nullable byb $$0) {
      if (this.u().orElse(null) instanceof csz $$1) {
         if ($$0 == null) {
            $$1.t();
         } else {
            $$1.j($$0);
            $$1.gJ();
            $$1.x(0.0F);
         }

         this.k();
      }
   }

   public boolean b(csz $$0) {
      return this.u().map($$1 -> $$1 == $$0).orElse(false);
   }

   public int d() {
      return this.y;
   }

   public int f() {
      if (this.t != null && !this.u().isEmpty()) {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      } else {
         return 0;
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      $$0.<UUID>a("creaking", kf.a).ifPresentOrElse(this::a, this::k);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (this.t != null) {
         $$0.a("creaking", kf.a, (UUID)this.t.map(bzm::cK, $$0x -> $$0x));
      }
   }
}
