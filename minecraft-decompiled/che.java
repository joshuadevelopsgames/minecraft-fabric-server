import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class che extends chi {
   private static final int a = 200;
   private final cmb b;
   private int c;
   private int d;

   public che(cmb $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cmb $$0) {
      return b(200 + $$0.ec().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gM()) {
         return false;
      } else if (this.b.gJ()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cmb> $$0 = $$0x -> $$0x.gL() || !$$0x.gJ();
         List<? extends cmb> $$1 = this.b.ai().a((Class<? extends cmb>)this.b.getClass(), this.b.cV().c(8.0, 8.0, 8.0), $$0);
         cmb $$2 = (cmb)DataFixUtils.orElse($$1.stream().filter(cmb::gL).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gJ()));
         return this.b.gJ();
      }
   }

   @Override
   public boolean c() {
      return this.b.gJ() && this.b.gN();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gK();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gO();
      }
   }
}
