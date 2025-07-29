import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxo extends fxe {
   public static final int f = 120;
   public static final int m = 150;
   public static final int n = 200;
   public static final int o = 20;
   public static final int p = 8;
   protected static final fxo.b q = $$0 -> $$0.get();
   protected final fxo.c r;
   protected final fxo.b s;

   public static fxo.a a(xo $$0, fxo.c $$1) {
      return new fxo.a($$0, $$1);
   }

   protected fxo(int $$0, int $$1, int $$2, int $$3, xo $$4, fxo.c $$5, fxo.b $$6) {
      super($$0, $$1, $$2, $$3, $$4);
      this.r = $$5;
      this.s = $$6;
   }

   @Override
   public void b() {
      this.r.onPress(this);
   }

   @Override
   protected yc d() {
      return this.s.createNarrationMessage(() -> super.d());
   }

   @Override
   public void a(gbt $$0) {
      this.c($$0);
   }

   public static class a {
      private final xo a;
      private final fxo.c b;
      @Nullable
      private fzb c;
      private int d;
      private int e;
      private int f = 150;
      private int g = 20;
      private fxo.b h = fxo.q;

      public a(xo $$0, fxo.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fxo.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fxo.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public fxo.a b(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
         return this;
      }

      public fxo.a a(int $$0, int $$1, int $$2, int $$3) {
         return this.a($$0, $$1).b($$2, $$3);
      }

      public fxo.a a(@Nullable fzb $$0) {
         this.c = $$0;
         return this;
      }

      public fxo.a a(fxo.b $$0) {
         this.h = $$0;
         return this;
      }

      public fxo a() {
         fxo $$0 = new fxo(this.d, this.e, this.f, this.g, this.a, this.b, this.h);
         $$0.a(this.c);
         return $$0;
      }
   }

   public interface b {
      yc createNarrationMessage(Supplier<yc> var1);
   }

   public interface c {
      void onPress(fxo var1);
   }
}
