import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqu extends cqr {
   private static final alh<jl<cqv>> d = all.a(cqu.class, alj.E);
   public static final float c = 0.0625F;

   public cqu(bzv<? extends cqu> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(d, cxc.b(this.eb(), mn.be));
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.e();
      }
   }

   private void a(jl<cqv> $$0) {
      this.ay.a(d, $$0);
   }

   public jl<cqv> l() {
      return this.ay.a(d);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aM ? c((kp<T>)$$0, this.l()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aM);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aM) {
         this.a(c(kq.aM, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cqu> a(dmu $$0, jb $$1, jh $$2) {
      cqu $$3 = new cqu($$0, $$1);
      List<jl<cqv>> $$4 = new ArrayList<>();
      $$0.K_().f(mn.be).c(azy.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.b($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.f();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cqu::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<jl<cqv>> $$6 = ag.b($$4, $$3.ar);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.a($$6.get());
               $$3.b($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int b(jl<cqv> $$0) {
      return $$0.a().a();
   }

   private cqu(dmu $$0, jb $$1) {
      super(bzv.aM, $$0, $$1);
   }

   public cqu(dmu $$0, jb $$1, jh $$2, jl<cqv> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.b($$2);
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("facing", jh.l, this.cS());
      super.a($$0);
      cxc.a($$0, this.l());
   }

   @Override
   protected void a(fda $$0) {
      jh $$1 = $$0.<jh>a("facing", jh.l).orElse(jh.d);
      super.a($$0);
      this.b($$1);
      cxc.a($$0, mn.be).ifPresent(this::a);
   }

   @Override
   protected fin a(jb $$0, jh $$1) {
      float $$2 = 0.46875F;
      fis $$3 = fis.b($$0).a($$1, -0.46875);
      cqv $$4 = this.l().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jh $$7 = $$1.i();
      fis $$8 = $$3.a($$7, $$5).a(jh.b, $$6);
      jh.a $$9 = $$1.o();
      double $$10 = $$9 == jh.a.a ? 0.0625 : $$4.b();
      double $$11 = $$4.c();
      double $$12 = $$9 == jh.a.c ? 0.0625 : $$4.b();
      return fin.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(aub $$0, @Nullable bzm $$1) {
      if ($$0.P().c(dmq.j)) {
         this.a(ayz.tE, 1.0F, 1.0F);
         if (!($$1 instanceof cut $$2 && $$2.gc())) {
            this.a($$0, dcz.re);
         }
      }
   }

   @Override
   public void u() {
      this.a(ayz.tF, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fis dw() {
      return fis.a(this.a);
   }

   @Override
   public zw<acq> a(atz $$0) {
      return new acr(this, this.cS().d(), this.i());
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      this.b(jh.a($$0.p()));
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.re);
   }
}
