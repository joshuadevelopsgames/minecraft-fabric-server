import java.util.Optional;

public class gxp implements gxn {
   private final gxn.a a;
   private final gxn.a b = gxn.a(new foa(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gxp(gxn.a $$0) {
      this.a = $$0;
   }

   @Override
   public fog getBuffer(gxz $$0) {
      if ($$0.I()) {
         fog $$1 = this.b.getBuffer($$0);
         return new gxp.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fog $$2 = this.a.getBuffer($$0);
         Optional<gxz> $$3 = $$0.H();
         if ($$3.isPresent()) {
            fog $$4 = this.b.getBuffer($$3.get());
            gxp.a $$5 = new gxp.a($$4, this.c, this.d, this.e, this.f);
            return foh.a($$5, $$2);
         } else {
            return $$2;
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void a() {
      this.b.b();
   }

   record a(fog a, int b) implements fog {
      public a(fog $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, baj.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fog a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fog a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fog a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fog a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fog b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fog b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
