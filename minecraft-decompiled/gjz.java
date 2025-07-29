import java.util.UUID;
import java.util.function.Supplier;

public class gjz extends gjs<gsu.a> {
   private static final int B = 85;
   private static final int C = 178;
   private static final xo D = xo.c("gui.abuseReport.skin.title");
   private fyh E;
   private fxo F;

   private gjz(get $$0, gst $$1, gsu.a $$2) {
      super(D, $$0, $$1, $$2);
   }

   public gjz(get $$0, gst $$1, UUID $$2, Supplier<hst> $$3) {
      this($$0, $$1, new gsu.a($$2, $$3, $$1.a().b()));
   }

   public gjz(get $$0, gst $$1, gsu $$2) {
      this($$0, $$1, new gsu.a($$2, $$1.a().b()));
   }

   @Override
   protected void m() {
      gbo $$0 = this.y.a(gbo.e().a(8));
      $$0.c().e();
      $$0.a(new fyp(85, 120, this.n.aT(), this.z.e().a()));
      gbo $$1 = $$0.a(gbo.d().a(8));
      this.F = fxo.a(c, $$0x -> this.n.a(new gjy(this, this.z.i(), gss.b, $$0xx -> {
         this.z.a($$0xx);
         this.E();
      }))).a(178).a();
      $$1.a(gbg.a(this.q, this.F, b));
      this.E = this.a(178, 9 * 8, $$0x -> {
         this.z.a($$0x);
         this.E();
      });
      $$1.a(gbg.a(this.q, this.E, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void E() {
      gsr $$0 = this.z.i();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      super.E();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}
