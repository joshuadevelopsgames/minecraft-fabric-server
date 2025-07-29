import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyr extends get {
   private static final ame a = ame.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int e = 130;
   private static final int f = 64;
   private static final int u = 250;
   private final get v;
   @Nullable
   private final ame w;
   private final xo x;
   private final List<fyr.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final gbo B = gbo.d();

   fyr(get $$0, int $$1, @Nullable ame $$2, xo $$3, xo $$4, List<fyr.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.v.p();
   }

   @Override
   protected void aV_() {
      this.v.b(this.n, this.o, this.p);
      this.B.a(12).c().b();
      this.B.a(new fyj(this.m.f().a(o.r), this.q).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fyb.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fyj(this.x, this.q).d(this.A).b(true));
      this.B.a(this.l());
      this.B.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   private gbo l() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      gbo $$2 = gbo.e();
      $$2.a(6);

      for (fyr.b $$3 : this.y) {
         $$2.a(fxo.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.n, this.o, this.p);
      this.B.a();
      gbi.a(this.B, this.I());
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.v.b($$0, $$1, $$2, $$3);
      $$0.c();
      this.v.a($$0, -1, -1, $$3);
      $$0.c();
      this.c($$0);
      $$0.a(gxx.ar, a, this.B.E() - 18, this.B.F() - 18, this.B.z() + 36, this.B.y() + 36);
   }

   @Override
   public xo i() {
      return xn.a(this.m, this.x);
   }

   @Override
   public void aP_() {
      if (this.z != null) {
         this.z.run();
      }

      this.n.a(this.v);
   }

   public static class a {
      private final get a;
      private final xo b;
      private xo c = xn.a;
      private int d = 250;
      @Nullable
      private ame e;
      private final List<fyr.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(get $$0, xo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fyr.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fyr.a a(ame $$0) {
         this.e = $$0;
         return this;
      }

      public fyr.a a(xo $$0) {
         this.c = $$0;
         return this;
      }

      public fyr.a a(xo $$0, Consumer<fyr> $$1) {
         this.f.add(new fyr.b($$0, $$1));
         return this;
      }

      public fyr.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fyr a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fyr(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   record b(xo a, Consumer<fyr> b) {
   }
}
