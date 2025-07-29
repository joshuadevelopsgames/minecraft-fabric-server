import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwk extends crw {
   protected static final alh<Boolean> c = all.a(cwk.class, alj.k);
   static final Predicate<cqz> a = $$0 -> !$$0.n() && $$0.bO() && dcv.a($$0.e(), cwj.a($$0.eb().f(mn.aJ)));
   private static final int b = 0;
   private static final boolean e = false;
   @Nullable
   protected cwj d;
   private int f = 0;
   private boolean ck = false;
   private int cl;

   protected cwk(bzv<? extends cwk> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(1, new cwk.b<>(this));
      this.ch.a(3, new cic<>(this));
      this.ch.a(4, new cwk.d(this, 1.05F, 1));
      this.ch.a(5, new cwk.c(this));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(aub var1, int var2, boolean var3);

   public boolean gT() {
      return this.ck;
   }

   public void A(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   public void e_() {
      if (this.ai() instanceof aub $$0 && this.bO()) {
         cwj $$1 = this.gU();
         if (this.gT()) {
            if ($$1 == null) {
               if (this.ai().ae() % 20L == 0L) {
                  cwj $$2 = $$0.d(this.dx());
                  if ($$2 != null && cwl.a(this)) {
                     $$2.a($$0, $$2.j(), this, null, true);
                  }
               }
            } else {
               cam $$3 = this.e();
               if ($$3 != null && ($$3.ap() == bzv.bU || $$3.ap() == bzv.ar)) {
                  this.bz = 0;
               }
            }
         }
      }

      super.e_();
   }

   @Override
   protected void gL() {
      this.bz += 2;
   }

   @Override
   public void a(byb $$0) {
      if (this.ai() instanceof aub $$1) {
         bzm $$2 = $$0.d();
         cwj $$3 = this.gU();
         if ($$3 != null) {
            if (this.gK()) {
               $$3.c(this.gY());
            }

            if ($$2 != null && $$2.ap() == bzv.bU) {
               $$3.a($$2);
            }

            $$3.a($$1, this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gN() {
      return !this.gX();
   }

   public void a(@Nullable cwj $$0) {
      this.d = $$0;
   }

   @Nullable
   public cwj gU() {
      return this.d;
   }

   public boolean gV() {
      dcv $$0 = this.a(bzw.f);
      boolean $$1 = !$$0.f() && dcv.a($$0, cwj.a(this.eb().f(mn.aJ)));
      boolean $$2 = this.gK();
      return $$1 && $$2;
   }

   public boolean gW() {
      return !(this.ai() instanceof aub $$0) ? false : this.gU() != null || $$0.d(this.dx()) != null;
   }

   public boolean gX() {
      return this.gU() != null && this.gU().r();
   }

   public void b(int $$0) {
      this.f = $$0;
   }

   public int gY() {
      return this.f;
   }

   public boolean gZ() {
      return this.ay.a(c);
   }

   public void B(boolean $$0) {
      this.ay.a(c, $$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Wave", this.f);
      $$0.a("CanJoinRaid", this.ck);
      if (this.d != null && this.ai() instanceof aub $$1) {
         $$1.C().a(this.d).ifPresent($$1x -> $$0.a("RaidId", $$1x));
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.a("Wave", 0);
      this.ck = $$0.a("CanJoinRaid", false);
      if (this.ai() instanceof aub $$1) {
         $$0.e("RaidId").ifPresent($$1x -> {
            this.d = $$1.C().a($$1x);
            if (this.d != null) {
               this.d.a($$1, this.f, this, false);
               if (this.gK()) {
                  this.d.a(this.f, this);
               }
            }
         });
      }
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      dcv $$2 = $$1.e();
      boolean $$3 = this.gX() && this.gU().b(this.gY()) != null;
      if (this.gX() && !$$3 && dcv.a($$2, cwj.a(this.eb().f(mn.aJ)))) {
         bzw $$4 = bzw.f;
         dcv $$5 = this.a($$4);
         double $$6 = this.go().b($$4);
         if (!$$5.f() && Math.max(this.ar.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gU().a(this.gY(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gU() == null ? super.h($$0) : false;
   }

   @Override
   public boolean af() {
      return super.af() || this.gU() != null;
   }

   public int ha() {
      return this.cl;
   }

   public void c(int $$0) {
      this.cl = $$0;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.gX()) {
         this.gU().n();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.A(this.ap() != bzv.bK || $$2 != bzu.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract ayy ag_();

   protected static class a extends chi {
      private final cwk b;
      private final float c;
      public final clc a = clc.b().a(8.0).d().e();

      public a(crc $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         cam $$0 = this.b.ew();
         return this.b.gU() == null && this.b.gP() && this.b.e() != null && !this.b.gy() && ($$0 == null || $$0.ap() != bzv.bU);
      }

      @Override
      public void d() {
         super.d();
         this.b.S().n();

         for (cwk $$1 : a(this.b).a(cwk.class, this.a, this.b, this.b.cV().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.e());
         }
      }

      @Override
      public void e() {
         super.e();
         cam $$0 = this.b.e();
         if ($$0 != null) {
            for (cwk $$2 : a(this.b).a(cwk.class, this.a, this.b, this.b.cV().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         cam $$0 = this.b.e();
         if ($$0 != null) {
            if (this.b.g((bzm)$$0) > this.c) {
               this.b.P().a($$0, 30.0F, 30.0F);
               if (this.b.ar.a(50) == 0) {
                  this.b.X();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends cwk> extends chi {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private faz d;
      @Nullable
      private cqz e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cwk.this.i(cbs.n);

            for (cqz $$3 : this.b.ai().a(cqz.class, this.b.cV().c($$1, 8.0, $$1), cwk.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cwk.this.ai().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  faz $$5 = this.b.S().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cwk.this.ai().ae() + 600L);
               }
            }

            this.c = $$0;
            return false;
         }
      }

      @Override
      public boolean c() {
         if (this.e == null || this.d == null) {
            return false;
         } else if (this.e.dU()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gX()) {
            return true;
         } else if (this.b.gU().a()) {
            return true;
         } else if (!this.b.gH()) {
            return true;
         } else if (dcv.a(this.b.a(bzw.f), cwj.a(this.b.eb().f(mn.aJ)))) {
            return true;
         } else {
            cwk $$0 = cwk.this.d.b(this.b.gY());
            return $$0 != null && $$0.bO();
         }
      }

      @Override
      public void d() {
         this.b.S().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(cwk.this.ai()), this.e);
         }
      }
   }

   public class c extends chi {
      private final cwk b;

      c(final cwk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         cwj $$0 = this.b.gU();
         return this.b.bO() && this.b.e() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.B(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.B(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.be() && this.b.ar.a(this.a(100)) == 0) {
            cwk.this.b(cwk.this.ag_());
         }

         if (!this.b.cc() && this.b.ar.a(this.a(50)) == 0) {
            this.b.R().a();
         }

         super.a();
      }
   }

   static class d extends chi {
      private final cwk a;
      private final double b;
      private jb c;
      private final List<jb> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cwk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.e() == null;
      }

      private boolean h() {
         return this.a.gX() && !this.a.gU().a();
      }

      private boolean i() {
         aub $$0 = (aub)this.a.ai();
         jb $$1 = this.a.dx();
         Optional<jb> $$2 = $$0.B().a($$0x -> $$0x.a(clt.n), this::a, clp.b.c, $$1, 48, this.a.ar);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.S().l() ? false : this.a.e() == null && !this.c.a(this.a.dv(), this.a.ds() + this.e) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dv(), this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.n(0);
         this.a.S().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.S().l()) {
            fis $$0 = fis.c(this.c);
            fis $$1 = clg.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = clg.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.S().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(jb $$0) {
         for (jb $$1 : this.d) {
            if (Objects.equals($$0, $$1)) {
               return false;
            }
         }

         return true;
      }

      private void k() {
         if (this.d.size() > 2) {
            this.d.remove(0);
         }
      }
   }
}
