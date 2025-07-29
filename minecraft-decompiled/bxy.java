import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bxy {
   public static final int a = 100;
   public static final int b = 300;
   private static final yl c = yl.a.a(new xm.f(bav.w)).a(new xu.e(xo.b("MCPE-28723")));
   private final List<bxw> d = Lists.newArrayList();
   private final cam e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bxy(cam $$0) {
      this.e = $$0;
   }

   public void a(byb $$0, float $$1) {
      this.c();
      byg $$2 = byg.a(this.e);
      bxw $$3 = new bxw($$0, $$1, $$2, (float)this.e.am);
      this.d.add($$3);
      this.f = this.e.as;
      this.j = true;
      if (!this.i && this.e.bO() && a($$0)) {
         this.i = true;
         this.g = this.e.as;
         this.h = this.g;
         this.e.h_();
      }
   }

   private static boolean a(byb $$0) {
      return $$0.d() instanceof cam;
   }

   private xo a(bzm $$0, xo $$1, String $$2, String $$3) {
      dcv $$5 = $$0 instanceof cam $$4 ? $$4.fh() : dcv.l;
      return !$$5.f() && $$5.c(kq.g) ? xo.a($$2, this.e.Q_(), $$1, $$5.K()) : xo.a($$3, this.e.Q_(), $$1);
   }

   private xo a(bxw $$0, @Nullable bzm $$1) {
      byb $$2 = $$0.a();
      if (!$$2.a(azp.m) && !$$2.a(azp.s)) {
         xo $$4 = a($$1);
         bzm $$5 = $$2.d();
         xo $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xo)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xo.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         byg $$3 = Objects.requireNonNullElse($$0.c(), byg.a);
         return xo.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static xo a(@Nullable bzm $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public xo a() {
      if (this.d.isEmpty()) {
         return xo.a("death.attack.generic", this.e.Q_());
      } else {
         bxw $$0 = this.d.get(this.d.size() - 1);
         byb $$1 = $$0.a();
         bxw $$2 = this.d();
         byf $$3 = $$1.k().e();
         if ($$3 == byf.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == byf.c) {
            String $$4 = "death.attack." + $$1.f();
            xo $$5 = xr.a((xo)xo.c($$4 + ".link")).c(c);
            return xo.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bxw d() {
      bxw $$0 = null;
      bxw $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bxw $$5 = this.d.get($$4);
         bxw $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         byb $$7 = $$5.a();
         boolean $$8 = $$7.a(azp.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(azp.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$9;
         }

         if ($$5.c() != null && ($$1 == null || $$5.b() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.b();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   public int b() {
      return this.i ? this.e.as - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bO() || this.e.as - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.as;
         if ($$1) {
            this.e.P_();
         }

         this.d.clear();
      }
   }
}
