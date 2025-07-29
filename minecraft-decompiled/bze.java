import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bze extends bzm implements cbk {
   private static final int e = 5;
   private static final alh<Float> f = all.a(bze.class, alj.d);
   private static final alh<Boolean> g = all.a(bze.class, alj.k);
   private static final alh<mc> h = all.a(bze.class, alj.l);
   private static final float i = 32.0F;
   private static final int j = 0;
   private static final int k = 0;
   private static final float l = 0.0F;
   private static final float m = 0.0F;
   private static final float n = 1.0F;
   private static final float o = 0.5F;
   private static final float p = 3.0F;
   public static final float a = 6.0F;
   public static final float b = 0.5F;
   public static final int c = -1;
   public static final int d = 600;
   private static final int q = 20;
   private static final int r = 20;
   private static final lx s = lx.a(me.u, -1);
   @Nullable
   private mc t;
   private der u = der.a;
   private float aM = 1.0F;
   private final Map<bzm, Integer> aN = Maps.newHashMap();
   private int aO = -1;
   private int aP = 20;
   private int aQ = 20;
   private int aR = 0;
   private float aS = 0.0F;
   private float aT = 0.0F;
   @Nullable
   private bzs<cam> aU;

   public bze(bzv<? extends bze> $$0, dmu $$1) {
      super($$0, $$1);
      this.aq = true;
   }

   public bze(dmu $$0, double $$1, double $$2, double $$3) {
      this(bzv.e, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(f, 3.0F);
      $$0.a(g, false);
      $$0.a(h, s);
   }

   public void a(float $$0) {
      if (!this.ai().C) {
         this.au().a(f, bcb.a($$0, 0.0F, 32.0F));
      }
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   public float c() {
      return this.au().a(f);
   }

   public void a(der $$0) {
      this.u = $$0;
      this.q();
   }

   public void a(@Nullable mc $$0) {
      this.t = $$0;
      this.q();
   }

   public void b(float $$0) {
      this.aM = $$0;
   }

   private void q() {
      if (this.t != null) {
         this.ay.a(h, this.t);
      } else {
         int $$0 = baj.f(this.u.b());
         this.ay.a(h, lx.a(s.a(), $$0));
      }
   }

   public void a(byq $$0) {
      this.a(this.u.a($$0));
   }

   public mc e() {
      return this.au().a(h);
   }

   protected void a(boolean $$0) {
      this.au().a(g, $$0);
   }

   public boolean f() {
      return this.au().a(g);
   }

   public int h() {
      return this.aO;
   }

   public void a(int $$0) {
      this.aO = $$0;
   }

   @Override
   public void g() {
      super.g();
      if (this.ai() instanceof aub $$0) {
         this.a($$0);
      } else {
         this.s();
      }
   }

   private void s() {
      boolean $$0 = this.f();
      float $$1 = this.c();
      if (!$$0 || !this.ar.h()) {
         mc $$2 = this.e();
         int $$3;
         float $$4;
         if ($$0) {
            $$3 = 2;
            $$4 = 0.2F;
         } else {
            $$3 = bcb.f((float) Math.PI * $$1 * $$1);
            $$4 = $$1;
         }

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            float $$8 = this.ar.i() * (float) (Math.PI * 2);
            float $$9 = bcb.c(this.ar.i()) * $$4;
            double $$10 = this.dC() + bcb.b($$8) * $$9;
            double $$11 = this.dE();
            double $$12 = this.dI() + bcb.a($$8) * $$9;
            if ($$2.a() == me.u) {
               if ($$0 && this.ar.h()) {
                  this.ai().b(s, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               } else {
                  this.ai().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
               }
            } else if ($$0) {
               this.ai().b($$2, $$10, $$11, $$12, 0.0, 0.0, 0.0);
            } else {
               this.ai().b($$2, $$10, $$11, $$12, (0.5 - this.ar.j()) * 0.15, 0.01F, (0.5 - this.ar.j()) * 0.15);
            }
         }
      }
   }

   private void a(aub $$0) {
      if (this.aO != -1 && this.as - this.aP >= this.aO) {
         this.at();
      } else {
         boolean $$1 = this.f();
         boolean $$2 = this.as < this.aP;
         if ($$1 != $$2) {
            this.a($$2);
         }

         if (!$$2) {
            float $$3 = this.c();
            if (this.aT != 0.0F) {
               $$3 += this.aT;
               if ($$3 < 0.5F) {
                  this.at();
                  return;
               }

               this.a($$3);
            }

            if (this.as % 5 == 0) {
               this.aN.entrySet().removeIf($$0x -> this.as >= (Integer)$$0x.getValue());
               if (!this.u.c()) {
                  this.aN.clear();
               } else {
                  List<byq> $$4 = new ArrayList<>();
                  this.u.a($$4::add, this.aM);
                  List<cam> $$5 = this.ai().a(cam.class, this.cV());
                  if (!$$5.isEmpty()) {
                     for (cam $$6 : $$5) {
                        if (!this.aN.containsKey($$6) && $$6.fS() && !$$4.stream().noneMatch($$6::b)) {
                           double $$7 = $$6.dC() - this.dC();
                           double $$8 = $$6.dI() - this.dI();
                           double $$9 = $$7 * $$7 + $$8 * $$8;
                           if ($$9 <= $$3 * $$3) {
                              this.aN.put($$6, this.as + this.aQ);

                              for (byq $$10 : $$4) {
                                 if ($$10.c().a().a()) {
                                    $$10.c().a().a($$0, this, this.n(), $$6, $$10.e(), 0.5);
                                 } else {
                                    $$6.b(new byq($$10), this);
                                 }
                              }

                              if (this.aS != 0.0F) {
                                 $$3 += this.aS;
                                 if ($$3 < 0.5F) {
                                    this.at();
                                    return;
                                 }

                                 this.a($$3);
                              }

                              if (this.aR != 0 && this.aO != -1) {
                                 this.aO = this.aO + this.aR;
                                 if (this.aO <= 0) {
                                    this.at();
                                    return;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public float i() {
      return this.aS;
   }

   public void c(float $$0) {
      this.aS = $$0;
   }

   public float k() {
      return this.aT;
   }

   public void d(float $$0) {
      this.aT = $$0;
   }

   public int l() {
      return this.aR;
   }

   public void b(int $$0) {
      this.aR = $$0;
   }

   public int m() {
      return this.aP;
   }

   public void c(int $$0) {
      this.aP = $$0;
   }

   public void a(@Nullable cam $$0) {
      this.aU = $$0 != null ? new bzs<>($$0) : null;
   }

   @Nullable
   public cam n() {
      return bzs.a(this.aU, this.ai(), cam.class);
   }

   @Override
   protected void a(fda $$0) {
      this.as = $$0.a("Age", 0);
      this.aO = $$0.a("Duration", -1);
      this.aP = $$0.a("WaitTime", 20);
      this.aQ = $$0.a("ReapplicationDelay", 20);
      this.aR = $$0.a("DurationOnUse", 0);
      this.aS = $$0.a("RadiusOnUse", 0.0F);
      this.aT = $$0.a("RadiusPerTick", 0.0F);
      this.a($$0.a("Radius", 3.0F));
      this.aU = bzs.a($$0, "Owner");
      this.a($$0.<mc>a("custom_particle", me.bk).orElse(null));
      this.a($$0.<der>a("potion_contents", der.c).orElse(der.a));
      this.aM = $$0.a("potion_duration_scale", 1.0F);
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Age", this.as);
      $$0.a("Duration", this.aO);
      $$0.a("WaitTime", this.aP);
      $$0.a("ReapplicationDelay", this.aQ);
      $$0.a("DurationOnUse", this.aR);
      $$0.a("RadiusOnUse", this.aS);
      $$0.a("RadiusPerTick", this.aT);
      $$0.a("Radius", this.c());
      $$0.b("custom_particle", me.bk, this.t);
      bzs.a(this.aU, $$0, "Owner");
      if (!this.u.equals(der.a)) {
         $$0.a("potion_contents", der.c, this.u);
      }

      if (this.aM != 1.0F) {
         $$0.a("potion_duration_scale", this.aM);
      }
   }

   @Override
   public void a(alh<?> $$0) {
      if (f.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public faq k_() {
      return faq.d;
   }

   @Override
   public bzp a(cay $$0) {
      return bzp.b(this.c() * 2.0F, 0.5F);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      if ($$0 == kq.R) {
         return c((kp<T>)$$0, this.u);
      } else {
         return $$0 == kq.S ? c((kp<T>)$$0, this.aM) : super.a($$0);
      }
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.R);
      this.a($$0, kq.S);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.R) {
         this.a(c(kq.R, $$1));
         return true;
      } else if ($$0 == kq.S) {
         this.b(c(kq.S, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
