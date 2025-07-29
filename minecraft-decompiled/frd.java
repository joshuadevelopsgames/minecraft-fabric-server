import javax.annotation.Nullable;

public class frd extends fxo {
   private static final ame u = ame.b("widget/slot_frame");
   public static final ame a = ame.b("textures/gui/realms/empty_frame.png");
   public static final ame b = ame.b("textures/gui/title/background/panorama_0.png");
   public static final ame c = ame.b("textures/gui/title/background/panorama_2.png");
   public static final ame d = ame.b("textures/gui/title/background/panorama_3.png");
   private static final xo v = xo.c("mco.configure.world.slot.tooltip.minigame");
   private static final xo w = xo.c("mco.configure.world.slot.tooltip");
   static final xo x = xo.c("mco.worldSlot.minigame");
   private static final int y = 64;
   private static final String z = "...";
   private final int A;
   private frd.b B;

   public frd(int $$0, int $$1, int $$2, int $$3, int $$4, fpx $$5, fxo.c $$6) {
      super($$0, $$1, $$2, $$3, xn.a, $$6, q);
      this.A = $$4;
      this.B = this.a($$5);
   }

   public frd.b a() {
      return this.B;
   }

   public frd.b a(fpx $$0) {
      this.B = new frd.b($$0, this.A);
      this.a(this.B, $$0.r);
      return this.B;
   }

   private void a(frd.b $$0, @Nullable String $$1) {
      xo $$2 = switch ($$0.c) {
         case b -> $$0.b ? v : w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fzb.a($$2));
      }

      yc $$3 = xo.b($$0.f);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xn.w).f($$1);
      }

      this.b($$3);
   }

   static frd.a a(fpx $$0, boolean $$1, boolean $$2) {
      return $$2 || $$1 && $$0.k ? frd.a.a : frd.a.b;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.E();
      int $$5 = this.F();
      boolean $$6 = this.C();
      ame $$7;
      if (this.B.b) {
         $$7 = fst.a(String.valueOf(this.B.i), this.B.j);
      } else if (this.B.a) {
         $$7 = a;
      } else if (this.B.j != null && this.B.i != -1L) {
         $$7 = fst.a(String.valueOf(this.B.i), this.B.j);
      } else if (this.A == 1) {
         $$7 = b;
      } else if (this.A == 2) {
         $$7 = c;
      } else if (this.A == 3) {
         $$7 = d;
      } else {
         $$7 = a;
      }

      int $$14 = -1;
      if (!this.B.e) {
         $$14 = baj.a(1.0F, 0.56F, 0.56F, 0.56F);
      }

      $$0.a(gxx.ar, $$7, $$4 + 1, $$5 + 1, 0.0F, 0.0F, this.g - 2, this.h - 2, 74, 74, 74, 74, $$14);
      if ($$6 && this.B.c != frd.a.a) {
         $$0.a(gxx.ar, u, $$4, $$5, this.g, this.h);
      } else if (this.B.e) {
         $$0.a(gxx.ar, u, $$4, $$5, this.g, this.h, baj.a(1.0F, 0.8F, 0.8F, 0.8F));
      } else {
         $$0.a(gxx.ar, u, $$4, $$5, this.g, this.h, baj.a(1.0F, 0.56F, 0.56F, 0.56F));
      }

      if (this.B.d) {
         $$0.a(gxx.ar, fol.a, $$4 + 3, $$5 + 4, 9, 8);
      }

      fwz $$15 = fue.R().h;
      String $$16 = this.B.f;
      if ($$15.b($$16) > 64) {
         $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
      }

      $$0.a($$15, $$16, $$4 + this.g / 2, $$5 + this.h - 14, -1);
      if (this.B.e) {
         $$0.a($$15, fol.a(this.B.g, this.B.h.a()), $$4 + this.g / 2, $$5 + this.h + 2, -1);
      }
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      final String f;
      final String g;
      final fpx.a h;
      final long i;
      @Nullable
      final String j;
      public final boolean a;
      public final boolean b;
      public final frd.a c;
      public final boolean d;
      public final boolean e;

      public b(fpx $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.f = frd.x.getString();
            this.i = $$0.s;
            this.j = $$0.t;
            this.a = $$0.s == -1;
            this.g = "";
            this.h = fpx.a.a;
            this.d = false;
            this.e = $$0.j();
         } else {
            fqb $$2 = $$0.j.get($$1);
            this.f = $$2.b.a($$1);
            this.i = $$2.b.j;
            this.j = $$2.b.k;
            this.a = $$2.b.l;
            this.g = $$2.b.h;
            this.h = $$2.b.i;
            this.d = $$2.b();
            this.e = $$0.q == $$1 && !$$0.j();
         }

         this.c = frd.a($$0, this.b, this.e);
      }
   }
}
