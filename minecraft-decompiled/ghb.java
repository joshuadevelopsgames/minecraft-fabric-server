import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ghb extends ggb<czp> {
   private float E;
   private float F;
   private boolean G;
   private final ggt H;

   public ghb(cut $$0) {
      super($$0.cm, new gjf($$0.cm), $$0.gs(), xo.c("container.crafting"));
      this.f = 97;
      this.H = new ggt(this);
   }

   @Override
   public void m() {
      super.m();
      if (this.n.t.gc()) {
         this.n.a(new ggq(this.n.t, this.n.t.j.A(), this.n.n.M().c()));
      }
   }

   @Override
   protected void aV_() {
      if (this.n.t.gc()) {
         this.n.a(new ggq(this.n.t, this.n.t.j.A(), this.n.n.M().c()));
      } else {
         super.aV_();
      }
   }

   @Override
   protected gcc E() {
      return new gcc(this.A + 104, this.p / 2 - 22);
   }

   @Override
   protected void F() {
      this.G = true;
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2) {
      $$0.a(this.q, this.m, this.f, this.u, -12566464, false);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      this.H.a($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
      this.H.b($$0, $$1, $$2);
      this.E = $$1;
      this.F = $$2;
   }

   @Override
   public boolean C() {
      return this.H.a();
   }

   @Override
   protected boolean G() {
      return false;
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(gxx.ar, a, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.E, this.F, this.n.t);
   }

   public static void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, cam $$9) {
      float $$10 = ($$1 + $$3) / 2.0F;
      float $$11 = ($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan(($$10 - $$7) / 40.0F);
      float $$13 = (float)Math.atan(($$11 - $$8) / 40.0F);
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.br;
      float $$17 = $$9.dP();
      float $$18 = $$9.dR();
      float $$19 = $$9.bu;
      float $$20 = $$9.bt;
      $$9.br = 180.0F + $$12 * 20.0F;
      $$9.v(180.0F + $$12 * 40.0F);
      $$9.w(-$$13 * 20.0F);
      $$9.bt = $$9.dP();
      $$9.bu = $$9.dP();
      float $$21 = $$9.eq();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dt() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = $$5 / $$21;
      a($$0, $$1, $$2, $$3, $$4, $$23, $$22, $$14, $$15, $$9);
      $$9.br = $$16;
      $$9.v($$17);
      $$9.w($$18);
      $$9.bu = $$19;
      $$9.bt = $$20;
      $$0.f();
   }

   public static void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Vector3f $$6, Quaternionf $$7, @Nullable Quaternionf $$8, cam $$9) {
      hec $$10 = fue.R().ar();
      hed<? super cam, ?> $$11 = $$10.a($$9);
      hkn $$12 = $$11.b($$9, 1.0F);
      $$12.H = null;
      $$0.a($$12, $$5, $$6, $$7, $$8, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.G) {
         this.G = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }
}
