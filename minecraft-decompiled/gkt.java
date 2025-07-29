import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkt extends get {
   private static final Logger d = LogUtils.getLogger();
   public static final eky a = new eky("test1".hashCode(), true, false);
   protected final get b;
   private fxo e;
   private fxo f;
   private fxo u;
   private fxo v;
   protected fxx c;
   private gkz w;

   public gkt(get $$0) {
      super(xo.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aV_() {
      this.c = new fxx(this.q, this.o / 2 - 100, 22, 200, 20, this.c, xo.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new gkz(this, this.n, this.o, this.p - 112, 48, 36, this.c.a(), this.w));
      this.f = this.c(fxo.a(fct.a, $$0 -> this.w.c().ifPresent(gkz.c::c)).a(this.o / 2 - 154, this.p - 52, 150, 20).a());
      this.c(fxo.a(xo.c("selectWorld.create"), $$0 -> gkl.a(this.n, this)).a(this.o / 2 + 4, this.p - 52, 150, 20).a());
      this.u = this.c(fxo.a(xo.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(gkz.c::g)).a(this.o / 2 - 154, this.p - 28, 72, 20).a());
      this.e = this.c(fxo.a(xo.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(gkz.c::d)).a(this.o / 2 - 76, this.p - 28, 72, 20).a());
      this.v = this.c(fxo.a(xo.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(gkz.c::h)).a(this.o / 2 + 4, this.p - 28, 72, 20).a());
      this.c(fxo.a(xn.k, $$0 -> this.n.a(this.b)).a(this.o / 2 + 82, this.p - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aF_() {
      this.b(this.c);
   }

   @Override
   public void aP_() {
      this.n.a(this.b);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 8, -1);
   }

   public void a(@Nullable fct $$0) {
      if ($$0 == null) {
         this.f.b(fct.a);
         this.f.j = false;
         this.u.j = false;
         this.v.j = false;
         this.e.j = false;
      } else {
         this.f.b($$0.t());
         this.f.j = $$0.u();
         this.u.j = $$0.w();
         this.v.j = $$0.x();
         this.e.j = $$0.y();
      }
   }

   @Override
   public void aI_() {
      if (this.w != null) {
         this.w.aH_().forEach(gkz.a::close);
      }
   }
}
