import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class gkg extends fxl {
   private static final int c = 32;
   private static final String d = "telemetry.event.required";
   private static final String e = "telemetry.event.optional";
   private static final String f = "telemetry.event.optional.disabled";
   private static final xo m = xo.c("telemetry_info.property_title").a(o.t);
   private final fwz n;
   private gkg.a o;
   @Nullable
   private DoubleConsumer p;

   public gkg(int $$0, int $$1, int $$2, int $$3, fwz $$4) {
      super($$0, $$1, $$2, $$3, xo.i());
      this.n = $$4;
      this.o = this.c(fue.R().D());
   }

   public void b(boolean $$0) {
      this.o = this.c($$0);
      this.h();
   }

   public void q() {
      this.o = this.c(fue.R().D());
      this.h();
   }

   private gkg.a c(boolean $$0) {
      gkg.b $$1 = new gkg.b(this.r());
      List<hxg> $$2 = new ArrayList<>(hxg.g());
      $$2.sort(Comparator.comparing(hxg::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         hxg $$4 = $$2.get($$3);
         boolean $$5 = $$4.d() && !$$0;
         this.a($$1, $$4, $$5);
         if ($$3 < $$2.size() - 1) {
            $$1.a(9);
         }
      }

      return $$1.a();
   }

   public void a(@Nullable DoubleConsumer $$0) {
      this.p = $$0;
   }

   @Override
   public void a(double $$0) {
      super.a($$0);
      if (this.p != null) {
         this.p.accept(this.g());
      }
   }

   @Override
   protected int c() {
      return this.o.a().y();
   }

   @Override
   protected double o() {
      return 9.0;
   }

   @Override
   protected void c(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.p();
      int $$5 = this.e();
      $$0.e().pushMatrix();
      $$0.e().translate($$5, $$4);
      this.o.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.e().popMatrix();
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, this.o.b());
   }

   private xo a(xo $$0, boolean $$1) {
      return (xo)($$1 ? $$0.f().a(o.h) : $$0);
   }

   private void a(gkg.b $$0, hxg $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.n, this.a(xo.a($$3, $$1.e()), $$2));
      $$0.b(this.n, $$1.f().a(o.h));
      $$0.a(9 / 2);
      $$0.a(this.n, this.a(m, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(hxg $$0, gkg.b $$1, boolean $$2) {
      for (hxi<?> $$3 : $$0.b()) {
         $$1.a(this.n, this.a($$3.a(), $$2));
      }
   }

   private int r() {
      return this.g - this.b();
   }

   record a(gbl a, xo b) {
   }

   static class b {
      private final int a;
      private final gbo b;
      private final yc c = xo.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = gbo.d();
         this.b.c().a();
         this.b.a(gbp.a($$0));
      }

      public void a(fwz $$0, xo $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fwz $$0, xo $$1, int $$2) {
         this.b.a(new fyj($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fwz $$0, xo $$1) {
         this.b.a(new fyj($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(gbp.b($$0));
      }

      public gkg.a a() {
         this.b.a();
         return new gkg.a(this.b, this.c);
      }
   }
}
