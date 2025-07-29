import java.util.List;

public abstract class gga<T extends cyo> extends ggb<T> {
   private final ame E;
   private final ame F;
   private final ame G;

   public gga(T $$0, cus $$1, xo $$2, xo $$3, ame $$4, ame $$5, ame $$6, List<gjj.a> $$7) {
      super($$0, new gjg($$0, $$3, $$7), $$1, $$2);
      this.E = $$4;
      this.F = $$5;
      this.G = $$6;
   }

   @Override
   public void aV_() {
      super.aV_();
      this.f = (this.d - this.q.a(this.m)) / 2;
   }

   @Override
   protected gcc E() {
      return new gcc(this.A + 20, this.p / 2 - 49);
   }

   @Override
   protected void a(fxb $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(gxx.ar, this.E, $$4, $$5, 0.0F, 0.0F, this.d, this.e, 256, 256);
      if (this.x.o()) {
         int $$6 = 14;
         int $$7 = bcb.f(this.x.n() * 13.0F) + 1;
         $$0.a(gxx.ar, this.F, 14, 14, 0, 14 - $$7, $$4 + 56, $$5 + 36 + 14 - $$7, 14, $$7);
      }

      int $$8 = 24;
      int $$9 = bcb.f(this.x.m() * 24.0F);
      $$0.a(gxx.ar, this.G, 24, 16, 0, 0, $$4 + 79, $$5 + 34, $$9, 16);
   }
}
