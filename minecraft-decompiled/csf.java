import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class csf extends crc {
   private static final alh<Byte> a = all.a(csf.class, alj.a);
   private static final int e = 0;
   protected int b = 0;
   private csf.a f = csf.a.a;

   protected csf(bzv<? extends csf> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b = $$0.a("SpellTicks", 0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public crc.a l() {
      if (this.gQ()) {
         return crc.a.c;
      } else {
         return this.gZ() ? crc.a.g : crc.a.a;
      }
   }

   public boolean gQ() {
      return this.ai().C ? this.ay.a(a) > 0 : this.b > 0;
   }

   public void a(csf.a $$0) {
      this.f = $$0;
      this.ay.a(a, (byte)$$0.h);
   }

   protected csf.a gR() {
      return !this.ai().C ? this.f : csf.a.a(this.ay.a(a));
   }

   @Override
   protected void a(aub $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C && this.gQ()) {
         csf.a $$0 = this.gR();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.br * (float) (Math.PI / 180.0) + bcb.b(this.as * 0.6662F) * 0.25F;
         float $$5 = bcb.b($$4);
         float $$6 = bcb.a($$4);
         double $$7 = 0.6 * this.eq();
         double $$8 = 1.8 * this.eq();
         this.ai().a(lx.a(me.u, $$1, $$2, $$3), this.dC() + $$5 * $$7, this.dE() + $$8, this.dI() + $$6 * $$7, 0.0, 0.0, 0.0);
         this.ai().a(lx.a(me.u, $$1, $$2, $$3), this.dC() - $$5 * $$7, this.dE() + $$8, this.dI() - $$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gS() {
      return this.b;
   }

   protected abstract ayy t();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<csf.a> g = baq.a($$0 -> $$0.h, values(), baq.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static csf.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends chi {
      public b() {
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         return csf.this.gS() > 0;
      }

      @Override
      public void d() {
         super.d();
         csf.this.cg.n();
      }

      @Override
      public void e() {
         super.e();
         csf.this.a(csf.a.a);
      }

      @Override
      public void a() {
         if (csf.this.e() != null) {
            csf.this.P().a(csf.this.e(), csf.this.gh(), csf.this.gg());
         }
      }
   }

   protected abstract class c extends chi {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         cam $$0 = csf.this.e();
         if ($$0 == null || !$$0.bO()) {
            return false;
         } else {
            return csf.this.gQ() ? false : csf.this.as >= this.c;
         }
      }

      @Override
      public boolean c() {
         cam $$0 = csf.this.e();
         return $$0 != null && $$0.bO() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         csf.this.b = this.h();
         this.c = csf.this.as + this.i();
         ayy $$0 = this.l();
         if ($$0 != null) {
            csf.this.a($$0, 1.0F, 1.0F);
         }

         csf.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            csf.this.a(csf.this.t(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ayy l();

      protected abstract csf.a m();
   }
}
