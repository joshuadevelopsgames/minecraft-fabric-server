import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

class fse extends fzs implements fsb {
   static final Logger b = LogUtils.getLogger();
   static final xo a = xo.c("mco.configure.world.players.title");
   static final xo d = xo.c("mco.question");
   private static final int e = 8;
   final fsc f;
   final fue g;
   fpx h;
   private final fse.b i;

   fse(fsc $$0, fue $$1, fpx $$2) {
      super(a);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      gbj.b $$3 = this.c.c(8).d(1);
      this.i = $$3.a(new fse.b($$0.o, this.a()), gbn.i().d().b());
      $$3.a(fxo.a(xo.c("mco.configure.world.buttons.invite"), $$3x -> $$1.a(new fsd($$0, $$2))).a(), gbn.i().f().b());
      this.a($$2);
   }

   public int a() {
      return this.f.g() - 20 - 16;
   }

   @Override
   public void a(gcd $$0) {
      this.i.b(this.f.o, this.a());
      super.a($$0);
   }

   @Override
   public void a(fpx $$0) {
      this.h = $$0;
      this.i.aH_().clear();

      for (fpp $$1 : $$0.i) {
         this.i.aH_().add(new fse.a($$1));
      }
   }

   class a extends fxu.a<fse.a> {
      protected static final int a = 32;
      private static final xo c = xo.c("mco.configure.world.invites.normal.tooltip");
      private static final xo d = xo.c("mco.configure.world.invites.ops.tooltip");
      private static final xo e = xo.c("mco.configure.world.invites.remove.tooltip");
      private static final ame f = ame.b("player_list/make_operator");
      private static final ame g = ame.b("player_list/remove_operator");
      private static final ame h = ame.b("player_list/remove_player");
      private static final int i = 8;
      private static final int j = 7;
      private final fpp k;
      private final fxo l;
      private final fxo m;
      private final fxo n;

      public a(final fpp $$0) {
         this.k = $$0;
         int $$1 = fse.this.h.i.indexOf(this.k);
         this.m = fyv.a(c, $$1x -> this.a($$1), false)
            .a(f, 8, 7)
            .a(16 + fse.this.f.B().a(c))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", d)))
            .a();
         this.n = fyv.a(d, $$1x -> this.b($$1), false)
            .a(g, 8, 7)
            .a(16 + fse.this.f.B().a(d))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get(), xo.a("narration.cycle_button.usage.focused", c)))
            .a();
         this.l = fyv.a(e, $$1x -> this.c($$1), false)
            .a(h, 8, 7)
            .a(16 + fse.this.f.B().a(e))
            .a($$1x -> xn.a(xo.a("mco.invited.player.narration", $$0.a()), (xo)$$1x.get()))
            .a();
         this.c();
      }

      private void a(int $$0) {
         UUID $$1 = fse.this.h.i.get($$0).b();
         fsu.<fpl>a($$1x -> $$1x.b(fse.this.h.b, $$1), $$0x -> fse.b.error("Couldn't op the user", $$0x)).thenAcceptAsync($$0x -> {
            this.a($$0x);
            this.c();
            this.a(this.n);
         }, fse.this.g);
      }

      private void b(int $$0) {
         UUID $$1 = fse.this.h.i.get($$0).b();
         fsu.<fpl>a($$1x -> $$1x.c(fse.this.h.b, $$1), $$0x -> fse.b.error("Couldn't deop the user", $$0x)).thenAcceptAsync($$0x -> {
            this.a($$0x);
            this.c();
            this.a(this.m);
         }, fse.this.g);
      }

      private void c(int $$0) {
         if ($$0 >= 0 && $$0 < fse.this.h.i.size()) {
            fpp $$1 = fse.this.h.i.get($$0);
            frj $$2 = new frj($$2x -> {
               if ($$2x) {
                  fsu.a($$1xx -> $$1xx.a(fse.this.h.b, $$1.b()), $$0xx -> fse.b.error("Couldn't uninvite user", $$0xx));
                  fse.this.h.i.remove($$0);
                  fse.this.a(fse.this.h);
               }

               fse.this.g.a(fse.this.f);
            }, fse.d, xo.a("mco.configure.world.uninvite.player", $$1.a()));
            fse.this.g.a($$2);
         }
      }

      private void a(fpl $$0) {
         for (fpp $$1 : fse.this.h.i) {
            $$1.a($$0.a.contains($$1.a()));
         }
      }

      private void c() {
         this.m.k = !this.k.c();
         this.n.k = !this.m.k;
      }

      private fxo g() {
         return this.m.k ? this.m : this.n;
      }

      @Override
      public List<? extends fzn> aH_() {
         return ImmutableList.of(this.g(), this.l);
      }

      @Override
      public List<? extends gbr> b() {
         return ImmutableList.of(this.g(), this.l);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10;
         if (!this.k.d()) {
            $$10 = -6250336;
         } else if (this.k.e()) {
            $$10 = -16711936;
         } else {
            $$10 = -1;
         }

         int $$13 = $$2 + $$5 / 2 - 16;
         fsu.a($$0, $$3, $$13, 32, this.k.b());
         int $$14 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fse.this.f.B(), this.k.a(), $$3 + 8 + 32, $$14, $$10);
         int $$15 = $$2 + $$5 / 2 - 10;
         int $$16 = $$3 + $$4 - this.l.z();
         this.l.c($$16, $$15);
         this.l.a($$0, $$6, $$7, $$9);
         int $$17 = $$16 - this.g().z() - 8;
         this.m.c($$17, $$15);
         this.m.a($$0, $$6, $$7, $$9);
         this.n.c($$17, $$15);
         this.n.a($$0, $$6, $$7, $$9);
      }
   }

   class b extends fxu<fse.a> {
      private static final int m = 36;

      public b(final int $$0, final int $$1) {
         super(fue.R(), $$0, $$1, fse.this.f.h(), 36, (int)(9.0F * 1.5F));
      }

      @Override
      protected void a(fxb $$0, int $$1, int $$2) {
         String $$3 = fse.this.h.i != null ? Integer.toString(fse.this.h.i.size()) : "0";
         xo $$4 = xo.a("mco.configure.world.invited.number", $$3).a(o.t);
         $$0.b(fse.this.f.B(), $$4, $$1 + this.a() / 2 - fse.this.f.B().a($$4) / 2, $$2, -1);
      }

      @Override
      protected void a(fxb $$0) {
      }

      @Override
      protected void b(fxb $$0) {
      }

      @Override
      public int a() {
         return 300;
      }
   }
}
