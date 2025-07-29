import java.util.List;
import javax.annotation.Nullable;

public class ghq extends get {
   private static final List<efm> a = List.of(efm.values());
   private static final xo b = xo.c(dqb.pJ.v());
   private static final xo c = xo.c("test_block.message");
   private final jb d;
   private efm e;
   private String f;
   @Nullable
   private fxx u;

   public ghq(ect $$0) {
      super(b);
      this.d = $$0.aA_();
      this.e = $$0.d();
      this.f = $$0.v();
   }

   @Override
   public void aV_() {
      this.u = new fxx(this.q, this.o / 2 - 152, 80, 240, 20, xo.c("test_block.message"));
      this.u.f(128);
      this.u.a(this.f);
      this.c(this.u);
      this.b(this.u);
      this.a(this.e);
      this.c(fxv.<efm>a(efm::a).a(a).a().a(this.e).a(this.o / 2 - 4 - 150, 185, 50, 20, b, ($$0, $$1) -> this.a($$1)));
      this.c(fxo.a(xn.d, $$0 -> this.l()).a(this.o / 2 - 4 - 150, 210, 150, 20).a());
      this.c(fxo.a(xn.e, $$0 -> this.m()).a(this.o / 2 + 4, 210, 150, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 10, -1);
      if (this.e != efm.a) {
         $$0.b(this.q, c, this.o / 2 - 153, 70, -6250336);
      }

      $$0.b(this.q, this.e.b(), this.o / 2 - 153, 174, -6250336);
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   private void l() {
      this.f = this.u.a();
      this.n.M().b(new ajk(this.d, this.e, this.f));
      this.aP_();
   }

   @Override
   public void aP_() {
      this.m();
   }

   private void m() {
      this.n.a(null);
   }

   private void a(efm $$0) {
      this.e = $$0;
      this.u.k = $$0 != efm.a;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }
}
