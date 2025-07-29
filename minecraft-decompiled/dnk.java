import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dnk implements dmn {
   private static final dmo a = new dmo();
   private static final int b = 16;
   private static final float c = 2.0F;
   private final boolean d;
   private final dmn.a e;
   private final aub f;
   private final fis g;
   @Nullable
   private final bzm h;
   private final float i;
   private final byb j;
   private final dmo k;
   private final Map<cut, fis> l = new HashMap<>();

   public dnk(aub $$0, @Nullable bzm $$1, @Nullable byb $$2, @Nullable dmo $$3, fis $$4, float $$5, boolean $$6, dmn.a $$7) {
      this.f = $$0;
      this.h = $$1;
      this.i = $$5;
      this.g = $$4;
      this.d = $$6;
      this.e = $$7;
      this.j = $$2 == null ? $$0.al().a(this) : $$2;
      this.k = $$3 == null ? this.b($$1) : $$3;
   }

   private dmo b(@Nullable bzm $$0) {
      return (dmo)($$0 == null ? a : new dml($$0));
   }

   public static float a(fis $$0, bzm $$1) {
      fin $$2 = $$1.cV();
      double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
      double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
      double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
      double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
      double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
      if (!($$3 < 0.0) && !($$4 < 0.0) && !($$5 < 0.0)) {
         int $$8 = 0;
         int $$9 = 0;

         for (double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for (double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
               for (double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                  double $$13 = bcb.d($$10, $$2.a, $$2.d);
                  double $$14 = bcb.d($$11, $$2.b, $$2.e);
                  double $$15 = bcb.d($$12, $$2.c, $$2.f);
                  fis $$16 = new fis($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.ai().a(new dmb($$16, $$0, dmb.a.a, dmb.b.a, $$1)).d() == fiq.a.a) {
                     $$8++;
                  }

                  $$9++;
               }
            }
         }

         return (float)$$8 / $$9;
      } else {
         return 0.0F;
      }
   }

   @Override
   public float e() {
      return this.i;
   }

   @Override
   public fis f() {
      return this.g;
   }

   private List<jb> m() {
      Set<jb> $$0 = new HashSet<>();
      int $$1 = 16;

      for (int $$2 = 0; $$2 < 16; $$2++) {
         for (int $$3 = 0; $$3 < 16; $$3++) {
            for (int $$4 = 0; $$4 < 16; $$4++) {
               if ($$2 == 0 || $$2 == 15 || $$3 == 0 || $$3 == 15 || $$4 == 0 || $$4 == 15) {
                  double $$5 = $$2 / 15.0F * 2.0F - 1.0F;
                  double $$6 = $$3 / 15.0F * 2.0F - 1.0F;
                  double $$7 = $$4 / 15.0F * 2.0F - 1.0F;
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  float $$9 = this.i * (0.7F + this.f.A.i() * 0.6F);
                  double $$10 = this.g.d;
                  double $$11 = this.g.e;
                  double $$12 = this.g.f;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     jb $$14 = jb.a($$10, $$11, $$12);
                     eeb $$15 = this.f.a_($$14);
                     fal $$16 = this.f.b_($$14);
                     if (!this.f.k($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.k.a(this, this.f, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.k.a(this, this.f, $$14, $$15, $$9)) {
                        $$0.add($$14);
                     }

                     $$10 += $$5 * 0.3F;
                     $$11 += $$6 * 0.3F;
                     $$12 += $$7 * 0.3F;
                  }
               }
            }
         }
      }

      return new ObjectArrayList($$0);
   }

   private void n() {
      float $$0 = this.i * 2.0F;
      int $$1 = bcb.a(this.g.d - $$0 - 1.0);
      int $$2 = bcb.a(this.g.d + $$0 + 1.0);
      int $$3 = bcb.a(this.g.e - $$0 - 1.0);
      int $$4 = bcb.a(this.g.e + $$0 + 1.0);
      int $$5 = bcb.a(this.g.f - $$0 - 1.0);
      int $$6 = bcb.a(this.g.f + $$0 + 1.0);

      for (bzm $$8 : this.f.a_(this.h, new fin($$1, $$3, $$5, $$2, $$4, $$6))) {
         if (!$$8.a(this)) {
            double $$9 = Math.sqrt($$8.g(this.g)) / $$0;
            if ($$9 <= 1.0) {
               double $$10 = $$8.dC() - this.g.d;
               double $$11 = ($$8 instanceof cra ? $$8.dE() : $$8.dG()) - this.g.e;
               double $$12 = $$8.dI() - this.g.f;
               double $$13 = Math.sqrt($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
               if ($$13 != 0.0) {
                  $$10 /= $$13;
                  $$11 /= $$13;
                  $$12 /= $$13;
                  boolean $$14 = this.k.a(this, $$8);
                  float $$15 = this.k.a($$8);
                  float $$16 = !$$14 && $$15 == 0.0F ? 0.0F : a(this.g, $$8);
                  if ($$14) {
                     $$8.a(this.f, this.j, this.k.a(this, $$8, $$16));
                  }

                  double $$17 = (1.0 - $$9) * $$16 * $$15;
                  double $$19;
                  if ($$8 instanceof cam $$18) {
                     $$19 = $$17 * (1.0 - $$18.i(cbs.j));
                  } else {
                     $$19 = $$17;
                  }

                  $$10 *= $$19;
                  $$11 *= $$19;
                  $$12 *= $$19;
                  fis $$21 = new fis($$10, $$11, $$12);
                  $$8.h($$21);
                  if ($$8 instanceof cut $$22 && !$$22.am() && (!$$22.gI() || !$$22.gt().b)) {
                     this.l.put($$22, $$21);
                  }

                  $$8.a(this.h);
               }
            }
         }
      }
   }

   private void a(List<jb> $$0) {
      List<dnk.a> $$1 = new ArrayList<>();
      ag.c($$0, this.f.A);

      for (jb $$2 : $$0) {
         this.f.a_($$2).a(this.f, $$2, this, ($$1x, $$2x) -> a($$1, $$1x, $$2x));
      }

      for (dnk.a $$3 : $$1) {
         dpz.a(this.f, $$3.a, $$3.b);
      }
   }

   private void b(List<jb> $$0) {
      for (jb $$1 : $$0) {
         if (this.f.A.a(3) == 0 && this.f.a_($$1).l() && this.f.a_($$1.e()).s()) {
            this.f.c($$1, dpm.a(this.f, $$1));
         }
      }
   }

   public void i() {
      this.f.a(this.h, ejb.w, this.g);
      List<jb> $$0 = this.m();
      this.n();
      if (this.o()) {
         btt $$1 = bts.a();
         $$1.a("explosion_blocks");
         this.a($$0);
         $$1.c();
      }

      if (this.d) {
         this.b($$0);
      }
   }

   private static void a(List<dnk.a> $$0, dcv $$1, jb $$2) {
      for (dnk.a $$3 : $$0) {
         $$3.a($$1);
         if ($$1.f()) {
            return;
         }
      }

      $$0.add(new dnk.a($$2, $$1));
   }

   private boolean o() {
      return this.e != dmn.a.a;
   }

   public Map<cut, fis> j() {
      return this.l;
   }

   @Override
   public aub a() {
      return this.f;
   }

   @Nullable
   @Override
   public cam c() {
      return dmn.a(this.h);
   }

   @Nullable
   @Override
   public bzm d() {
      return this.h;
   }

   public byb k() {
      return this.j;
   }

   @Override
   public dmn.a b() {
      return this.e;
   }

   @Override
   public boolean g() {
      if (this.e != dmn.a.d) {
         return false;
      } else {
         return this.h != null && this.h.ap() == bzv.t ? this.f.P().c(dmq.d) : true;
      }
   }

   @Override
   public boolean h() {
      boolean $$0 = this.f.P().c(dmq.d);
      boolean $$1 = this.h == null || this.h.ap() != bzv.t && this.h.ap() != bzv.bJ;
      return $$0 ? $$1 : this.e.a() && $$1;
   }

   public boolean l() {
      return this.i < 2.0F || !this.o();
   }

   static class a {
      final jb a;
      dcv b;

      a(jb $$0, dcv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dcv $$0) {
         if (cqz.a(this.b, $$0)) {
            this.b = cqz.a(this.b, $$0, 16);
         }
      }
   }
}
