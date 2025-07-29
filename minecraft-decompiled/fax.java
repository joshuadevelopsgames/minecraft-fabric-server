import javax.annotation.Nullable;

public class fax {
   public final int a;
   public final int b;
   public final int c;
   private final int m;
   public int d = -1;
   public float e;
   public float f;
   public float g;
   @Nullable
   public fax h;
   public boolean i;
   public float j;
   public float k;
   public fbc l = fbc.a;

   public fax(int $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.m = b($$0, $$1, $$2);
   }

   public fax a(int $$0, int $$1, int $$2) {
      fax $$3 = new fax($$0, $$1, $$2);
      $$3.d = this.d;
      $$3.e = this.e;
      $$3.f = this.f;
      $$3.g = this.g;
      $$3.h = this.h;
      $$3.i = this.i;
      $$3.j = this.j;
      $$3.k = this.k;
      $$3.l = this.l;
      return $$3;
   }

   public static int b(int $$0, int $$1, int $$2) {
      return $$1 & 0xFF | ($$0 & 32767) << 8 | ($$2 & 32767) << 24 | ($$0 < 0 ? Integer.MIN_VALUE : 0) | ($$2 < 0 ? 32768 : 0);
   }

   public float a(fax $$0) {
      float $$1 = $$0.a - this.a;
      float $$2 = $$0.b - this.b;
      float $$3 = $$0.c - this.c;
      return bcb.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float b(fax $$0) {
      float $$1 = $$0.a - this.a;
      float $$2 = $$0.c - this.c;
      return bcb.c($$1 * $$1 + $$2 * $$2);
   }

   public float a(jb $$0) {
      float $$1 = $$0.u() - this.a;
      float $$2 = $$0.v() - this.b;
      float $$3 = $$0.w() - this.c;
      return bcb.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public float c(fax $$0) {
      float $$1 = $$0.a - this.a;
      float $$2 = $$0.b - this.b;
      float $$3 = $$0.c - this.c;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float b(jb $$0) {
      float $$1 = $$0.u() - this.a;
      float $$2 = $$0.v() - this.b;
      float $$3 = $$0.w() - this.c;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public float d(fax $$0) {
      float $$1 = Math.abs($$0.a - this.a);
      float $$2 = Math.abs($$0.b - this.b);
      float $$3 = Math.abs($$0.c - this.c);
      return $$1 + $$2 + $$3;
   }

   public float c(jb $$0) {
      float $$1 = Math.abs($$0.u() - this.a);
      float $$2 = Math.abs($$0.v() - this.b);
      float $$3 = Math.abs($$0.w() - this.c);
      return $$1 + $$2 + $$3;
   }

   public jb a() {
      return new jb(this.a, this.b, this.c);
   }

   public fis b() {
      return new fis(this.a, this.b, this.c);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof fax $$1) ? false : this.m == $$1.m && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
   }

   @Override
   public int hashCode() {
      return this.m;
   }

   public boolean c() {
      return this.d >= 0;
   }

   @Override
   public String toString() {
      return "Node{x=" + this.a + ", y=" + this.b + ", z=" + this.c + "}";
   }

   public void a(wg $$0) {
      $$0.q(this.a);
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.a(this.j);
      $$0.a(this.k);
      $$0.a(this.i);
      $$0.a(this.l);
      $$0.a(this.g);
   }

   public static fax b(wg $$0) {
      fax $$1 = new fax($$0.readInt(), $$0.readInt(), $$0.readInt());
      a($$0, $$1);
      return $$1;
   }

   protected static void a(wg $$0, fax $$1) {
      $$1.j = $$0.readFloat();
      $$1.k = $$0.readFloat();
      $$1.i = $$0.readBoolean();
      $$1.l = $$0.b(fbc.class);
      $$1.g = $$0.readFloat();
   }
}
