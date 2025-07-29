import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class gjt extends gjs<gsm.a> {
   private static final xo B = xo.c("gui.chatReport.title");
   private static final xo C = xo.c("gui.chatReport.select_chat");
   private fyh D;
   private fxo E;
   private fxo F;

   private gjt(get $$0, gst $$1, gsm.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public gjt(get $$0, gst $$1, UUID $$2) {
      this($$0, $$1, new gsm.a($$2, $$1.a().b()));
   }

   public gjt(get $$0, gst $$1, gsm $$2) {
      this($$0, $$1, new gsm.a($$2, $$1.a().b()));
   }

   @Override
   protected void m() {
      this.E = this.y.a(fxo.a(C, $$0 -> this.n.a(new gjv(this, this.x, this.z, $$0x -> {
         this.z = $$0x;
         this.E();
      }))).a(280).a());
      this.F = fxo.a(c, $$0 -> this.n.a(new gjy(this, this.z.i(), gss.a, $$0x -> {
         this.z.a($$0x);
         this.E();
      }))).a(280).a();
      this.y.a(gbg.a(this.q, this.F, b));
      this.D = this.a(280, 9 * 8, $$0 -> {
         this.z.a($$0);
         this.E();
      });
      this.y.a(gbg.a(this.q, this.D, d, $$0 -> $$0.e(12)));
   }

   @Override
   protected void E() {
      IntSet $$0 = this.z.a();
      if ($$0.isEmpty()) {
         this.E.b(C);
      } else {
         this.E.b(xo.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gsr $$1 = this.z.i();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      super.E();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
