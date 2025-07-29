import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dlu {
   private static final Logger a = LogUtils.getLogger();
   public static final String b = "SpawnData";
   private static final int c = 1;
   private static final int d = 20;
   private static final int e = 200;
   private static final int f = 800;
   private static final int g = 4;
   private static final int h = 6;
   private static final int i = 16;
   private static final int j = 4;
   private int k = 20;
   private bvt<dno> l = bvt.a();
   @Nullable
   private dno m;
   private double n;
   private double o;
   private int p = 200;
   private int q = 800;
   private int r = 4;
   @Nullable
   private bzm s;
   private int t = 6;
   private int u = 16;
   private int v = 4;

   public void a(bzv<?> $$0, @Nullable dmu $$1, bck $$2, jb $$3) {
      this.a($$1, $$2, $$3).a().a("id", mm.f.b($$0).toString());
   }

   private boolean c(dmu $$0, jb $$1) {
      return $$0.a($$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, this.u);
   }

   public void a(dmu $$0, jb $$1) {
      if (!this.c($$0, $$1)) {
         this.o = this.n;
      } else if (this.s != null) {
         bck $$2 = $$0.H_();
         double $$3 = $$1.u() + $$2.j();
         double $$4 = $$1.v() + $$2.j();
         double $$5 = $$1.w() + $$2.j();
         $$0.a(me.ah, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(me.F, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.k > 0) {
            this.k--;
         }

         this.o = this.n;
         this.n = (this.n + 1000.0F / (this.k + 200.0F)) % 360.0;
      }
   }

   public void a(aub $$0, jb $$1) {
      if (this.c($$0, $$1)) {
         if (this.k == -1) {
            this.d($$0, $$1);
         }

         if (this.k > 0) {
            this.k--;
         } else {
            boolean $$2 = false;
            bck $$3 = $$0.H_();
            dno $$4 = this.a($$0, $$3, $$1);

            for (int $$5 = 0; $$5 < this.r; $$5++) {
               try (bci.j $$6 = new bci.j(this::toString, a)) {
                  fda $$7 = fcy.a($$6, $$0.K_(), $$4.a());
                  Optional<bzv<?>> $$8 = bzv.a($$7);
                  if ($$8.isEmpty()) {
                     this.d($$0, $$1);
                     return;
                  }

                  fis $$9 = $$7.<fis>a("Pos", fis.a)
                     .orElseGet(
                        () -> new fis($$1.u() + ($$3.j() - $$3.j()) * this.v + 0.5, $$1.v() + $$3.a(3) - 1, $$1.w() + ($$3.j() - $$3.j()) * this.v + 0.5)
                     );
                  if ($$0.b($$8.get().a($$9.d, $$9.e, $$9.f))) {
                     jb $$10 = jb.a((jv)$$9);
                     if ($$4.b().isPresent()) {
                        if (!$$8.get().f().d() && $$0.an() == bxg.a) {
                           continue;
                        }

                        dno.a $$11 = $$4.b().get();
                        if (!$$11.a($$10, $$0)) {
                           continue;
                        }
                     } else if (!cbh.a($$8.get(), $$0, bzu.c, $$10, $$0.H_())) {
                        continue;
                     }

                     bzm $$12 = bzv.a($$7, $$0, bzu.c, $$1x -> {
                        $$1x.b($$9.d, $$9.e, $$9.f, $$1x.dP(), $$1x.dR());
                        return $$1x;
                     });
                     if ($$12 == null) {
                        this.d($$0, $$1);
                        return;
                     }

                     int $$13 = $$0.a(ein.b($$12.getClass()), new fin($$1.u(), $$1.v(), $$1.w(), $$1.u() + 1, $$1.v() + 1, $$1.w() + 1).g(this.v), bzt.f)
                        .size();
                     if ($$13 >= this.t) {
                        this.d($$0, $$1);
                        return;
                     }

                     $$12.b($$12.dC(), $$12.dE(), $$12.dI(), $$3.i() * 360.0F, 0.0F);
                     if ($$12 instanceof cao $$14) {
                        if ($$4.b().isEmpty() && !$$14.a($$0, bzu.c) || !$$14.a((dmx)$$0)) {
                           continue;
                        }

                        boolean $$15 = $$4.a().i() == 1 && $$4.a().i("id").isPresent();
                        if ($$15) {
                           ((cao)$$12).a($$0, $$0.d_($$12.dx()), bzu.c, null);
                        }

                        $$4.c().ifPresent($$14::a);
                     }

                     if (!$$0.e($$12)) {
                        this.d($$0, $$1);
                        return;
                     }

                     $$0.c(2004, $$1, 0);
                     $$0.a($$12, ejb.t, $$10);
                     if ($$12 instanceof cao) {
                        ((cao)$$12).Y();
                     }

                     $$2 = true;
                  }
               }
            }

            if ($$2) {
               this.d($$0, $$1);
            }

            return;
         }
      }
   }

   private void d(dmu $$0, jb $$1) {
      bck $$2 = $$0.A;
      if (this.q <= this.p) {
         this.k = this.p;
      } else {
         this.k = this.p + $$2.a(this.q - this.p);
      }

      this.l.a($$2).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable dmu $$0, jb $$1, fda $$2) {
      this.k = $$2.a("Delay", (short)20);
      $$2.<dno>a("SpawnData", dno.b).ifPresent($$2x -> this.a($$0, $$1, $$2x));
      this.l = $$2.<bvt<dno>>a("SpawnPotentials", dno.c).orElseGet(() -> bvt.a(this.m != null ? this.m : new dno()));
      this.p = $$2.a("MinSpawnDelay", 200);
      this.q = $$2.a("MaxSpawnDelay", 800);
      this.r = $$2.a("SpawnCount", 4);
      this.t = $$2.a("MaxNearbyEntities", 6);
      this.u = $$2.a("RequiredPlayerRange", 16);
      this.v = $$2.a("SpawnRange", 4);
      this.s = null;
   }

   public void a(fdc $$0) {
      $$0.a("Delay", (short)this.k);
      $$0.a("MinSpawnDelay", (short)this.p);
      $$0.a("MaxSpawnDelay", (short)this.q);
      $$0.a("SpawnCount", (short)this.r);
      $$0.a("MaxNearbyEntities", (short)this.t);
      $$0.a("RequiredPlayerRange", (short)this.u);
      $$0.a("SpawnRange", (short)this.v);
      $$0.b("SpawnData", dno.b, this.m);
      $$0.a("SpawnPotentials", dno.c, this.l);
   }

   @Nullable
   public bzm b(dmu $$0, jb $$1) {
      if (this.s == null) {
         ui $$2 = this.a($$0, $$0.H_(), $$1).a();
         if ($$2.i("id").isEmpty()) {
            return null;
         }

         this.s = bzv.a($$2, $$0, bzu.c, Function.identity());
         if ($$2.i() == 1 && this.s instanceof cao) {
         }
      }

      return this.s;
   }

   public boolean a(dmu $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.C) {
            this.k = this.p;
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(@Nullable dmu $$0, jb $$1, dno $$2) {
      this.m = $$2;
   }

   private dno a(@Nullable dmu $$0, bck $$1, jb $$2) {
      if (this.m != null) {
         return this.m;
      } else {
         this.a($$0, $$2, this.l.a($$1).orElseGet(dno::new));
         return this.m;
      }
   }

   public abstract void a(dmu var1, jb var2, int var3);

   public double a() {
      return this.n;
   }

   public double b() {
      return this.o;
   }
}
