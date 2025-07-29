import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cgu extends chi {
   private static final clc d = clc.b().a(8.0).d();
   protected final cmd a;
   private final Class<? extends cmd> e;
   protected final aub b;
   @Nullable
   protected cmd c;
   private int f;
   private final double g;

   public cgu(cmd $$0, double $$1) {
      this($$0, $$1, (Class<? extends cmd>)$$0.getClass());
   }

   public cgu(cmd $$0, double $$1, Class<? extends cmd> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(chi.a.a, chi.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gR()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bO() && this.c.gR() && this.f < 60 && !this.c.gE();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.P().a(this.c, 10.0F, this.a.gg());
      this.a.S().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cmd h() {
      List<? extends cmd> $$0 = this.b.a(this.e, d, this.a, this.a.cV().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cmd $$2 = null;

      for (cmd $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gE() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a(this.b, this.c);
   }
}
