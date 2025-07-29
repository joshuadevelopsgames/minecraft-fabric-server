import javax.annotation.Nullable;

public abstract class fyv extends fxo {
   protected final ame a;
   protected final int b;
   protected final int c;

   fyv(int $$0, int $$1, xo $$2, int $$3, int $$4, ame $$5, fxo.c $$6, @Nullable fxo.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fyv.a a(xo $$0, fxo.c $$1, boolean $$2) {
      return new fyv.a($$0, $$1, $$2);
   }

   public static class a {
      private final xo b;
      private final fxo.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private ame g;
      private int h;
      private int i;
      @Nullable
      fxo.b a;

      public a(xo $$0, fxo.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fyv.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fyv.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fyv.a a(ame $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fyv.a a(fxo.b $$0) {
         this.a = $$0;
         return this;
      }

      public fyv a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fyv)(this.d
               ? new fyv.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fyv.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fyv {
      protected b(int $$0, int $$1, xo $$2, int $$3, int $$4, ame $$5, fxo.c $$6, @Nullable fxo.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.E() + this.z() / 2 - this.b / 2;
         int $$5 = this.F() + this.y() / 2 - this.c / 2;
         $$0.a(gxx.ar, this.a, $$4, $$5, this.b, this.c, this.l);
      }

      @Override
      public void a(fxb $$0, fwz $$1, int $$2) {
      }
   }

   public static class c extends fyv {
      protected c(int $$0, int $$1, xo $$2, int $$3, int $$4, ame $$5, fxo.c $$6, @Nullable fxo.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.E() + this.z() - this.b - 2;
         int $$5 = this.F() + this.y() / 2 - this.c / 2;
         $$0.a(gxx.ar, this.a, $$4, $$5, this.b, this.c, this.l);
      }

      @Override
      public void a(fxb $$0, fwz $$1, int $$2) {
         int $$3 = this.E() + 2;
         int $$4 = this.E() + this.z() - this.b - 4;
         int $$5 = this.E() + this.z() / 2;
         a($$0, $$1, this.A(), $$5, $$3, this.F(), $$4, this.F() + this.y(), $$2);
      }
   }
}
