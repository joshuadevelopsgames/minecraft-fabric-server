import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ghm extends ghc<dan> {
   private static final ame E = ame.b("container/smithing/error");
   private static final ame F = ame.b("container/slot/smithing_template_armor_trim");
   private static final ame G = ame.b("container/slot/smithing_template_netherite_upgrade");
   private static final xo H = xo.c("container.upgrade.missing_template_tooltip");
   private static final xo I = xo.c("container.upgrade.error_tooltip");
   private static final List<ame> J = List.of(F, G);
   private static final int K = 44;
   private static final int L = 15;
   private static final int M = 28;
   private static final int N = 21;
   private static final int O = 65;
   private static final int P = 46;
   private static final int Q = 115;
   private static final int R = 210;
   private static final int S = 25;
   private static final Vector3f T = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Quaternionf U = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int V = 25;
   private static final int W = 121;
   private static final int X = 20;
   private static final int Y = 161;
   private static final int Z = 80;
   private final ggr aa = new ggr(0);
   private final ggr ab = new ggr(1);
   private final ggr ac = new ggr(2);
   @Nullable
   private cqo ad;

   public ghm(dan $$0, cus $$1, xo $$2) {
      super($$0, $$1, $$2, ame.b("textures/gui/container/smithing.png"));
      this.f = 44;
      this.u = 15;
   }

   @Override
   protected void E() {
      this.ad = new cqo(this.n.s, 0.0, 0.0, 0.0);
      this.ad.b(true);
      this.ad.a(true);
      this.ad.br = 210.0F;
      this.ad.w(25.0F);
      this.ad.bt = this.ad.dP();
      this.ad.bu = this.ad.dP();
      this.b(this.x.b(3).g());
   }

   @Override
   public void m() {
      super.m();
      Optional<ddz> $$0 = this.F();
      this.aa.a(J);
      this.ab.a($$0.map(ddz::c).orElse(List.of()));
      this.ac.a($$0.map(ddz::n).orElse(List.of()));
   }

   private Optional<ddz> F() {
      dcv $$0 = this.x.b(0).g();
      return !$$0.f() && $$0.h() instanceof ddz $$1 ? Optional.of($$1) : Optional.empty();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.e($$0, $$1, $$2);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.aa.a(this.x, $$0, $$1, this.A, this.B);
      this.ab.a(this.x, $$0, $$1, this.A, this.B);
      this.ac.a(this.x, $$0, $$1, this.A, this.B);
      int $$4 = this.A + 121;
      int $$5 = this.B + 20;
      int $$6 = this.A + 161;
      int $$7 = this.B + 80;
      ghb.a($$0, $$4, $$5, $$6, $$7, 25.0F, T, U, null, this.ad);
   }

   @Override
   public void a(cym $$0, int $$1, dcv $$2) {
      if ($$1 == 3) {
         this.b($$2);
      }
   }

   private void b(dcv $$0) {
      if (this.ad != null) {
         for (bzw $$1 : bzw.j) {
            this.ad.a($$1, dcv.l);
         }

         if (!$$0.f()) {
            dle $$2 = $$0.a(kq.D);
            bzw $$3 = $$2 != null ? $$2.b() : bzw.b;
            this.ad.a($$3, $$0.v());
         }
      }
   }

   @Override
   protected void d(fxb $$0, int $$1, int $$2) {
      if (this.G()) {
         $$0.a(gxx.ar, E, $$1 + 65, $$2 + 46, 28, 21);
      }
   }

   private void e(fxb $$0, int $$1, int $$2) {
      Optional<xo> $$3 = Optional.empty();
      if (this.G() && this.a(65, 46, 28, 21, $$1, $$2)) {
         $$3 = Optional.of(I);
      }

      if (this.z != null) {
         dcv $$4 = this.x.b(0).g();
         dcv $$5 = this.z.g();
         if ($$4.f()) {
            if (this.z.d == 0) {
               $$3 = Optional.of(H);
            }
         } else if ($$4.h() instanceof ddz $$6 && $$5.f()) {
            if (this.z.d == 1) {
               $$3 = Optional.of($$6.a());
            } else if (this.z.d == 2) {
               $$3 = Optional.of($$6.b());
            }
         }
      }

      $$3.ifPresent($$3x -> $$0.b(this.q, this.q.c($$3x, 115), $$1, $$2));
   }

   private boolean G() {
      return this.x.m();
   }
}
