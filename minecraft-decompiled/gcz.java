import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public final class gcz implements gda {
   public final fwz a;
   public final bbm b;
   public final Matrix3x2f c;
   public final int d;
   public final int e;
   public final int f;
   public final int g;
   public final boolean h;
   @Nullable
   public final gcd i;
   @Nullable
   private fwz.c j;
   @Nullable
   private gcd k;

   public gcz(fwz $$0, bbm $$1, Matrix3x2f $$2, int $$3, int $$4, int $$5, int $$6, boolean $$7, @Nullable gcd $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   public fwz.c a() {
      if (this.j == null) {
         this.j = this.a.a(this.b, (float)this.d, (float)this.e, this.f, this.h, this.g);
         gcd $$0 = this.j.a();
         if ($$0 != null) {
            $$0 = $$0.b(this.c);
            this.k = this.i != null ? this.i.b($$0) : $$0;
         }
      }

      return this.j;
   }

   @Nullable
   @Override
   public gcd n() {
      this.a();
      return this.k;
   }
}
