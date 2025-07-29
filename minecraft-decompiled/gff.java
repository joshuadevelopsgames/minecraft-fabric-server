import com.google.common.collect.Lists;
import java.util.List;

public class gff extends get {
   static final ame a = ame.b("gamemode_switcher/slot");
   static final ame b = ame.b("gamemode_switcher/selection");
   private static final ame c = ame.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int e = 128;
   private static final int f = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = gff.a.values().length * 31 - 5;
   private static final xo y = xo.a("debug.gamemodes.select_next", xo.c("debug.gamemodes.press_f4").a(o.l));
   private final gff.a z;
   private gff.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<gff.b> E = Lists.newArrayList();

   public gff() {
      super(ftv.a);
      this.z = gff.a.a(this.l());
      this.A = this.z;
   }

   private dmr l() {
      gru $$0 = fue.R().r;
      dmr $$1 = $$0.h();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.i() == dmr.b ? dmr.a : dmr.b;
      }
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < gff.a.e.length; $$0++) {
         gff.a $$1 = gff.a.e[$$0];
         this.E.add(new gff.b($$1, this.o / 2 - x / 2 + $$0 * 31, this.p / 2 - 31));
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (!this.n()) {
         $$0.a(this.q, this.A.h, this.o / 2, this.p / 2 - 31 - 20, -1);
         $$0.a(this.q, y, this.o / 2, this.p / 2 + 5, -1);
         if (!this.D) {
            this.B = $$1;
            this.C = $$2;
            this.D = true;
         }

         boolean $$4 = this.B == $$1 && this.C == $$2;

         for (gff.b $$5 : this.E) {
            $$5.a($$0, $$1, $$2, $$3);
            $$5.b(this.A == $$5.a);
            if (!$$4 && $$5.C()) {
               this.A = $$5.a;
            }
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.o / 2 - 62;
      int $$5 = this.p / 2 - 31 - 27;
      $$0.a(gxx.ar, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
   }

   private void m() {
      a(this.n, this.A);
   }

   private static void a(fue $$0, gff.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         gff.a $$2 = gff.a.a($$0.r.i());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.b(new ahr($$1.i));
         }
      }
   }

   private boolean n() {
      if (!fna.a(this.n.aP().h(), 292)) {
         this.m();
         this.n.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.D = false;
         this.A = this.A.a();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   static enum a {
      a(xo.c("gameMode.creative"), dmr.b, new dcv(dqb.i)),
      b(xo.c("gameMode.survival"), dmr.a, new dcv(dcz.qg)),
      c(xo.c("gameMode.adventure"), dmr.c, new dcv(dcz.vL)),
      d(xo.c("gameMode.spectator"), dmr.d, new dcv(dcz.tR));

      static final gff.a[] e = values();
      private static final int f = 16;
      private static final int g = 5;
      final xo h;
      final dmr i;
      private final dcv j;

      private a(final xo $$0, final dmr $$1, final dcv $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      void a(fxb $$0, int $$1, int $$2) {
         $$0.a(this.j, $$1, $$2);
      }

      gff.a a() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static gff.a a(dmr $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public static class b extends fxm {
      final gff.a a;
      private boolean b;

      public b(gff.a $$0, int $$1, int $$2) {
         super($$1, $$2, 26, 26, $$0.h);
         this.a = $$0;
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         if (this.b) {
            this.b($$0);
         }

         this.a.a($$0, this.E() + 5, this.F() + 5);
      }

      @Override
      public void a(gbt $$0) {
         this.c($$0);
      }

      @Override
      public boolean C() {
         return super.C() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fxb $$0) {
         $$0.a(gxx.ar, gff.a, this.E(), this.F(), 26, 26);
      }

      private void b(fxb $$0) {
         $$0.a(gxx.ar, gff.b, this.E(), this.F(), 26, 26);
      }
   }
}
