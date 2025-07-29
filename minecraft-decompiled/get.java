import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class get extends fzl implements fys {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("narrator.screen.usage");
   public static final ame g = ame.b("textures/gui/menu_background.png");
   public static final ame h = ame.b("textures/gui/header_separator.png");
   public static final ame i = ame.b("textures/gui/footer_separator.png");
   private static final ame c = ame.b("textures/gui/inworld_menu_background.png");
   public static final ame j = ame.b("textures/gui/inworld_header_separator.png");
   public static final ame k = ame.b("textures/gui/inworld_footer_separator.png");
   protected static final float l = 2000.0F;
   protected final xo m;
   private final List<fzn> d = Lists.newArrayList();
   private final List<gbr> e = Lists.newArrayList();
   @Nullable
   protected fue n;
   private boolean f;
   public int o;
   public int p;
   private final List<fys> u = Lists.newArrayList();
   protected fwz q;
   private static final long v = TimeUnit.SECONDS.toMillis(2L);
   private static final long w = v;
   private static final long x = 750L;
   private static final long y = 200L;
   private static final long z = 200L;
   private final gbw A = new gbw();
   private long B = Long.MIN_VALUE;
   private long C = Long.MAX_VALUE;
   @Nullable
   protected fxv<fug> r;
   @Nullable
   private gbr D;
   protected final Executor s = $$0x -> this.n.execute(() -> {
      if (this.n.z == this) {
         $$0x.run();
      }
   });

   protected get(xo $$0) {
      this.m = $$0;
   }

   public xo o() {
      return this.m;
   }

   public xo i() {
      return this.o();
   }

   public final void c(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.c();
      this.b($$0, $$1, $$2, $$3);
      $$0.c();
      this.a($$0, $$1, $$2, $$3);
      $$0.g();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      for (fys $$4 : this.u) {
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256 && this.aG_()) {
         this.aP_();
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         gbz $$3 = (gbz)(switch ($$0) {
            case 258 -> this.l();
            default -> null;
            case 262 -> this.b(gcb.d);
            case 263 -> this.b(gcb.c);
            case 264 -> this.b(gcb.b);
            case 265 -> this.b(gcb.a);
         });
         if ($$3 != null) {
            fwy $$4 = super.a($$3);
            if ($$4 == null && $$3 instanceof gbz.c) {
               this.p();
               $$4 = super.a($$3);
            }

            if ($$4 != null) {
               this.a($$4);
            }
         }

         return false;
      }
   }

   private gbz.c l() {
      boolean $$0 = !t();
      return new gbz.c($$0);
   }

   private gbz.a b(gcb $$0) {
      return new gbz.a($$0);
   }

   protected void aF_() {
      if (this.n.aY().b()) {
         gbz.c $$0 = new gbz.c(true);
         fwy $$1 = super.a($$0);
         if ($$1 != null) {
            this.a($$1);
         }
      }
   }

   protected void b(fzn $$0) {
      fwy $$1 = fwy.a(this, $$0.a(new gbz.b()));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   public void p() {
      fwy $$0 = this.aN_();
      if ($$0 != null) {
         $$0.a(false);
      }
   }

   @VisibleForTesting
   protected void a(fwy $$0) {
      this.p();
      $$0.a(true);
   }

   public boolean aG_() {
      return true;
   }

   public void aP_() {
      this.n.a(null);
   }

   protected <T extends fzn & fys & gbr> T c(T $$0) {
      this.u.add($$0);
      return this.d($$0);
   }

   protected <T extends fys> T a(T $$0) {
      this.u.add($$0);
      return $$0;
   }

   protected <T extends fzn & gbr> T d(T $$0) {
      this.d.add($$0);
      this.e.add($$0);
      return $$0;
   }

   protected void e(fzn $$0) {
      if ($$0 instanceof fys) {
         this.u.remove((fys)$$0);
      }

      if ($$0 instanceof gbr) {
         this.e.remove((gbr)$$0);
      }

      this.d.remove($$0);
   }

   protected void q() {
      this.u.clear();
      this.d.clear();
      this.e.clear();
   }

   public static List<xo> a(fue $$0, dcv $$1) {
      return $$1.a(dcr.b.a($$0.s), $$0.t, $$0.n.m ? dek.a.b : dek.a.a);
   }

   protected void a_(String $$0, boolean $$1) {
   }

   public boolean a(yl $$0) {
      xm $$1 = $$0.i();
      if (t()) {
         if ($$0.k() != null) {
            this.a_($$0.k(), false);
         }
      } else if ($$1 != null) {
         this.a(this.n, $$1);
         return true;
      }

      return false;
   }

   protected void a(fue $$0, xm $$1) {
      a($$1, $$0, this);
   }

   protected static void a(xm $$0, fue $$1, @Nullable get $$2) {
      gwi $$3 = Objects.requireNonNull($$1.t, "Player not available");
      switch ($$0) {
         case xm.g var6:
            xm.g var10000 = var6;

            try {
               var12 = var10000.b();
            } catch (Throwable var10) {
               throw new MatchException(var10.toString(), var10);
            }

            String var11 = var12;
            a($$3, var11, $$2);
            break;
         case xm.h $$5:
            $$3.j.a($$5.b(), $$2);
            break;
         case xm.d $$6:
            $$3.j.b(new aav($$6.b(), $$6.c()));
            if ($$1.z != $$2) {
               $$1.a($$2);
            }
            break;
         default:
            b($$0, $$1, $$2);
      }
   }

   protected static void b(xm $$0, fue $$1, @Nullable get $$2) {
      boolean $$7 = switch ($$0) {
         case xm.f var6 -> {
            xm.f var23 = var6;

            try {
               var24 = var23.b();
            } catch (Throwable var16) {
               throw new MatchException(var16.toString(), var16);
            }

            URI var17 = var24;
            a($$1, $$2, var17);
            yield false;
         }
         case xm.e $$4 -> {
            ag.n().a($$4.b());
            yield true;
         }
         case xm.i var9 -> {
            xm.i var21 = var9;

            try {
               var22 = var21.b();
            } catch (Throwable var15) {
               throw new MatchException(var15.toString(), var15);
            }

            String var18 = var22;
            if ($$2 != null) {
               $$2.a_(var18, true);
            }

            yield true;
         }
         case xm.c var11 -> {
            xm.c var19 = var11;

            try {
               var20 = var19.b();
            } catch (Throwable var14) {
               throw new MatchException(var14.toString(), var14);
            }

            String var13 = var20;
            $$1.p.a(var13);
            yield true;
         }
         default -> {
            a.error("Don't know how to handle {}", $$0);
            yield true;
         }
      };
      if ($$7 && $$1.z != $$2) {
         $$1.a($$2);
      }
   }

   protected static boolean a(fue $$0, @Nullable get $$1, URI $$2) {
      if (!$$0.n.P().c()) {
         return false;
      } else {
         if ($$0.n.Q().c()) {
            $$0.a(new gdq($$3 -> {
               if ($$3) {
                  ag.n().a($$2);
               }

               $$0.a($$1);
            }, $$2.toString(), false));
         } else {
            ag.n().a($$2);
         }

         return true;
      }
   }

   protected static void a(gwi $$0, String $$1, @Nullable get $$2) {
      $$0.j.a(el.a($$1), $$2);
   }

   public final void b(fue $$0, int $$1, int $$2) {
      this.n = $$0;
      this.q = $$0.h;
      this.o = $$1;
      this.p = $$2;
      if (!this.f) {
         this.aV_();
         this.aF_();
      } else {
         this.c();
      }

      this.f = true;
      this.d(false);
      this.a(v);
   }

   protected void r() {
      this.q();
      this.p();
      this.aV_();
      this.aF_();
   }

   protected void a(float $$0) {
      for (fzn $$1 : this.aH_()) {
         if ($$1 instanceof fxm $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public List<? extends fzn> aH_() {
      return this.d;
   }

   protected void aV_() {
   }

   public void e() {
   }

   public void aI_() {
   }

   public void aJ_() {
   }

   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.n.s == null) {
         this.a($$0, $$3);
      }

      this.b($$0);
      this.a($$0);
   }

   protected void b(fxb $$0) {
      float $$1 = this.n.n.s();
      if ($$1 >= 1.0F) {
         $$0.d();
      }
   }

   protected void a(fxb $$0, float $$1) {
      this.n.j.q().a($$0, this.o, this.p, true);
   }

   protected void a(fxb $$0) {
      this.a($$0, 0, 0, this.o, this.p);
   }

   protected void a(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, this.n.s == null ? g : c, $$1, $$2, 0.0F, 0.0F, $$3, $$4);
   }

   public static void a(fxb $$0, ame $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7) {
      int $$8 = 32;
      $$0.a(gxx.ar, $$1, $$2, $$3, $$4, $$5, $$6, $$7, 32, 32);
   }

   public void c(fxb $$0) {
      $$0.a(0, 0, this.o, this.p, -1072689136, -804253680);
   }

   public boolean aQ_() {
      return true;
   }

   public static boolean s() {
      return fue.a ? fna.a(fue.R().aP().h(), 343) || fna.a(fue.R().aP().h(), 347) : fna.a(fue.R().aP().h(), 341) || fna.a(fue.R().aP().h(), 345);
   }

   public static boolean t() {
      return fna.a(fue.R().aP().h(), 340) || fna.a(fue.R().aP().h(), 344);
   }

   public static boolean u() {
      return fna.a(fue.R().aP().h(), 342) || fna.a(fue.R().aP().h(), 346);
   }

   public static boolean c(int $$0) {
      return $$0 == 88 && s() && !t() && !u();
   }

   public static boolean d(int $$0) {
      return $$0 == 86 && s() && !t() && !u();
   }

   public static boolean e(int $$0) {
      return $$0 == 67 && s() && !t() && !u();
   }

   public static boolean f(int $$0) {
      return $$0 == 65 && s() && !t() && !u();
   }

   protected void c() {
      this.r();
   }

   public void a(fue $$0, int $$1, int $$2) {
      this.o = $$1;
      this.p = $$2;
      this.c();
   }

   public void a(p $$0) {
      q $$1 = $$0.a("Affected screen", 1);
      $$1.a("Screen name", () -> this.getClass().getCanonicalName());
   }

   protected boolean a(String $$0, char $$1, int $$2) {
      int $$3 = $$0.indexOf(58);
      int $$4 = $$0.indexOf(47);
      if ($$1 == ':') {
         return ($$4 == -1 || $$2 <= $$4) && $$3 == -1;
      } else {
         return $$1 == '/' ? $$2 > $$3 : $$1 == '_' || $$1 == '-' || $$1 >= 'a' && $$1 <= 'z' || $$1 >= '0' && $$1 <= '9' || $$1 == '.';
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return true;
   }

   public void a(List<Path> $$0) {
   }

   private void a(long $$0, boolean $$1) {
      this.C = ag.c() + $$0;
      if ($$1) {
         this.B = Long.MIN_VALUE;
      }
   }

   private void a(long $$0) {
      this.B = ag.c() + $$0;
   }

   public void v() {
      this.a(750L, false);
   }

   public void w() {
      this.a(200L, true);
   }

   public void x() {
      this.a(200L, true);
   }

   private boolean m() {
      return this.n.aZ().a();
   }

   public void z() {
      if (this.m()) {
         long $$0 = ag.c();
         if ($$0 > this.C && $$0 > this.B) {
            this.c(true);
            this.C = Long.MAX_VALUE;
         }
      }
   }

   public void d(boolean $$0) {
      if (this.m()) {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      this.A.a(this::a);
      String $$1 = this.A.a(!$$0);
      if (!$$1.isEmpty()) {
         this.n.aZ().a($$1);
      }
   }

   protected boolean aR_() {
      return true;
   }

   protected void a(gbt $$0) {
      $$0.a(gbs.a, this.i());
      if (this.aR_()) {
         $$0.a(gbs.d, b);
      }

      this.b($$0);
   }

   protected void b(gbt $$0) {
      List<? extends gbr> $$1 = this.e.stream().flatMap($$0x -> $$0x.aO_().stream()).filter(gbr::D).sorted(Comparator.comparingInt(fza::J)).toList();
      get.a $$2 = a($$1, this.D);
      if ($$2 != null) {
         if ($$2.c.a()) {
            this.D = $$2.a;
         }

         if ($$1.size() > 1) {
            $$0.a(gbs.b, xo.a("narrator.position.screen", $$2.b + 1, $$1.size()));
            if ($$2.c == gbr.a.c) {
               $$0.a(gbs.d, this.A());
            }
         }

         $$2.a.b($$0.a());
      }
   }

   protected xo A() {
      return xo.c("narration.component_list.usage");
   }

   @Nullable
   public static get.a a(List<? extends gbr> $$0, @Nullable gbr $$1) {
      get.a $$2 = null;
      get.a $$3 = null;
      int $$4 = 0;

      for (int $$5 = $$0.size(); $$4 < $$5; $$4++) {
         gbr $$6 = $$0.get($$4);
         gbr.a $$7 = $$6.w();
         if ($$7.a()) {
            if ($$6 != $$1) {
               return new get.a($$6, $$4, $$7);
            }

            $$3 = new get.a($$6, $$4, $$7);
         } else if ($$7.compareTo($$2 != null ? $$2.c : gbr.a.a) > 0) {
            $$2 = new get.a($$6, $$4, $$7);
         }
      }

      return $$2 != null ? $$2 : $$3;
   }

   public void e(boolean $$0) {
      if ($$0) {
         this.a(w, false);
      }

      if (this.r != null) {
         this.r.a(this.n.n.aw().c());
      }
   }

   public fwz B() {
      return this.q;
   }

   public boolean C() {
      return false;
   }

   @Override
   public gcd I() {
      return new gcd(0, 0, this.o, this.p);
   }

   @Nullable
   public ayw D() {
      return null;
   }

   public static class a {
      public final gbr a;
      public final int b;
      public final gbr.a c;

      public a(gbr $$0, int $$1, gbr.a $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
