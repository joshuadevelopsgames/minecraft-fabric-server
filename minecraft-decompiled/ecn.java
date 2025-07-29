import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.UUID;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecn extends eaz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 90;
   private static final int c = 10;
   private static final boolean d = false;
   @Nullable
   private UUID e;
   private eco f;
   private eco g;
   private boolean h = false;

   public ecn(jb $$0, eeb $$1) {
      this(ebb.h, $$0, $$1);
   }

   public ecn(ebb $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
      this.f = this.f();
      this.g = this.f();
   }

   protected eco f() {
      return new eco();
   }

   public boolean a(cut $$0) {
      if (this.m().b() instanceof dxk $$1) {
         fis $$2 = $$1.o(this.m());
         double $$3 = $$0.dC() - (this.aA_().u() + $$2.d);
         double $$4 = $$0.dI() - (this.aA_().w() + $$2.f);
         float $$5 = $$1.h(this.m());
         float $$6 = (float)(bcb.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
         return bcb.d($$5, $$6) <= 90.0F;
      } else {
         return false;
      }
   }

   public eco a(boolean $$0) {
      return $$0 ? this.f : this.g;
   }

   public eco j() {
      return this.f;
   }

   public eco k() {
      return this.g;
   }

   public int a() {
      return 10;
   }

   public int c() {
      return 90;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("front_text", eco.a, this.f);
      $$0.a("back_text", eco.a, this.g);
      $$0.a("is_waxed", this.h);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.<eco>a("front_text", eco.a).map(this::a).orElseGet(eco::new);
      this.g = $$0.<eco>a("back_text", eco.a).map(this::a).orElseGet(eco::new);
      this.h = $$0.a("is_waxed", false);
   }

   private eco a(eco $$0) {
      for (int $$1 = 0; $$1 < 4; $$1++) {
         xo $$2 = this.a($$0.a($$1, false));
         xo $$3 = this.a($$0.a($$1, true));
         $$0 = $$0.a($$1, $$2, $$3);
      }

      return $$0;
   }

   private xo a(xo $$0) {
      if (this.n instanceof aub $$1) {
         try {
            return xr.a(a(null, $$1, this.o), $$0, null, 0);
         } catch (CommandSyntaxException var4) {
         }
      }

      return $$0;
   }

   public void a(cut $$0, boolean $$1, List<auu> $$2) {
      if (!this.w() && $$0.cK().equals(this.v()) && this.n != null) {
         this.a($$2x -> this.a($$0, $$2, $$2x), $$1);
         this.a(null);
         this.n.a(this.aA_(), this.m(), this.m(), 3);
      } else {
         a.warn("Player {} just tried to change non-editable sign", $$0.aj().getString());
      }
   }

   public boolean a(UnaryOperator<eco> $$0, boolean $$1) {
      eco $$2 = this.a($$1);
      return this.a($$0.apply($$2), $$1);
   }

   private eco a(cut $$0, List<auu> $$1, eco $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         auu $$4 = $$1.get($$3);
         yl $$5 = $$2.a($$3, $$0.X()).a();
         if ($$0.X()) {
            $$2 = $$2.a($$3, xo.b($$4.b()).b($$5));
         } else {
            $$2 = $$2.a($$3, xo.b($$4.d()).b($$5), xo.b($$4.b()).b($$5));
         }
      }

      return $$2;
   }

   public boolean a(eco $$0, boolean $$1) {
      return $$1 ? this.c($$0) : this.b($$0);
   }

   private boolean b(eco $$0) {
      if ($$0 != this.g) {
         this.g = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(eco $$0) {
      if ($$0 != this.f) {
         this.f = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean a(boolean $$0, cut $$1) {
      return this.w() && this.a($$0).b($$1);
   }

   public boolean a(aub $$0, cut $$1, jb $$2, boolean $$3) {
      boolean $$4 = false;

      for (xo $$5 : this.a($$3).b($$1.X())) {
         yl $$6 = $$5.a();
         switch ($$6.i()) {
            case xm.g $$8:
               $$0.q().aG().a(a($$1, $$0, $$2), $$8.b());
               $$4 = true;
               break;
            case xm.h $$9:
               $$1.b($$9.b());
               $$4 = true;
               break;
            case xm.d $$10:
               $$0.q().a($$10.b(), $$10.c());
               $$4 = true;
               break;
            case null:
            default:
         }
      }

      return $$4;
   }

   private static ek a(@Nullable cut $$0, aub $$1, jb $$2) {
      String $$3 = $$0 == null ? "Sign" : $$0.aj().getString();
      xo $$4 = (xo)($$0 == null ? xo.b("Sign") : $$0.Q_());
      return new ek(ej.a, fis.b($$2), fir.a, $$1, 2, $$3, $$4, $$1.q(), $$0);
   }

   public acw u() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public void a(@Nullable UUID $$0) {
      this.e = $$0;
   }

   @Nullable
   public UUID v() {
      return this.e;
   }

   private void x() {
      this.e();
      this.n.a(this.aA_(), this.m(), this.m(), 3);
   }

   public boolean w() {
      return this.h;
   }

   public boolean b(boolean $$0) {
      if (this.h != $$0) {
         this.h = $$0;
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(UUID $$0) {
      cut $$1 = this.n.a($$0);
      return $$1 == null || !$$1.a(this.aA_(), 4.0);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecn $$3) {
      UUID $$4 = $$3.v();
      if ($$4 != null) {
         $$3.a($$3, $$0, $$4);
      }
   }

   private void a(ecn $$0, dmu $$1, UUID $$2) {
      if ($$0.b($$2)) {
         $$0.a(null);
      }
   }

   public ayy d() {
      return ayz.DE;
   }
}
