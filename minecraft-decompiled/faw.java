import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class faw extends fbh {
   private final Long2ObjectMap<fbc> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dnh $$0, cao $$1) {
      super.a($$0, $$1);
      this.a.clear();
      $$1.L();
   }

   @Override
   public void b() {
      this.c.N();
      this.a.clear();
      super.b();
   }

   @Override
   public fax a() {
      int $$0;
      if (this.f() && this.c.bm()) {
         $$0 = this.c.dD();
         jb.a $$1 = new jb.a(this.c.dC(), (double)$$0, this.c.dI());

         for (eeb $$2 = this.b.a($$1); $$2.a(dqb.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dC(), (double)(++$$0), this.c.dI());
         }
      } else {
         $$0 = bcb.a(this.c.dE() + 0.5);
      }

      jb $$4 = jb.a(this.c.dC(), (double)$$0, this.c.dI());
      if (!this.a($$4)) {
         for (jb $$5 : this.a(this.c)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(jb $$0) {
      fbc $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public fbg a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(fax[] $$0, fax $$1) {
      int $$2 = 0;
      fax $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      fax $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      fax $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      fax $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      fax $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      fax $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      fax $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      fax $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      fax $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      fax $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      fax $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      fax $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      fax $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      fax $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      fax $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      fax $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      fax $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      fax $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      fax $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      fax $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      fax $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      fax $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      fax $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      fax $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      fax $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      fax $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable fax $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable fax $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected fax a(int $$0, int $$1, int $$2) {
      fax $$3 = null;
      fbc $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == fbc.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected fbc b(int $$0, int $$1, int $$2) {
      return (fbc)this.a.computeIfAbsent(jb.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
      fbc $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == fbc.b && $$2 >= $$0.a().L_() + 1) {
         jb $$5 = new jb($$1, $$2 - 1, $$3);
         fbc $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == fbc.o || $$6 == fbc.i) {
            $$4 = fbc.o;
         } else if ($$6 == fbc.q) {
            $$4 = fbc.q;
         } else if ($$6 == fbc.x) {
            $$4 = fbc.x;
         } else if ($$6 == fbc.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = fbc.h;
            }
         } else {
            $$4 = $$6 != fbc.c && $$6 != fbc.b && $$6 != fbc.j ? fbc.c : fbc.b;
         }
      }

      if ($$4 == fbc.c || $$4 == fbc.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<jb> a(cao $$0) {
      fin $$1 = $$0.cV();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            jb.a($$1.a, (double)$$0.dD(), $$1.c),
            jb.a($$1.a, (double)$$0.dD(), $$1.f),
            jb.a($$1.d, (double)$$0.dD(), $$1.c),
            jb.a($$1.d, (double)$$0.dD(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         fin $$6 = $$1.c($$4, $$5, $$3);
         return jb.a($$0.ec(), 10, bcb.a($$6.a), bcb.a($$6.b), bcb.a($$6.c), bcb.a($$6.d), bcb.a($$6.e), bcb.a($$6.f));
      }
   }
}
