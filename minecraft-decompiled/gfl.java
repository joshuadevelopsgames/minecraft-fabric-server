import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public abstract class gfl<T extends art> extends get {
   public static final xo b = xo.c("menu.custom_screen_info.disconnect");
   private static final int a = 20;
   private static final fzd c = new fzd(ame.b("dialog/warning_button"), ame.b("dialog/warning_button_disabled"), ame.b("dialog/warning_button_highlighted"));
   private final T d;
   private final gbk e = new gbk(this);
   @Nullable
   private final get f;
   @Nullable
   private fyt u;
   private fxo v;
   private final gfi w;
   private Supplier<Optional<xm>> x = gfj.a;

   public gfl(@Nullable get $$0, T $$1, gfi $$2) {
      super($$1.A_().b());
      this.d = $$1;
      this.f = $$0;
      this.w = $$2;
   }

   @Override
   protected final void aV_() {
      super.aV_();
      this.v = this.E();
      this.v.l(-10);
      gfj $$0 = new gfj(this);
      gbo $$1 = gbo.d().a(10);
      $$1.c().b();
      this.e.a(this.l());

      for (ask $$2 : this.d.A_().g()) {
         gbm $$3 = gfs.a(this, $$2);
         if ($$3 != null) {
            $$1.a($$3);
         }
      }

      for (ary $$4 : this.d.A_().h()) {
         $$0.a($$4, $$1::a);
      }

      this.a($$1, $$0, this.d, this.w);
      this.u = new fyt(this.n, $$1, this.e.d());
      this.e.c(this.u);
      this.a(this.e, $$0, this.d, this.w);
      this.x = $$0.a(this.d.d());
      this.e.a($$0x -> {
         if ($$0x != this.v) {
            this.c($$0x);
         }
      });
      this.c(this.v);
      this.c();
   }

   protected void a(gbo $$0, gfj $$1, T $$2, gfi $$3) {
   }

   protected void a(gbk $$0, gfj $$1, T $$2, gfi $$3) {
   }

   @Override
   protected void c() {
      this.u.b(this.e.d());
      this.e.a();
      this.m();
   }

   protected gbm l() {
      gbo $$0 = gbo.e().a(10);
      $$0.c().b().e();
      $$0.a(new fyx(this.m, this.q));
      $$0.a(this.v);
      return $$0;
   }

   protected void m() {
      int $$0 = this.v.E();
      int $$1 = this.v.F();
      if ($$0 < 0 || $$1 < 0 || $$0 > this.o - 20 || $$1 > this.p - 20) {
         this.v.j(Math.max(0, this.o - 40));
         this.v.k(Math.min(5, this.p));
      }
   }

   private fxo E() {
      fya $$0 = new fya(0, 0, 20, 20, c, $$0x -> this.n.a(gfl.a.a(this.n, this)), xo.c("menu.custom_screen_info.button_narration"));
      $$0.a(fzb.a(xo.c("menu.custom_screen_info.tooltip")));
      return $$0;
   }

   @Override
   public boolean aQ_() {
      return this.d.A_().e();
   }

   @Override
   public boolean aG_() {
      return this.d.A_().d();
   }

   @Override
   public void aP_() {
      this.a(this.x.get(), aru.a);
   }

   public void a(Optional<xm> $$0) {
      this.a($$0, this.d.A_().f());
   }

   public void a(Optional<xm> $$0, aru $$1) {
      get $$2 = (get)(switch ($$1) {
         case b -> this;
         case a -> this.f;
         case c -> new gfq(this.f);
      });
      if ($$0.isPresent()) {
         this.a($$0.get(), $$2);
      } else {
         this.n.a($$2);
      }
   }

   private void a(xm $$0, @Nullable get $$1) {
      switch ($$0) {
         case xm.g var5:
            xm.g var10000 = var5;

            try {
               var11 = var10000.b();
            } catch (Throwable var9) {
               throw new MatchException(var9.toString(), var9);
            }

            String var10 = var11;
            this.w.a(el.a(var10), $$1);
            break;
         case xm.h $$3:
            this.w.a($$3.b(), $$1);
            break;
         case xm.d $$4:
            this.w.a($$4.b(), $$4.c());
            this.n.a($$1);
            break;
         default:
            b($$0, this.n, $$1);
      }
   }

   @Nullable
   public get n() {
      return this.f;
   }

   protected static gbm a(List<? extends gbm> $$0, int $$1) {
      gbj $$2 = new gbj();
      $$2.c().b();
      $$2.a(2).b(2);
      int $$3 = $$0.size();
      int $$4 = $$3 / $$1;
      int $$5 = $$4 * $$1;

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         $$2.a($$0.get($$6), $$6 / $$1, $$6 % $$1);
      }

      if ($$3 != $$5) {
         gbo $$7 = gbo.e().a(2);
         $$7.c().b();

         for (int $$8 = $$5; $$8 < $$3; $$8++) {
            $$7.a($$0.get($$8));
         }

         $$2.a($$7, $$4, 0, 1, $$1);
      }

      return $$2;
   }

   public static class a extends gdr {
      private final MutableObject<get> u;

      public static get a(fue $$0, get $$1) {
         return new gfl.a($$0, new MutableObject($$1));
      }

      private a(fue $$0, MutableObject<get> $$1) {
         super($$2 -> {
            if ($$2) {
               geo.a($$0, gfl.b);
            } else {
               $$0.a((get)$$1.getValue());
            }
         }, xo.c("menu.custom_screen_info.title"), xo.c("menu.custom_screen_info.contents"), xn.b($$0.U()), xn.k);
         this.u = $$1;
      }

      @Nullable
      public get l() {
         return (get)this.u.getValue();
      }

      public void a(@Nullable get $$0) {
         this.u.setValue($$0);
      }
   }
}
