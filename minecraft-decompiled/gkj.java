import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import javax.annotation.Nullable;

public class gkj extends get {
   private static final xo a = xo.c("selectWorld.experimental.title");
   private static final xo b = xo.c("selectWorld.experimental.message");
   private static final xo c = xo.c("selectWorld.experimental.details");
   private static final int d = 10;
   private static final int e = 100;
   private final BooleanConsumer f;
   final Collection<aww> u;
   private final gbj v = new gbj().a(10).b(20);

   public gkj(Collection<aww> $$0, BooleanConsumer $$1) {
      super(a);
      this.u = $$0;
      this.f = $$1;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aV_() {
      super.aV_();
      gbj.b $$0 = this.v.d(2);
      gbn $$1 = $$0.b().b();
      $$0.a(new fyx(this.m, this.q), 2, $$1);
      fyj $$2 = $$0.a(new fyj(b, this.q).b(true), 2, $$1);
      $$2.d(310);
      $$0.a(fxo.a(c, $$0x -> this.n.a(new gkj.a())).a(100).a(), 2, $$1);
      $$0.a(fxo.a(xn.i, $$0x -> this.f.accept(true)).a());
      $$0.a(fxo.a(xn.k, $$0x -> this.f.accept(false)).a());
      this.v.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.v.a();
      this.c();
   }

   @Override
   protected void c() {
      gbi.a(this.v, 0, 0, this.o, this.p, 0.5F, 0.5F);
   }

   @Override
   public void aP_() {
      this.f.accept(false);
   }

   class a extends get {
      private static final xo b = xo.c("selectWorld.experimental.details.title");
      final gbk c = new gbk(this);
      @Nullable
      private gkj.a.a d;

      a() {
         super(b);
      }

      @Override
      protected void aV_() {
         this.c.a(b, this.q);
         this.d = this.c.c(new gkj.a.a(this.n, gkj.this.u));
         this.c.b(fxo.a(xn.k, $$0 -> this.aP_()).a());
         this.c.a($$1 -> {
            fxm var10000 = this.c($$1);
         });
         this.c();
      }

      @Override
      protected void c() {
         if (this.d != null) {
            this.d.a(this.o, this.c);
         }

         this.c.a();
      }

      @Override
      public void aP_() {
         this.n.a(gkj.this);
      }

      class a extends fyl<gkj.a.b> {
         public a(final fue $$0, final Collection<aww> $$1) {
            super($$0, a.this.o, a.this.c.d(), a.this.c.c(), (9 + 2) * 3);

            for (aww $$2 : $$1) {
               String $$3 = cyf.a(cyf.g, $$2.e());
               if (!$$3.isEmpty()) {
                  xo $$4 = xr.a($$2.b().f(), yl.a.a(true));
                  xo $$5 = xo.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fyi.a(a.this.q, $$5, this.a())));
               }
            }
         }

         @Override
         public int a() {
            return this.g * 3 / 4;
         }
      }

      class b extends fyl.a<gkj.a.b> {
         private final xo b;
         private final xo c;
         private final fyi d;

         b(final xo $$0, final xo $$1, final fyi $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.n.h, this.b, $$3, $$2, -1);
            this.d.b($$0, $$3, $$2 + 12, 9, -1);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xn.a(this.b, this.c));
         }
      }
   }
}
