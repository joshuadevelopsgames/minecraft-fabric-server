import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgq extends chi {
   private final cpj a;
   @Nullable
   private cut b;
   private final aub c;
   private final float d;
   private int e;
   private final clc f;

   public cgq(cpj $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = clc.b().a($$1);
      this.a(EnumSet.of(chi.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bO()) {
         return false;
      } else {
         return this.a.g((bzm)this.b) > this.d * this.d ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.A(true);
      this.e = this.a(40 + this.a.ec().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.P().a(this.b.dC(), this.b.dG(), this.b.dI(), 10.0F, this.a.gg());
      this.e--;
   }

   private boolean a(cut $$0) {
      for (bxi $$1 : bxi.values()) {
         dcv $$2 = $$0.b($$1);
         if ($$2.a(dcz.sY) || this.a.i($$2)) {
            return true;
         }
      }

      return false;
   }
}
