import javax.annotation.Nullable;

public class aey implements zw<acq> {
   public static final zm<wg, aey> a = zw.a(aey::a, aey::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ex.a f;
   private final ex.a g;
   private final boolean h;

   public aey(ex.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aey(ex.a $$0, bzm $$1, ex.a $$2) {
      this.f = $$0;
      this.e = $$1.ar();
      this.g = $$2;
      fis $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aey(wg $$0) {
      this.f = $$0.b(ex.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(ex.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(wg $$0) {
      $$0.a(this.f);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.h);
      if (this.h) {
         $$0.c(this.e);
         $$0.a(this.g);
      }
   }

   @Override
   public zy<aey> a() {
      return ahk.ah;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public ex.a b() {
      return this.f;
   }

   @Nullable
   public fis a(dmu $$0) {
      if (this.h) {
         bzm $$1 = $$0.a(this.e);
         return $$1 == null ? new fis(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new fis(this.b, this.c, this.d);
      }
   }
}
