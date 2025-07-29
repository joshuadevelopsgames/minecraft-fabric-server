import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class btm {
   private final LongSupplier a;
   private final IntSupplier b;
   private final BooleanSupplier c;
   private btq d = btp.a;

   public btm(LongSupplier $$0, IntSupplier $$1, BooleanSupplier $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a() {
      return this.d != btp.a;
   }

   public void b() {
      this.d = btp.a;
   }

   public void c() {
      this.d = new btl(this.a, this.b, this.c);
   }

   public btt d() {
      return this.d;
   }

   public btr e() {
      return this.d.d();
   }
}
