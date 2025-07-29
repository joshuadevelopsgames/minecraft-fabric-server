import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class ggc extends get {
   protected final ecn a;
   private eco c;
   private final String[] d;
   private final boolean e;
   protected final efp b;
   private int f;
   private int u;
   @Nullable
   private gar v;

   public ggc(ecn $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, xo.c("sign.edit"));
   }

   public ggc(ecn $$0, boolean $$1, boolean $$2, xo $$3) {
      super($$3);
      this.a = $$0;
      this.c = $$0.a($$1);
      this.e = $$1;
      this.b = dxk.a($$0.m().b());
      this.d = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(xo::getString).toArray(String[]::new);
   }

   @Override
   protected void aV_() {
      this.c(fxo.a(xn.d, $$0 -> this.E()).a(this.o / 2 - 100, this.p / 4 + 144, 200, 20).a());
      this.v = new gar(() -> this.d[this.u], this::a, gar.a(this.n), gar.c(this.n), $$0 -> this.n.h.b($$0) <= this.a.c());
   }

   @Override
   public void e() {
      this.f++;
      if (!this.n()) {
         this.E();
      }
   }

   private boolean n() {
      return this.n != null && this.n.t != null && !this.a.n() && !this.a.b(this.n.t.cK());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.u = this.u - 1 & 3;
         this.v.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.u = this.u + 1 & 3;
         this.v.f();
         return true;
      } else {
         return this.v.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.v.a($$0);
      return true;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 40, -1);
      this.e($$0);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }

   @Override
   public void aP_() {
      this.E();
   }

   @Override
   public void aI_() {
      grl $$0 = this.n.M();
      if ($$0 != null) {
         $$0.b(new ajl(this.a.aA_(), this.e, this.d[0], this.d[1], this.d[2], this.d[3]));
      }
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   protected abstract void d(fxb var1);

   protected abstract Vector3f l();

   protected abstract float m();

   private void e(fxb $$0) {
      $$0.e().pushMatrix();
      $$0.e().translate(this.o / 2.0F, this.m());
      $$0.e().pushMatrix();
      this.d($$0);
      $$0.e().popMatrix();
      this.f($$0);
      $$0.e().popMatrix();
   }

   private void f(fxb $$0) {
      Vector3f $$1 = this.l();
      $$0.e().scale($$1.x(), $$1.y());
      int $$2 = this.c.a() ? this.c.b().g() : gzw.a(this.c);
      boolean $$3 = this.f / 6 % 2 == 0;
      int $$4 = this.v.g();
      int $$5 = this.v.h();
      int $$6 = 4 * this.a.a() / 2;
      int $$7 = this.u * this.a.a() - $$6;

      for (int $$8 = 0; $$8 < this.d.length; $$8++) {
         String $$9 = this.d[$$8];
         if ($$9 != null) {
            if (this.q.a()) {
               $$9 = this.q.a($$9);
            }

            int $$10 = -this.q.b($$9) / 2;
            $$0.a(this.q, $$9, $$10, $$8 * this.a.a() - $$6, $$2, false);
            if ($$8 == this.u && $$4 >= 0 && $$3) {
               int $$11 = this.q.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.q.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.q, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.d.length; $$13++) {
         String $$14 = this.d[$$13];
         if ($$14 != null && $$13 == this.u && $$4 >= 0) {
            int $$15 = this.q.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.q.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.a.a(), baj.f($$2));
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.q.b($$14.substring(0, $$17)) - this.q.b($$14) / 2;
               int $$20 = this.q.b($$14.substring(0, $$18)) - this.q.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.d($$21, $$7, $$22, $$7 + this.a.a());
            }
         }
      }
   }

   private void a(String $$0) {
      this.d[this.u] = $$0;
      this.c = this.c.a(this.u, xo.b($$0));
      this.a.a(this.c, this.e);
   }

   private void E() {
      this.n.a(null);
   }
}
