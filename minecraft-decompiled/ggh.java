import java.util.List;
import java.util.Optional;

public class ggh extends get {
   private static final xo a = xo.c("book.editTitle");
   private static final xo b = xo.c("book.finalizeWarning");
   private static final xo c = xo.c("book.sign.title");
   private static final xo d = xo.c("book.sign.titlebox");
   private final ggg e;
   private final cut f;
   private final List<String> u;
   private final bxi v;
   private final xo w;
   private fxx x;
   private String y = "";

   public ggh(ggg $$0, cut $$1, bxi $$2, List<String> $$3) {
      super(c);
      this.e = $$0;
      this.f = $$1;
      this.v = $$2;
      this.u = $$3;
      this.w = xo.a("book.byAuthor", $$1.aj()).a(o.i);
   }

   @Override
   protected void aV_() {
      fxo $$0 = fxo.a(xo.c("book.finalizeButton"), $$0x -> {
         this.l();
         this.n.a(null);
      }).a(this.o / 2 - 100, 196, 98, 20).a();
      $$0.j = false;
      this.x = this.c(new fxx(this.n.h, (this.o - 114) / 2 - 3, 50, 114, 20, d));
      this.x.f(15);
      this.x.d(false);
      this.x.f(true);
      this.x.m(-16777216);
      this.x.g(false);
      this.x.b($$1 -> $$0.j = !bdb.h($$1));
      this.x.a(this.y);
      this.c($$0);
      this.c(fxo.a(xn.e, $$0x -> {
         this.y = this.x.a();
         this.n.a(this.e);
      }).a(this.o / 2 + 2, 196, 98, 20).a());
   }

   @Override
   protected void aF_() {
      this.b(this.x);
   }

   private void l() {
      int $$0 = this.v == bxi.a ? this.f.gs().f() : 40;
      this.n.M().b(new aih($$0, this.u, Optional.of(this.x.a().trim())));
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.x.aM_() || this.x.a().isEmpty() || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.l();
         this.n.a(null);
         return true;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 192) / 2;
      int $$5 = 2;
      int $$6 = this.q.a(a);
      $$0.a(this.q, a, $$4 + 36 + (114 - $$6) / 2, 34, -16777216, false);
      int $$7 = this.q.a(this.w);
      $$0.a(this.q, this.w, $$4 + 36 + (114 - $$7) / 2, 60, -16777216, false);
      $$0.a(this.q, b, $$4 + 36, 82, 114, -16777216, false);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
      $$0.a(gxx.ar, ggi.e, (this.o - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }
}
