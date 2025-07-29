import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class giu extends giq {
   private static final xo a = xo.c("options.videoTitle");
   private static final xo f = xo.c("options.graphics.fabulous").a(o.u);
   private static final xo u = xo.a("options.graphics.warning.message", f, f);
   private static final xo v = xo.c("options.graphics.warning.title").a(o.m);
   private static final xo w = xo.c("options.graphics.warning.accept");
   private static final xo x = xo.c("options.graphics.warning.cancel");
   private final gxd y;
   private final int z;

   private static fuh<?>[] a(fui $$0) {
      return new fuh[]{
         $$0.l(),
         $$0.e(),
         $$0.n(),
         $$0.f(),
         $$0.m(),
         $$0.h(),
         $$0.R(),
         $$0.i(),
         $$0.au(),
         $$0.G(),
         $$0.at(),
         $$0.j(),
         $$0.ae(),
         $$0.av(),
         $$0.F(),
         $$0.S(),
         $$0.an(),
         $$0.g(),
         $$0.ao(),
         $$0.aj(),
         $$0.aq(),
         $$0.ar(),
         $$0.r(),
         $$0.af(),
         $$0.k()
      };
   }

   public giu(get $$0, fue $$1, fui $$2) {
      super($$0, $$2, a);
      this.y = $$1.ak();
      this.y.h();
      if ($$2.l().c() == ftw.c) {
         this.y.d();
      }

      this.z = $$2.F().c();
   }

   @Override
   protected void l() {
      int $$0 = -1;
      fni $$1 = this.n.aP();
      fnd $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fnh> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fuh<Integer> $$6 = new fuh<>("options.fullscreen.resolution", fuh.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xo.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fui.a($$1x, xo.c("options.fullscreen.current"));
         } else {
            fnh $$3x = $$2.a($$2x);
            return fui.a($$1x, xo.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fuh.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.H());
      this.d.a(a(this.c));
   }

   @Override
   public void aP_() {
      this.n.aP().f();
      super.aP_();
   }

   @Override
   public void aI_() {
      if (this.c.F().c() != this.z) {
         this.n.a(this.c.F().c());
         this.n.S();
      }

      super.aI_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.y.f()) {
            List<xo> $$3 = Lists.newArrayList(new xo[]{u, xn.t});
            String $$4 = this.y.i();
            if ($$4 != null) {
               $$3.add(xn.t);
               $$3.add(xo.a("options.graphics.warning.renderer", $$4).a(o.h));
            }

            String $$5 = this.y.k();
            if ($$5 != null) {
               $$3.add(xn.t);
               $$3.add(xo.a("options.graphics.warning.vendor", $$5).a(o.h));
            }

            String $$6 = this.y.j();
            if ($$6 != null) {
               $$3.add(xn.t);
               $$3.add(xo.a("options.graphics.warning.version", $$6).a(o.h));
            }

            this.n.a(new git(v, $$3, ImmutableList.of(new git.a(w, $$0x -> {
               this.c.l().a(ftw.c);
               fue.R().f.d();
               this.y.d();
               this.n.a(this);
            }), new git.a(x, $$0x -> {
               this.y.e();
               this.n.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (get.s()) {
         fuh<Integer> $$4 = this.c.au();
         if ($$4.e() instanceof fuh.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fxv<Integer> $$9 = (fxv<Integer>)this.d.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.d.a(0.0);
                  return true;
               }
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void c(boolean $$0) {
      if (this.d != null) {
         fxm $$1 = this.d.b(this.c.ae());
         if ($$1 != null) {
            fxv<Boolean> $$2 = (fxv<Boolean>)$$1;
            $$2.a($$0);
         }
      }
   }
}
