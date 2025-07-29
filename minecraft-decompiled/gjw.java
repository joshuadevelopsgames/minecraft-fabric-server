import java.util.UUID;
import javax.annotation.Nullable;

public class gjw extends gjs<gso.a> {
   private static final xo B = xo.c("gui.abuseReport.name.title");
   private static final xo C = xo.c("gui.abuseReport.name.comment_box_label");
   @Nullable
   private fyh D;

   private gjw(get $$0, gst $$1, gso.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public gjw(get $$0, gst $$1, UUID $$2, String $$3) {
      this($$0, $$1, new gso.a($$2, $$3, $$1.a().b()));
   }

   public gjw(get $$0, gst $$1, gso $$2) {
      this($$0, $$1, new gso.a($$2, $$1.a().b()));
   }

   @Override
   protected void m() {
      xo $$0 = xo.b(this.z.e().a()).a(o.o);
      this.y.a(new fyx(xo.a("gui.abuseReport.name.reporting", $$0), this.q), $$0x -> $$0x.b().a(0, 8));
      this.D = this.a(280, 9 * 8, $$0x -> {
         this.z.a($$0x);
         this.E();
      });
      this.y.a(gbg.a(this.q, this.D, C, $$0x -> $$0x.e(12)));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (super.b($$0, $$1, $$2)) {
         return true;
      } else {
         return this.D != null ? this.D.b($$0, $$1, $$2) : false;
      }
   }
}
