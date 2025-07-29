import com.mojang.logging.LogUtils;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqy extends bzm {
   private static final Logger f = LogUtils.getLogger();
   private static final eeb g = dqb.L.m();
   private static final int h = 0;
   private static final float i = 0.0F;
   private static final int j = 40;
   private static final boolean k = true;
   private static final boolean l = false;
   private eeb m = g;
   public int a = 0;
   public boolean b = true;
   private boolean n = false;
   private boolean o;
   private int p = 40;
   private float q = 0.0F;
   @Nullable
   public ui c;
   public boolean d;
   protected static final alh<jb> e = all.a(cqy.class, alj.o);

   public cqy(bzv<? extends cqy> $$0, dmu $$1) {
      super($$0, $$1);
   }

   private cqy(dmu $$0, double $$1, double $$2, double $$3, eeb $$4) {
      this(bzv.Y, $$0);
      this.m = $$4;
      this.V = true;
      this.a_($$1, $$2, $$3);
      this.i(fis.c);
      this.X = $$1;
      this.Y = $$2;
      this.Z = $$3;
      this.a(this.dx());
   }

   public static cqy a(dmu $$0, jb $$1, eeb $$2) {
      cqy $$3 = new cqy($$0, $$1.u() + 0.5, $$1.v(), $$1.w() + 0.5, $$2.b(eer.I) ? $$2.b(eer.I, false) : $$2);
      $$0.a($$1, $$2.y().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean cF() {
      return false;
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      if (!this.d($$1)) {
         this.bG();
      }

      return false;
   }

   public void a(jb $$0) {
      this.ay.a(e, $$0);
   }

   public jb e() {
      return this.ay.a(e);
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(e, jb.c);
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
      if (this.m.l()) {
         this.at();
      } else {
         dpz $$0 = this.m.b();
         this.a++;
         this.bi();
         this.a(caq.a, this.dA());
         this.aL();
         this.bZ();
         if (this.ai() instanceof aub $$1 && (this.bO() || this.d)) {
            jb $$2 = this.dx();
            boolean $$3 = this.m.b() instanceof drm;
            boolean $$4 = $$3 && this.ai().b_($$2).a(azu.a);
            double $$5 = this.dA().h();
            if ($$3 && $$5 > 1.0) {
               fio $$6 = this.ai().a(new dmb(new fis(this.X, this.Y, this.Z), this.dv(), dmb.a.a, dmb.b.b, this));
               if ($$6.d() != fiq.a.a && this.ai().b_($$6.b()).a(azu.a)) {
                  $$2 = $$6.b();
                  $$4 = true;
               }
            }

            if (!this.aK() && !$$4) {
               if (this.a > 100 && ($$2.v() <= this.ai().L_() || $$2.v() > this.ai().ao()) || this.a > 600) {
                  if (this.b && $$1.P().c(dmq.j)) {
                     this.a($$1, $$0);
                  }

                  this.at();
               }
            } else {
               eeb $$7 = this.ai().a_($$2);
               this.i(this.dA().d(0.7, -0.5, 0.7));
               if (!$$7.a(dqb.ca)) {
                  if (!this.n) {
                     boolean $$8 = $$7.a(new dgp(this.ai(), $$2, jh.a, dcv.l, jh.b));
                     boolean $$9 = dsy.n(this.ai().a_($$2.e())) && (!$$3 || !$$4);
                     boolean $$10 = this.m.a((dmx)this.ai(), $$2) && !$$9;
                     if ($$8 && $$10) {
                        if (this.m.b(eer.I) && this.ai().b_($$2).a() == fam.c) {
                           this.m = this.m.b(eer.I, true);
                        }

                        if (this.ai().a($$2, this.m, 3)) {
                           ((aub)this.ai()).n().a.a(this, new acy($$2, this.ai().a_($$2)));
                           this.at();
                           if ($$0 instanceof dsx) {
                              ((dsx)$$0).a(this.ai(), $$2, this.m, $$7, this);
                           }

                           if (this.c != null && this.m.x()) {
                              eaz $$11 = this.ai().c_($$2);
                              if ($$11 != null) {
                                 try (bci.j $$12 = new bci.j($$11.t(), f)) {
                                    jz $$13 = this.ai().K_();
                                    fcz $$14 = fcz.a($$12, $$13);
                                    $$11.e($$14);
                                    ui $$15 = $$14.b();
                                    this.c.a((BiConsumer<String, vi>)(($$1x, $$2x) -> $$15.a($$1x, $$2x.d())));
                                    $$11.b(fcy.a($$12, $$13, $$15));
                                 } catch (Exception var19) {
                                    f.error("Failed to load block entity from falling block", var19);
                                 }

                                 $$11.e();
                              }
                           }
                        } else if (this.b && $$1.P().c(dmq.j)) {
                           this.at();
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     } else {
                        this.at();
                        if (this.b && $$1.P().c(dmq.j)) {
                           this.a($$0, $$2);
                           this.a($$1, $$0);
                        }
                     }
                  } else {
                     this.at();
                     this.a($$0, $$2);
                  }
               }
            }
         }

         this.i(this.dA().c(0.98));
      }
   }

   public void a(dpz $$0, jb $$1) {
      if ($$0 instanceof dsx) {
         ((dsx)$$0).a(this.ai(), $$1, this);
      }
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      if (!this.o) {
         return false;
      } else {
         int $$3 = bcb.c($$0 - 1.0);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bzm> $$4 = bzt.e.and(bzt.b);
            byb $$6 = this.m.b() instanceof dsx $$5 ? $$5.a(this) : this.ea().a(this);
            float $$7 = Math.min(bcb.d($$3 * this.q), this.p);
            this.ai().a(this, this.cV(), $$4).forEach($$2x -> $$2x.a($$6, $$7));
            boolean $$8 = this.m.a(azo.J);
            if ($$8 && $$7 > 0.0F && this.ar.i() < 0.05F + $$3 * 0.05F) {
               eeb $$9 = doz.e(this.m);
               if ($$9 == null) {
                  this.n = true;
               } else {
                  this.m = $$9;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("BlockState", eeb.a, this.m);
      $$0.a("Time", this.a);
      $$0.a("DropItem", this.b);
      $$0.a("HurtEntities", this.o);
      $$0.a("FallHurtAmount", this.q);
      $$0.a("FallHurtMax", this.p);
      if (this.c != null) {
         $$0.a("TileEntityData", ui.a, this.c);
      }

      $$0.a("CancelDrop", this.n);
   }

   @Override
   protected void a(fda $$0) {
      this.m = $$0.<eeb>a("BlockState", eeb.a).orElse(g);
      this.a = $$0.a("Time", 0);
      boolean $$1 = this.m.a(azo.J);
      this.o = $$0.a("HurtEntities", $$1);
      this.q = $$0.a("FallHurtAmount", 0.0F);
      this.p = $$0.a("FallHurtMax", 40);
      this.b = $$0.a("DropItem", true);
      this.c = $$0.<ui>a("TileEntityData", ui.a).orElse(null);
      this.n = $$0.a("CancelDrop", false);
   }

   public void b(float $$0, int $$1) {
      this.o = true;
      this.q = $$0;
      this.p = $$1;
   }

   public void f() {
      this.n = true;
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public void a(q $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.m.toString());
   }

   public eeb i() {
      return this.m;
   }

   @Override
   protected xo cD() {
      return xo.a("entity.minecraft.falling_block_type", this.m.b().f());
   }

   @Override
   public zw<acq> a(atz $$0) {
      return new acr(this, $$0, dpz.j(this.i()));
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      this.m = dpz.a($$0.p());
      this.V = true;
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      this.a_($$1, $$2, $$3);
      this.a(this.dx());
   }

   @Nullable
   @Override
   public bzm b(fbl $$0) {
      amd<dmu> $$1 = $$0.b().aj();
      amd<dmu> $$2 = this.ai().aj();
      boolean $$3 = ($$2 == dmu.k || $$1 == dmu.k) && $$2 != $$1;
      bzm $$4 = super.b($$0);
      this.d = $$4 != null && $$3;
      return $$4;
   }
}
