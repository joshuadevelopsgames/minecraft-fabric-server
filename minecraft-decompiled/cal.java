import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cal extends bzm {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private auc h;
   private final Set<bzm> i = Sets.newHashSet();
   private int j;

   public cal(bzv<? extends cal> $$0, dmu $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ar.g();
      this.f = this.ar.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public aza do() {
      return aza.d;
   }

   @Nullable
   public auc e() {
      return this.h;
   }

   public void b(@Nullable auc $$0) {
      this.h = $$0;
   }

   private void l() {
      jb $$0 = this.m();
      eeb $$1 = this.ai().a_($$0);
      if ($$1.a(dqb.tb)) {
         ((duv)$$1.b()).d($$1, this.ai(), $$0);
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.e == 2) {
         if (this.ai().B_()) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.pf, aza.d, 10000.0F, 0.8F + this.ar.i() * 0.2F, false);
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.pe, aza.d, 2.0F, 0.5F + this.ar.i() * 0.2F, false);
         } else {
            bxg $$0 = this.ai().an();
            if ($$0 == bxg.c || $$0 == bxg.d) {
               this.b(4);
            }

            this.l();
            b(this.ai(), this.m());
            this.c(ejb.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.ai() instanceof aub) {
               List<bzm> $$1 = this.ai()
                  .a(
                     this,
                     new fin(this.dC() - 15.0, this.dE() - 15.0, this.dI() - 15.0, this.dC() + 15.0, this.dE() + 6.0 + 15.0, this.dI() + 15.0),
                     $$0 -> $$0.bO() && !this.i.contains($$0)
                  );

               for (auc $$2 : ((aub)this.ai()).a($$0 -> $$0.f(this) < 256.0F)) {
                  aq.W.a($$2, this, $$1);
               }
            }

            this.at();
         } else if (this.e < -this.ar.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ar.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.ai() instanceof aub)) {
            this.ai().c(2);
         } else if (!this.g) {
            List<bzm> $$3 = this.ai()
               .a(this, new fin(this.dC() - 3.0, this.dE() - 3.0, this.dI() - 3.0, this.dC() + 3.0, this.dE() + 6.0 + 3.0, this.dI() + 3.0), bzm::bO);

            for (bzm $$4 : $$3) {
               $$4.a((aub)this.ai(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               aq.F.a(this.h, $$3);
            }
         }
      }
   }

   private jb m() {
      fis $$0 = this.dv();
      return jb.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.ai() instanceof aub $$1 && $$1.P().c(dmq.b)) {
         jb $$3 = this.dx();
         eeb $$4 = dpm.a(this.ai(), $$3);
         if (this.ai().a_($$3).l() && $$4.a((dmx)this.ai(), $$3)) {
            this.ai().c($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            jb $$6 = $$3.b(this.ar.a(3) - 1, this.ar.a(3) - 1, this.ar.a(3) - 1);
            $$4 = dpm.a(this.ai(), $$6);
            if (this.ai().a_($$6).l() && $$4.a((dmx)this.ai(), $$6)) {
               this.ai().c($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(dmu $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      jb $$3;
      eeb $$4;
      if ($$2.a(dqb.tb)) {
         $$3 = $$1.a($$2.c(duv.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dzv) {
         $$0.c($$3, dzv.c($$0.a_($$3)));
         jb.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dmu $$0, jb $$1, jb.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jb> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jb> c(dmu $$0, jb $$1) {
      for (jb $$2 : jb.a($$0.A, 10, $$1, 1)) {
         eeb $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dzv) {
            dzv.b($$3).ifPresent($$2x -> $$0.c($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cO();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(all.a $$0) {
   }

   @Override
   protected void a(fda $$0) {
   }

   @Override
   protected void a(fdc $$0) {
   }

   public int f() {
      return this.j;
   }

   public Stream<bzm> i() {
      return this.i.stream().filter(bzm::bO);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }
}
