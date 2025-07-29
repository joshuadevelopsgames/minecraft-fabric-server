import javax.annotation.Nullable;

public sealed interface bxj permits bxj.d, bxj.a, bxj.c, bxj.f {
   bxj.d a = new bxj.d(bxj.e.b, bxj.b.b);
   bxj.d b = new bxj.d(bxj.e.c, bxj.b.b);
   bxj.d c = new bxj.d(bxj.e.a, bxj.b.b);
   bxj.a d = new bxj.a();
   bxj.c e = new bxj.c();
   bxj.f f = new bxj.f();

   default boolean a() {
      return false;
   }

   public record a() implements bxj {
   }

   public record b(boolean c, @Nullable dcv d) {
      static bxj.b a = new bxj.b(false, null);
      static bxj.b b = new bxj.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public dcv b() {
         return this.d;
      }
   }

   public record c() implements bxj {
   }

   public record d(bxj.e g, bxj.b h) implements bxj {
      @Override
      public boolean a() {
         return true;
      }

      public bxj.d a(dcv $$0) {
         return new bxj.d(this.g, new bxj.b(true, $$0));
      }

      public bxj.d b() {
         return new bxj.d(this.g, bxj.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public dcv d() {
         return this.h.d;
      }

      public bxj.e e() {
         return this.g;
      }

      public bxj.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public record f() implements bxj {
   }
}
