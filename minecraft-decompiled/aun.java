import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aun implements aul {
   private static final Logger a = LogUtils.getLogger();
   private final int b;
   private int c;
   private long d;
   private long e = Long.MAX_VALUE;

   private aun(int $$0) {
      this.b = $$0;
   }

   public static aun b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static aun c(int $$0) {
      int $$1 = aul.a($$0);
      return new aun($$1 * $$1);
   }

   public static aun c() {
      return new aun(0);
   }

   @Override
   public void a(dlz $$0) {
      this.e = ag.c();
      this.d = this.e;
   }

   @Override
   public void a(dlz $$0, @Nullable egz $$1) {
      if ($$1 == egz.n) {
         this.c++;
      }

      int $$2 = this.d();
      if (ag.c() > this.e) {
         this.e += 500L;
         a.info(xo.a("menu.preparingSpawn", bcb.a($$2, 0, 100)).getString());
      }
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
      a.info("Time elapsed: {} ms", ag.c() - this.d);
      this.e = Long.MAX_VALUE;
   }

   public int d() {
      return this.b == 0 ? 100 : bcb.d(this.c * 100.0F / this.b);
   }
}
