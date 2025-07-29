import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.tuple.Pair;

public class fxa {
   private static final ame c = ame.b("hud/crosshair");
   private static final ame d = ame.b("hud/crosshair_attack_indicator_full");
   private static final ame e = ame.b("hud/crosshair_attack_indicator_background");
   private static final ame f = ame.b("hud/crosshair_attack_indicator_progress");
   private static final ame g = ame.b("hud/effect_background_ambient");
   private static final ame h = ame.b("hud/effect_background");
   private static final ame i = ame.b("hud/hotbar");
   private static final ame j = ame.b("hud/hotbar_selection");
   private static final ame k = ame.b("hud/hotbar_offhand_left");
   private static final ame l = ame.b("hud/hotbar_offhand_right");
   private static final ame m = ame.b("hud/hotbar_attack_indicator_background");
   private static final ame n = ame.b("hud/hotbar_attack_indicator_progress");
   private static final ame o = ame.b("hud/armor_empty");
   private static final ame p = ame.b("hud/armor_half");
   private static final ame q = ame.b("hud/armor_full");
   private static final ame r = ame.b("hud/food_empty_hunger");
   private static final ame s = ame.b("hud/food_half_hunger");
   private static final ame t = ame.b("hud/food_full_hunger");
   private static final ame u = ame.b("hud/food_empty");
   private static final ame v = ame.b("hud/food_half");
   private static final ame w = ame.b("hud/food_full");
   private static final ame x = ame.b("hud/air");
   private static final ame y = ame.b("hud/air_bursting");
   private static final ame z = ame.b("hud/air_empty");
   private static final ame A = ame.b("hud/heart/vehicle_container");
   private static final ame B = ame.b("hud/heart/vehicle_full");
   private static final ame C = ame.b("hud/heart/vehicle_half");
   private static final ame D = ame.b("textures/misc/vignette.png");
   public static final ame a = ame.b("textures/misc/nausea.png");
   private static final ame E = ame.b("textures/misc/spyglass_scope.png");
   private static final ame F = ame.b("textures/misc/powder_snow_outline.png");
   private static final Comparator<fjq> G = Comparator.comparing(fjq::d).reversed().thenComparing(fjq::c, String.CASE_INSENSITIVE_ORDER);
   private static final xo H = xo.c("demo.demoExpired");
   private static final xo I = xo.c("menu.savingLevel");
   private static final float J = 5.0F;
   private static final int K = 100;
   private static final int L = 10;
   private static final int M = 10;
   private static final String N = ": ";
   private static final float O = 0.2F;
   private static final int P = 9;
   private static final int Q = 8;
   private static final int R = 10;
   private static final int S = 9;
   private static final int T = 8;
   private static final int U = 2;
   private static final int V = 1;
   private static final float W = 0.5F;
   private static final float X = 0.1F;
   private static final float Y = 1.0F;
   private static final float Z = 0.1F;
   private static final int aa = 3;
   private static final int ab = 5;
   private static final float ac = 0.2F;
   private static final int ad = 5;
   private static final int ae = 5;
   private final bck af = bck.a();
   private final fue ag;
   private final fxp ah;
   private int ai;
   @Nullable
   private xo aj;
   private int ak;
   private boolean al;
   private boolean am;
   public float b = 1.0F;
   private int an;
   private dcv ao = dcv.l;
   private final fxw ap;
   private final fyy aq;
   private final fzq ar;
   private final fyq as;
   private final fxn at;
   private int au;
   @Nullable
   private xo av;
   @Nullable
   private xo aw;
   private int ax;
   private int ay;
   private int az;
   private int aA;
   private int aB;
   private long aC;
   private long aD;
   private int aE;
   private float aF;
   private float aG;
   private Pair<fxa.b, gag> aH = Pair.of(fxa.b.a, gag.d);
   private final Map<fxa.b, Supplier<gag>> aI;
   private float aJ;

   public fxa(fue $$0) {
      this.ag = $$0;
      this.ap = new fxw($$0);
      this.ar = new fzq($$0);
      this.ah = new fxp($$0);
      this.as = new fyq($$0, this);
      this.at = new fxn($$0);
      this.aq = new fyy($$0);
      this.aI = ImmutableMap.of(
         fxa.b.a,
         (Supplier<gag>)() -> gag.d,
         fxa.b.b,
         (Supplier<gag>)() -> new gah($$0),
         fxa.b.c,
         (Supplier<gag>)() -> new gaj($$0),
         fxa.b.d,
         (Supplier<gag>)() -> new gai($$0)
      );
      this.a();
   }

   public void a() {
      this.ax = 10;
      this.ay = 70;
      this.az = 20;
   }

   public void a(fxb $$0, ftu $$1) {
      if (this.ag.z == null || !(this.ag.z instanceof ger)) {
         if (!this.ag.n.Y) {
            this.f($$0, $$1);
            this.m($$0, $$1);
            $$0.c();
            this.o($$0, $$1);
            this.n($$0, $$1);
            this.c($$0, $$1);
         }

         this.g($$0, $$1);
         if (!this.ag.n.Y) {
            this.q($$0, $$1);
            this.d($$0, $$1);
            this.k($$0, $$1);
            this.h($$0, $$1);
            this.i($$0, $$1);
            this.j($$0, $$1);
            this.l($$0, $$1);
            this.e($$0, $$1);
         }
      }
   }

   private void c(fxb $$0, ftu $$1) {
      this.at.a($$0);
   }

   private void d(fxb $$0, ftu $$1) {
      if (this.ap.d()) {
         $$0.c();
         this.ap.a($$0);
      }
   }

   private void e(fxb $$0, ftu $$1) {
      this.aq.a($$0);
   }

   private void f(fxb $$0, ftu $$1) {
      if (fue.O()) {
         this.a($$0, this.ag.ap());
      }

      gwi $$2 = this.ag.t;
      float $$3 = $$1.a();
      this.aJ = bcb.h(0.5F * $$3, this.aJ, 1.125F);
      if (this.ag.n.aH().a()) {
         if ($$2.gR()) {
            this.a($$0, this.aJ);
         } else {
            this.aJ = 0.5F;

            for (bzw $$4 : bzw.values()) {
               dcv $$5 = $$2.a($$4);
               dle $$6 = $$5.a(kq.D);
               if ($$6 != null && $$6.b() == $$4 && $$6.e().isPresent()) {
                  this.a($$0, $$6.e().get().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")), 1.0F);
               }
            }
         }
      }

      if ($$2.cy() > 0) {
         this.a($$0, F, $$2.cz());
      }

      float $$7 = $$1.a(false);
      float $$8 = bcb.h($$7, $$2.cU, $$2.cT);
      float $$9 = $$2.a(bys.i, $$7);
      if ($$8 > 0.0F) {
         this.b($$0, $$8);
      } else if ($$9 > 0.0F) {
         float $$10 = this.ag.n.an().c().floatValue();
         if ($$10 < 1.0F) {
            float $$11 = $$9 * (1.0F - $$10);
            this.c($$0, $$11);
         }
      }
   }

   private void g(fxb $$0, ftu $$1) {
      if (this.ag.t.gy() > 0) {
         bts.a().a("sleep");
         $$0.c();
         float $$2 = this.ag.t.gy();
         float $$3 = $$2 / 100.0F;
         if ($$3 > 1.0F) {
            $$3 = 1.0F - ($$2 - 100.0F) / 10.0F;
         }

         int $$4 = (int)(220.0F * $$3) << 24 | 1052704;
         $$0.a(0, 0, $$0.a(), $$0.b(), $$4);
         bts.a().c();
      }
   }

   private void h(fxb $$0, ftu $$1) {
      fwz $$2 = this.g();
      if (this.aj != null && this.ak > 0) {
         bts.a().a("overlayMessage");
         float $$3 = this.ak - $$1.a(false);
         int $$4 = (int)($$3 * 255.0F / 20.0F);
         if ($$4 > 255) {
            $$4 = 255;
         }

         if ($$4 > 0) {
            $$0.c();
            $$0.e().pushMatrix();
            $$0.e().translate($$0.a() / 2, $$0.b() - 68);
            int $$5;
            if (this.al) {
               $$5 = bcb.a($$3 / 50.0F, 0.7F, 0.6F, $$4);
            } else {
               $$5 = baj.c($$4, -1);
            }

            int $$7 = $$2.a(this.aj);
            $$0.a($$2, this.aj, -$$7 / 2, -4, $$7, $$5);
            $$0.e().popMatrix();
         }

         bts.a().c();
      }
   }

   private void i(fxb $$0, ftu $$1) {
      if (this.av != null && this.au > 0) {
         fwz $$2 = this.g();
         bts.a().a("titleAndSubtitle");
         float $$3 = this.au - $$1.a(false);
         int $$4 = 255;
         if (this.au > this.az + this.ay) {
            float $$5 = this.ax + this.ay + this.az - $$3;
            $$4 = (int)($$5 * 255.0F / this.ax);
         }

         if (this.au <= this.az) {
            $$4 = (int)($$3 * 255.0F / this.az);
         }

         $$4 = bcb.a($$4, 0, 255);
         if ($$4 > 0) {
            $$0.c();
            $$0.e().pushMatrix();
            $$0.e().translate($$0.a() / 2, $$0.b() / 2);
            $$0.e().pushMatrix();
            $$0.e().scale(4.0F, 4.0F);
            int $$6 = $$2.a(this.av);
            int $$7 = baj.c($$4, -1);
            $$0.a($$2, this.av, -$$6 / 2, -10, $$6, $$7);
            $$0.e().popMatrix();
            if (this.aw != null) {
               $$0.e().pushMatrix();
               $$0.e().scale(2.0F, 2.0F);
               int $$8 = $$2.a(this.aw);
               $$0.a($$2, this.aw, -$$8 / 2, 5, $$8, $$7);
               $$0.e().popMatrix();
            }

            $$0.e().popMatrix();
         }

         bts.a().c();
      }
   }

   private void j(fxb $$0, ftu $$1) {
      if (!this.ah.e()) {
         fni $$2 = this.ag.aP();
         int $$3 = bcb.a(this.ag.o.a($$2));
         int $$4 = bcb.a(this.ag.o.b($$2));
         $$0.c();
         this.ah.a($$0, this.ai, $$3, $$4, false);
      }
   }

   private void k(fxb $$0, ftu $$1) {
      fjx $$2 = this.ag.s.S();
      fjp $$3 = null;
      fjs $$4 = $$2.e(this.ag.t.cM());
      if ($$4 != null) {
         fjo $$5 = fjo.a($$4.o());
         if ($$5 != null) {
            $$3 = $$2.a($$5);
         }
      }

      fjp $$6 = $$3 != null ? $$3 : $$2.a(fjo.b);
      if ($$6 != null) {
         $$0.c();
         this.a($$0, $$6);
      }
   }

   private void l(fxb $$0, ftu $$1) {
      fjx $$2 = this.ag.s.S();
      fjp $$3 = $$2.a(fjo.a);
      if (!this.ag.n.J.e() || this.ag.U() && this.ag.t.j.n().size() <= 1 && $$3 == null) {
         this.as.a(false);
      } else {
         this.as.a(true);
         $$0.c();
         this.as.a($$0, $$0.a(), $$2, $$3);
      }
   }

   private void m(fxb $$0, ftu $$1) {
      fui $$2 = this.ag.n;
      if ($$2.aH().a()) {
         if (this.ag.r.i() != dmr.d || this.a(this.ag.w)) {
            if (!this.b()) {
               $$0.c();
               int $$3 = 15;
               $$0.a(gxx.ay, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
               if (this.ag.n.G().c() == ftl.b) {
                  float $$4 = this.ag.t.G(0.0F);
                  boolean $$5 = false;
                  if (this.ag.v != null && this.ag.v instanceof cam && $$4 >= 1.0F) {
                     $$5 = this.ag.t.gN() > 5.0F;
                     $$5 &= this.ag.v.bO();
                  }

                  int $$6 = $$0.b() / 2 - 7 + 16;
                  int $$7 = $$0.a() / 2 - 8;
                  if ($$5) {
                     $$0.a(gxx.ay, d, $$7, $$6, 16, 16);
                  } else if ($$4 < 1.0F) {
                     int $$8 = (int)($$4 * 17.0F);
                     $$0.a(gxx.ay, e, $$7, $$6, 16, 4);
                     $$0.a(gxx.ay, f, 16, 4, 0, 0, $$7, $$6, $$8, 4);
                  }
               }
            }
         }
      }
   }

   public boolean b() {
      return this.ap.d() && this.ag.n.aH() == ftn.a && !this.ag.t.gK() && !this.ag.n.Z().c();
   }

   private boolean a(@Nullable fiq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0.d() == fiq.a.c) {
         return ((fip)$$0).a() instanceof bxm;
      } else if ($$0.d() == fiq.a.b) {
         jb $$1 = ((fio)$$0).b();
         dmu $$2 = this.ag.s;
         return $$2.a_($$1).b($$2, $$1) != null;
      } else {
         return false;
      }
   }

   private void n(fxb $$0, ftu $$1) {
      Collection<byq> $$2 = this.ag.t.eI();
      if (!$$2.isEmpty() && (this.ag.z == null || !this.ag.z.C())) {
         int $$3 = 0;
         int $$4 = 0;

         for (byq $$5 : Ordering.natural().reverse().sortedCopy($$2)) {
            jl<byo> $$6 = $$5.c();
            if ($$5.h()) {
               int $$7 = $$0.a();
               int $$8 = 1;
               if (this.ag.L()) {
                  $$8 += 15;
               }

               if ($$6.a().j()) {
                  $$3++;
                  $$7 -= 25 * $$3;
               } else {
                  $$4++;
                  $$7 -= 25 * $$4;
                  $$8 += 26;
               }

               float $$9 = 1.0F;
               if ($$5.f()) {
                  $$0.a(gxx.ar, g, $$7, $$8, 24, 24);
               } else {
                  $$0.a(gxx.ar, h, $$7, $$8, 24, 24);
                  if ($$5.a(200)) {
                     int $$10 = $$5.d();
                     int $$11 = 10 - $$10 / 20;
                     $$9 = bcb.a($$10 / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F) + bcb.b($$10 * (float) Math.PI / 5.0F) * bcb.a($$11 / 10.0F * 0.25F, 0.0F, 0.25F);
                     $$9 = bcb.a($$9, 0.0F, 1.0F);
                  }
               }

               $$0.a(gxx.ar, a($$6), $$7 + 3, $$8 + 3, 18, 18, baj.a($$9));
            }
         }
      }
   }

   public static ame a(jl<byo> $$0) {
      return $$0.e().map(amd::a).map($$0x -> $$0x.f("mob_effect/")).orElseGet(hrh::c);
   }

   private void o(fxb $$0, ftu $$1) {
      if (this.ag.r.i() == dmr.d) {
         this.ar.a($$0);
      } else {
         this.p($$0, $$1);
      }

      if (this.ag.r.a()) {
         this.b($$0);
      }

      this.c($$0);
      fxa.b $$2 = this.t();
      if ($$2 != this.aH.getKey()) {
         this.aH = Pair.of($$2, this.aI.get($$2).get());
      }

      ((gag)this.aH.getValue()).a($$0, $$1);
      if (this.ag.r.d() && this.ag.t.cB > 0) {
         gag.a($$0, this.ag.h, this.ag.t.cB);
      }

      ((gag)this.aH.getValue()).b($$0, $$1);
      if (this.ag.r.i() != dmr.d) {
         this.a($$0);
      } else if (this.ag.t.am()) {
         this.ar.b($$0);
      }
   }

   private void p(fxb $$0, ftu $$1) {
      cut $$2 = this.n();
      if ($$2 != null) {
         dcv $$3 = $$2.fi();
         cad $$4 = $$2.fF().e();
         int $$5 = $$0.a() / 2;
         int $$6 = 182;
         int $$7 = 91;
         $$0.a(gxx.ar, i, $$5 - 91, $$0.b() - 22, 182, 22);
         $$0.a(gxx.ar, j, $$5 - 91 - 1 + $$2.gs().f() * 20, $$0.b() - 22 - 1, 24, 23);
         if (!$$3.f()) {
            if ($$4 == cad.a) {
               $$0.a(gxx.ar, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
               $$0.a(gxx.ar, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
         }

         int $$8 = 1;

         for (int $$9 = 0; $$9 < 9; $$9++) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gs().a($$9), $$8++);
         }

         if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == cad.a) {
               this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
               this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
         }

         if (this.ag.n.G().c() == ftl.c) {
            float $$13 = this.ag.t.G(0.0F);
            if ($$13 < 1.0F) {
               int $$14 = $$0.b() - 20;
               int $$15 = $$5 + 91 + 6;
               if ($$4 == cad.b) {
                  $$15 = $$5 - 91 - 22;
               }

               int $$16 = (int)($$13 * 19.0F);
               $$0.a(gxx.ar, m, $$15, $$14, 18, 18);
               $$0.a(gxx.ar, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
            }
         }
      }
   }

   private void a(fxb $$0) {
      bts.a().a("selectedItemName");
      if (this.an > 0 && !this.ao.f()) {
         yc $$1 = xo.i().b(this.ao.y()).a(this.ao.D().a());
         if (this.ao.c(kq.g)) {
            $$1.a(o.u);
         }

         int $$2 = this.g().a($$1);
         int $$3 = ($$0.a() - $$2) / 2;
         int $$4 = $$0.b() - 59;
         if (!this.ag.r.a()) {
            $$4 += 14;
         }

         int $$5 = (int)(this.an * 256.0F / 10.0F);
         if ($$5 > 255) {
            $$5 = 255;
         }

         if ($$5 > 0) {
            $$0.a(this.g(), (xo)$$1, $$3, $$4, $$2, baj.c($$5, -1));
         }
      }

      bts.a().c();
   }

   private void q(fxb $$0, ftu $$1) {
      if (this.ag.L()) {
         bts.a().a("demo");
         $$0.c();
         xo $$2;
         if (this.ag.s.ae() >= 120500L) {
            $$2 = H;
         } else {
            $$2 = xo.a("demo.remainingTime", bdb.a((int)(120500L - this.ag.s.ae()), this.ag.s.v().f()));
         }

         int $$4 = this.g().a($$2);
         int $$5 = $$0.a() - $$4 - 10;
         int $$6 = 5;
         $$0.a(this.g(), $$2, $$5, 5, $$4, -1);
         bts.a().c();
      }
   }

   private void a(fxb $$0, fjp $$1) {
      fjx $$2 = $$1.b();
      ze $$3 = $$1.a(zh.c);

      record a(xo a, xo b, int c) {
      }

      a[] $$4 = $$2.i($$1).stream().filter($$0x -> !$$0x.a()).sorted(G).limit(15L).map($$2x -> {
         fjs $$3x = $$2.e($$2x.c());
         xo $$4x = $$2x.b();
         xo $$5x = fjs.a($$3x, $$4x);
         xo $$6x = $$2x.a($$3);
         int $$7x = this.g().a($$6x);
         return new a($$5x, $$6x, $$7x);
      }).toArray(a[]::new);
      xo $$5 = $$1.e();
      int $$6 = this.g().a($$5);
      int $$7 = $$6;
      int $$8 = this.g().b(": ");

      for (a $$9 : $$4) {
         $$7 = Math.max($$7, this.g().a($$9.a) + ($$9.c > 0 ? $$8 + $$9.c : 0));
      }

      int $$11 = $$4.length;
      int $$12 = $$11 * 9;
      int $$13 = $$0.b() / 2 + $$12 / 3;
      int $$14 = 3;
      int $$15 = $$0.a() - $$7 - 3;
      int $$16 = $$0.a() - 3 + 2;
      int $$17 = this.ag.n.b(0.3F);
      int $$18 = this.ag.n.b(0.4F);
      int $$19 = $$13 - $$11 * 9;
      $$0.a($$15 - 2, $$19 - 9 - 1, $$16, $$19 - 1, $$18);
      $$0.a($$15 - 2, $$19 - 1, $$16, $$13, $$17);
      $$0.a(this.g(), $$5, $$15 + $$7 / 2 - $$6 / 2, $$19 - 9, -1, false);

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         a $$21 = $$4[$$20];
         int $$22 = $$13 - ($$11 - $$20) * 9;
         $$0.a(this.g(), $$21.a, $$15, $$22, -1, false);
         $$0.a(this.g(), $$21.b, $$16 - $$21.c, $$22, -1, false);
      }
   }

   @Nullable
   private cut n() {
      return this.ag.ap() instanceof cut $$0 ? $$0 : null;
   }

   @Nullable
   private cam o() {
      cut $$0 = this.n();
      if ($$0 != null) {
         bzm $$1 = $$0.dm();
         if ($$1 == null) {
            return null;
         }

         if ($$1 instanceof cam) {
            return (cam)$$1;
         }
      }

      return null;
   }

   private int a(@Nullable cam $$0) {
      if ($$0 != null && $$0.bQ()) {
         float $$1 = $$0.fa();
         int $$2 = (int)($$1 + 0.5F) / 2;
         if ($$2 > 30) {
            $$2 = 30;
         }

         return $$2;
      } else {
         return 0;
      }
   }

   private int a(int $$0) {
      return (int)Math.ceil($$0 / 10.0);
   }

   private void b(fxb $$0) {
      cut $$1 = this.n();
      if ($$1 != null) {
         int $$2 = bcb.f($$1.eL());
         boolean $$3 = this.aD > this.ai && (this.aD - this.ai) / 3L % 2L == 1L;
         long $$4 = ag.c();
         if ($$2 < this.aA && $$1.aw > 0) {
            this.aC = $$4;
            this.aD = this.ai + 20;
         } else if ($$2 > this.aA && $$1.aw > 0) {
            this.aC = $$4;
            this.aD = this.ai + 10;
         }

         if ($$4 - this.aC > 1000L) {
            this.aB = $$2;
            this.aC = $$4;
         }

         this.aA = $$2;
         int $$5 = this.aB;
         this.af.b((long)(this.ai * 312871));
         int $$6 = $$0.a() / 2 - 91;
         int $$7 = $$0.a() / 2 + 91;
         int $$8 = $$0.b() - 39;
         float $$9 = Math.max((float)$$1.i(cbs.t), (float)Math.max($$5, $$2));
         int $$10 = bcb.f($$1.fD());
         int $$11 = bcb.f(($$9 + $$10) / 2.0F / 10.0F);
         int $$12 = Math.max(10 - ($$11 - 2), 3);
         int $$13 = $$8 - 10;
         int $$14 = -1;
         if ($$1.d(bys.j)) {
            $$14 = this.ai % bcb.f($$9 + 5.0F);
         }

         bts.a().a("armor");
         a($$0, $$1, $$8, $$11, $$12, $$6);
         bts.a().b("health");
         this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
         cam $$15 = this.o();
         int $$16 = this.a($$15);
         if ($$16 == 0) {
            bts.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
         }

         bts.a().b("air");
         this.a($$0, $$1, $$16, $$13, $$7);
         bts.a().c();
      }
   }

   private static void a(fxb $$0, cut $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$1.eX();
      if ($$6 > 0) {
         int $$7 = $$2 - ($$3 - 1) * $$4 - 10;

         for (int $$8 = 0; $$8 < 10; $$8++) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
               $$0.a(gxx.ar, q, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 == $$6) {
               $$0.a(gxx.ar, p, $$9, $$7, 9, 9);
            }

            if ($$8 * 2 + 1 > $$6) {
               $$0.a(gxx.ar, o, $$9, $$7, 9, 9);
            }
         }
      }
   }

   private void a(fxb $$0, cut $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
      fxa.c $$11 = fxa.c.a($$1);
      boolean $$12 = $$1.ai().D_().l();
      int $$13 = bcb.c($$6 / 2.0);
      int $$14 = bcb.c($$9 / 2.0);
      int $$15 = $$13 * 2;

      for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; $$16--) {
         int $$17 = $$16 / 10;
         int $$18 = $$16 % 10;
         int $$19 = $$2 + $$18 * 8;
         int $$20 = $$3 - $$17 * $$4;
         if ($$7 + $$9 <= 4) {
            $$20 += this.af.a(2);
         }

         if ($$16 < $$13 && $$16 == $$5) {
            $$20 -= 2;
         }

         this.a($$0, fxa.c.a, $$19, $$20, $$12, $$10, false);
         int $$21 = $$16 * 2;
         boolean $$22 = $$16 >= $$13;
         if ($$22) {
            int $$23 = $$21 - $$15;
            if ($$23 < $$9) {
               boolean $$24 = $$23 + 1 == $$9;
               this.a($$0, $$11 == fxa.c.d ? $$11 : fxa.c.e, $$19, $$20, $$12, false, $$24);
            }
         }

         if ($$10 && $$21 < $$8) {
            boolean $$25 = $$21 + 1 == $$8;
            this.a($$0, $$11, $$19, $$20, $$12, true, $$25);
         }

         if ($$21 < $$7) {
            boolean $$26 = $$21 + 1 == $$7;
            this.a($$0, $$11, $$19, $$20, $$12, false, $$26);
         }
      }
   }

   private void a(fxb $$0, fxa.c $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
      $$0.a(gxx.ar, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
   }

   private void a(fxb $$0, cut $$1, int $$2, int $$3, int $$4) {
      int $$5 = $$1.cv();
      int $$6 = Math.clamp((long)$$1.cw(), 0, $$5);
      boolean $$7 = $$1.a(azu.a);
      if ($$7 || $$6 < $$5) {
         $$3 = this.a($$2, $$3);
         int $$8 = b($$6, $$5, -2);
         int $$9 = b($$6, $$5, 0);
         int $$10 = 10 - b($$6, $$5, a($$6, $$7));
         boolean $$11 = $$8 != $$9;
         if (!$$7) {
            this.aE = 0;
         }

         for (int $$12 = 1; $$12 <= 10; $$12++) {
            int $$13 = $$4 - ($$12 - 1) * 8 - 9;
            if ($$12 <= $$8) {
               $$0.a(gxx.ar, x, $$13, $$3, 9, 9);
            } else if ($$11 && $$12 == $$9 && $$7) {
               $$0.a(gxx.ar, y, $$13, $$3, 9, 9);
               this.a($$12, $$1, $$10);
            } else if ($$12 > 10 - $$10) {
               int $$14 = $$10 == 10 && this.ai % 2 == 0 ? this.af.a(2) : 0;
               $$0.a(gxx.ar, z, $$13, $$3 + $$14, 9, 9);
            }
         }
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = this.a($$0) - 1;
      return $$1 - $$2 * 10;
   }

   private static int b(int $$0, int $$1, int $$2) {
      return bcb.f((float)(($$0 + $$2) * 10) / $$1);
   }

   private static int a(int $$0, boolean $$1) {
      return $$0 != 0 && $$1 ? 1 : 0;
   }

   private void a(int $$0, cut $$1, int $$2) {
      if (this.aE != $$0) {
         float $$3 = 0.5F + 0.1F * Math.max(0, $$2 - 3 + 1);
         float $$4 = 1.0F + 0.1F * Math.max(0, $$2 - 5 + 1);
         $$1.a(ayz.dc, $$3, $$4);
         this.aE = $$0;
      }
   }

   private void a(fxb $$0, cut $$1, int $$2, int $$3) {
      cyi $$4 = $$1.gD();
      int $$5 = $$4.a();

      for (int $$6 = 0; $$6 < 10; $$6++) {
         int $$7 = $$2;
         ame $$8;
         ame $$9;
         ame $$10;
         if ($$1.d(bys.q)) {
            $$8 = r;
            $$9 = s;
            $$10 = t;
         } else {
            $$8 = u;
            $$9 = v;
            $$10 = w;
         }

         if ($$1.gD().c() <= 0.0F && this.ai % ($$5 * 3 + 1) == 0) {
            $$7 = $$2 + (this.af.a(3) - 1);
         }

         int $$14 = $$3 - $$6 * 8 - 9;
         $$0.a(gxx.ar, $$8, $$14, $$7, 9, 9);
         if ($$6 * 2 + 1 < $$5) {
            $$0.a(gxx.ar, $$10, $$14, $$7, 9, 9);
         }

         if ($$6 * 2 + 1 == $$5) {
            $$0.a(gxx.ar, $$9, $$14, $$7, 9, 9);
         }
      }
   }

   private void c(fxb $$0) {
      cam $$1 = this.o();
      if ($$1 != null) {
         int $$2 = this.a($$1);
         if ($$2 != 0) {
            int $$3 = (int)Math.ceil($$1.eL());
            bts.a().b("mountHealth");
            int $$4 = $$0.b() - 39;
            int $$5 = $$0.a() / 2 + 91;
            int $$6 = $$4;

            for (int $$7 = 0; $$2 > 0; $$7 += 20) {
               int $$8 = Math.min($$2, 10);
               $$2 -= $$8;

               for (int $$9 = 0; $$9 < $$8; $$9++) {
                  int $$10 = $$5 - $$9 * 8 - 9;
                  $$0.a(gxx.ar, A, $$10, $$6, 9, 9);
                  if ($$9 * 2 + 1 + $$7 < $$3) {
                     $$0.a(gxx.ar, B, $$10, $$6, 9, 9);
                  }

                  if ($$9 * 2 + 1 + $$7 == $$3) {
                     $$0.a(gxx.ar, C, $$10, $$6, 9, 9);
                  }
               }

               $$6 -= 10;
            }
         }
      }
   }

   private void a(fxb $$0, ame $$1, float $$2) {
      int $$3 = baj.a($$2);
      $$0.a(gxx.ar, $$1, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
   }

   private void a(fxb $$0, float $$1) {
      float $$2 = Math.min($$0.a(), $$0.b());
      float $$4 = Math.min($$0.a() / $$2, $$0.b() / $$2) * $$1;
      int $$5 = bcb.d($$2 * $$4);
      int $$6 = bcb.d($$2 * $$4);
      int $$7 = ($$0.a() - $$5) / 2;
      int $$8 = ($$0.b() - $$6) / 2;
      int $$9 = $$7 + $$5;
      int $$10 = $$8 + $$6;
      $$0.a(gxx.ar, E, $$7, $$8, 0.0F, 0.0F, $$5, $$6, $$5, $$6);
      $$0.a(gxx.ao, 0, $$10, $$0.a(), $$0.b(), -16777216);
      $$0.a(gxx.ao, 0, 0, $$0.a(), $$8, -16777216);
      $$0.a(gxx.ao, 0, $$8, $$7, $$10, -16777216);
      $$0.a(gxx.ao, $$9, $$8, $$0.a(), $$10, -16777216);
   }

   private void a(bzm $$0) {
      jb $$1 = jb.a($$0.dC(), $$0.dG(), $$0.dI());
      float $$2 = gxj.a($$0.ai().G_(), $$0.ai().C($$1));
      float $$3 = bcb.a(1.0F - $$2, 0.0F, 1.0F);
      this.b = this.b + ($$3 - this.b) * 0.01F;
   }

   private void a(fxb $$0, @Nullable bzm $$1) {
      eft $$2 = this.ag.s.F_();
      float $$3 = 0.0F;
      if ($$1 != null) {
         float $$4 = (float)$$2.a($$1);
         double $$5 = Math.min($$2.p() * $$2.q() * 1000.0, Math.abs($$2.k() - $$2.i()));
         double $$6 = Math.max((double)$$2.r(), $$5);
         if ($$4 < $$6) {
            $$3 = 1.0F - (float)($$4 / $$6);
         }
      }

      int $$7;
      if ($$3 > 0.0F) {
         $$3 = bcb.a($$3, 0.0F, 1.0F);
         $$7 = baj.a(1.0F, 0.0F, $$3, $$3);
      } else {
         float $$8 = this.b;
         $$8 = bcb.a($$8, 0.0F, 1.0F);
         $$7 = baj.a(1.0F, $$8, $$8, $$8);
      }

      $$0.a(gxx.ax, D, 0, 0, 0.0F, 0.0F, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$7);
   }

   private void b(fxb $$0, float $$1) {
      if ($$1 < 1.0F) {
         $$1 *= $$1;
         $$1 *= $$1;
         $$1 = $$1 * 0.8F + 0.2F;
      }

      int $$2 = baj.a($$1);
      hrs $$3 = this.ag.aq().a().a(dqb.eu.m());
      $$0.a(gxx.ar, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
   }

   private void c(fxb $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.e().pushMatrix();
      float $$4 = bcb.h($$1, 2.0F, 1.0F);
      $$0.e().translate($$2 / 2.0F, $$3 / 2.0F);
      $$0.e().scale($$4, $$4);
      $$0.e().translate(-$$2 / 2.0F, -$$3 / 2.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      $$0.a(gxx.aw, a, 0, 0, 0.0F, 0.0F, $$2, $$3, $$2, $$3, baj.a(1.0F, $$5, $$6, $$7));
      $$0.e().popMatrix();
   }

   private void a(fxb $$0, int $$1, int $$2, ftu $$3, cut $$4, dcv $$5, int $$6) {
      if (!$$5.f()) {
         float $$7 = $$5.L() - $$3.a(false);
         if ($$7 > 0.0F) {
            float $$8 = 1.0F + $$7 / 5.0F;
            $$0.e().pushMatrix();
            $$0.e().translate($$1 + 8, $$2 + 12);
            $$0.e().scale(1.0F / $$8, ($$8 + 1.0F) / 2.0F);
            $$0.e().translate(-($$1 + 8), -($$2 + 12));
         }

         $$0.a($$4, $$5, $$1, $$2, $$6);
         if ($$7 > 0.0F) {
            $$0.e().popMatrix();
         }

         $$0.a(this.ag.h, $$5, $$1, $$2);
      }
   }

   public void a(boolean $$0) {
      this.q();
      if (!$$0) {
         this.p();
      }
   }

   private void p() {
      if (this.ak > 0) {
         this.ak--;
      }

      if (this.au > 0) {
         this.au--;
         if (this.au <= 0) {
            this.av = null;
            this.aw = null;
         }
      }

      this.ai++;
      bzm $$0 = this.ag.ap();
      if ($$0 != null) {
         this.a($$0);
      }

      if (this.ag.t != null) {
         dcv $$1 = this.ag.t.gs().g();
         if ($$1.f()) {
            this.an = 0;
         } else if (this.ao.f() || !$$1.a(this.ao.h()) || !$$1.y().equals(this.ao.y())) {
            this.an = (int)(40.0 * this.ag.n.E().c());
         } else if (this.an > 0) {
            this.an--;
         }

         this.ao = $$1;
      }

      this.ah.a();
   }

   private void q() {
      MinecraftServer $$0 = this.ag.W();
      boolean $$1 = $$0 != null && $$0.bf();
      this.aG = this.aF;
      this.aF = bcb.h(0.2F, this.aF, $$1 ? 1.0F : 0.0F);
   }

   public void a(xo $$0) {
      xo $$1 = xo.a("record.nowPlaying", $$0);
      this.a($$1, true);
      this.ag.aZ().d($$1);
   }

   public void a(xo $$0, boolean $$1) {
      this.b(false);
      this.aj = $$0;
      this.ak = 60;
      this.al = $$1;
   }

   public void b(boolean $$0) {
      this.am = $$0;
   }

   public boolean c() {
      return this.am && this.ak > 0;
   }

   public void a(int $$0, int $$1, int $$2) {
      if ($$0 >= 0) {
         this.ax = $$0;
      }

      if ($$1 >= 0) {
         this.ay = $$1;
      }

      if ($$2 >= 0) {
         this.az = $$2;
      }

      if (this.au > 0) {
         this.au = this.ax + this.ay + this.az;
      }
   }

   public void b(xo $$0) {
      this.aw = $$0;
   }

   public void c(xo $$0) {
      this.av = $$0;
      this.au = this.ax + this.ay + this.az;
   }

   public void d() {
      this.av = null;
      this.aw = null;
      this.au = 0;
   }

   public fxp e() {
      return this.ah;
   }

   public int f() {
      return this.ai;
   }

   public fwz g() {
      return this.ag.h;
   }

   public fzq h() {
      return this.ar;
   }

   public fyq i() {
      return this.as;
   }

   public void j() {
      this.as.a();
      this.at.a();
      this.ag.aB().b();
      this.ap.p();
      this.ah.a(true);
      this.d();
      this.a();
   }

   public fxn k() {
      return this.at;
   }

   public fxw l() {
      return this.ap;
   }

   public void m() {
      this.ap.a();
   }

   public void b(fxb $$0, ftu $$1) {
      if (this.ag.n.aj().c() && (this.aF > 0.0F || this.aG > 0.0F)) {
         int $$2 = bcb.d(255.0F * bcb.a(bcb.h($$1.b(), this.aG, this.aF), 0.0F, 1.0F));
         if ($$2 > 0) {
            fwz $$3 = this.g();
            int $$4 = $$3.a(I);
            int $$5 = baj.c($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - 9 - 5;
            $$0.c();
            $$0.a($$3, I, $$6, $$7, $$4, $$5);
         }
      }
   }

   private boolean r() {
      return this.ag.t.cO + 100 > this.ag.t.as;
   }

   private boolean s() {
      return this.ag.t.v() > 0.0F || y.a(this.ag.t.u(), caw::c, 0) > 0;
   }

   private fxa.b t() {
      boolean $$0 = this.ag.t.j.H().a();
      boolean $$1 = this.ag.t.u() != null;
      boolean $$2 = this.ag.r.d();
      if ($$0) {
         if ($$1 && this.s()) {
            return fxa.b.d;
         } else {
            return $$2 && this.r() ? fxa.b.b : fxa.b.c;
         }
      } else if ($$1) {
         return fxa.b.d;
      } else {
         return $$2 ? fxa.b.b : fxa.b.a;
      }
   }

   static enum b {
      a,
      b,
      c,
      d;
   }

   static enum c {
      a(
         ame.b("hud/heart/container"),
         ame.b("hud/heart/container_blinking"),
         ame.b("hud/heart/container"),
         ame.b("hud/heart/container_blinking"),
         ame.b("hud/heart/container_hardcore"),
         ame.b("hud/heart/container_hardcore_blinking"),
         ame.b("hud/heart/container_hardcore"),
         ame.b("hud/heart/container_hardcore_blinking")
      ),
      b(
         ame.b("hud/heart/full"),
         ame.b("hud/heart/full_blinking"),
         ame.b("hud/heart/half"),
         ame.b("hud/heart/half_blinking"),
         ame.b("hud/heart/hardcore_full"),
         ame.b("hud/heart/hardcore_full_blinking"),
         ame.b("hud/heart/hardcore_half"),
         ame.b("hud/heart/hardcore_half_blinking")
      ),
      c(
         ame.b("hud/heart/poisoned_full"),
         ame.b("hud/heart/poisoned_full_blinking"),
         ame.b("hud/heart/poisoned_half"),
         ame.b("hud/heart/poisoned_half_blinking"),
         ame.b("hud/heart/poisoned_hardcore_full"),
         ame.b("hud/heart/poisoned_hardcore_full_blinking"),
         ame.b("hud/heart/poisoned_hardcore_half"),
         ame.b("hud/heart/poisoned_hardcore_half_blinking")
      ),
      d(
         ame.b("hud/heart/withered_full"),
         ame.b("hud/heart/withered_full_blinking"),
         ame.b("hud/heart/withered_half"),
         ame.b("hud/heart/withered_half_blinking"),
         ame.b("hud/heart/withered_hardcore_full"),
         ame.b("hud/heart/withered_hardcore_full_blinking"),
         ame.b("hud/heart/withered_hardcore_half"),
         ame.b("hud/heart/withered_hardcore_half_blinking")
      ),
      e(
         ame.b("hud/heart/absorbing_full"),
         ame.b("hud/heart/absorbing_full_blinking"),
         ame.b("hud/heart/absorbing_half"),
         ame.b("hud/heart/absorbing_half_blinking"),
         ame.b("hud/heart/absorbing_hardcore_full"),
         ame.b("hud/heart/absorbing_hardcore_full_blinking"),
         ame.b("hud/heart/absorbing_hardcore_half"),
         ame.b("hud/heart/absorbing_hardcore_half_blinking")
      ),
      f(
         ame.b("hud/heart/frozen_full"),
         ame.b("hud/heart/frozen_full_blinking"),
         ame.b("hud/heart/frozen_half"),
         ame.b("hud/heart/frozen_half_blinking"),
         ame.b("hud/heart/frozen_hardcore_full"),
         ame.b("hud/heart/frozen_hardcore_full_blinking"),
         ame.b("hud/heart/frozen_hardcore_half"),
         ame.b("hud/heart/frozen_hardcore_half_blinking")
      );

      private final ame g;
      private final ame h;
      private final ame i;
      private final ame j;
      private final ame k;
      private final ame l;
      private final ame m;
      private final ame n;

      private c(final ame $$0, final ame $$1, final ame $$2, final ame $$3, final ame $$4, final ame $$5, final ame $$6, final ame $$7) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
         this.k = $$4;
         this.l = $$5;
         this.m = $$6;
         this.n = $$7;
      }

      public ame a(boolean $$0, boolean $$1, boolean $$2) {
         if (!$$0) {
            if ($$1) {
               return $$2 ? this.j : this.i;
            } else {
               return $$2 ? this.h : this.g;
            }
         } else if ($$1) {
            return $$2 ? this.n : this.m;
         } else {
            return $$2 ? this.l : this.k;
         }
      }

      static fxa.c a(cut $$0) {
         fxa.c $$1;
         if ($$0.d(bys.s)) {
            $$1 = c;
         } else if ($$0.d(bys.t)) {
            $$1 = d;
         } else if ($$0.cA()) {
            $$1 = f;
         } else {
            $$1 = b;
         }

         return $$1;
      }
   }

   public interface d {
      void a(fxb var1, ftu var2);
   }
}
