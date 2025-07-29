import java.util.Optional;
import javax.annotation.Nullable;

public class cra extends bzm implements cbk {
   private static final alh<Integer> b = all.a(cra.class, alj.b);
   private static final alh<eeb> c = all.a(cra.class, alj.i);
   private static final short d = 80;
   private static final float e = 4.0F;
   private static final eeb f = dqb.cu.m();
   private static final String g = "block_state";
   public static final String a = "fuse";
   private static final String h = "explosion_power";
   private static final dmo i = new dmo() {
      @Override
      public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
         return $$3.a(dqb.eu) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4) {
         return $$3.a(dqb.eu) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bzs<cam> j;
   private boolean k;
   private float l = 4.0F;

   public cra(bzv<? extends cra> $$0, dmu $$1) {
      super($$0, $$1);
      this.V = true;
   }

   public cra(dmu $$0, double $$1, double $$2, double $$3, @Nullable cam $$4) {
      this(bzv.by, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.X = $$1;
      this.Y = $$2;
      this.Z = $$3;
      this.j = $$4 != null ? new bzs<>($$4) : null;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, f);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   public boolean bK() {
      return !this.dU();
   }

   @Override
   protected double bg() {
      return 0.04;
   }

   @Override
   public void g() {
      this.bZ();
      this.bi();
      this.a(caq.a, this.dA());
      this.aL();
      this.i(this.dA().c(0.98));
      if (this.aK()) {
         this.i(this.dA().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.f() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.ai().C) {
            this.l();
         }
      } else {
         this.bt();
         if (this.ai().C) {
            this.ai().a(me.ah, this.dC(), this.dE() + 0.5, this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void l() {
      if (this.ai() instanceof aub $$0 && $$0.P().c(dmq.ad)) {
         this.ai().a(this, dmn.a(this.ai(), this), this.k ? i : null, this.dC(), this.e(0.0625), this.dI(), this.l, false, dmu.a.d);
      }
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("fuse", (short)this.f());
      $$0.a("block_state", eeb.a, this.i());
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }

      bzs.a(this.j, $$0, "owner");
   }

   @Override
   protected void a(fda $$0) {
      this.b($$0.a("fuse", (short)80));
      this.c($$0.<eeb>a("block_state", eeb.a).orElse(f));
      this.l = bcb.a($$0.a("explosion_power", 4.0F), 0.0F, 128.0F);
      this.j = bzs.a($$0, "owner");
   }

   @Nullable
   public cam e() {
      return bzs.a(this.j, this.ai(), cam.class);
   }

   @Override
   public void y(bzm $$0) {
      super.y($$0);
      if ($$0 instanceof cra $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.ay.a(b, $$0);
   }

   public int f() {
      return this.ay.a(b);
   }

   public void c(eeb $$0) {
      this.ay.a(c, $$0);
   }

   public eeb i() {
      return this.ay.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bzm b(fbl $$0) {
      bzm $$1 = super.b($$0);
      if ($$1 instanceof cra $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }
}
