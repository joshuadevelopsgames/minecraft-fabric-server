public class cgm extends cgk {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public cgm(cao $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.bt = this.a(this.a.bt, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.w(this.a(this.a.dR(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.S().l()) {
            this.a.w(this.a(this.a.dR(), 0.0F, 5.0F));
         }

         this.a.bt = this.a(this.a.bt, this.a.br, this.b);
      }

      float $$0 = bcb.h(this.a.bt - this.a.br);
      if ($$0 < -this.h) {
         this.a.br -= 4.0F;
      } else if ($$0 > this.h) {
         this.a.br += 4.0F;
      }
   }
}
