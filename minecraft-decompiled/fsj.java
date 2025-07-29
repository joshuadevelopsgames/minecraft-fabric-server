import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

class fsj extends fzs implements fsb {
   static final xo a = xo.c("mco.configure.worlds.title");
   private final fsc b;
   private final fue d;
   private fpx e;
   private final fxo f;
   private final fxo g;
   private final fxo h;
   private final List<frd> i = Lists.newArrayList();

   fsj(fsc $$0, fue $$1, fpx $$2) {
      super(a);
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      gbj.b $$3 = this.c.c(20).d(1);
      gbj.b $$4 = new gbj().c(16).d(4);
      this.i.clear();

      for (int $$5 = 1; $$5 < 5; $$5++) {
         this.i.add($$4.a(this.a($$5), gbn.i().f()));
      }

      $$3.a($$4.a());
      gbj.b $$6 = new gbj().c(8).d(1);
      this.f = $$6.a(fxo.a(xo.c("mco.configure.world.buttons.options"), $$3x -> $$1.a(new fsh($$0, $$2.j.get($$2.q).a(), $$2.n, $$2.q))).a(0, 0, 150, 20).a());
      this.g = $$6.a(fxo.a(xo.c("mco.configure.world.backup"), $$3x -> $$1.a(new fsa($$0, $$2.h(), $$2.q))).a(0, 0, 150, 20).a());
      this.h = $$6.a(fxo.a(xo.i(), $$0x -> this.c()).a(0, 0, 150, 20).a());
      $$3.a($$6.a(), gbn.i().b());
      this.g.j = true;
      this.a($$2);
   }

   private void c() {
      if (this.d()) {
         this.d.a(new frv(xo.c("mco.template.title.minigame"), this::a, fpx.d.b));
      } else {
         this.d.a(frt.a(this.b, this.e.h(), () -> this.d.execute(() -> this.d.a(this.b.n()))));
      }
   }

   private void a(@Nullable fqs $$0) {
      if ($$0 != null && fqs.a.b == $$0.i) {
         this.b.m();
         fsc $$1 = this.b.n();
         this.d.a(new fro($$1, new fti(this.e.b, $$0, $$1)));
      } else {
         this.d.a(this.b);
      }
   }

   private boolean d() {
      return this.e.j();
   }

   @Override
   public void b(fpx $$0) {
      this.a($$0);
   }

   @Override
   public void a(fpx $$0) {
      this.e = $$0;
      this.f.j = !$$0.k && !this.d();
      this.h.j = !$$0.k;
      if (this.d()) {
         this.h.b(xo.c("mco.configure.world.buttons.switchminigame"));
      } else {
         boolean $$1 = $$0.j.containsKey($$0.q) && $$0.j.get($$0.q).b.l;
         if ($$1) {
            this.h.b(xo.c("mco.configure.world.buttons.newworld"));
         } else {
            this.h.b(xo.c("mco.configure.world.buttons.resetworld"));
         }
      }

      this.g.j = !this.d();

      for (frd $$2 : this.i) {
         frd.b $$3 = $$2.a($$0);
         if ($$3.e) {
            $$2.b(80, 80);
         } else {
            $$2.b(50, 50);
         }
      }
   }

   private frd a(int $$0) {
      return new frd(0, 0, 80, 80, $$0, this.e, $$1 -> {
         frd.b $$2 = ((frd)$$1).a();
         switch ($$2.c) {
            case b:
               if ($$2.b) {
                  this.e();
               } else if ($$2.a) {
                  this.b($$0, this.e);
               } else {
                  this.a($$0, this.e);
               }
            case a:
               return;
            default:
               throw new IllegalStateException("Unknown action " + $$2.c);
         }
      });
   }

   private void e() {
      frv $$0 = new frv(xo.c("mco.template.title.minigame"), this::a, fpx.d.b);
      $$0.a(xo.c("mco.minigame.world.info.line1"), xo.c("mco.minigame.world.info.line2"));
      this.d.a($$0);
   }

   private void a(int $$0, fpx $$1) {
      this.d.a(frs.a(this.b, xo.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         fsc $$3 = this.b.n();
         this.b.m();
         this.d.a(new fro($$3, new ftj($$1.b, $$0, () -> this.d.execute(() -> this.d.a($$3)))));
      }));
   }

   private void b(int $$0, fpx $$1) {
      this.d.a(frs.a(this.b, xo.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.b.m();
         frt $$3 = frt.a(this.b, $$0, $$1, () -> this.d.execute(() -> this.d.a(this.b.n())));
         this.d.a($$3);
      }));
   }
}
